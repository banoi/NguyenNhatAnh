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
public class BookDao implements BookUtil{
/*c.	Class BookDAO in dao package that implements BookUtil interface. It has private properties:									[5]
•	bk: array of 50 books
•	n: the number of books in a library at the moment
Override all methods of the BookUtil interface and do the suitable functions.
*/
    Book[] bk = new Book[50];
    int n;
    public BookDao(){
        n=0;
    }
    @Override
    public int indexOf(int code) {
        for(int i = 0;i<n;i++){
            if(bk[i].getCode()==code){
                return i;
            }
        }
        return -1 ;
    }
    @Override
    public boolean add(Book b) {
        int a=1;
        if(n<50 && indexOf(b.getCode())==-1){
            bk[n]=b;
            n++;
            System.out.println("More success");
            return true;
        }
        else{
            System.out.println("The list is full or the book does exist");
            return false;
        }
    }

    @Override
    public float getCost(String sName) {
        float sum=0;
        for(int i=0;i<n;i++){
            if(bk[i].getName().indexOf(sName,0)!=-1){
                sum=sum+(bk[i].getQuantity()*bk[i].getPrice());
            }
        }
        return sum;
    }

    @Override
    public void readByAll() {
        System.out.println("Display all book: ");
        for(int i=0;i<n;i++){
            System.out.println("code: "+this.bk[i].getCode()+" name: "+this.bk[i].getName()+
                               " quantity: "+this.bk[i].getQuantity()+" price: "+this.bk[i].getPrice());
        }
    }

    @Override
    public void readByMaxQty() {
        int max=0;
        for(int i=0;i<n;i++){
            if(max<bk[i].getQuantity()){
                max=bk[i].getQuantity();
            }
        }
        System.out.println("Maximum of quantity: "+(max));
        System.out.println("books’ information that have maximum quantity: ");
        for(int i=0;i<n;i++){
            if(max==bk[i].getQuantity()){
                System.out.println("code: "+this.bk[i].getCode()+" name: "+this.bk[i].getName()+
                                   " quantity: "+this.bk[i].getQuantity()+" price: "+this.bk[i].getPrice());
            }
        }
    }

}
