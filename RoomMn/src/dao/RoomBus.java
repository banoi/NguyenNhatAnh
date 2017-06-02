/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import enntity.Room;

/**
 *
 * @author HP Envy 15
 */
public interface RoomBus {
    /*b. Tạo package dao chứa giao diện RoomBus, giao diện này có các phương thức:
- public boolean create(Room r) : đăng kí mới 1 phòng trong khách sạn với thông tin tương ứng với r.
    Khi đăng kí trạng thái phòng sẽ là true. 
- public boolean update(String code): cập nhật trạng thái cho phòng có code chỉ ra là false.
    (Sử dụng hàm readByCode() để tìm phòng có code chỉ ra, sau đó cập nhật status " false" của nó)
- public int readByCode(String code): trả về chỉ số của phòng có code chỉ ra trong mảng room,
    nếu không tìm thấy, trả về -1
- public int count() : trả về số lượng phòng trống trong khách sạn (phòng có status là false)
- public int total(): trả về tổng tiền các phòng có khách ở (các phòng có status = true)
- public void display(boolean status): hiển thị thông tin tất cả các phòng có status chỉ ra
    */
    public boolean create(Room r);
    public int readByCode(String code);
    public boolean update(String code);
    public int count();
    public int total();
    public void display(boolean status);
}
