package com.marketplace_ep.marketplace_EP.dto.availableProductsDTO;

import com.marketplace_ep.marketplace_EP.enums.ECategory;
import com.marketplace_ep.marketplace_EP.enums.ESize;

import java.util.ArrayList;
import java.util.List;

public class CreateAvailableDTO {
    private String title;
    private String description;
    private int price;
    private String color;

    public List<ESize> size = new ArrayList<>();
    public List<ECategory> categoryList = new ArrayList<>();


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

}
