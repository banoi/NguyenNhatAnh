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
public class Caug {
    //Tìm số lớn thứ 2 trong mảng.
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
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=1;i<n;i++){
            if(a[i]<a[0]){
                System.out.println("So lon thu 2 trong mang la: "+a[i]);
                break;
            }
        }
    }
}
