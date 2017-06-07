/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import account.Account;
import bus.Bank;
import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class BankTest {
    /*3. Class BankTest nằm trong gói bank
    Class này chứa hàm main, khởi tạo đối tượng của lớp Bank và thực hiện menu sau:
    - tạo danh sách các tài khoản mới
    - rút tiền từ tài khoản
    - gửi tiền
    - kết thúc chương trình
    */
    public static void main(String[] args) {
        Bank dao = new Bank();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1: tao tai khoan");
            System.out.println("2: thong tin tai khoan");
            System.out.println("3: rut tien");
            System.out.println("4: gui tien");
            System.out.println("5: ket thuc chuong trinh");
            System.out.println("Nhap chuc nang: ");
            int choose = sc.nextInt();
            sc = new Scanner(System.in);
            switch(choose){
                case 1:{
                    System.out.println("name: ");
                    String cName = sc.nextLine();
                    System.out.println("num: ");
                    int num = sc.nextInt();
                    System.out.println("balance: ");
                    int balance = sc.nextInt();
                    Account e = new Account(cName, num, balance);
                    dao.create(e);
                    break;
                }
                case 2:{
                    System.out.println("num: ");
                    int num = sc.nextInt();
                    Account ee = new Account(num);
                    dao.display(ee);
                    break;
                }
                case 3:{
                    System.out.println("num: ");
                    int num = sc.nextInt();
                    System.out.println("money: ");
                    int money = sc.nextInt();
                    dao.withdraw(num, money);
                    break;
                }
                case 4:{
                    System.out.println("num: ");
                    int num = sc.nextInt();
                    System.out.println("money: ");
                    int money = sc.nextInt();
                    dao.deposit(num, money);
                    break;
                }
                case 5:{
                    System.exit(0);
                }
                default:{
                    System.out.println("Ban vui long nhap lai");
                    break;
                }
            }
        }while(true);
    }
}
