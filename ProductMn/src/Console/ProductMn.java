/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import bus.ProductDao;
import entity.Product;
import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class ProductMn {
    //Tạo class ProductMn trong gói console. Class này có hàm main thực thi các nhiệm vụ sau:
    public static void main(String[] args) {
        //- Tạo đối tượng ProductDAO
        ProductDao dao = new ProductDao();
        Scanner sc = new Scanner(System.in);
        //- thêm thong tin 3 sản phẩm
        System.out.println("Them thong tin 3 san pham: ");
        for(int i=0;i<3;i++){
            System.out.println("code: ");
            int code = sc.nextInt();
            System.out.println("name: ");
             sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("quantity: ");
            int quantity =sc.nextInt();
            System.out.println("price: ");
            int price = sc.nextInt();
            Product e = new Product(code, name, quantity, price);
            dao.add(e);
        }
         //Xóa sản phẩm có code bất kì. Hiển thị thong báo sau khi xóa
        System.out.println("De xoa san pham, nhap code: ");
        int code = sc.nextInt();
        if(true==dao.delete(code)){
            System.out.println("Xoa thanh cong");
        }
        else{
            System.out.println("Xoa KHONG thanh cong");
        }
        //- Hiển thị danh sách sản phẩm theo thứ tự tăng dần của thành tiền
        System.out.println("hien thi danh sach san pham theo thu tu tang dan cua thanh tien");
        dao.sort();
        dao.display();
        //
    }
}
