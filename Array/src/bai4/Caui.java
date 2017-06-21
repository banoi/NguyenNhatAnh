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
public class Caui {
    //In ra danh sách các số trùng nhau trong mảng.
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
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int i=0;
        int j=1;
        System.out.println("Cac so bi trung nhau la: ");
        while(i<n){
            if(a[i]==a[j]){
                System.out.print(+a[j]+"\t");
                do{
                    j++;
                }
                while(a[i]==a[j]);
                if(j==n-1){
                    System.exit(0);
                }
                else{
                    i=j;
                    j++;
                }
            }
            else{
                if(j<n-1){
                    i++;
                    j++;
                }
                else{
                    System.exit(0);
                }
            }
        }
    }
}
