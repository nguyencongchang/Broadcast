package com.example.serviceandroidtutorial;

import java.io.Serializable;

public class Song implements Serializable {
    private String title;
    private String signer;
    private int image;
    private int resource;

    public Song(String title, String signer, int image, int resource) {
        this.title = title;
        this.signer = signer;
        this.image = image;
        this.resource = resource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
}
