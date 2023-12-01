package D10_LesMethodesChaine;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {


        String email;
        Scanner sc = new Scanner(System.in);
        

        // Transformation du texte en minuscule
        System.out.println("******Saisissez votre email******");
        email = sc .nextLine();


        if (email.toLowerCase().equals("admin@gmail.com")) {
            System.out.println("Vous êtes un administrateur");
        }
        else
        {
            System.out.println("Vous êtes un utilisateur simple \n Votre email en majuscule est : " + email.toUpperCase());
        }
    }
    
}
