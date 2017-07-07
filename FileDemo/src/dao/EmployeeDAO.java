/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Employee;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP Envy 15
 */
public class EmployeeDAO {
    List<Employee> listE = null;
    public EmployeeDAO(){
        listE = new ArrayList<>();
    }
    public boolean saveEmployee(Employee e){
        try {
            FileWriter fw = new FileWriter(new File(System.getProperty("user.dir")+"/employee.txt"),true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(e.toString());
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    public boolean saveListE(List<Employee> e){
        try {
            FileWriter fw = new FileWriter(new File(System.getProperty("user.dir")+"/employee.txt"),false);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Employee ee: e){
                bw.write(ee.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    public boolean login(String username, String password){
        try {
            FileReader fr = new FileReader(new File(System.getProperty("user.dir")+"/account.txt"));
            BufferedReader br = new BufferedReader(fr);
            String str;
            try {
                while((str = br.readLine())!=null){
                    String[] s = str.split(",");
                    if(s[0].equals(username) && s[1].equals(password)){
                        return true;
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //CRUD
    public Employee create(Employee e){
        listE.add(e);
        saveEmployee(e);
        return e;
    }
    public List<Employee> readAll(){
        List<Employee> temp = new ArrayList<>();
        try {
            FileReader fr = new FileReader(new File(System.getProperty("user.dir")+"/employee.txt"));
            BufferedReader br = new BufferedReader(fr);
            String str;
            try {
                while((str=br.readLine())!=null){
                    String[] s = str.split(",");
                    Employee e = new Employee(s[0],s[1],s[2],s[3]);
                    temp.add(e);
                }
                br.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
    public Employee update(Employee e){
        listE = readAll();
        for(Employee ee: listE){
            if(ee.getCode().equals(e.getCode())){
                ee.setName(e.getName());
                ee.setAge(e.getAge());
                ee.setSalary(e.getSalary());
                saveListE(listE);
                System.out.println("Update success");
                return e;
            }
        }
        System.out.println("Update fail");
        return null;
    }
    public Employee delete(String code){
        List<Employee> temp = new ArrayList<>();
        listE = readAll();
        for(Employee ee: listE){
            if(!ee.getCode().equals(code)){
                temp.add(ee);
            }
        }
        saveListE(temp);
        System.out.println("Delete success");
        return null;
    }
}
