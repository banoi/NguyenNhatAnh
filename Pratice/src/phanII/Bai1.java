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
public class Bai1 {
    // Viết chương trình tính tổng dãy số S=1^2+2^2+3^2+…..+10^2
    public static void main(String[] args) {
        int s=0;
        for(int i=1;i<=10;i++){
            s = s + i*i;
        }
        System.out.println("S = "+s);
    }
}
