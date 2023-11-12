package com.fiserv.ffx.springmongodbtemplate.controller.v1;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiserv.ffx.springmongodbtemplate.model.entity.Bank;
import com.fiserv.ffx.springmongodbtemplate.service.BankService;

@RestController
@RequestMapping("/v1/bank")
public class BankController {

	private BankService bankService;

	public BankController(BankService bankService) {
		this.bankService = bankService;
	}

	@GetMapping(value = "")
	public List<Bank> getAllBanks() {
		return bankService.findAllBanks();
	}

	@PostMapping(value = "")
	public Bank saveProduct(@RequestBody Bank bank) {
		return bankService.save(bank);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteForm(@PathVariable("id") String id) {
		bankService.deleteById(id);
	}
}