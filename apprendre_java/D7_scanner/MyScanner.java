package D7_scanner;

import java.util.Scanner;

public class MyScanner {
    // Les attributs
    String prenom = "";
    int age;
    String lieuNaissance = "";


    // Les methodes 
    public void parler()
    {
        System.out.println("Je suis entrain de parler");
        
    }
     
    public static void main(String[] args){
        //Creation d'objet de notre scanner
        Scanner sc = new Scanner(System.in);


       // On demande user de saisir son prenom
       System.out.println("Entrer votre prenom,age et lieu de naissance");


        // Stocker la saisie de user dans la var prenom
       MyScanner monObjet = new MyScanner();
       monObjet.prenom = sc.nextLine();
       monObjet.lieuNaissance = sc.nextLine();
       monObjet.age = sc.nextInt();


         // On fermer le scanner
         sc.close();


        // Affichage du prénom saisi
        System.out.println("Bonjour " + monObjet.prenom + '\n' + "Tu as "
        + monObjet.age + " ans \n" + "Ton lieu de naisance est : " + monObjet.lieuNaissance);


           //Appelle de la methode parler
           monObjet.parler();




        
    }





    


}
