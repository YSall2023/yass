package D8_LesConditions;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int numeroEtage;
        Scanner sc = new Scanner(System.in);


        System.out.println("** Application Ascenseur ***");
        System.out.println("Entrer le numéro de l'etage ou l'ascenseur doit se rendre (0 - 3)");
        numeroEtage = sc.nextInt();

        switch (numeroEtage) {
            case 0:
            case 1:
                System.out.println("L'ascenseur doit se rendre au rez-de-chaussé ou au premier etage");
                break;
            case 2:
                System.out.println("L'ascenseur doit se rendre au deuxieme etage");
                break;
            case 3:
                System.out.println("L'ascenseur doit se rendre au troisieme etage");
                break;
            default:
                System.out.println("Le numéro de l'etage spécifié n'existe pas");
        }
    
        
    }
    
}
