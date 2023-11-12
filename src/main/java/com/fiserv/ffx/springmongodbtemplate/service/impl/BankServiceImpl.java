package com.fiserv.ffx.springmongodbtemplate.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fiserv.ffx.springmongodbtemplate.model.entity.Bank;
import com.fiserv.ffx.springmongodbtemplate.repository.BankRepository;
import com.fiserv.ffx.springmongodbtemplate.service.BankService;

@Service
public class BankServiceImpl implements BankService {

	private BankRepository bankRepository;

	public BankServiceImpl(BankRepository bankRepository) {
		this.bankRepository = bankRepository;
	}

	@Override
	public List<Bank> findAllBanks() {
		return bankRepository.findAll();
	}

	@Override
	public Bank findByName(String name) {
		return bankRepository.findByName(name);
	}

	@Override
	public Bank save(Bank bank) {
		return bankRepository.save(bank);
	}

	@Override
	public void deleteById(String id) {
		bankRepository.deleteById(id);
	}
}
