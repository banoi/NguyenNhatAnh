/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhanIII;

import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class Bai8 {
    //Viết chương trình mô phỏng máy rút tiền tự đông ATM. 
    //Giả sử rằng giá trị tài khoản được khởi đầu với 1.000.000 đồng và 
    //máy này cho phép thực hiện các thao tác rút tiền ấn R, nộp tiền ấn N và 
    //xem tài khoản ấn X. 
    //Khi rút tiền phải kiểm tra đảm bảo để số tiền còn lại không bị âm và 
    //số tiền rút là bội số của 50.000.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance=1000000;
        while(true){
            System.out.println("VIRTUAL ATM");
            System.out.println("An N: De nop tien");
            System.out.println("An R: De rut tien");
            System.out.println("An X: De xem so du");
            System.out.println("An E: De thoat");
            System.out.println("Vui long chon chuc nang:");
            sc = new Scanner(System.in);
            String n = sc.nextLine();
            switch(n){
                case "n":{
                    System.out.println("Nhap so tien can nop:");
                    int pay = sc.nextInt();
                    if(pay>0){
                        balance+=pay;
                        System.out.println("Nop tien thanh cong");
                    }
                    else{
                        System.out.println("So tien nop phai lon hon 0");
                    }
                    break;
                }
                case "r":{
                    System.out.println("Nhap so tien can rut: ");
                    int withdraw = sc.nextInt();
                    if(withdraw%50000==0 && balance-withdraw>=0){
                        balance-=withdraw;
                        System.out.println("Rut tien thanh cong");     
                    }
                    else{
                        System.out.println("So tien ban nhap khong phu hop hoac so du khong du");
                    }
                    break;
                }
                case "x":{
                    System.out.println("So du tai khoan: "+balance);
                    break;
                }
                case "e":{
                    System.out.println("Cam on quy khach da su dung dich vu cua chung toi");
                    System.exit(0);
                }
                default:{
                    System.out.println("Ban nhap khong hop le");
                    break;
                }
            }
        }
    }
}
