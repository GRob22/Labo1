/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjournom;

/**
 *
 * @author hd691026
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Bonjour John Doe!");
        if(args.length == 2){
            String prenom = args[0];
            String nom =args[1];
            System.out.println("Bonjour " + prenom + " " + nom);
        }else{
            System.out.println("Nombre d'arguments invalide");
        }
    }
    
}
