
package com.example.demo.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.RBasketRepo;
import com.example.demo.entity.Basket;
import com.example.demo.entity.ElectronicProduct;
import com.example.demo.error.OrderNotFoundException;

@Service
public class BasketService implements IBasket {

	@Autowired
	RBasketRepo repo;

	@Override
	public Basket getBasketById(String id) {
		Basket basket = null;
		Optional<Basket> opbasket = repo.findById(id);
		basket = opbasket.get();
		return basket;
	}

	@Override
	public Basket addBasket(Basket basket) {
		Basket basket1 = null;
		Optional<Basket> opbasket = repo.findById(basket.getBasket_Id());
		if (opbasket.isEmpty()) {
			repo.save(basket);
			basket1 = basket;
		}
		return basket1;
	}

	public Basket removeBasket(String name) throws OrderNotFoundException {
		Optional<Basket> searchedOrder = repo.findById(name);
		if (searchedOrder.isPresent()) {
			Basket basketTodelete = searchedOrder.get();
			repo.delete(basketTodelete);
			return basketTodelete;
		} else {
			throw new OrderNotFoundException("Order you are trying to delete is not available");
		}
	}

	@Override
	public List<Basket> viewBasket() {
		List<Basket> allOrder = repo.findAll();
		return allOrder;
	}

	@Override
	public Basket removeBasket(int id) throws OrderNotFoundException {

		return null;
	}

	@Override
	public Basket addProduct(Basket basket, ElectronicProduct pr, int quantity)
	{
		
		Basket b = repo.getById(basket.getBasket_Id());
		if(b.equals(basket)) {
			
		}
		
		
		return null;
	}

}
