/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class Cauf {
    //Nhập vào 1 số x từ bàn phím, in ra danh sách số trong mảng lớn hơn x, 
    //các số trong mảng nhỏ hơn x.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Mang co so phan tu: ");
        int n = sc.nextInt();
        System.out.println("Nhap mang: ");
        for(int i=0;i<n;i++){
            System.out.printf("a[%d] = ",i);
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap x = ");
        int x = sc.nextInt();
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        if(x<a[0]){
            System.out.println("Khong co so nho hon x");
        }
        else{
            System.out.println("Cac so nho hon x: ");
            for(int i=0;i<n;i++){
                if(i==0 && a[i]<x){
                    System.out.print(+a[i]+"\t");
                }
                if(i>0 && a[i]<x && a[i-1]!=a[i]){
                    System.out.print(+a[i]+"\t");
                }
            }
        }
        if(x>a[n-1]){
            System.out.println("Khong co so lon hon x");
        }
        else{
            System.out.println("\nCac so lon hon x: ");
            for(int i=0;i<n;i++){
                if(i==0 && a[i]>x){
                    System.out.print(+a[i]+"\t");
                }
                if(i>0 && a[i]>x && a[i-1]!=a[i]){
                    System.out.print(+a[i]+"\t");
                }
            }
        }
    }
}
