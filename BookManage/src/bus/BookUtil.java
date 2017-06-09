/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import entity.Book;

/**
 *
 * @author HP Envy 15
 */
public interface BookUtil {
    //	Interface BookUtil in bus package to define some businesses relating to books. [5]
    
    //public boolean add(Book b): add book b to an array if it does not exist in array 
    //    (index of this book in array is -1) and array is not full.	[10]
    public boolean add(Book b);
    
    //public int indexOf(int code): return the first index of book that has specified code in an array.
    //   If not found, return -1.		[10]
    public int indexOf(int code);
    
    //public float getCost(String sName): return the total cost (cost = quantity * price)
    //   of all books that have name start with sName.		[10]
    public float getCost(String sName);
    
    //public void readByAll(): display all books’ information of an array.[10]
    public void readByAll();
    
    // public void readByMaxQty(): display the maximum of quantity and books’ 
    //    information that have maximum quantity.		[15]
    public void readByMaxQty();
    
}
