package PEO;

import java.util.Scanner;

public class PE4_Casa_Domotitzada {
    static float temperatura = 20;
    static String back = "Si";
    static String exit = "";
    // cortinas de cada habitacio
    // false = No esta tancada
    static boolean cortinamenjador = false;
    static boolean cortinah2 = false;
    static boolean cortinah3 = false;
    static boolean cortinabany = false;
    static boolean cortinapasadis = false;

    // Llum de cada habitacio
    // false = Esta apagada
    static boolean llummenjador = false;
    static boolean llumh1 = false;
    static boolean llumh2 = false;
    static boolean llumh3 = false;
    static boolean llumbany = false;
    static boolean llumcuina = false;
    static boolean llumpasadis = false;
    // menu llum
    static String menullumtot = "";

    // Camara de cada habitacio
    // false = Esta apagada
    static boolean camaramenjador = false;
    static boolean camarah1 = false;
    static boolean camarah2 = false;
    static boolean camarah3 = false;
    static boolean camarabany = false;
    static boolean camaracuina = false;
    static boolean camarapasadis = false;
    // menu camara
    static String menucamaratot = "";

    static Scanner exits = new Scanner(System.in);

    public static void main(String[] args) {
        String menu = " ";

        // menu temperataras
        String menutemperatura = " ";
        String menutemperaturastatus = " ";
        String menutemperaturapujar = " ";
        String menutemperaturabaixar = " ";

        // menu cortinas
        String menucortina = " ";
        String menucortinahabitacio = " ";
        String menucortinaobrirotancar = " ";

        // menu llums
        String menullum = " ";
        String menullumhabitacio = "";
        String menullumonoff = "";

        // menu camara
        String menucamara = " ";
        String menucamarahabitacio = "";
        String menucamaraonoff = "";

        String backmenumain = "Si";
        String backmenutemp = "Si";

        Scanner menus = new Scanner(System.in);

        do {
            // pujar el texto anterior 50 linies cap a dalt
            for (int i = 0; i < 50; ++i)
                System.out.println();
            System.out.println("Seleciona una funcio: ");
            System.out.println("a) Temperatura de la Habitacio");
            System.out.println("b) Obrir o tancar persianes");
            System.out.println("c) Llums");
            System.out.println("d) Càmeres");
            System.out.println("e) Apagar");
            menu = menus.next();
            switch (menu) {
                case "a":
                    do {
                        // pujar el texto anterior 50 linies cap a dalt
                        for (int i = 0; i < 50; ++i)
                            System.out.println();
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
                                try {
                                    Thread.sleep(2000);
                                } catch (Exception e) {

                                }
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
                                try {
                                    Thread.sleep(2000);
                                } catch (Exception e) {

                                }
                                break;

                            case "e":
                                // tornar enrere
                                System.out.println("Back");
                                try {
                                    Thread.sleep(2000);
                                } catch (Exception e) {

                                }
                                // backmenumain = "No";
                                break;

                            default:
                                // no has selecionat un caracter valid
                                System.out.println("Error: Seleciona un caracter valid");
                                break;
                        }
                    } while (!menutemperaturastatus.equals("e"));
                    break;

                case "b":
                    // pujar el texto anterior 50 linies cap a dalt
                    for (int i = 0; i < 50; ++i)
                        System.out.println();
                    System.out.println("a) Escull habitacio");
                    System.out.println("b) Tancar todes les cortinas");
                    System.out.println("c) Tornar enrere");
                    menucortina = menus.next();
                    switch (menucortina) {
                        case "a":
                            // pujar el texto anterior 50 linies cap a dalt
                            for (int i = 0; i < 50; ++i)
                                System.out.println();
                            System.out.println("a) bany");
                            System.out.println("b) menjador");
                            System.out.println("c) h2");
                            System.out.println("d) h3");
                            System.out.println("e) passadis");
                            System.out.println("f) go back");
                            menucortinahabitacio = menus.next();
                            switch (menucortinahabitacio) {
                                case "a":
                                    System.out.println("Cortina del bany que vols fer?");
                                    System.out.println("a) Open");
                                    System.out.println("b) Close");
                                    System.out.println("c) Go back");
                                    menucortinaobrirotancar = menus.next();
                                    switch (menucortinaobrirotancar) {
                                        case "a":
                                            // Open
                                            System.out.println("Oberta");
                                            cortinabany = false;
                                            try {
                                                Thread.sleep(2000);
                                            } catch (Exception e) {

                                            }

                                            break;
                                        case "b":
                                            // tancar
                                            System.out.println("Tancada");
                                            cortinabany = true;
                                            try {
                                                Thread.sleep(2000);
                                            } catch (Exception e) {

                                            }
                                            System.out.println(" ");

                                            break;

                                        case "c":
                                            // go back
                                            break;

                                        default:
                                            System.out.println("Error: Seleciona un caracter valid");
                                            break;
                                    }

                                    break;

                                case "b":
                                    // pujar el texto anterior 50 linies cap a dalt
                                    for (int i = 0; i < 50; ++i)
                                        System.out.println();
                                    System.out.println("Cortina del menjador que vols fer?");
                                    System.out.println("a) Open");
                                    System.out.println("b) Close");
                                    System.out.println("c) Go back");
                                    menucortinaobrirotancar = menus.next();
                                    switch (menucortinaobrirotancar) {
                                        case "a":
                                            // Open
                                            System.out.println("Oberta");
                                            cortinamenjador = false;
                                            try {
                                                Thread.sleep(2000);
                                            } catch (Exception e) {

                                            }

                                            break;
                                        case "b":
                                            // tancar
                                            System.out.println("Tancada");
                                            cortinamenjador = true;
                                            try {
                                                Thread.sleep(2000);
                                            } catch (Exception e) {

                                            }

                                            break;

                                        case "c":
                                            // go back
                                            break;

                                        default:
                                            System.out.println("Error: Seleciona un caracter valid");
                                            break;
                                    }
                                    break;
                                case "c":
                                    // pujar el texto anterior 50 linies cap a dalt
                                    for (int i = 0; i < 50; ++i)
                                        System.out.println();
                                    System.out.println("Cortina del h2 que vols fer?");
                                    System.out.println("a) Open");
                                    System.out.println("b) Close");
                                    System.out.println("c) Go back");
                                    menucortinaobrirotancar = menus.next();
                                    switch (menucortinaobrirotancar) {
                                        case "a":
                                            // Open
                                            System.out.println("Oberta");
                                            cortinah2 = false;
                                            try {
                                                Thread.sleep(2000);
                                            } catch (Exception e) {

                                            }

                                            break;
                                        case "b":
                                            // tancar
                                            System.out.println("Tancada");
                                            cortinah2 = true;
                                            try {
                                                Thread.sleep(2000);
                                            } catch (Exception e) {

                                            }
                                            break;

                                        case "c":
                                            // go back
                                            break;

                                        default:
                                            System.out.println("Error: Seleciona un caracter valid");
                                            break;
                                    }
                                    break;
                                case "d":
                                    // pujar el texto anterior 50 linies cap a dalt
                                    for (int i = 0; i < 50; ++i)
                                        System.out.println();
                                    System.out.println("Cortina del h3 que vols fer?");
                                    System.out.println("a) Open");
                                    System.out.println("b) Close");
                                    System.out.println("c) Go back");
                                    menucortinaobrirotancar = menus.next();
                                    switch (menucortinaobrirotancar) {
                                        case "a":
                                            // Open
                                            System.out.println("Oberta");
                                            cortinah3 = false;
                                            try {
                                                Thread.sleep(2000);
                                            } catch (Exception e) {

                                            }

                                            break;
                                        case "b":
                                            // tancar
                                            System.out.println("Tancada");
                                            cortinah3 = true;
                                            try {
                                                Thread.sleep(2000);
                                            } catch (Exception e) {

                                            }
                                            break;

                                        case "c":
                                            // go back
                                            break;

                                        default:
                                            System.out.println("Error: Seleciona un caracter valid");
                                            break;
                                    }
                                    break;

                                case "e":
                                    // pujar el texto anterior 50 linies cap a dalt
                                    for (int i = 0; i < 50; ++i)
                                        System.out.println();
                                    System.out.println("Cortina del passadis que vols fer?");
                                    System.out.println("a) Open");
                                    System.out.println("b) Close");
                                    System.out.println("c) Go back");
                                    menucortinaobrirotancar = menus.next();
                                    switch (menucortinaobrirotancar) {
                                        case "a":
                                            // Open
                                            System.out.println("Oberta");
                                            cortinapasadis = false;
                                            try {
                                                Thread.sleep(2000);
                                            } catch (Exception e) {

                                            }

                                            break;
                                        case "b":
                                            // tancar
                                            System.out.println("Tancada");
                                            try {
                                                Thread.sleep(2000);
                                            } catch (Exception e) {

                                            }
                                            cortinapasadis = true;
                                            break;

                                        case "c":
                                            // go back
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
                            cortinestottancades();
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

                case "c":
                    System.out.println("Escull que opcio vols");
                    System.out.println("a) Escollir habitacio");
                    System.out.println("b) Controlar totes les habitacions");
                    System.out.println("c) Mostra el estat de totes les llums");
                    System.out.println("d) Go back");
                    menullum = menus.next();
                    switch (menullum) {
                        case "a":
                            System.out.println("Seleciona una habitacio: ");
                            System.out.println("a) Menjador");
                            System.out.println("b) H1");
                            System.out.println("c) H2");
                            System.out.println("d) H3");
                            System.out.println("e) Bany");
                            System.out.println("f) Cuina");
                            System.out.println("g) Pasadis");
                            System.out.println("h) Go back");
                            menullumhabitacio = menus.next();
                            switch (menullumhabitacio) {
                                case "a":
                                    System.out.println("Que vols fer apagar llum o encendre llum");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menullumonoff = menus.next();

                                    if (menullumonoff.equals("a")) {
                                        llummenjador = true;
                                        System.out.println("On");
                                    }
                                    if (menullumonoff.equals("b")) {
                                        llummenjador = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menullumonoff = "";

                                    break;
                                case "b":
                                    System.out.println("Que vols fer apagar llum o encendre llum");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menullumonoff = menus.next();

                                    if (menullumonoff.equals("a")) {
                                        llumh1 = true;
                                        System.out.println("On");
                                    }
                                    if (menullumonoff.equals("b")) {
                                        llumh1 = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menullumonoff = "";
                                    break;

                                case "c":
                                    System.out.println("Que vols fer apagar llum o encendre llum");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menullumonoff = menus.next();

                                    if (menullumonoff.equals("a")) {
                                        llumh2 = true;
                                        System.out.println("On");
                                    }
                                    if (menullumonoff.equals("b")) {
                                        llumh2 = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menullumonoff = "";
                                    break;
                                case "d":
                                    System.out.println("Que vols fer apagar llum o encendre llum");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menullumonoff = menus.next();

                                    if (menullumonoff.equals("a")) {
                                        llumh3 = true;
                                        System.out.println("On");
                                    }
                                    if (menullumonoff.equals("b")) {
                                        llumh3 = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menullumonoff = "";
                                    break;

                                case "e":
                                    System.out.println("Que vols fer apagar llum o encendre llum");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menullumonoff = menus.next();

                                    if (menullumonoff.equals("a")) {
                                        llumbany = true;
                                        System.out.println("On");
                                    }
                                    if (menullumonoff.equals("b")) {
                                        llumbany = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menullumonoff = "";
                                    break;
                                case "f":
                                    System.out.println("Que vols fer apagar llum o encendre llum");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menullumonoff = menus.next();

                                    if (menullumonoff.equals("a")) {
                                        llumcuina = true;
                                        System.out.println("On");
                                    }
                                    if (menullumonoff.equals("b")) {
                                        llumcuina = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menullumonoff = "";
                                    break;

                                case "g":
                                    System.out.println("Que vols fer apagar llum o encendre llum");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menullumonoff = menus.next();

                                    if (menullumonoff.equals("a")) {
                                        llumpasadis = true;
                                        System.out.println("On");
                                    }
                                    if (menullumonoff.equals("b")) {
                                        llumpasadis = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menullumonoff = "";
                                    break;

                                default:
                                    System.out.println("Error: Seleciona un caracter valid");
                                    break;

                            }
                            break;
                        case "b":
                            System.out.println("Encendre o apagar totes les llums");
                            System.out.println("a) Encendre");
                            System.out.println("b) Apagar");
                            menullumtot = menus.next();
                            switch (menullumtot) {
                                case "a":
                                    encendretot();
                                    break;
                                case "b":
                                    apagattot();
                                    break;
                                default:
                                    System.out.println("Error: Seleciona un caracter valid");
                                    break;
                            }
                            break;
                        case "c":
                            System.out.println("Estat de les llums: ");
                            System.out.println("Menjador " + llummenjador);
                            System.out.println("H1 " + llumh1);
                            System.out.println("H2 " + llumh2);
                            System.out.println("H3 " + llumh3);
                            System.out.println("Bany " + llumbany);
                            System.out.println("Cuina " + llumpasadis);
                            try {
                                Thread.sleep(5000);
                            } catch (Exception e) {

                            }
                            break;

                        case "d":
                            // Tornar enrere
                            break;
                        default:
                            System.out.println("Error: Seleciona un caracter valid");
                            break;
                    }
                    break;

                case "d":
                // pujar el texto anterior 50 linies cap a dalt
                    for (int i = 0; i < 50; ++i)
                        System.out.println();
                    System.out.println("Escull que opcio vols");
                    System.out.println("a) Escollir habitacio");
                    System.out.println("b) Controlar totes les habitacions");
                    System.out.println("c) Mostra el estat de totes les càmeres");
                    System.out.println("d) Go back");
                    menucamara = menus.next();
                    switch (menucamara) {
                        case "a":
                            System.out.println("Seleciona una habitacio: ");
                            System.out.println("a) Menjador");
                            System.out.println("b) H1");
                            System.out.println("c) H2");
                            System.out.println("d) H3");
                            System.out.println("e) Bany");
                            System.out.println("f) Cuina");
                            System.out.println("g) Pasadis");
                            System.out.println("h) Go back");
                            menucamarahabitacio = menus.next();
                            switch (menucamarahabitacio) {
                                case "a":
                                    System.out.println("Que vols fer apagar camara o encendre camara");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menucamaraonoff = menus.next();

                                    if (menucamaraonoff.equals("a")) {
                                        camaramenjador = true;
                                        System.out.println("On");
                                    }
                                    if (menucamaraonoff.equals("b")) {
                                        camaramenjador = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menucamaraonoff = "";

                                    break;
                                case "b":
                                    System.out.println("Que vols fer apagar camara o encendre camara");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menucamaraonoff = menus.next();

                                    if (menucamaraonoff.equals("a")) {
                                        camarah1 = true;
                                        System.out.println("On");
                                    }
                                    if (menucamaraonoff.equals("b")) {
                                        camarah1 = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menucamaraonoff = "";
                                    break;

                                case "c":
                                    System.out.println("Que vols fer apagar camara o encendre camara");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menucamaraonoff = menus.next();

                                    if (menucamaraonoff.equals("a")) {
                                        camarah2 = true;
                                        System.out.println("On");
                                    }
                                    if (menucamaraonoff.equals("b")) {
                                        camarah2 = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menucamaraonoff = "";
                                    break;
                                case "d":
                                    System.out.println("Que vols fer apagar camara o encendre camara");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menucamaraonoff = menus.next();

                                    if (menucamaraonoff.equals("a")) {
                                        camarah3 = true;
                                        System.out.println("On");
                                    }
                                    if (menucamaraonoff.equals("b")) {
                                        camarah3 = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menucamaraonoff = "";
                                    break;

                                case "e":
                                    System.out.println("Que vols fer apagar camara o encendre camara");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menucamaraonoff = menus.next();

                                    if (menucamaraonoff.equals("a")) {
                                        camarabany = true;
                                        System.out.println("On");
                                    }
                                    if (menucamaraonoff.equals("b")) {
                                        camarabany = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menucamaraonoff = "";
                                    break;
                                case "f":
                                    System.out.println("Que vols fer apagar camara o encendre camara");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menucamaraonoff = menus.next();

                                    if (menucamaraonoff.equals("a")) {
                                        camaracuina = true;
                                        System.out.println("On");
                                    }
                                    if (menucamaraonoff.equals("b")) {
                                        camaracuina = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menucamaraonoff = "";
                                    break;

                                case "g":
                                    System.out.println("Que vols fer apagar camara o encendre camara");
                                    System.out.println("a) Encendre");
                                    System.out.println("b) Apagar");
                                    menucamaraonoff = menus.next();

                                    if (menucamaraonoff.equals("a")) {
                                        camarapasadis = true;
                                        System.out.println("On");
                                    }
                                    if (menucamaraonoff.equals("b")) {
                                        camarapasadis = false;
                                        System.out.println("Off");
                                    }
                                    try {
                                        Thread.sleep(2000);
                                    } catch (Exception e) {

                                    }
                                    menucamaraonoff = "";
                                    break;

                                default:
                                    System.out.println("Error: Seleciona un caracter valid");
                                    break;

                            }
                            break;
                        case "b":
                            System.out.println("Encendre o apagar totes les càmeres");
                            System.out.println("a) Encendre");
                            System.out.println("b) Apagar");
                            menucamaratot = menus.next();
                            switch (menucamaratot) {
                                case "a":
                                    encendretotcamara();
                                    break;
                                case "b":
                                    apagattotcamara();
                                    break;
                                default:
                                    System.out.println("Error: Seleciona un caracter valid");
                                    break;
                            }
                            break;
                        case "c":
                            System.out.println("Estat de les camares: ");
                            System.out.println("Menjador " + camaramenjador);
                            System.out.println("H1 " + camarah1);
                            System.out.println("H2 " + camarah2);
                            System.out.println("H3 " + camarah3);
                            System.out.println("Bany " + camarabany);
                            System.out.println("Cuina " + camaracuina);
                            System.out.println("Pasadis " + camarapasadis);
                            try {
                                Thread.sleep(5000);
                            } catch (Exception e) {

                            }
                            break;

                        case "d":
                            // Tornar enrere
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
        } while (!menutemperatura.equals("e"));
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
            back = exits.next();
        }
        System.out.println("Temperatura final:" + temperatura);

    }

    public static void deacrease() {
        while (back.equals("Si")) {
            temperatura = temperatura - 1;
            System.out.println("Temperatura actual: " + temperatura);
            System.out.println("Vols baixar més la temperatura?");
            System.out.println("Si o No");
            back = exits.next();
        }
        System.out.println("Temperatura final:" + temperatura);

    }

    public static void selecciotemp() {
        System.out.println("Que temperatura vols: ");
        temperatura = exits.nextFloat();
        System.out.println("La temperatura es de: " + temperatura);
    }

    public static void cortinestottancades() {
        System.out.println("Totes les cortines tancades");
        cortinamenjador = true;
        cortinah2 = true;
        cortinah3 = true;
        cortinabany = true;
        cortinapasadis = true;
    }

    public static void apagattot() {

        System.out.println("S'han apagat totes les llums");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        llummenjador = false;
        llumh1 = false;
        llumh2 = false;
        llumh3 = false;
        llumbany = false;
        llumcuina = false;
        llumpasadis = false;
    }

    public static void encendretot() {
        System.out.println("S'han ences totes les llums");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        llummenjador = true;
        llumh1 = true;
        llumh2 = true;
        llumh3 = true;
        llumbany = true;
        llumcuina = true;
        llumpasadis = true;

    }

    public static void apagattotcamara() {

        System.out.println("S'han apagat totes les cameres");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        camaramenjador = false;
        camarah1 = false;
        camarah2 = false;
        camarah3 = false;
        camarabany = false;
        camaracuina = false;
        camarapasadis = false;
    }

    public static void encendretotcamara() {

        System.out.println("S'han encès totes les càmeres");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        camaramenjador = true;
        camarah1 = true;
        camarah2 = true;
        camarah3 = true;
        camarabany = true;
        camaracuina = true;
        camarapasadis = true;
    }

}