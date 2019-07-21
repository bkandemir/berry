package edu.sabanciuniv.berry.service.implementation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import edu.sabanciuniv.berry.domain.School;
import edu.sabanciuniv.berry.service.SchoolService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class SchoolServiceImpl implements SchoolService {
	
    @PersistenceContext
    private EntityManager entityManager;
	
	@Transactional
	public void fillTable() {
		

		
		School s1 =  new School();
		s1.setId(1l);
		s1.setName("Sabanci University");

		   entityManager.createNativeQuery("INSERT INTO berrydatabase.school (id,name) VALUES (?,?)")
		      .setParameter(1, s1.getId())
		      .setParameter(2, s1.getName())
		      .executeUpdate();
		
		
		School s2 =  new School();
		s2.setId(2l);
		s2.setName("Koc University");

		School s3 =  new School();
		s3.setId(3l);
		s3.setName("Istanbul Technical University");		

		School s4 =  new School();
		s4.setId(4l);
		s4.setName("Yeditepe University");

		School s5 =  new School();
		s5.setId(5l);
		s5.setName("Middle East Technical University");

		School s6 =  new School();
		s6.setId(6l);
		s6.setName("Dokuz Eylul University");

		School s7 =  new School();
		s7.setId(7l);
		s7.setName("Ege University");

		School s8 =  new School();
		s8.setId(8l);
		s8.setName("Izmir University of Economics");

		School s9 =  new School();
		s9.setId(9l);
		s9.setName("Bilkent University");

		School s10 = new School();
		s10.setId(10l);
		s10.setName("Istanbul University");

		School s11 = new School();
		s11.setId(11);
		s11.setName("Erciyes University");

		School s12 = new School();
		s12.setId(12);
		s12.setName("Hacettepe University");

		School s13 = new School(13,"Yildiz Technical University");
		s13.setId(13);
		s13.setName("Yildiz Technical University");

		School s14 = new School();
		s14.setId(14);
		s14.setName("Galatasaray University");

		School s15 = new School();
		s15.setId(15);
		s15.setName("Marmara University");

		School s16 = new School();
		s16.setId(16);
		s16.setName("Ozyegin University");

		School s17 = new School();
		s17.setId(17);
		s17.setName("Bahcesehir University");

		School s18 = new School();
		s18.setId(18);
		s18.setName("Bilgi University");

		School s19 = new School();
		s19.setId(19);
		s19.setName("Karadeniz Technical University");

		School s20 = new School();
		s20.setId(20);
		s20.setName("Sakarya University");

	}


}
