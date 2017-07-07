/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import dao.AccountDAO;
import dao.EmployeeDAO;
import dto.Employee;
import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountDAO daoA = new AccountDAO();
        EmployeeDAO daoE = new EmployeeDAO();
        do {
            System.out.println("Press 1: Login account");
            System.out.println("Press 2: exit");
            System.out.println("Choose the function: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("Please you input your username and password to login !");
                    System.out.println("Input username: ");
                    sc = new Scanner(System.in);
                    String username = sc.nextLine();
                    System.out.println("Input password: ");
                    sc = new Scanner(System.in);
                    String password = sc.nextLine();
                    if (daoE.login(username, password) == true) {
                        System.out.println("Login success");
                        do {
                            System.out.println("Press 1: Add employee");
                            System.out.println("Press 2: view employee list");
                            System.out.println("Press 3: update employee");
                            System.out.println("Press 4: delete employee");
                            System.out.println("Press 5: exit the employee program management");
                            System.out.println("You choose the function: ");
                            int option = sc.nextInt();
                            switch (option) {
                                case 1: {
                                    System.out.println("Add one employee: ");
                                    System.out.println("Input code: ");
                                    sc = new Scanner(System.in);
                                    String code = sc.nextLine();
                                    System.out.println("Input name: ");
                                    sc = new Scanner(System.in);
                                    String name = sc.nextLine();
                                    System.out.println("Input age: ");
                                    int age = sc.nextInt();
                                    String sAge = String.valueOf(age);
                                    System.out.println("Input salary: ");
                                    float salary = sc.nextFloat();
                                    String sSalary = String.valueOf(salary);
                                    Employee e = new Employee(code, name, sAge, sSalary);
                                    daoE.create(e);
                                    System.out.println("Create employee is success!");
                                    break;
                                }
                                case 2: {
                                    System.out.println("Display employee list: ");
                                    for(Employee e: daoE.readAll()){
                                        System.out.println(e.toStringDisplay());
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("Update profile of the employee: ");
                                    System.out.println("Input the code to search: ");
                                    sc = new Scanner(System.in);
                                    String code = sc.nextLine();
                                    System.out.println("Input new name: ");
                                    sc = new Scanner(System.in);
                                    String nName = sc.nextLine();
                                    System.out.println("Input new age: ");
                                    int nAge = sc.nextInt();
                                    String sAge = String.valueOf(nAge);
                                    System.out.println("Input new salary: ");
                                    float nSalary = sc.nextFloat();
                                    String sSalary = String.valueOf(nSalary);
                                    Employee e = new Employee(code, nName, sAge, sSalary);
                                    daoE.update(e);
                                    break;
                                }
                                case 4: {
                                    System.out.println("Delete employee: ");
                                    System.out.println("Input the code of employee to delete: ");
                                    sc = new Scanner(System.in);
                                    String code = sc.nextLine();
                                    daoE.delete(code);
                                    break;
                                }
                                case 5: {
                                    System.out.println("Exit the employee management Program");
                                    System.exit(0);
                                    break;
                                }
                                default: {
                                    System.out.println("Function"+option+"do not have, please input again");
                                    break;
                                }
                            }
                        } while (true);
                    } else {
                        System.out.println("Your username or password is fail");
                    }
                    break;
                }
                case 2: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("You input error function, please input again!");
                    break;
                }
            }
        } while (true);
    }
}
