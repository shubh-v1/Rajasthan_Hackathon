package com.example.shubham.tourderaj;

/**
 * Created by adityasingh on 20/03/18.
 */

public class Destination {

    private String name;
    private String description;
    private String image;
    private float rating;

    public Destination(String name,String description,String image,float rating){
        this.description=description;
        this.image=image;
        this.name=name;
        this.rating=rating;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public void setImage(String image){
        this.image=image;
    }

    public void setRating(float rating){
        this.rating=rating;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getImage(){
        return image;
    }

    public float getRating(){
        return rating;
    }
}
