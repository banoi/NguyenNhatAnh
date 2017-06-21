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
public class Bai1 {
    public static void main(String[] args) {
        //Nhap vao 3 so nguyen,in ra man hinh so nho nhat va lon nhat
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();
        System.out.println("c = ");
        int c = sc.nextInt();
        int max=a;
        int min=a;
        max=max>b?max:b;
        max=max>c?max:c;
        min=min<b?min:b;
        min=min<c?min:c;
        System.out.println("max = "+max+"; min= "+min);
    }
}
