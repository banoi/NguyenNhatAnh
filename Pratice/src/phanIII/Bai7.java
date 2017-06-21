/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhanIII;

import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class Bai7 {
    //Dãy số Fibonacci được định nghĩa như sau: F0 =1, F1 = 1; Fn = Fn-1 + Fn-2 với n>=2. 
    //Hãy viết chương trình tìm số Fibonacci thứ n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        int f0=1,f1=1;
        int fn=0;
        int count=3;
        if(n==1 || n==2){
            System.out.println("So Fibonacci thu "+n+" la: "+1);
            System.exit(0);
        }
        while(count<=n){
            fn=f0+f1;
            f0=f1;
            f1=fn;
            count++;
        }
        System.out.println("So Fibonacci thu "+n+" la: "+fn);
    }
}
