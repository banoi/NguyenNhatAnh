/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author HP Envy 15
 */
public class Employee {
    private String code;
    private String name;
    private int age;
    private float salary;

    public Employee() {
    }

    public Employee(String code, String name,String age,String salary) {
        this.code = code;
        this.name = name;
        this.age = Integer.valueOf(age);
        this.salary = Float.valueOf(salary);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return code+","+name+","+age+","+salary;
    }
    public String toStringDisplay() {
        return "code: "+code+" name: "+name+" age: "+age+" salary: "+salary;
    }
    
}
