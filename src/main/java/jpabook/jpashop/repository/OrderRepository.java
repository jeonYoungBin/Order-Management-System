package jpabook.jpashop.repository;

//import com.querydsl.core.types.Projections;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jpabook.jpashop.domain.*;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

import static jpabook.jpashop.domain.QMember.member;
import static jpabook.jpashop.domain.QOrder.order;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    @Autowired
    JPAQueryFactory jpaQueryFactory;
    private final EntityManager em;

    public void save(Order order) {
        em.persist(order);
    }

    public Order findOne(Long id) {
        return em.find(Order.class, id);
    }

    public List<Order> findAllByString(OrderSearch orderSearch) {
        return jpaQueryFactory
                .select(order)
                .from(order)
                .join(order.member, member)
                .where(nameLike(orderSearch.getMemberName()),
                        statusEq(orderSearch.getOrderStatus()))
                .fetch();

    }

    private BooleanExpression statusEq(OrderStatus statusCond){
        if (statusCond == null){
            return null;
        }
        return order.status.eq(statusCond);
    }

    private BooleanExpression nameLike(String nameCond){
        if (!StringUtils.hasText(nameCond)){
            return null;
        }
        return member.name.like(nameCond);
    }

}
