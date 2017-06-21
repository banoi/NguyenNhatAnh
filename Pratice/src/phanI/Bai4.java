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
public class Bai4 {
    //Viet chuong trinh tinh tong binh phuong cac so le tu 1 den n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum=sum+i*i;
        }
        System.out.println("Kq: "+sum);
    }
}
