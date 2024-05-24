package com.marketplace_ep.marketplace_EP.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orderProduct")
public class orderProduct {


    // title int
    // description string
    // price int
    // size array enum
    // color string
    // category array enum
    // isActive boolean
    // availableProductId dbref
    @Id
    private String id;

    private String description;
    private int price;
    private double size;
    private String color;
    private String category;
    private boolean isActive;
    @DBRef
    private availableProduct availableProduct;


}
