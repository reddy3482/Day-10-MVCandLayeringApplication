package com.moneymoney.app.console.controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import com.moneymoney.framework.account.dao.BankAccountCollection;
import com.moneymoney.framework.account.pojo.BankAccount;
import com.moneymoney.framework.account.pojo.Customer;
import com.moneymoney.framework.controller.BankController;
import com.moneymoney.framework.factory.BankFactory;

public class MMBankAccountController extends BankController {

	BankFactory factory;
	BankAccountCollection collection;
	
	public MMBankAccountController(BankFactory factory, BankAccountCollection collection) {
		super();
		this.factory = factory;
		this.collection = collection;
	}

	@Override
	public void createNewCurrentAccount(Map<String, Object> arg0) {
		collection.addBankAccount(factory.createNewCurrentAccount(arg0););
		
	}

	@Override
	public void createNewSavingsAccount(Map<String, Object> arg0) {
		collection.addBankAccount(factory.createNewSavingsAccount(arg0););
	}

	@Override
	public Collection<BankAccount> getAllAccounts() {
		return collection.viewAll();
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		List<Customer> ListOfCustomers=new ArrayList<>();
		(collection.viewAll().stream().forEach((element)-> listOfCustomers.add(element.getAccountHolder()));
		return ;
	}

}
