/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import account.Account;

/**
 *
 * @author HP Envy 15
 */
public interface BankBus {
    /*2. Giao diện BankBus nằm trong gói bus gồm các phương thức chỉ ra nghiệp vụ của ngân hàng
- void display (Account a): hiển thị chi tiết account a
- void create () : thêm mới tài khoản vào danh sách, thông tin nhập từ bàn phím. 
    Lưu ý thông tin cho tài khoản phải hợp lệ (num, balance phải là số nguyên đồng thời balance >= 100), 
    nếu không hợp lệ thì việc thêm mới sẽ không thành công. Mã số tài khoản sẽ tự động tăng dần theo số tài khoản đăng kí
- void withdraw() : thực hiện việc rút tiền cho tài khoản bất kì, 
    số tài khoản và số tiền được nhập vào từ bàn phím. Kiểm tra tính hợp lệ của thông tin nhập vào,
    số tiền rút <= balance nếu không ngoại lệ sẽ phát sinh, việc rút tiền không thành công  
- void deposit() : cho phép gửi tiền vào tài khoản, số tài khoản và số tiền gửi nhập từ bàn phím.
    Xử lý ngoại lệ cho các trường hợp thông tin không hợp lệ
    */
    public void display(Account a);
    public void create(Account a);
    public void withdraw(int num, int money);
    public void deposit(int num, int money);
}
