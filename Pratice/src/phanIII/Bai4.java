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
public class Bai4 {
// Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố. 
//    Ví dụ: Số 28 được phân tích thành 2 x 2 x 7

    public int nguyenTo(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai4 nt = new Bai4();
        System.out.println("n = ");
        int n = sc.nextInt();
        int a[] = new int[20];
        int count = 0;
        int crime = 2;
        while (n > 1) {
            if (nt.nguyenTo(crime) == 1 && n % crime == 0) {
                a[count] = crime;
                count++;
                n = n / crime;
            }
            if(n%crime!=0){
                crime++;
            }
        }
        System.out.print("n = ");
        for (int i = 0; i < count; i++) {
            System.out.print(+a[i]);
            if(i!=count-1){
                System.out.print("*");
            }
        }
    }   
}
