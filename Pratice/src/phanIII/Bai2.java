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
public class Bai2 {
    //Viết chương trình chuyển đổi một số tự nhiên 
    //ở hệ cơ số 10 thành số ở hệ cơ số b bất kì (1< b≤ 36).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        if(n>=0){
            System.out.println("b = ");
            int b = sc.nextInt();
            int a[] = new int[20];
            int count=0;
            if(b>1 && b<=36){
                while(n!=0){
                    a[count]=n%b;
                    System.out.println("a="+a[count]);
                    n=(int)(n/b);
                    System.out.println("n = "+n);
                    count++;
                }
            }
            System.out.println("n chuyen qua co so b la: ");
            for(int i=count-1;i>=0;i--){
                System.out.print(+a[i]+" ");
            }
        }
    }
}
