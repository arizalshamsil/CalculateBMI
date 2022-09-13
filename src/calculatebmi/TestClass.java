/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculatebmi;

/**
 *
 * @author MOHD ARIZAL
 */
public class TestClass {
    
    
    public static void main(String[]args){
        
        CalculateBMI myBMI = new CalculateBMI();
        myBMI.setHeight(1.69);
        myBMI.setWeight(70);
        
        System.out.println(myBMI.calculateBMI());
        
    }
    
}
