package fr.univbrest.dosi.spi.business;




import java.util.ArrayList;
import java.util.List;

import fr.univbrest.dosi.spi.dao.FormationRepository;
import fr.univbrest.dosi.spi.entites.Formation;
public class FormationServiceStub implements FormationRepository {

	List<Formation> donnees=new ArrayList<>();

	@Override
	public long count() {
		return donnees.size();
	}

	@Override
	public void delete(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Formation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Formation> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Formation> findAll() {
		// TODO Auto-generated method stub
		return donnees;
	}

	@Override
	public Iterable<Formation> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return donnees;
	}

	@Override
	public Formation findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Formation> S save(S formation) {
		this.donnees.add(formation) ;
		return formation;
	}

	@Override
	public <S extends Formation> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
}