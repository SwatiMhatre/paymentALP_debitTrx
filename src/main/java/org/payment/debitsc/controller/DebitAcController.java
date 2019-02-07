package org.payment.debitsc.controller;

import org.payment.debitsc.dto.DebitAccount;
import org.payment.debitsc.repository.DebitAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
@RequestMapping(value="/debitac")
public class DebitAcController {
	@Autowired
	DebitAccountRepository repository;
	//DebitAccountDaoService debitAccountDaoService;
	
	@GetMapping(value="/ac/{id}")
	public DebitAccount getData(@PathVariable Integer id){
		
		return repository.getDebitAcById(id);
	}

}
