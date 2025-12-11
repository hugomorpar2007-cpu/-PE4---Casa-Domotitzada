package PEO;

import java.util.Scanner;

public class PE3_OperacionsAritmètiques {
    public static void main(String[] args) {
        // Variables
        String menu;
        String name;

        // edat
        int age;

        // peso
        double weight;

        // altura
        double height;

        //Creacio scanner
        Scanner operacio = new Scanner(System.in);

        while (true) {
            System.out.println("Opcio a");
            menu = operacio.nextLine();

            switch (menu) {
                case "a":
                    String tempName;
                    boolean isNumber;
                    boolean saveName = true;

                    // Introduir dades
                    System.out.println("Put your name: ");
                    tempName = operacio.nextLine();

                    if (tempName.isBlank()) { // esta vacio o solo son espacios
                        saveName = false;
                    } else if (tempName.length() < 3 && tempName.length() > 16) {
                        saveName = false;
                    } else {

                        try {
                            Double.parseDouble(tempName); // intenta pasar a numero
                            isNumber = true;
                        } catch (Exception e) {
                            isNumber = false;
                        }

                        saveName = (!isNumber);
                    }

                    if (saveName) {
                        name = tempName;
                    } else {
                        //
                    }

                    try {
                        System.out.println("Put your age: ");
                        age = operacio.nextInt();
                        if (age >= 0 && age <= 120) {

                        }

                    } catch (Exception e) {
                        System.out.println("Error: Introdueix una edad valida");
                    }

                    try {
                        System.out.println("Put your weight: ");
                        weight = operacio.nextDouble();
                        if (weight < 400) {

                        }

                    } catch (Exception e) {
                        System.out.println("Error: Introdueix un pes valid");
                    }

                    try {
                        System.out.println("Put your height: ");
                        height = operacio.nextDouble();
                        if (height >= 0.5 && height <= 2.5) {

                        }
                    } catch (Exception e) {
                        System.out.println("Error: Introdueix una altura valida");
                    }
                    break;

                case "b":

                    break;

                default:
                    System.out.println("No funciona has escollit cap opcio");
                    break;
            }
        }

        // Modificar dades

        // Visualitzar dades
    }
}
