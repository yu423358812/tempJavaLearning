package com.fiserv.ffx.springmongodbtemplate.service.impl;

import java.util.List;
import java.util.Optional;

import com.fiserv.ffx.springmongodbtemplate.service.ProductService;
import org.springframework.stereotype.Service;

import com.fiserv.ffx.springmongodbtemplate.model.entity.Product;
import com.fiserv.ffx.springmongodbtemplate.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findById(String id) {
		return productRepository.findById(id);
	}

	@Override
	public Product saveOrUpdateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteById(String id) {
		productRepository.deleteById(id);
	}

}
