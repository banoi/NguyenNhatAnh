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
public class Bai1 {
    // Viết chương trình tìm ước số chung lớn nhất, 
    //bội số chung nhỏ nhất của hai số tự nhiên a và b.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();
        int a1=a;
        int b1=b;
        int c;
        if(a<b){
            c=a;
            a=b;
            b=c;
        }
        while(true){
            c=a%b;
            if(b>c){
                a=b;
                b=c;
            }
            else if(b<c){
                a=c;
            }
            if(b==c){
                break;
            }
        }
        System.out.println("UCNN = "+c);
        System.out.println("BCLN = "+(a1*b1/c));
    }
}
