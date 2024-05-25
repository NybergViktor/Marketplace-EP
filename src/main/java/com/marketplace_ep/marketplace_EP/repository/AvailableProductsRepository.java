package com.marketplace_ep.marketplace_EP.repository;

import com.marketplace_ep.marketplace_EP.models.AvailableProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AvailableProductsRepository extends MongoRepository<AvailableProduct, String> {
}
