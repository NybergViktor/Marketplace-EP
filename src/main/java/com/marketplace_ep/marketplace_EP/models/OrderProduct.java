package com.marketplace_ep.marketplace_EP.models;

import com.marketplace_ep.marketplace_EP.enums.ECategory;
import com.marketplace_ep.marketplace_EP.enums.ESize;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "orderProduct")
public class OrderProduct {


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

    public List<ESize> size = new ArrayList<>();
    private String color;
    public List<ECategory> categoryList = new ArrayList<>();
    private boolean isActive;
    @DBRef
    private AvailableProduct availableProduct;


}
