import java.awt.geom.*;
/**
 * Simulate a tourist like a Triangle.
 * 
 * @author Luisa De la Hoz y Jorge Saenz. 
 * @version 8/02/22.
 */
public class Turist
{
    private boolean visible;
    private Triangle turis = new Triangle();

    /**
     * Constructor for objects of class Turist
     */
    public Turist()
    {
        turis.changeColor("magenta");
        turis.varyAngle(-90);
    }
    
    /**
     * Change the color of the tourist
     * @Param newColor Name of the color to which you want to vary, 
     * you can choose between "red", "yellow", "blue", "green",
     * "magenta", "orange", "light blue", "violet" and "black".
     */
    public void setColor(String newColor){
        turis.changeColor(newColor);
        makeVisible();
    }
    
    /**
     * Gives the color that the tourist has
     */
    public String getColor(){
        return turis.getColor();
    }
    
    public int getHeight(){
        return turis.getHeight();
    }
    
    /**
     * Sets the angle the tourist faces.
     * @Param newAngle is the new angle.
     */
    public void setAngle(int newAngle){
        turis.varyAngle(newAngle);
    }
    
    public int getAngle(){
        return turis.getAngle();
    }
    
    /**
     * We change position to tourist.
     * @Param newXcor X coordinate of the tourist.
     * @Param newYcor Y coordinate of the tourist.
     */
    public void setCor(int newXcor, int newYcor){
        turis.setXposition(newXcor);
        turis.setYposition(newYcor);
        makeVisible();
    }
    
    /**
     * we get the coordinate x where the tourist is located.
     */
    public int getXcor(){
        return turis.getXposition();
    }
    
    /**
     * we get the coordinate y where the tourist is located.
     */
    public int getYcor(){
        return turis.getYposition();
    }
    
    /**
     * Makes the tourist visible.
     */
    public void makeVisible(){
        visible = true;
        turis.makeVisible();
    }
    
    /**
     * Makes the tourist invisible.
     */
    public void makeInvisible(){
        turis.makeInvisible();
        visible = false;
    }
}