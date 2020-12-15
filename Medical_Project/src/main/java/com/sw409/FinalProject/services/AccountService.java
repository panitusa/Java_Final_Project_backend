package com.sw409.FinalProject.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.FinalProject.models.Account;
import com.sw409.FinalProject.repositories.AccountRepository;

@Service
public class AccountService {
	
	List<Account> accountList = new ArrayList<>();
	
	@Autowired
	AccountRepository accountRepo;
	

	//create
	public Account createAccount(Account account)
	{
		accountList.add(account);
		return accountRepo.save(account);
	}
	
	//read
	public List<Account> findAllAccount()
	{
		return (List<Account>)accountRepo.findAll();
		
	}
	
	//update
	public void updateAccount (Integer id, Account a)
	{
		Account oldAccount = accountRepo.findById(id).get();
		oldAccount.setEmail(a.getEmail());
		oldAccount.setPassword(a.getPassword());
		oldAccount.setUsername(a.getUsername());
		accountRepo.save(a);
		
	}
	
	//delete
	public void deleteAccount(Integer id)
	{
		accountRepo.deleteById(id);
	}
	
}
