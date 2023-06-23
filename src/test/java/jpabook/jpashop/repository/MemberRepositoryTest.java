package jpabook.jpashop.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceUtil;
import jpabook.jpashop.domain.*;
import jpabook.jpashop.domain.Item.Book;
//import jpabook.jpashop.domain.Order;
//import jpabook.jpashop.domain.OrderItem;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    OrderRepository orderRepository;
    @Autowired
    EntityManager em;

    @Test
    @Rollback(value = false)
    void save_테스트() {

        /*List<Member> resultList = em.createQuery(
                "select m from Member m where m.USERNAME like '%kim%'",
                Member.class).getResultList();
        for (Member member : resultList) {
            System.out.println("member = " + member);
        }*/



/*        Member member = new Member();
        member.setName("userName1");
        member.setHomeAddress(new Address("homecity","street","10000"));

        member.getFavoriteFoods().add("치킨");
        member.getFavoriteFoods().add("족발");
        member.getFavoriteFoods().add("피자");

        member.getAddressHistory().add(new Address("oldcity1", "street1", "10000"));
        member.getAddressHistory().add(new Address("oldcity2", "street2", "10000"));

        em.persist(member);

        em.flush();
        em.clear();

        System.out.println("============================");
        Member findMember = em.find(Member.class, member.getId());
        System.out.println("============================");*/

        //homecity -> newcity
/*
        Address homeAddress = findMember.getHomeAddress();
        findMember.setHomeAddress(new Address("newCity", homeAddress.getStreet(), homeAddress.getZipcode()));
*/

        //치킨 -> 한식
/*        findMember.getFavoriteFoods().remove("치킨");
        findMember.getFavoriteFoods().add("한식");*/

       /* findMember.getAddressHistory().remove(new Address("oldcity1", "street1", "10000"));
        findMember.getAddressHistory().add(new Address("newcity1", "street1", "10000"));
*/

        // jpql
//        List<Member> members = em.createQuery("select m from Member m join fetch m.team ", Member.class)
//                .getResultList();
//        List<Member> members = em.createQuery("select m from Member m", Member.class)
//                .getResultList();



        //N+1 해결 밥법 : 1.LAZY loading(지연로딩) 2.fetch join 사용 3.

        //SQL : select * from Member

    }


    @Test
    @Rollback(value = false)
    void find_테스트() {
        //변경 감지(dirty checking)

    }

    @Test
    @Rollback(value = false)
    void find_테스트1() {

    }

    @Test
    void find_테스트2() {

    }

    @Test
    void find_테스트3() {

    }
}