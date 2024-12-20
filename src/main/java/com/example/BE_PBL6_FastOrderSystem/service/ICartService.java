package com.example.BE_PBL6_FastOrderSystem.service;

import com.example.BE_PBL6_FastOrderSystem.entity.Combo;
import com.example.BE_PBL6_FastOrderSystem.entity.Product;
import com.example.BE_PBL6_FastOrderSystem.entity.Size;
import com.example.BE_PBL6_FastOrderSystem.request.CartComboRequest;
import com.example.BE_PBL6_FastOrderSystem.request.CartProductRequest;
import com.example.BE_PBL6_FastOrderSystem.response.APIRespone;
import org.springframework.http.ResponseEntity;

public interface ICartService {
    ResponseEntity<APIRespone> addProductToCart(Long userId, CartProductRequest cartProductRequest);

    Double getPriceBasedProductOnSize(Product product, Size size);

    Double getPriceBasedComboOnSize(Combo combo, Size size);

    ResponseEntity<APIRespone> addComboToCart(Long userId, CartComboRequest cartComboRequest);

    ResponseEntity<APIRespone> getHistoryCart(Long userId);

    ResponseEntity<APIRespone> deleteCart(Long userId, Long cartId);

    ResponseEntity<APIRespone> updateCart(Long userId, Long cartId, Integer quantity);

    ResponseEntity<APIRespone> getAllStoreCart(Long userId);

    ResponseEntity<APIRespone> getCartByStore(Long userId, Long storeId);

    ResponseEntity<APIRespone> getCartById(Long userId, Long cartid);
}
