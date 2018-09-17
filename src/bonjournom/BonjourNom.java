/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjournom;
import aleatoire.Person;
/**
 *
 * @author hd691026
 */
public class BonjourNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World3!");
        System.out.println("Bonjour John Doe!");
        //if(args.length == 2){
           String prenom = args[0];
           String nom =args[1];
           String ageString = args[2];
            System.out.println("Bonjour " + prenom + " " + nom);
        //}else{
          //  System.out.println("Nombre d'arguments invalide");
        //}
        
        Person personne = new Person("Bill","Gates", 60);
        System.out.println("First Name: " + personne.getFirstName());
        System.out.println("Last Name: " + personne.getLastName());
        System.out.println("Age:  " + personne.getAge());
        
        personne.setFirstName(prenom);
        personne.setLastName(nom);
        int age = Integer.parseInt(ageString);
        personne.setAge(age);
     
        System.out.println("First Name: " + personne.getFirstName());
        System.out.println("Last Name: " + personne.getLastName());
        System.out.println("Age:  " + personne.getAge());
    }
    
}
