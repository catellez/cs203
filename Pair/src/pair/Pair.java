/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pair;

import java.io.Serializable;


/**
 *
 * @author catellez
 */
public class Pair<E> implements Serializable, Cloneable{
    /** constructs Pair class
     * 
     * @param e1, the first value of Pair
     * @param e2 the second value of Pair
     */
    public Pair(E e1, E e2)
    {
        this.element1 = e1;
        this.element2 = e2;
    }
    
    
    /**returns the first element in an object of class Pair
     * 
     * @return the first element
     */
    public E getFirstE()
    {
         return element1;
    }
    /**returns the second element in an object of class Pair
     * 
     * @return the second element
     */
    public E getSecondE()
    {
         return element2;
    }
    /** changes the value of the first element in an object of class Pair
     * 
     * @param newValue the new value for first element 
     * @return the first element after it is changed
     */
    public E setFirstE(E newValue)
    {
         element1 = newValue;
         return element1;
    }
    /** changes the value of the second element in an object of class Pair
     * 
     * @param newValue the new value for second element 
     * @return the second element after it is changed
     */
    public E setSecondE(E newValue)
    {
        element2 = newValue;
        return element2;
    }
    /** creates a clone of and object of class Pair
     * 
     * @return the cloned object of class Pair
     * @throws CloneNotSupportedException 
     */
    @Override
    public Pair<E> clone() throws CloneNotSupportedException {
        super.clone();
        // create a new pair with the values from this pair
        Pair<E> pair = new Pair (getFirstE(), getSecondE());
        return pair;
    }

    
    private E element1;
    private E element2;
    
}
    
    
   
    
    
    
