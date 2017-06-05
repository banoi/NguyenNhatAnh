/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author HP Envy 15
 */
public class Good {
    /*a. Tạo Class Good  nằm trong package entity, có các thuộc tính public
code : số nguyên lưu trữ mã sản phẩm
name: chuỗi lưu trữ tên sản phẩm
Xây dựng hàm dựng mặc định và hàm dựng có tham số để khởi tạo giá trị cho các thuộc tính này
    */
    private int code;
    private String name;

    public Good() {
    }

    public Good(int code, String name) {
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
