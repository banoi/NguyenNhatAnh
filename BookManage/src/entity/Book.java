/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author HP Envy 15
 */
public class Book {
    /*a.Class Book in entity package to describe detail of a book. 
    It has private properties: code (int), name (String), quantity (int) and price (float)
    Create getter and setter methods of the above properties	*/
    private int code;
    private String name;
    private int quantity;
    private float price;

    public Book() {
    }

    public Book(int code, String name, int quantity, float price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
