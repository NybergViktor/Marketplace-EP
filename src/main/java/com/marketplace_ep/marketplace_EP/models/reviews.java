package com.marketplace_ep.marketplace_EP.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class reviews {

    //grade enum
    // comment string
    // name string not required if empty anonym
    // productId string
}
