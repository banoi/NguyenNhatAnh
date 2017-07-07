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
public class Account {
    private String username;
    private String password;
    private String description;

    public Account() {
    }

    public Account(String username, String password, String description) {
        this.username = username;
        this.password = password;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return username+","+password+","+description;
    }
    public String toStringDisplay(){
        return "username: "+username+" password: "+password+" description: "+description;
    }

    public int compareTo(Account a) {
        return this.username.compareTo(a.getUsername());
    }
}
