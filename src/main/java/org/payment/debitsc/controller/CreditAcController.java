package org.payment.debitsc.controller;

import org.payment.debitsc.dto.CreditAccount;
import org.payment.debitsc.repository.CreditAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
@RequestMapping(value="/creditac")
public class CreditAcController {
	@Autowired
	CreditAccountRepository repository;
	
	@GetMapping(value="/ac/{id}")
	public CreditAccount getData(@PathVariable Integer id){
		
		return repository.getCreditAcById(id);
	}

}
