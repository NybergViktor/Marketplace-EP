package com.marketplace_ep.marketplace_EP.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "giftcard")
public class Giftcard {

    // title string
    // description string
    // price int
    // isActive boolean

    private String title;
    private String description;
    private int price;
    private boolean isActive;
}
