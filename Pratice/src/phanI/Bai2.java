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
public class Bai2 {
    public static void main(String[] args) {
        //Nhap a,b,neu a>b, hoan doi a,b
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();
        int temp;
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }
        System.out.println("a= "+a+"; b= "+b);
    }
}
