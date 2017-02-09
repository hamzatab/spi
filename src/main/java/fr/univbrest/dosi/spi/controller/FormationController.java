package fr.univbrest.dosi.spi.controller;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import fr.univbrest.dosi.spi.business.FormationBusinessInter;
import fr.univbrest.dosi.spi.entites.Formation;

@RestController
@RequestMapping(value = "/myformation")
public class FormationController {

	
	private FormationBusinessInter formation;
	
	@Autowired
	public void FormationController(FormationBusinessInter formation){
		this.formation = formation;
	}
	
	@RequestMapping(method= RequestMethod.GET)
	public List<Formation> retrieveFormation() {
		
		return formation.findAll();

	}
}
