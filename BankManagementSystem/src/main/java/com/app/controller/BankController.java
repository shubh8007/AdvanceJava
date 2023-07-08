package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Bank;
import com.app.service.BankService;

@RestController
@RequestMapping("/banks")
public class BankController {
	@Autowired
	private BankService bankSer;
	@GetMapping
	public List<Bank> getAllAccounts() {
		return bankSer.getAllAccounts();	
	}
	@PostMapping
	public Bank addBankAccount(@RequestBody Bank b1) {
		return bankSer.addBankAccount(b1);
	}
	@GetMapping("/{id}")
	public Bank getAccountById(Long id) {
		return bankSer.getAccoBankById(id);
	}
       @DeleteMapping("/{id}")
	public String deleteAccById(Long id) {
		bankSer.deleteAccoById(id);
		return "deleted";
		
	}
       @PutMapping("/{id}")
       public Bank updateAccount(@RequestBody Bank b,Long id) {
    	   return bankSer.updateAccount(b);
       }
}
