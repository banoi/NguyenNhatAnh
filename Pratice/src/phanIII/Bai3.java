/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhanIII;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai3 {
//Viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. 
//Ví dụ: Số  8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        if(n<0){
            n=-n;
        }
        int sum=0;
        while(n!=0){
            sum = sum + (n%10);
            n = n/10;
        }
        System.out.println("Tong cac chu so cua n la: "+sum);
    }
}
