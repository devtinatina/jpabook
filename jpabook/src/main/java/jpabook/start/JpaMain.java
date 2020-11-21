package jpabook.start;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JpaMain {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			
			
			
			em.flush();
			em.clear();
			
//			//조회
//			Member member = em.find(Member.class, "member1");
//			Team findTeam = member.getTeam();
//			System.out.println("Team name:"+findTeam.getName());
			
			//수정 
//			Team team2 = new Team("team2","팀2");
//			em.persist(team2);
//
//			Member findMember = em.find(Member.class,"member1");
//			findMember.setTeam(team2);
			
			
//			Team team = em.find(Team.class, "team1");
//			List<Member> members = team.getMembers();
//			for (Member member : members) {
//			System.out.println("member.username="+
//			member.getName());
//			}

			
			
			
			tx.commit();
		} catch (Exception e) {
			System.out.println(e);
			tx.rollback();
		} finally {
			em.close();
		}
		emf.close();
	}
}
