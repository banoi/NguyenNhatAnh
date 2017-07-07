/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import dao.AccountDAO;
import dto.Account;
import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountDAO dao = new AccountDAO();
        do{
            System.out.println("Program: account Manage");
            System.out.println("Press 1: add acount");
            System.out.println("Press 2: view the list");
            System.out.println("Press 3: update account");
            System.out.println("Press 4: delete account");
            System.out.println("Press 5: exit program");
            System.out.println("You choose the funtion: ");
            int choose = sc.nextInt();
            switch(choose){
                case 1:{
                    System.out.println("Add account");
                    System.out.println("Input username: ");
                    sc = new Scanner(System.in);
                    String username = sc.nextLine();
                    System.out.println("Input password: ");
                    sc = new Scanner(System.in);
                    String password = sc.nextLine();
                    System.out.println("Input description: ");
                    sc = new Scanner(System.in);
                    String description = sc.nextLine();
                    Account a = new Account(username, password, description);
                    dao.create(a);
                    break;
                }
                case 2:{
                    System.out.println("Display account list: ");
                    for(Account a: dao.readAll()){
                        System.out.println(a.toStringDisplay());
                    }
                    break;
                }
                case 3:{
                    System.out.println("Update account: ");
                    System.out.println("Input username to search: ");
                    sc = new Scanner(System.in);
                    String username = sc.nextLine();
                    System.out.println("Input new password: ");
                    sc = new Scanner(System.in);
                    String nPassword = sc.nextLine();
                    System.out.println("Input new description: ");
                    sc = new Scanner(System.in);
                    String nDescription = sc.nextLine();
                    Account a = new Account(username, nPassword, nDescription);
                    dao.update(a);
                    break;
                }
                case 4:{
                    System.out.println("Delete account: ");
                    System.out.println("Input username of account to delete: ");
                    sc = new Scanner(System.in);
                    String username = sc.nextLine();
                    dao.delete(username);
                    break;
                }
                case 5:{
                    System.out.println("Exit the Account management Program");
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Function"+choose+" do not have, please input again");
                    break;
                }
            }
        }
        while(true);
    }
}
