package com.sw409.FinalProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.FinalProject.models.Account;
import com.sw409.FinalProject.services.AccountService;

@CrossOrigin("*")
@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService = new AccountService();
	
	//create
	@PostMapping("api/v1/accounts")
	public Account createAccount(@RequestBody Account account)
	{
		return accountService.createAccount(account);
	}
	
	//read
	@GetMapping("api/v1/accounts")
	public List<Account> findAllAccount()
	{
		return accountService.findAllAccount();
	}
	
	//update
	@PutMapping("api/v1/accounts/{accountid}")
	public void updateAccount(@PathVariable("accountid") Integer id, @RequestBody Account account)
	{
		accountService.updateAccount(id, account);
		
	}
	
	//delete
	@DeleteMapping("api/v1/accounts/{accountid}")
	public void deleteAccount(@PathVariable("accountid") Integer id)
	{
		accountService.deleteAccount(id);
	}
	
	
}
