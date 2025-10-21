package PEO;

import java.util.Scanner;

public class PE4_Casa_Domotitzada {
    static float temperatura = 20;
    static String back = "Si";
    static String exit = "";
    static Scanner exits = new Scanner(System.in);

    public static void main(String[] args) {
        String menu = " ";
        Scanner menus = new Scanner(System.in);

        System.out.println("Seleciona una funcio: ");
        System.out.println("a) Room Temperature");
        System.out.println("b) Open close curtains");
        menu = menus.nextLine();

        while (exit.equals("")) {

            switch (menu) {
                case "a":
                    System.out.println("Seleciona una opcio: ");
                    System.out.println("a) Status temp");
                    System.out.println("b) Increase");
                    System.out.println("c) Decrease");
                    System.out.println("d) Set");
                    System.out.println("e) Exit");
                    menu = menus.next();
                    switch (menu) {
                        case "a":
                            mostrarEstatClima();
                            break;

                        case "b":
                            for (exit="Si"; exit.equals("Si");){
                                System.out.println("a) Increase +1");
                                System.out.println("b) Go back");
                                menu = menus.next();
                                switch (menu) {
                                    case "a":
                                        // Increase +1
                                        increase();
                                        break;
                                    case "b":
                                        // Go back
                                        back = "No";
                                        break;
                                    default:
                                        System.out.println("Error: Seleciona un caracter valid");
                                        break;
                                    }
                            }
                            break;

                        case "c":
                            System.out.println("Decrease -1");
                            System.out.println("Go back");
                            switch (menu) {
                                case "a":
                                    // Deacrease -1
                                    deacrease();
                                    break;
                                case "b":
                                    // Go back
                                    break;

                                default:
                                    System.out.println("Error: Seleciona un caracter valid");
                                    break;
                            }
                            break;
                        case "d":
                            // poner la temperatura que quieras
                            selecciotemp();
                            break;

                        case "e":
                            System.out.println("Exit");
                            exit = "x";
                            break;

                        default:
                            System.out.println("Error: Seleciona un caracter valid");
                            break;
                    }
                    break;

                case "b":
                    System.out.println("a) choose room");
                    System.out.println("b) all curtains");
                    System.out.println("c) Exit");
                        switch (menu) {
                            case "a":
                                    System.out.println("a) bathroom");
                                    System.out.println("b) dining room");
                                    System.out.println("c) h2");
                                    System.out.println("d) h3");
                                    System.out.println("e) exit");
                                        switch (menu) {
                                            case "a":
                                                    System.out.println("Cortina del bany tancada");
                                                break;

                                            case "b":
                                                    System.out.println("Cortina del menjador tancada");
                                                break;
                                            case "c":
                                                    System.out.println("Cortina del h2 tancada");
                                                break;
                                        
                                            default:
                                                System.out.println("Error: Seleciona un caracter valid");
                                                break;
                                        }
                                break;

                            case "b":
                                    // tancar totes les cortines
                                    System.out.println("Totes les cortines tancades");
                                break;

                            case "c":
                                    //exit
                                    System.out.println("Exit");
                                    exit = "x";
                                break;
                        
                            default:
                                System.out.println("Error: Seleciona un caracter valid");
                                break;
                        }
                    break;

                default:
                    System.out.println("Error: Seleciona un caracter valid");
                    break;
            }

        }
    }

    public static void mostrarEstatClima() {
        System.out.println("La temperatura de la habitacio es:" + temperatura);

    }

    public static void increase() {
        for (back = "Si"; back.equals("Si");) {
            temperatura = temperatura + 1;
            System.out.println("Temperatura actual: " + temperatura);
            System.out.println("Vols pujar més la temperatura?");
            System.out.println("Si o No");
            back = exits.nextLine();
        }
        System.out.println("Temperatura final:" + temperatura);

    }

    public static void deacrease() {
        for (back = "Si"; back.equals("Si");) {
            temperatura = temperatura - 1;
            System.out.println("Temperatura actual: " + temperatura);
            System.out.println("Vols baixar més la temperatura?");
            System.out.println("Si o No");
            back = exits.nextLine();
        }
        System.out.println("Temperatura final:" + temperatura);

    }

    public static void selecciotemp() {
        System.out.println("Que temperatura vols: ");
        temperatura = exits.nextFloat();
        System.out.println("La temperatura es de: " + temperatura);
    }

}
