package D9_OperateurTernaire;

public class Ternaire {
    public static void main(String[] args){
         
        int age = 18;
        //Sans Operation ternaire (7 ligne de code)
        if (age < 18){
            System.out.println("Vous ête mineur");
        }
        else
        {
            System.out.println("Vous ête majeur");
        }

        // Avec les opérateurs ternaire (En une seule ligne)
        
        System.out.println(age < 18 ? "Vous ête mineur" : "Vous ête majeur");


        
    }
    
}
