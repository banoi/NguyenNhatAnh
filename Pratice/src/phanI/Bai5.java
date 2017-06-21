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
public class Bai5 {
    //Tinh dien tich, the tich hinh cau
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("r = ");
        float r = sc.nextFloat();
        double pi = 3.14;
        System.out.println("Dien tich hinh cau la: "+(4*pi*r*r)+"\n");
        System.out.println("The tich hinh cau la: "+(4*pi*r*r*r/3));
    }
}
