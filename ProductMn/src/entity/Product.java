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
public class Product extends Good{
    /*b. Tạo Class Product nằm trong package entity, kế thừa class Good. Class này còn có các thuộc tính private
quantity: số nguyên chỉ ra số lượng
price: số nguyên chỉ ra giá của sản phẩm
- Xây dựng hàm dựng mặc định, hàm dựng có tham số để khởi tạo giá trị cho các thuộc tính của class
- Xây dựng các phương thức get và set cho 2 thuộc tính private nói trên*/
    private int quantity;
    private int price;

    public Product() {
    }

    public Product(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Product(int code, String name,int quantity, int price) {
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
