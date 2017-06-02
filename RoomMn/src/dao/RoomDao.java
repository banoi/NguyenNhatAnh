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
public class RoomDao implements RoomBus{
 /*c. Tạo class RoomDAO trong package dao. Class này cài đặt giao diện nói trên. 
    Ngoài ra có các thuộc tính public:
max : số nguyên chỉ ra số lượng phòng có trong khách sạn
index: số nguyên chỉ ra số lượng phòng đã được đặt
room: mảng Room gồm có max phòng
- xây dựng hàm dựng để khởi tạo giá trị cho max là 10, mảng room gồm max phòng, các phần tử trong mảng room
-  Ghi đè các phương thức được cài đặt từ giao diện và cài đặt chức năng tương ứng cho chúng*/
    int max = 10;
    Room[] room = new Room[max];
    int index;
    public RoomDao(){
        index = 0;
    }

    @Override
    public boolean create(Room r) {
        //đăng kí mới 1 phòng trong khách sạn với thông tin tương ứng với r.
        //Khi đăng kí trạng thái phòng sẽ là true. 
        if(index < max){
            room[index] = r;
            index++;
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int readByCode(String code) {
        int a=0;
        for(int i=0;i<index;i++){
           if(room[i].code.equals(code)){
               return i;
            }
        }
        return -1;
    }

    @Override
    public boolean update(String code) {
        if(readByCode(code)==-1){
            return true;
        }
        else{
            room[readByCode(code)].setStatus(false);
            return false;
        }    
    }

    @Override
    public int count() {
        int dem = 0;
        for(int i=0;i<index;i++){
            if(room[i].isStatus() == true){
                dem++;
            }
        }
        return max - dem;
    }

    @Override
    public int total() {
        int sum=0;
        for(int i=0;i<index;i++){
            if(room[i].isStatus()==true){
                sum = sum + room[i].getPrice();
            }
        }
        return sum;
    }

    @Override
    public void display(boolean status){
       for(int i=0;i<index;i++){
           if(room[i].isStatus()==status){
               System.out.println("code: "+room[i].getCode()+ "price: "
                       +room[i].getPrice()+"status: "+room[i].isStatus());
           }
        }
    }     
}

