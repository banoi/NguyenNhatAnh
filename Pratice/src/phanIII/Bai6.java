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

public class Bai6 {
    public int nguyenTo(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
    //Viết chương trình liệt kê n số nguyên tố đầu tiên.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        Bai6 b6 = new Bai6();
        int prime=2;
        int count=0;
        while(count<n){
            if(b6.nguyenTo(prime)==1){
                System.out.print(+prime+"\t");
                count++;
            }
            prime++;
        }
    }
}
