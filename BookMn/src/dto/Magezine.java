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
public class Magezine {
    /*1. Class Magezine gồm các thuộc tính 
code – int : mã tài liệu
name – String : tên tài liệu
*/
    private int code;
    private String name;

    public Magezine() {
    }

    public Magezine(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
