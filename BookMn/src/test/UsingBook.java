/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.BookDao;
import dto.Book;
import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class UsingBook {
//- hiển thị tổng thành tiền của tất cả các sách
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDao dao = new BookDao();
        //- tạo 3 book, thông tin nhập vào từ bàn phím. Kiểm tra tính hợp lệ cho code, quanty, price. 
        //Hiển thị thông báo sau khi thêm mới book
        System.out.println("Nhap thong tin cho 3 quyen sach: ");
        for(int i=0;i<3;i++){
            System.out.println("Book "+(i+1)+":");
            System.out.println("code: ");
            int code = sc.nextInt();
            System.out.println("name: ");
            sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("quantity: ");
            int quantity = sc.nextInt();
            System.out.println("price: ");
            int price = sc.nextInt();
            Book e = new Book(code, name, quantity, price);
            dao.create(e);
        }
        //- Nhập code từ bàn phím, giảm giá cho quyển sách có code này. 
        //Hiển thị thông tin book có code bằng với giá trị code này
        System.out.println("Giam gia cho sach: ");
        System.out.println("code: ");
        int code = sc.nextInt();    
        dao.discount(code);
        //- hiển thị giá tiền đắt nhất trong các sách
        System.out.println("Gia tien lon nhat: "+(dao.maxPrice()));
        //- hiển thị tổng thành tiền của tất cả các sách
        System.out.println("Tong tien cua tat ca cac sach: "+(dao.totalPrice()));
    }
}
