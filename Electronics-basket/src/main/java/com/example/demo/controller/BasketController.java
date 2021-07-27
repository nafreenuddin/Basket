
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.IBasket;
import com.example.demo.entity.Basket;
import com.example.demo.entity.ElectronicProduct;
import com.example.demo.error.OrderNotFoundException;

@RestController
@RequestMapping("/api")
public class BasketController {

	@Autowired
	IBasket basketService;

	@GetMapping("basket/{id}")
	public Basket getBasketById(@PathVariable String id) {
		Basket basket = basketService.getBasketById(id);
		return basket;
	}

	
	@PostMapping("basket")
	public Basket addBasket(@RequestBody Basket basket) {
		Basket basket1 =  basketService.addBasket(basket);
		return basket1;
	}

	@DeleteMapping("basket/{id}")
	public Basket removeBasket(@PathVariable int id) throws OrderNotFoundException {

		return basketService.removeBasket(id);
	}
	 @GetMapping("baskets")
	public List<Basket> viewBasket() {
		List<Basket> basket2 = basketService.viewBasket();
		return basket2;
	}
	 
	public Basket addProduct(Basket basket,ElectronicProduct pr,int quantity) {
		Basket addingProduct = basketService.addProduct(basket,pr,quantity);
		return addingProduct;
	}

}

