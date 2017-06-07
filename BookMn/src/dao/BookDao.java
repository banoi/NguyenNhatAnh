/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Book;
import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class BookDao {
 //2. Class BookDAO để quản lý sách, gồm các thuộc tính
    int max=10;
    int len;
    Book[] book = new Book[max];
    public BookDao(){
        len=0;
    }
//-  boolean create (Book b) :  thêm b vào mảng book. 
    public boolean create(Book b){
        if(len<max){
            book[len]=b;
            len++;
            return true;
        }
        else{
            return false;
        }
    }
//- void discount(int code) để giảm giá cho sách có code chỉ ra, giá trị giảm nhập từ bàn phím. 
//        Kiểm tra tính hợp lệ của giá trị giảm, lưu ý giá trị giảm không vượt quá price/3. 
//        Hiển thị thông báo thích hợp
    public void discount(int code){
        for(int i=0;i<len;i++){
            if(book[i].getCode()==code){
                System.out.println("So tien giam: ");
                Scanner sc = new Scanner(System.in);
                int money = sc.nextInt();
                if(money <= book[i].getPrice()/3){
                    book[i].setPrice(book[i].getPrice()-money);
                    System.out.println("Giam gia thanh cong");
                }
                else{
                    System.out.println("So gia giam bi vi pham");
                }
            }
        }
    }
//- void display(int q) để hiển thị tất các book có quanty = q
    public void display(int q){
          for(int i=0;i<len;i++){
              if(book[i].getQuantity()==q){
                  System.out.println("code: "+book[i].getCode()+" name: "+book[i].getName()+
                          " quantity: "+book[i].getQuantity()+" price: "+book[i].getPrice());
              }
          }
    }
//- int totalPrice() trả về tổng số tiền tất cả các book trong danh sách
    public int totalPrice(){
        int sum=0;
        for(int i=0;i<len;i++){
            sum=sum+(book[i].getQuantity()*book[i].getPrice());
        }
        return sum;
    }
//- int maxPrice() để trả giá tiền lớn nhất trong tất cả các book
    public int maxPrice(){
        int max = -1;
        for(int i=0;i<len;i++){
            if(max<book[i].getPrice()){
                max=book[i].getPrice();
            }
        }
        return max;
    }
//- Book find(int code): trả về book có code chỉ ra, nếu không tìm thấy, trả về null
    public Book find(int code){
        for(int i=0;i<len;i++){
            if(book[i].getCode()==code){
                return book[i];
            }
        }
        return null;
    }
}
