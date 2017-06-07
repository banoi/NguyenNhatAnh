/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import account.Account;

/**
 *
 * @author HP Envy 15
 */
public class Bank implements BankBus{
    /*2. Class Bank trong gói bus, cài đặt giao diện nói trên. Ngoài ra, class này gồm các thuộc tính:
int next : số lượng tài khoản thực sự tồn tại
int max : số tài khoản được phép tạo trong danh sách
int nextAcc  : mã số cho tài khoản tiếp theo
acct : danh sách các account cần quản lý
Các phương thức:
- hàm dựng khởi tạo danh sách các Account gồm max phần tử, mỗi phần tử là một đối tượng Account,
    tài khoản tạo ban đầu sẽ có mã số (nextAcc) là 1
- cài đặt chức năng tương ứng cho các phương thức ghi đè từ giao diện
    */
    int next;
    int max=10;
    int nextAcc;
    
    public Bank(){
        next=0;
        nextAcc=1;
    }
    Account[] acct = new Account[max];
    @Override
    public void display(Account a) {
        for(int i=0;i<next;i++){
            if(a.getNum()==acct[i].getNum()){
                System.out.println("cName: "+acct[i].getcName()+" num: "
                        +acct[i].getNum()+" balance: "+acct[i].getBalance());
            }
        }
    }

    @Override
    public void create(Account a) {
        if(next<max){
            acct[next]=a;
            next++;
            System.out.println("tao tai khoan thanh cong");
        }
        else{
            System.out.println("So tai khoan da day");
        }
    }

    @Override
    public void withdraw(int num, int money) {
        if(money<=acct[num].getBalance()){
            acct[num].setBalance(acct[num].getBalance()-money);
            System.out.println("rut tien thanh cong");
        }
        else{
            System.out.println("so du khong du");
        }
    }

    @Override
    public void deposit(int num, int money) {
        acct[num].setBalance(acct[num].getBalance()+money);
        System.out.println("gui tien thanh cong");
    }
    
}
