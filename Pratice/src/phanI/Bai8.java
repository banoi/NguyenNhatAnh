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
public class Bai8 {
    //Nhap va in ket qua cua bien thuc
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();
        System.out.println("c = ");
        int c = sc.nextInt();
        System.out.println("ket qua cau b: "+String.valueOf((30<b) || !(c<b)));
    }
}
