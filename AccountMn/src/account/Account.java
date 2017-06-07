/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author HP Envy 15
 */
public class Account {
    /*1. Class Account nằm trong gói account mô tả về tài khoản người sử dụng, gồm các thuộc tính 
cName : String, num : int, balance : int
Giá trị các thuộc tính được khởi tạo trong hàm dựng có tham số
    */
    private String cName;
    private int num;
    private int balance;

    public Account() {
    }

    public Account(int num) {
        this.num = num;
    }
    public Account(String cName,int num, int balance) {
        this.cName = cName;
        this.num = num;
        this.balance = balance;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
}
