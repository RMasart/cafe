package exo;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Bonjour ! Je suis l'assistant de la machine à café. Dites-moi les pièces jaunes dont vous disposez :");
        int machine = 100;
        int pieces1 = 1;
        int pieces5 = 5;
        int pieces10 = 10;
        int pieces20 = 20;
        int pieces50 = 50;
        System.out.println("Pièces de 1 centimes :");
        int npieces1 = clavier.nextInt();
        System.out.println("Pièces de 5 centimes :");
        int npieces5 = clavier.nextInt();
        System.out.println("Pièces 10 centimes :");
        int npieces10 = clavier.nextInt();
        System.out.println("Pièces de 20 centimes :");
        int npieces20 = clavier.nextInt();
        System.out.println("Pièces de 50 centimes :");
        int npieces50 = clavier.nextInt();

        int rpieces1 = pieces1 * npieces1;
        int rpieces5 = pieces5 * npieces5;
        int rpieces10 = pieces10 * npieces10;
        int rpieces20 = pieces20 * npieces20;
        int rpieces50 = pieces50 * npieces50;

        int addition = rpieces1+rpieces5+rpieces10+rpieces20+rpieces50;
        int reste = addition - machine;
        int surplus = addition - machine;
        if (machine == addition) {
            System.out.println("Vous avez exactement de quoi vous payer le café-crème !");
        }
        else {
            if (addition < machine) {
                System.out.println("Il vous manque"+ " " + reste +" "+ "cents pour prendre un café.");
            }
            else {
                System.out.println("Il vous restera"+ " "+ surplus + " " +"cents après avoir pris votre café !");
            }
        }
        clavier.close();
    }
}
