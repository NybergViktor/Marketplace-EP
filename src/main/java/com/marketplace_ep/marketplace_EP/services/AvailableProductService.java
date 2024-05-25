package com.marketplace_ep.marketplace_EP.services;

import com.marketplace_ep.marketplace_EP.dto.availableProductsDTO.CreateAvailableDTO;
import com.marketplace_ep.marketplace_EP.models.AvailableProduct;
import com.marketplace_ep.marketplace_EP.repository.AvailableProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AvailableProductService {
    @Autowired
    AvailableProductsRepository availableProductsRepository;

    public ResponseEntity<?> createAvailableProduct(CreateAvailableDTO createAvailableDTO) {
        AvailableProduct newAvailableProduct = new AvailableProduct();
        newAvailableProduct.setTitle(createAvailableDTO.getTitle());
        newAvailableProduct.setDescription(createAvailableDTO.getDescription());
        newAvailableProduct.setPrice(createAvailableDTO.getPrice());
        newAvailableProduct.setCategoryList(createAvailableDTO.getCategoryList());
        newAvailableProduct.setColor(createAvailableDTO.getColor());
        newAvailableProduct.setSize(createAvailableDTO.getSize());

        availableProductsRepository.save(newAvailableProduct);
        return ResponseEntity.ok("availableProduct created");
    }
}
