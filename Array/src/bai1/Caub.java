/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class Caub {
    //In ra màn hình các số nguyên tố.
    public int nguyenTo(int n){
         if (n > 1) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return 0;
                }
            }
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caub cb = new Caub();
        int a[] = new int[10];
        for(int i=0;i<10;i++){
            System.out.printf("a[%d]= ",i);
            a[i]=sc.nextInt();
            tt:if(a[i]<=100 || a[i]>=999){
                System.out.println("Ban nhap khong hop le");
                System.out.printf("Nhap lai: a[%d] = ",i);
                a[i]=sc.nextInt();
                break tt;
            }
        }
        int sum=0;
        for(int i=0;i<10;i++){
            if(cb.nguyenTo(a[i])==1){
                sum+=a[i];
            }
        }
        System.out.println("Tong cac so nguyen to trong mang: "+sum);
    }
}
