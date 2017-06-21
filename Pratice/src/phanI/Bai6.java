package phan1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Bai6 {
    //Kiem tra n la so chinh phuong
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        for(int i=0;i<=n/2;i++){
            if(i*i==n){
                System.out.println(n+" la so chinh phuong");
                System.exit(0);
            }
        }
       System.out.println(n+" KHONG la so chinh phuong");
    }
}
