/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enntity;

import java.io.Serializable;

/**
 *
 * @author HP Envy 15
 */
public class Room implements Serializable{
    /*code : chuỗi lưu trữ mã phòng
price : số nguyên lưu trữ giá phòng
status : kiểu boolean lưu trữ trạng thái của phòng (true nếu đã có khách đặt, ngược lại là false) 
Xây dựng các phương thức get và set cho các thuộc tính này
    */
    public String code;
    private int price;
    private boolean status;

    public Room() {
    }

    public Room(String code, int price, boolean status) {
        this.code = code;
        this.price = price;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
