package com.devtiro.forms.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devtiro.forms.springboot.domain.ContactForm;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ContactFromController {
	/*
	 * Mehtod 1 to access data as map
	@RequestMapping(path="/contact", method = RequestMethod.POST)
	public String contactFormSubmission(@RequestBody MultiValueMap values) {
		log.info( values.toString() );		
		return "redirect:success.html";
	}
	*/
	/*
	 * Mehtod 2 to access data as map from parsing */ 
	@RequestMapping(path="/contact", method = RequestMethod.POST)
	public String contactFormSubmission(@Valid @ModelAttribute final ContactForm contactForm ) {
		log.info(contactForm.toString());
		return "redirect:success.html";
	}
	
	 

}
