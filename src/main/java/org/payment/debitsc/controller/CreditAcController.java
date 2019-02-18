package org.payment.debitsc.controller;

import java.util.List;

import org.payment.debitsc.dto.CreditAccount;
import org.payment.debitsc.dto.DebitAccount;
import org.payment.debitsc.repository.CreditAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CreditAcController {
	@Autowired
	CreditAccountRepository repository;
	
	@GetMapping(value="/creditac/ac/{id}")
	public CreditAccount getData(@PathVariable Integer id){

		return repository.getCreditAcById(id);
	}
	
	@GetMapping(value="/creditac/getAll")
	public List<CreditAccount> getAll(){
		return repository.findAll();
	}

}
