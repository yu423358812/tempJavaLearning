package com.fiserv.ffx.springmongodbtemplate.service;

import java.util.List;

import com.fiserv.ffx.springmongodbtemplate.model.entity.Bank;

public interface BankService {

	List<Bank> findAllBanks();

	Bank findByName(String name);
	
	Bank save(Bank bank);
	
	void deleteById(String id);
}

