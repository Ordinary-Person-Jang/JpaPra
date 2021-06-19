package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Random;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
//            Member member = new Member();
//            member.setId(4L);
//            member.setName("HelloC");
//            em.persist(member);

//            Member findMember = em.find(Member.class, 2L);
//            System.out.println("findMember.getId() = " + findMember.getId());
//            System.out.println("findMember.getId() = " + findMember.getName());
//            findMember.setName("HelloJPA");

//            em.remove(findMember); //삭제

//            List<Member> result = em.createQuery("select m from Member as m", Member.class).setFirstResult(1).setMaxResults(2)
//                    .getResultList();
//            for(Member member : result) {
//                System.out.println("member.name = " + member.getName());
//            }
            Member member = new Member();
            member.setUsername("MemberE");
            em.persist(member);

            System.out.println("member.id = " + member.getId());

            Team team = new Team();
            team.setName("TeamA");
            em.persist(team);

            

//
//            Member member = new Member();
//            member.setUsername("member1");
//            member.changeTeam(team);
//            em.persist(member);
//
////            em.flush();
////            em.clear();
//
//            Team findTeam = em.find  (Team.class, team.getId());
//            List<Member> members = findTeam.getMembers();
//
//            System.out.println("========================");
//            for (Member m : members){
//                System.out.println("m = " + m.getUsername());
//            }
////            System.out.println("========================");
//            Movie m = new Movie();
//            m.setDirector("AAAA");
//            m.setActor("BBBBB");
//            m.setName("Wind");
//            m.setPrice(5000);
//            em.persist(m);
//            em.clear();
//
//            System.out.println(m.getId());
//
//            Movie findmovie = em.find(Movie.class, m.getId());
//            System.out.println("findmovie.getName() = " + findmovie.getName());

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
