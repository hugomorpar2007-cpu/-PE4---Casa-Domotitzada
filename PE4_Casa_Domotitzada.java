package PEO;

import java.util.Scanner;

public class PE4_Casa_Domotitzada {
    static float temperatura = 20;
    static String back = "Si";
    static String exit = "";
    static Scanner exits = new Scanner(System.in);

    public static void main(String[] args) {
        String menu = " ";

        //menu temperataras
        String menutemperatura = " ";
        String menutemperaturastatus = " ";
        String menutemperaturapujar = " ";
        String menutemperaturabaixar = " ";

        // menu cortinas
        String menucortina = " ";
        String menucortinahabitacio = " ";
        String menucortinaobrirotancar = " ";

        //cortinas de cada habitacio
            // false = No esta tancada
        boolean cortinamenjador = false;
        boolean cortinah2 = false;
        boolean cortinah3 = false;
        boolean cortinabany = false;
        boolean cortinapasadis = false;


        String backmenumain = "Si";
        String backmenutemp = "Si";
        

        Scanner menus = new Scanner(System.in);

        do {
                //pujar el texto anterior 50 linies cap a dalt
            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("Seleciona una funcio: ");
            System.out.println("a) Room Temperature");
            System.out.println("b) Open close curtains");
            System.out.println("c) Luces");
            System.out.println("d)");
            System.out.println("e) Apagar");
            menu = menus.nextLine();
            switch (menu) {
                case "a":
                    do {
                            //pujar el texto anterior 50 linies cap a dalt
                        for (int i = 0; i < 50; ++i) System.out.println();
                        System.out.println("Seleciona una opcio: ");
                        System.out.println("a) Status temp");
                        System.out.println("b) Increase");
                        System.out.println("c) Decrease");
                        System.out.println("d) Set");
                        System.out.println("e) Back");
                        menutemperaturastatus = menus.next();
                        switch (menutemperaturastatus) {
                            case "a":
                                mostrarEstatClima();
                                break;

                            case "b":
                                System.out.println("a) Increase +1");
                                System.out.println("b) Go back");
                                menutemperaturapujar = menus.next();
                                switch (menutemperaturapujar) {
                                    case "a":
                                        // Increase +1
                                        increase();
                                        break;
                                    case "b":
                                        // Go back
                                        backmenutemp = "No";
                                        break;
                                    default:
                                        System.out.println("Error: Seleciona un caracter valid");
                                        break;
                                }

                                break;

                            case "c":
                                System.out.println("Decrease -1");
                                System.out.println("Go back");
                                switch (menutemperaturabaixar) {
                                    case "a":
                                        // Deacrease -1
                                        deacrease();
                                        break;
                                    case "b":
                                        // Go back
                                        backmenutemp = "No";
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
                                // tornar enrere
                                System.out.println("Back");
                                //backmenumain = "No";
                                break;

                            default:
                                // no has selecionat un caracter valid
                                System.out.println("Error: Seleciona un caracter valid");
                                break;
                        }
                    } while (!menutemperaturastatus.equals("e"));
                    break;

                case "b":
                    //pujar el texto anterior 50 linies cap a dalt
                    for (int i = 0; i < 50; ++i) System.out.println();
                    System.out.println("a) escull habitacio");
                    System.out.println("b) todas las cortinas");
                    System.out.println("c) Tornar");
                     menucortina = menus.nextLine();
                    switch (menucortina) {
                        case "a":
                                //pujar el texto anterior 50 linies cap a dalt
                            for (int i = 0; i < 50; ++i) System.out.println();
                            System.out.println("a) bany");
                            System.out.println("b) menjador");
                            System.out.println("c) h2");
                            System.out.println("e) h3");
                            System.out.println("f) passadis");
                            System.out.println("g) exit");
                            menucortinahabitacio = menus.nextLine();
                            switch (menucortinahabitacio) {
                                case "a":
                                    System.out.println("Cortina del bany que vols fer?");
                                    System.out.println("Open");
                                    System.out.println("Close");
                                    System.out.println("Go back");
                                     menucortinaobrirotancar = menus.nextLine();
                                    switch (menucortinaobrirotancar) {
                                        case "a":
                                                // Open
                                                cortinabany = false;
                                            break;
                                        case "b":
                                                //tancar
                                                cortinabany = true;
                                            break;

                                        case "c":
                                                //go back
                                            break;
                                    
                                        default:
                                            System.out.println("Error: Seleciona un caracter valid");
                                            break;
                                    }
                                    
                                    break;

                                case "b":
                                        //pujar el texto anterior 50 linies cap a dalt
                                    for (int i = 0; i < 50; ++i) System.out.println();
                                    System.out.println("Cortina del menjador que vols fer?");
                                    System.out.println("Open");
                                    System.out.println("Close");
                                    System.out.println("Go back");
                                    menucortinaobrirotancar = menus.nextLine();
                                    switch (menucortinaobrirotancar) {
                                        case "a":
                                                // Open
                                                cortinamenjador = false;
                                            break;
                                        case "b":
                                                //tancar
                                                cortinamenjador = true;
                                            break;

                                        case "c":
                                                //go back
                                            break;
                                    
                                        default:
                                            System.out.println("Error: Seleciona un caracter valid");
                                            break;
                                    }
                                    break;
                                case "c":
                                        //pujar el texto anterior 50 linies cap a dalt
                                    for (int i = 0; i < 50; ++i) System.out.println();
                                    System.out.println("Cortina del h2 que vols fer?");
                                    System.out.println("Open");
                                    System.out.println("Close");
                                    System.out.println("Go back");
                                    menucortinaobrirotancar = menus.nextLine();
                                    switch (menucortinaobrirotancar) {
                                        case "a":
                                                // Open
                                                cortinah2 = false;
                                            break;
                                        case "b":
                                                //tancar
                                                cortinah2 = true;
                                            break;

                                        case "c":
                                                //go back
                                            break;
                                    
                                        default:
                                            System.out.println("Error: Seleciona un caracter valid");
                                            break;
                                    }
                                    break;
                                case "d":
                                        //pujar el texto anterior 50 linies cap a dalt
                                    for (int i = 0; i < 50; ++i) System.out.println();
                                    System.out.println("Cortina del h3 que vols fer?");
                                    System.out.println("Open");
                                    System.out.println("Close");
                                    System.out.println("Go back");
                                    menucortinaobrirotancar = menus.nextLine();
                                    switch (menucortinaobrirotancar) {
                                        case "a":
                                                // Open
                                                cortinah3 = false;
                                            break;
                                        case "b":
                                                //tancar
                                                cortinah3 = true;
                                            break;

                                        case "c":
                                                //go back
                                            break;
                                    
                                        default:
                                            System.out.println("Error: Seleciona un caracter valid");
                                            break;
                                    }
                                    break;
        
                                    case "e":
                                        //pujar el texto anterior 50 linies cap a dalt
                                    for (int i = 0; i < 50; ++i) System.out.println();
                                    System.out.println("Cortina del passadis que vols fer?");
                                    System.out.println("a) Open");
                                    System.out.println("b) Close");
                                    System.out.println("c) Go back");
                                    menucortinaobrirotancar = menus.nextLine();
                                    switch (menucortinaobrirotancar) {
                                        case "a":
                                                // Open
                                                System.out.println("Oberta");
                                                cortinapasadis = false;
                                                try{
                                                    Thread.sleep(20000);
                                                }catch (Exception e) {
                                                    
                                                }
                                                System.out.println(" ");
                                                
                                            break;
                                        case "b":
                                                //tancar
                                                cortinapasadis = true;
                                            break;

                                        case "c":
                                                //go back
                                            break;
                                    
                                        default:
                                            System.out.println("Error: Seleciona un caracter valid");
                                            break;
                                    }
                                    break;
                                case "f":
                                    // go back
                                    break;

                                default:
                                    System.out.println("Error: Seleciona un caracter valid");
                                    break;
                            }
                            break;

                        case "b":
                            // tancar totes les cortines
                            System.out.println("Totes les cortines tancades");
                            cortinamenjador = true;
                            cortinah2 = true;
                            cortinah3 = true;
                            cortinabany = true;
                            cortinapasadis = true;
                            break;

                        case "c":
                            // exit
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
        }while(!menutemperatura.equals("e"));
    }

    public static void mostrarEstatClima() {
        System.out.println("La temperatura de la habitacio es:" + temperatura);

    }

    public static void increase() {
        while (back.equals("Si")) {
            temperatura = temperatura + 1;
            System.out.println("Temperatura actual: " + temperatura);
            System.out.println("Vols pujar més la temperatura?");
            System.out.println("Si o No");
            back = exits.nextLine();
        }
        System.out.println("Temperatura final:" + temperatura);

    }

    public static void deacrease() {
        while (back.equals("Si")) {
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
