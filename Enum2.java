/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enum2;

import trabajo.videojuego;

/**
 *
 * @author Guest
 */
public class Enum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      for(videojuego juego:videojuego.values()){
           System.out.printf("%s : %s = %d", juego,juego.getComentario(),juego.getCalificacion()); 
            
        }
        
    }
    
}