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
public class Caub {
    //Liệt kê các số lẻ ở vị trí lẻ trong mảng.
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
        System.out.println("Liet ke cac so chan o vi tri le");
        for(int i=0;i<n;i++){
            if(i%2!=0){
                System.out.print(+a[i]+"\t");
            }
        }
    }
}
