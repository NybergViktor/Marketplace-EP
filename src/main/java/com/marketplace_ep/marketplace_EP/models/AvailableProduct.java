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

    public AvailableProduct() {
        isActive = true;
        isAvailable = true;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<ESize> getSize() {
        return size;
    }

    public void setSize(List<ESize> size) {
        this.size = size;
    }

    public List<ECategory> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<ECategory> categoryList) {
        this.categoryList = categoryList;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getId() {
        return id;
    }
}
