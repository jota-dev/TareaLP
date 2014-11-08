package tarea2_lp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jc
 */
public class Comprable extends Casilla{
    public Comprable(){
        super();
    };
    public Comprable(int price, int owner, int properties, int ID, String typebox){
        super(ID, typebox);
        this.price = price; this.owner = owner; this.properties = properties;
    };
    protected int price;
    protected int owner;
    protected int properties;
}
