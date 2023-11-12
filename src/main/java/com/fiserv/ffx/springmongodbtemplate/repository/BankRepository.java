package com.fiserv.ffx.springmongodbtemplate.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fiserv.ffx.springmongodbtemplate.model.entity.Bank;

public interface BankRepository extends MongoRepository<Bank, String> {

	List<Bank> findAll();

	Bank findByName(String name);

	Bank save(Bank bank);
	
	void deleteById(String id);
}

