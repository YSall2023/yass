package D10_LesMethodesChaine;

import java.util.Scanner;

public class Length {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez votre lieu de naissance");
        String lieuNaissance = sc.nextLine();


        String caractereformter;
        caractereformter = lieuNaissance.length() < 2 ? " caractere" : " caracres ";
 

        System.out.println(lieuNaissance + "comporte" + lieuNaissance.length() + caractereformter);
    }

    
}
