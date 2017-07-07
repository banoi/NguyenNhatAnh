/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Account;
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
public class AccountDAO {

    List<Account> list = null;

    public AccountDAO() {
        list = new ArrayList<>();
    }

    public boolean saveAccount(Account a) {
        try {
            FileWriter fw = new FileWriter(new File(System.getProperty("user.dir") + "/account.txt"), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(a.toString());
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public boolean saveList(List<Account> a) {
        try {
            FileWriter fr = new FileWriter(new File(System.getProperty("user.dir") + "/account.txt"), false);
            BufferedWriter br = new BufferedWriter(fr);
            for (Account e : a) {
                br.write(e.toString());
                br.newLine();
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    //CRUD
    public Account create(Account a) {
        list.add(a);
        saveAccount(a);
        return a;
    }

    public List<Account> readAll() {
        List<Account> temp = new ArrayList<>();
        try {
            FileReader fr = new FileReader(new File(System.getProperty("user.dir") + "/account.txt"));
            BufferedReader br = new BufferedReader(fr);
            String str;
            while ((str = br.readLine()) != null) {
                String[] s = str.split(",");
                Account a = new Account(s[0], s[1], s[2]);
                temp.add(a);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

    public Account update(Account a) {
        list = readAll();
        for (Account aa : list) {
            if (aa.compareTo(a) == 0) {
                aa.setPassword(a.getPassword());
                aa.setDescription(a.getDescription());
                saveList(list);
                System.out.println("Update success");
                return aa;
            }
        }
        System.out.println("Update fail");
        return null;
    }

    public Account delete(String username) {
        List<Account> temp = new ArrayList<>();
        list = readAll();
        for (Account aa : list) {
            if (aa.getUsername().compareTo(username) != 0) {
                temp.add(aa);
            }
        }
        saveList(temp);
        return null;
    }
}
