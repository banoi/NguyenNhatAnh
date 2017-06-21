/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author HP Envy 15
 */
public class InSHH {
    //In 5 so hoan hao dau tien
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
        InSHH in = new InSHH();
        int count=0;
        int n=1;
        while(count<5){
            if(in.hoanhao(n)==1){
                System.out.print(+n+"\t");
                count++;
            }
            n++;
        }
    }
}
