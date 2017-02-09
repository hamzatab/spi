package fr.univbrest.dosi.spi.business;

import java.util.List;

import fr.univbrest.dosi.spi.entites.Formation;

public interface FormationBusinessInter {

	Formation retrieveFormation(final String IdFormation);

	List<Formation> findAll();

	// List<Formation> searchFormations(final String nomFormation);

	void createFromation(final Formation formation);

	void deleteFormation(final String idFormation);

	void updateFormation(final String codeFormation, final Formation formation);
}
