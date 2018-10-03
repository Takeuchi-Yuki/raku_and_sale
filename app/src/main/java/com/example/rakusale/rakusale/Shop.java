package com.example.rakusale.rakusale;

public class Shop {
    private String name;
    private String imageUrl;
    private String location;

    public Shop(String name, String imageUrl,String location){
        this.name = name;
        this.imageUrl = imageUrl;
        this.location = location;
    }

    public String getName(){
        return name;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public String getLocation(){
        return location;
    }
}
