package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.dto.Purchase;
import com.luv2code.ecommerce.dto.PurchaseResponse;
import com.luv2code.ecommerce.entity.Customer;

import java.util.List;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
    List<Customer> findAll();
}
