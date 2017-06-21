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

public class Bai5 {
    public int nguyenTo(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
    //Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.    
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        Bai5 b5 = new Bai5();
        for(int i=2;i<=n;i++){
            if(b5.nguyenTo(i)==1){
                System.out.print(+i+"\t");
            }
        }
    }
}
