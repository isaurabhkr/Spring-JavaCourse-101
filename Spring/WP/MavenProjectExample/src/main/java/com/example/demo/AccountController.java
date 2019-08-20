package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@Autowired
	Accountservice accountService;
	@RequestMapping("/accounts/{Id}")
	
	public Account getAccountById(@PathVariable("Id") int accNo)
	{
		return accountService.findAccountBY(accNo);
	}
	
	@RequestMapping("/accounts/getall")
	public List<Account> getAccounts()
	{
		return accountService.getallAccount();
	}
}
