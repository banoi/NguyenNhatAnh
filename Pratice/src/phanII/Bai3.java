/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhanII;

/**
 *
 * @author Administrator
 */
public class Bai3 {
    public static void main(String[] args) {
        int n=1;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.print("\n");
            n++;
        }
    }
}
