package com.generacion;

import java.util.Scanner; //importamos el scanner

public  class Codigo4 {
	
//creamos clase main
	public static void main (String[] args) {
	
	Scanner s = new Scanner(System.in); //indicamos que la entrada sea por consola 

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    //s.nextLine(); // 
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
  //  Scanner s2 = new Scanner(); no se pueden declarar 2 scanner
    String j2 = s.nextLine();
    
    if (j1.equals (j2) ){   //eliminé un parentesis de cierre que sobraba 
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }
          break; //agregamos el break para interrumpir el flujo del case

        case "papel":     //
          if (j2.equals ("papel")) {
            g = 1;
          }    //agregamos llave de cierre
        case "tijeras":   //agregamos una s a tijeras
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default: 
        	
      }
      System.out.println("Gana el jugador " + g);
    }
    s.close();
  }
    
} 
