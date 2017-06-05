/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import entity.Product;

/**
 *
 * @author HP Envy 15
 */
public interface ProductBus {
    /*c. Tạo Giao diện ProductBus trong package bus, giao diện này có các phương thức
- public void add(): nhập thông tin một sản phẩm mới từ bàn phím. Hiển thị thông báo sau khi nhập
- public boolean delete(): xóa sản phẩm ra khỏi danh sách dựa vào mã sản phẩm được nhập vào từ bàn phím
- public void sort(): sắp xếp các sản phẩm theo thứ tự tăng dần của thành tiền (fPrice = price*quantity)
- public void display(): hiển thị thông tin các sản phẩm. Thông tin gồm code, name, quantity, fPrice
    */
    public void add(Product e);
    public boolean delete(int code);
    public void sort();
    public void display();
    
}
