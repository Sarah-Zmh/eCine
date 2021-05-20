package com.everis.eCine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.everis.eCine.model.Personne;
import com.everis.eCine.service.PersonneService;

@Controller
@RequestMapping("personnes")
public class PersonneController {
	private PersonneService personneService;

	@Autowired
	public void setCustomerService(PersonneService personneService) {
		this.personneService = personneService;
	}

}
