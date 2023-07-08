package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.BankHandlingException;
import com.app.dto.ApiResponse;
import com.app.dto.BankDto;
import com.app.entities.Bank;
import com.app.repository.BankRepository;
@Service
@Transactional
public class BankServiceImpl implements BankService {
	@Autowired
private BankRepository bankRepo;
	@Override
	public List<Bank> getAllAccounts() {
		System.out.println("in list of Bank method...");
		return bankRepo.findAll();
	}
	@Override
	public Bank addBankAccount(Bank b) {
		// TODO Auto-generated method stub
		return bankRepo.save(b);
	}
	@Override
	public Bank getAccoBankById(Long id) {
		// TODO Auto-generated method stub
		return bankRepo.findById(id).orElseThrow(()->new BankHandlingException("id is not found"));
	}
	@Override
	public String deleteAccoById(Long id) {
		String msg="Account deleted Sucessfully......";
	if(bankRepo.existsById(id)) {
		bankRepo.deleteById(id);
	}
		return msg;
	}
	@Override
	public Bank updateAccount(Bank bt) {
		 
		return bankRepo.save(bt);
	}

}
