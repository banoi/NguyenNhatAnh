/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author HP Envy 15
 */
public class Book extends Magezine{
    /*Class Book kế thừa class Magezine, đồng thời chứa thêm các thuộc tính private
quanty – int : số lượng sách
price – int : giá sách
Các phương thức:
- xây dựng hàm dựng mặc định và hàm dựng có tham số để khởi tạo các thuộc tính trên
- xây dựng các phương thức get, set cho các thuộc tính private nói trên
    */
    private int quantity;
    private int price;

    public Book() {
    }

    public Book(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Book(int code, String name, int quantity, int price) {
        super(code, name);
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
