package com.app.service;

import java.util.List;

import com.app.dto.BankDto;
import com.app.entities.Bank;

public interface BankService {
	List<Bank> getAllAccounts();
	Bank addBankAccount(Bank b);
	Bank getAccoBankById(Long id);
	String deleteAccoById(Long id);
	
	Bank updateAccount(Bank bt);

}
