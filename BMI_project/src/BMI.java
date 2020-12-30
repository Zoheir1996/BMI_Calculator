import java.util.Scanner;
public class BMI {

    public static void main(String[] args) {

        Scanner indicemassecorp = new Scanner(System.in);
        System.out.println("Indiquez votre poids");
        double poids = indicemassecorp.nextDouble();

        System.out.println("indiquez votre taille");
        double taille = indicemassecorp.nextDouble();
        double imc;
        imc = (poids / (taille * taille));
        System.out.println("Vous êtes un Homme ou une Femme ? ");
        indicemassecorp.nextLine();
        String genre = indicemassecorp.nextLine();
        System.out.println("genre = " +genre);
        System.out.println("L'indice de masse corporelle est " +imc);
        System.out.println(genre.equals("Homme"));
        System.out.println(genre.equals("Femme"));
        if (genre.equals("Homme") ) {
            if (imc < 20)
                System.out.println("Vous êtes maigre");
            else if (imc >= 20 && imc <= 25)
                System.out.println("Vous avez un poids normal");
            else if (imc >= 25 && imc < 30)
                System.out.println("Vous êtes en surcharge pondérale");
            else if (imc >= 30 && imc <= 40)
                System.out.println("Vous êtes en adiposité");
            else if (imc > 40)
                System.out.println("Vous êtes en obésité");
        }
        if (genre.equals("Femme") ) {
            if (imc < 19)
                System.out.println("Vous êtes maigre");
            else if (imc >= 19 && imc <= 24)
                System.out.println("Vous avez un poids normal");
            else if (imc >= 24 && imc < 30)
                System.out.println("Vous êtes en surcharge pondérale");
            else if (imc >= 30 && imc <= 40)
                System.out.println("Vous êtes en adiposité");
            else if (imc > 40)
                System.out.println("Vous êtes en obésité");
        }


    }


}