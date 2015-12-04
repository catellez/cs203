/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pair;

/**
 *
 * @author catellez
 */
public class Rectangle {
    int width;
    int height;
    
    /**Constructs Rectangle class
     * @param w, the width of the rectangle
     * @param h, the height of the rectangle
     */
    public Rectangle(int w,  int h) {
        this.width = w;
        this.height = h;
        
    }
    /**returns the width of the rectangle 
     * 
     * @param r Rectangle with the width to be returned
     * @return the width of r
     */
    public int getWidth(Rectangle r)
    {
        return r.width;
    }
    /**returns the height of the rectangle 
     * 
     * @param r Rectangle with the height to be returned
     * @return the height of r
     */
    public int getHeight(Rectangle r)
    {
        return r.height;
    }
    
    
    
    
}
