
package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Basket;
import com.example.demo.entity.ElectronicProduct;
import com.example.demo.error.OrderNotFoundException;

@Service
public interface IBasket {

	public Basket getBasketById(String id);

	public Basket addBasket(Basket basket);

	public Basket removeBasket(int id) throws OrderNotFoundException;

	public List<Basket> viewBasket();

	public Basket addProduct(Basket basket, ElectronicProduct pr, int quantity);

}
