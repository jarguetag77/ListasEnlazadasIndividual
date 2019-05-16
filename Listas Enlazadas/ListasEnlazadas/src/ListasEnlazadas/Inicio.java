/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasEnlazadas;

import java.util.Scanner;

/**
 *
 * @author YO
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListasEnlazadas miLista=new ListasEnlazadas();
        miLista.Insert();
        Scanner scn = new Scanner(System.in);
        System.out.print(miLista.Listar());
        System.out.print("\n\tIngrese el numero que desea localizar= ");
        int dato = scn.nextInt();
        System.out.print("\n\tnumero localizado en posicion: #"+miLista.Localizar(dato));
        
        
        
      
// TODO code application logic here
    }
    
}
