/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam_q1_2021;

/**
 *
 * @author user
 */
public class Instrument {
    
    private String instrumentName;
    private String level;
    private int price;
    
    public Instrument(String instrumentName, String level, int price){
        this.instrumentName = instrumentName;
        this.level = level;
        this.price = price;
    }
    
    public Instrument(Instrument source){
        this.instrumentName = source.instrumentName;
        this.level = source.level;
        this.price = source.price;
    }
    
    public String getInstrumentName(){
        return this.instrumentName;
    }
    
    public String getLevel(){
        return this.level;
    }
    
    public int getPrice(){
        return this.price;
    }
    
}
