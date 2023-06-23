package jpabook.jpashop.repository;

import jakarta.persistence.EntityManager;
import jpabook.jpashop.domain.Member;
//import jpabook.jpashop.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {
    /*private final EntityManager em;
    void save(Order order) {
        em.persist(order);
    }

    Order findOne(Long id) {
        return em.find(Order.class, id);
    }

    List<Order> findAll() {
       return em.createQuery("select m from Order m", Order.class)
               .getResultList();
    }

    void delete(Order order)  {
        em.remove(order);
    }*/

}
