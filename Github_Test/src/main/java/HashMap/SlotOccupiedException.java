/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashMap;

/**
 *
 * @author carol
 */
public class SlotOccupiedException extends RuntimeException{
    public SlotOccupiedException(String message){
        super(message);
    }
    
    public SlotOccupiedException(){
        super();
    }
}
