package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.ElectronicProduct;

public interface IElectronicProduct {
	public ElectronicProduct addProduct(ElectronicProduct product);
	public ElectronicProduct updateProduct(ElectronicProduct product) throws Exception;
	public ElectronicProduct removeProduct(int productId) throws Exception;
	public List<ElectronicProduct> showAllProducts();
	public Optional<ElectronicProduct> viewProduct(int ProductdId);
	public List<ElectronicProduct> showProductListByName(String name);
	

}
