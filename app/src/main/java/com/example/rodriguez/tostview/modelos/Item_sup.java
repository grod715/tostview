package com.example.rodriguez.tostview.modelos;

/**
 * Created by Rodriguez on 13/09/2016.
 */
public class Item_sup {
    public String getText() {
        return text;
    }

    private String text;

    public String getImg() {
        return img;
    }

    private String img;

    public Item_sup(String text, String img) {
        this.text = text;
        this.img = img;
    }
}
