/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.RoomDao;
import enntity.Room;
import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class RoomTest {
    /*d. Tạo package main chứa class RoomTest. Class này có phương thức main thực hiện các yêu cầu sau:
    */
    public static void main(String[] args) {
        //- Khởi tạo đối tượng RoomDAO
        RoomDao dao = new RoomDao();
        Scanner sc = new Scanner(System.in);
        //- Nhập thông tin cho 4 phòng được đặt (status = true). Hiển thị thông báo thích hợp sau khi đặt phòng
        System.out.println("Nhap thong tin cho 4 phong: ");
        for(int i=0;i<4;i++){
            System.out.println("code: ");
            String code = sc.nextLine();
            System.out.println("price: ");
            int price = sc.nextInt();
            boolean status = true;
            sc = new Scanner(System.in);
            Room e = new Room(code, price, status);
            dao.create(e);
        }
        //- Nhập code của phòng tùy ý.
        //Cập nhật trạng thái của phòng này sau khi khách trả phòng. Hiển thị thông báo thích hợp
        System.out.println("Nhap code de tra phong: ");
        String code = sc.nextLine();
        if(dao.update(code)==false){
            System.out.println("Tra phong thanh cong");
        }
        else{
            System.out.println("Tra phong KHONG thanh cong");
        }
        //- Hiển thị số lượng phòng trống trong khách sạn
        System.out.println("So luong phong trong trong khach san: "+dao.count());
        //- Hiển thị tổng tiền của các phòng đang có khách ở
        System.out.println("Tong tien cua cac phong dang co khach o: "+dao.total());
        //Hien thi thong tin cac phong co status chi ra:
        System.out.println("De hien thi thong tin cac phong, nhap status: ");
        boolean status = sc.nextBoolean();
        dao.display(status);
    }
}
