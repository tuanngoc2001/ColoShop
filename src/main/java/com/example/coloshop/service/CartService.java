package com.example.coloshop.service;

import com.example.coloshop.model.Cart;

public interface CartService {
    void save(Cart cart);
    Iterable<Cart>getNumberCart(int id,int status);
    void deleteCart(int id);
}