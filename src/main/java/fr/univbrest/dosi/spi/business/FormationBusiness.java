package fr.univbrest.dosi.spi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univbrest.dosi.spi.dao.FormationRepository;
import fr.univbrest.dosi.spi.entites.Formation;

@Component
public  class FormationBusiness implements FormationBusinessInter{

	
	private FormationRepository formationRepo;
	
	@Autowired
	public FormationBusiness(FormationRepository formationRepo) {
		this.formationRepo = formationRepo;
	}

	@Override
	public Formation retrieveFormation(String codeFormation) {
		
		for(Formation fo : formationRepo.findAll()){
			if (fo.getCodeFormation().equals(codeFormation))
				return fo;
		}
		
		return null;
	}


	@Override
	public void createFromation(Formation formation) {
		formationRepo.save(formation);
		
	}

	@Override
	public void updateFormation(String codeFormation, Formation formation) {
		for(Formation fo : formationRepo.findAll()){
			if(fo.getCodeFormation().equals(codeFormation))
				formationRepo.delete(codeFormation);
			formationRepo.save(formation);
		}
		
		
		
	}

	@Override
	public List<Formation> findAll() {
		return (List<Formation>) formationRepo.findAll();
	}

	@Override
	public void deleteFormation(String idFormation) {
		// TODO Auto-generated method stub
		
	}


	
	
}
