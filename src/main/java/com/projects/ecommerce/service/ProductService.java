package com.projects.ecommerce.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.projects.ecommerce.model.Product;
import com.projects.ecommerce.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	
		public List<Product> getAllProducts(){
			
			return productRepo.findAll();
		}


		public Product getProductById(int id) {
			return productRepo.findById(id).get();
		}

		
		public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
			
			product.setImageName(imageFile.getOriginalFilename());
			product.setImageType(imageFile.getContentType());
			product.setImageDate(imageFile.getBytes());;
			
			return productRepo.save(product);
		}


		public Product updateByProductId(int id, Product product, MultipartFile imageFile) throws IOException {
			
			product.setImageType(imageFile.getContentType());
			product.setImageDate(imageFile.getBytes());
			product.setImageName(imageFile.getOriginalFilename());			
			return productRepo.save(product);
		}


		public void deleteProduct(int id) {
		productRepo.deleteById(id);
			
		}


		public List<Product> searchProducts(String keyword) {
			
			return productRepo.searchProducts(keyword);
		}
		
	}
	

