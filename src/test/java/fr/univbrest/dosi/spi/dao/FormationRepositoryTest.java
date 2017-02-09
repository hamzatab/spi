package fr.univbrest.dosi.spi.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.spi.AppTestConfig;
import fr.univbrest.dosi.spi.entites.Formation;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppTestConfig.class)
public class FormationRepositoryTest {

	@Autowired
	FormationRepository formationRepo;
	
	@Before
	public void init(){
		Formation formation = new Formation("1",new Date("27/03/2016"),"LSI","DOSI",new Date("27/03/2017"),new BigDecimal(3),"DOSI");
		formationRepo.save(formation);
		
	}
	
	@Test
	public void doitRécupérerUneFormationParDiplome(){
		//List<Formation> resultat = formationRepo.fi
	}
}
