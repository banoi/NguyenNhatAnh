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
public class Bai7 {
    //Chuyen do F qua do C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do C = ");
        float c = sc.nextFloat();
        System.out.println(c+" do C = "+(c*180/100+32)+" do F");
    }
}
