package com.marketplace_ep.marketplace_EP.models;

import com.marketplace_ep.marketplace_EP.enums.EGrade;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "reviews")
public class Reviews {

    //grade enum
    // comment string
    // name string not required if empty anonym
    // productId string
    public List<EGrade> grade = new ArrayList<>();
    private String comment;
    private String name;
    private String productId;
}
