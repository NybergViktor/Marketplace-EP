package com.marketplace_ep.marketplace_EP.models;

import com.marketplace_ep.marketplace_EP.enums.ECategory;
import com.marketplace_ep.marketplace_EP.enums.ESize;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "availableProduct")
public class AvailableProduct {
    // title string
    // description string
    // price int
    // color string
    // category array enum
    // isActive boolean
    // isAvailable boolean
    @Id
    private String id;
    private String title;
    private String description;
    private int price;
    private String color;

    public List<ESize> size = new ArrayList<>();
    public List<ECategory> categoryList = new ArrayList<>();
    private boolean isActive;
    private boolean isAvailable;



}
