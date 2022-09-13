/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatebmi;

/**
 *
 * @author MOHD ARIZAL
 */
public class CalculateBMI {

    public double getHeight() {
        
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double calculateBMI(){
        
        
        return getWeight()/(getHeight()*getHeight());
    }
    
    private double height;
    private double weight;
    
    
    
}
