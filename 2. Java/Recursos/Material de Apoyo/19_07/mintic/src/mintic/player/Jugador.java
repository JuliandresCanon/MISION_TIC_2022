/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.player;

/**
 *
 * @author farma
 */
public class Jugador {
    private String nick;
    private int puntaje;
    private String game;
    
    public Jugador(String nick, int Puntaje){
        System.out.println("Hola jugador");
        this.nick = nick;
        puntaje = Puntaje;
        game = "";
    }
    public Jugador(String nick, int Puntaje, String game){
        this.nick = nick;
        puntaje = Puntaje;
        this.game = game;
    }
    
    public String getInfo(){
        return nick+" :"+puntaje+" \n";
    }
    
    public String getInfo(String game){
        return nick+" :"+puntaje+" \n";
    }
    
    
    //player.nick = "Adrian";
    //player.nick
    
    public String getNick(){
        return nick;
    }
//    public void setNick(String nick){
//        this.nick = nick;
//    }
    public int getPuntaje(){
        return puntaje;
    }
    public void setPuntaje(int puntaje){
        this.puntaje = puntaje;
    }
}
