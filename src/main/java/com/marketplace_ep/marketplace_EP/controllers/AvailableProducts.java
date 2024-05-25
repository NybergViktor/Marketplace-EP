package com.marketplace_ep.marketplace_EP.controllers;

import com.marketplace_ep.marketplace_EP.dto.availableProductsDTO.CreateAvailableDTO;
import com.marketplace_ep.marketplace_EP.exceptions.EntityNotFoundException;
import com.marketplace_ep.marketplace_EP.services.AvailableProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/api/availableproduct")
public class AvailableProducts {

    @Autowired
    AvailableProductService availableProductService;

    @PostMapping("/create")
    public ResponseEntity<?> createAvailableProduct(@RequestBody CreateAvailableDTO createAvailableDTO) {
        try {
            return ResponseEntity.ok(availableProductService.createAvailableProduct(createAvailableDTO));
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
