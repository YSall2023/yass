package D10_LesMethodesChaine;

import java.util.Scanner;

public class Autres {
    public static void main(String[] args) {
        // Apprtendre la methode concat()
        String salutation = "Bonjour";
        String nom = "Modou Sarr";
        //premier methode pour afficher bjr Modou Sarr
        System.out.println(salutation.concat(" ").concat(nom));
        // Deuxieme methode pour aff bjr Modou Sarr
        System.out.println("Bonjour ".concat(nom));
        System.out.println("");


        // Apprendre la méthode charAt()
        System.out.println("** Apprendre la méthode charAt() **");
        char reponse;
        Scanner sc = new Scanner(System.in);
        System.out.println("Aimez vous le madd ? O / N");
        reponse = sc.nextLine().charAt(0);
        if (reponse == 'O') {
            System.out.println("M. aime le maddd");
        }
        else
        {
            System.out.println("M. n'aime pas le madd");
        }


         
 
    }

        
    
    
}
