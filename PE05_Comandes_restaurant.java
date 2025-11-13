package PEO;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class PE05_Comandes_restaurant {
    public static void main(String[] args) {
        PE05_Comandes_restaurant p = new PE05_Comandes_restaurant();
        p.principal();
    }

    public void principal() {
        // menus
        int menuprin = 0;
        int menunewcomanda = 0;
        int menurefreshcomanda = 0;
        int menuseecomanda = 0;

        // dades
        String nom = "";
        String producte = "";
        float preuunitat = 0;
        int unitats = 0;

        String tiquet = "";

        Scanner insert = new Scanner(System.in);

        
        while (menuprin != (4)) {
            System.out.println("______________________________________");
            System.out.println("");
            System.out.println("===== GESTIÓ COMANDES RESTAURANT =====");
            System.out.println("______________________________________");
            System.out.println("1. Crear nova comanda");
            System.out.println("2. Actualitzar comanda anterior");
            System.out.println("3. Visualitzar últim tiquet");
            System.out.println("4. Sortir");
            System.out.print("Tria una opcio: ");
            menuprin = insert.nextInt();
            switch (menuprin) {
                case 1:
                    String opcioSeguir = " ";
                    System.out.println("______________________________________");
                    System.out.println("============ NOVA COMANDA ============ ");
                    System.out.println("______________________________________");
                    System.out.println("> Introdueix el nom del client:");
                    nom = insert.next();
                    tiquet = tiquet + " - " + nom;
                    while (!opcioSeguir.equalsIgnoreCase("n")) {

                        System.out.println("> Introdueix el producte:");
                        producte = insert.next();
                        tiquet = tiquet + " - " + producte;
                        System.out.println("> Preu unitari (€):");
                        preuunitat = insert.nextFloat();
                        System.out.println("> Quantitat:");
                        unitats = insert.nextInt();

                        tiquet = tiquet + "\n";
                        System.out.println("> Vols afegir un altre producte? (s/n):");
                        opcioSeguir = insert.next();
                    }
                    System.out.println("S’està generant el tiquet…");
                    System.out.println("______________________________________");
                    System.out.println("=============== TIQUET ===============");
                    System.out.println("______________________________________");
                    System.out.println("Client: " + nom);
                    System.out.println("Producte        Quantitat   Preu unit.   Subtotal");
                    System.out.println("--------------------------------------------------");
                    System.out.println(tiquet);
                    System.out.println("--------------------------------------------------");
                    System.out.println("Total sense IVA: ");
                    System.out.println("IVA (10%): ");
                    System.out.println("TOTAL A PAGAR: ");
                    System.out.println("==================================================");
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {}

                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println("______________________________________");
                    System.out.println("============ ÚLTIM TIQUET ============");
                    System.out.println("______________________________________");
                    System.out.println("Client: ");
                    System.out.println("Producte        Quantitat   Preu unit.   Subtotal");
                    System.out.println("--------------------------------------------------");
                    // Tickets productes
                    System.out.println("--------------------------------------------------");
                    System.out.println("Total sense IVA:");
                    System.out.println("IVA (10%): ");
                    System.out.println("TOTAL A PAGAR: ");
                    System.out.println("==================================================");
                    System.out.println("Comanda actualitzada correctament");
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {}
                    break;
                case 4:
                    System.out.println("______________________________________");
                    System.out.println("========== FINS LA PROPERA! ==========");
                    System.out.println("______________________________________");
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {}
                    break;

                default:
                    System.out.println("Introdueix un valor valid");
                    break;
            }
        }
    }
}
