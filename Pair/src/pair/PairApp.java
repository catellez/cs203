/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pair;





public class PairApp {
    
    
    
    public static void main(String[] args) throws CloneNotSupportedException {
        //creates rectangles R1, R2, and new R1
        Rectangle R1 = new Rectangle(100, 100);
        Rectangle R2 = new Rectangle(200, 200);
        Rectangle newR1 = new Rectangle(50, 50);
        //creates original, a Pair class with R1 and R2 as its values
        Pair original = new Pair(R1, R2);
        //clones original to make cloned
        Pair cloned = (Pair) original.clone();
        
        //changes R1 in cloned to new R1
        cloned.setFirstE(newR1);
        //checks to see if original is linked to cloned. If false,
        //not linked and clone was successful
        System.out.print(cloned == original);
        
    }
}
