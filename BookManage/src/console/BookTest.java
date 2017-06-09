/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import bus.BookDao;
import entity.Book;
import java.util.Scanner;

/**
 *
 * @author HP Envy 15
 */
public class BookTest {
/*d.	Class BookTest in console package. Its main() method to the the below function:
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDao dao = new BookDao();
        
        //Add 4 books. The information are get from the keyboard. Code, quantity and price must be validated. 
        //Display the suitable message after adding.  [10]
        System.out.println("Add 4 books: ");
        for(int i=0;i<4;i++){
            System.out.println("Code: ");
            int code = sc.nextInt();
            System.out.println("Name: ");
            sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            System.out.println("Price: ");
            float price = sc.nextFloat();
            Book e = new Book(code, name, quantity, price);
            dao.add(e);
        }
        
        //Enter a string value. 
        //Display the total cost of all books that names started with this string.	[5]
        System.out.println("Enter a string: ");
        sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("The total cost of all books that names started with: "+(name)+
                           " is "+(dao.getCost(name)));
        
        //Display the maximum of quantity and books’ information that have maximum quantity.	[5]
        dao.readByMaxQty();
        //Display all books’ information of a library.	[5]
        dao.readByAll();
    }
}
