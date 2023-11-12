package com.fiserv.ffx.springmongodbtemplate.controller.v1;

import java.util.List;

import com.fiserv.ffx.springmongodbtemplate.service.ProductService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiserv.ffx.springmongodbtemplate.model.entity.Product;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping(value = "")
	public List<Product> getAllProducts() {
		return productService.findAll();
	}

	@PostMapping(value = "")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveOrUpdateProduct(product);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteForm(@PathVariable("id") String id) {
		productService.deleteById(id);
	}
}
