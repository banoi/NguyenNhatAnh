/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class SoHoanHao {
    //Hãy nhập vào một số nguyên dương 
    //và sau đó xác định só đó có phải là số hoàn hảo hay ko?
    public int hoanhao(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoHoanHao shh = new SoHoanHao();
        System.out.println("Nhap so nguyen duong n = ");
        int n = sc.nextInt();
        if(n>0){
            if(shh.hoanhao(n)==1){
                System.out.println(+n+" la so hoan hao");
            }
            else{
                System.out.println(+n+" KHONG la so hoan hao");
            }
        }
        else{
            System.out.println("Ban nhap khong hop le");
        }
    }
}
