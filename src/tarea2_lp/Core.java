/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_lp;

/**
 *
 * @author Jc
 */
public abstract class Core {
    public class Init{
        void init(){
            //indices de los arreglos!
            int a = 0;
            int o = 0;
            int c = 0;
            int f = 0;
            //Inicializacion lineal
            tablero[a] = new Casilla(o, "Otros");
            array_otros[o] = new Otros(o, "Otros", "Salida");
            o++;
            a++;
            {
            tablero[a] = new Casilla(c, "Ciudad");
            int[] b = {2,10,30,90,160,250};
            array_ciudad[c] = new Ciudad("Rojo", b, "Ovalle", 0, 50, 60, 0, 2, c, "Ciudad");
            c++;
            }
            a++;
            tablero[a] = new Casilla(0, "Suerte");
            a++;
            {
            tablero[a] = new Casilla(c, "Ciudad");
            int[] b = {4,20,60,180,320,450};
            array_ciudad[c] = new Ciudad("Rojo", b, "Punta Arenas", 0, 50, 60, 0, 2, c, "Ciudad");
            c++;
            a++;
            }
            tablero[a] = new Casilla(o, "Otros");
            array_otros[o] = new Otros(o, "Otros", "Impuestos");
            o++;
            a++;
            tablero[a] = new Casilla(f, "Ferrocarril");
            array_ferrocarril[f] = new Ferrocarriles("Ferrocarril Arica", "banco", 4, f);
            f++;
        }
        void getPlayers(){
            System.out.println("Ingrese numero de jugadores");
            t = 5;
            jugadores = new Jugadores[t];
        }
        void sortPlayers(){
            //Repartir jugadores en el arreglo
        }
    }
    public class Game{
        int getPosition(int num){
            return jugadores[num].getPosition();
        }
        void getCasilla(int pos, int playr_id){
            switch(tablero[pos].typebox){
                case "Ciudad":
                    //analisis de caso
                    Ciudad city = array_ciudad[pos];
                    Jugadores playr = jugadores[playr_id];
                    if(city.getOwner() == 0){
                        System.out.println("¿Quiere comprar esta propiedad?");
                        if(true){
                            playr.addMoney(-city.getPrice());
                            city.setOwner(playr_id);
                        }
                    }
                    else if(city.getOwner() != playr_id){
                        int rent = city.getRent();
                        playr.addMoney(-rent);
                        playr = jugadores[city.getOwner()];
                        playr.addMoney(rent);
                    }
                case "Otros":
                    //g
                case "Suertes":
                    //sgfd
                case "Ferrocarriles":
                    //fsdf
            }
        }
    }
    public class Refresh{
        private void refreshBlock(int ID, int playr){
            String color = array_ciudad[tablero[ID].ID].getBlock();
            int i;
            int prop = 0;
            for(i = ID; array_ciudad[tablero[i].ID].getBlock() == color;, i--){
                if(playr == array_ciudad[tablero[i].ID].getOwner())
                    prop++;
            }
            for(i = ID; color == array_ciudad[tablero[i].ID].getBlock(); i++){
                if(playr == array_ciudad[tablero[i].ID].getOwner())
                    prop++;
            }
        }
    }
    //Arreglos iniciales
    static int t;
    static Casilla[] tablero = new Casilla[40];
    static Ciudad[] array_ciudad = new Ciudad[22];
    static Ferrocarriles[] array_ferrocarril = new Ferrocarriles[4];
    static Servicios[] array_servicios = new Servicios[2];
    static Otros[] array_otros = new Otros[4];
    static Jugadores[] jugadores;
    
}
