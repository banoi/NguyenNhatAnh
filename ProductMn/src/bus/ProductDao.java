/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import entity.Product;
import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class ProductDao implements ProductBus{
    /*d. Tạo class ProductDAO trong package dao. Class này cài đặt giao diện nói trên. Ngoài ra, class còn có các thuộc tính
len: số nguyên chỉ ra số lượng sản phẩm có thể có
n: số nguyên chỉ ra số lượng sản phẩm thực sự tồn tại
p: mảng có thể chứa len sản phẩm
-	xây dựng hàm dựng không có tham số để khởi tạo giá trị cho các thuộc tính nói trên. Cho biết có thể chứa 20 sản phẩm, ban đầu chưa có sản phẩm nào cả
-	Ghi đè tất cả các phương thức cài đặt từ giao diện và cài đặt chức năng tương ứng
    */
    int len=10;
    int n;
    Product[] p = new Product[len];
    public ProductDao(){
        n=0;
    }
    @Override
    public void add(Product e){
        if(n<len){
            p[n]=e;
            n++;
            System.out.println("them thanh cong");
        }
        else{
            System.out.println("danh sach da day");
        }
    }

    @Override
    public boolean delete(int code) {
        Product[] k = new Product[n];
        int m=0;
        for(int i=0;i<n;i++){
            if(code!=p[i].getCode()){
                k[m]=p[i];
                m++;
            }
        }
        if(m!=0){
            p=k;
            n=m;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void sort() {
        Product tam = new Product();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(p[i].getQuantity()*p[i].getPrice()>p[j].getQuantity()*p[j].getPrice()){
                    tam=p[i];
                    p[i]=p[j];
                    p[j]=tam;
                }
            }
        }
    }

    @Override
    public void display() {
       for(int i=0;i<n;i++){
           System.out.println("code: "+p[i].getCode()+" name: "+p[i].getName()+
                              " quantity: "+p[i].getQuantity()+" price: "+p[i].getPrice());
       }
    }
}
