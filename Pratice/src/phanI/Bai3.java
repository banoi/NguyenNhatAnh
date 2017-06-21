package phan1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so chu dien: ");
        int n = sc.nextInt();
        int cost;
        if(n<=100){
            cost = 550*n;
        }
        else if(n<=150){
            cost=100*550+(n-100)*900;
        }
        else if(n<=200){
            cost=100*150+50*900+(n-150)*1210;
        }
        else if(n<=300){
            cost=100*150+50*900+200*1210+(n-200)*1340;
        }
        else{
              cost=100*150+50*900+200*1210+300*1340+(n-300)*1400;
        }
        System.out.println("Chi phi phai tra: "+cost);
    }
}
