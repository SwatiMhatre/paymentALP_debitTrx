package org.payment.debitsc.controller;

import java.util.List;

import org.payment.debitsc.dto.DebitAccount;
import org.payment.debitsc.repository.DebitAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class DebitAcController {
	@Autowired
	DebitAccountRepository repository;
	//DebitAccountDaoService debitAccountDaoService;
	
	@GetMapping(value="/debitac/getAll")
	public List<DebitAccount> getAll(){
		System.out.println("getAll called from debit account controller");
		return repository.findAll();
	}
	
	@GetMapping(value="/debitac/ac/{id}")
	public DebitAccount getData(@PathVariable Integer id){
		return repository.getDebitAcById(id);
	}
	
	@GetMapping(value="/debitac/test")
	public String test(){
		System.out.println("test callye");
		return "test called!!";
	}

}
