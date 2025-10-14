package PEO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PE03_Control_Salut {
    public static void main(String[] args) {
        // Variables
            // menu
        String menu="";
            //nom
        String name="";

            // edat
        int age=0;

            // peso
        double weight=0;

            // altura
        double height=0;

            // imc
        String imctype = "";
        double imc = 0;

            // aigua recomendada
        int water = 35;
        double waterml = 0;
        double waterl =0;
        //Creacio scanner
        Scanner operacio = new Scanner(System.in);

         while (true) {
            System.out.println("Opcions: ");
            System.out.println("a: Per introduir dades");
            System.out.println("b: Modificar dades");
            System.out.println("c: Visualitzar dades");
            System.out.println("d: Sortir");
            menu = operacio.nextLine();
            switch (menu) {
                case "a":
                    // Introduir dades

                        //Introduir nom
                    System.out.println("Put your name: ");
                    name = operacio.nextLine();
                    if (name.isBlank()) { // esta vacio o solo son espacios
                        System.out.println("Error: Esta buit o nomes son espais");
                    } 
                    
                        //Introduir edat
                    System.out.println("Put your age: ");
                    try{
                        age = operacio.nextInt();
                        if (age < 0 || age > 120) {
                           System.out.println("Error: L'edat ha de ser un enter positiu ≤ 120.");
                        } 
                    }catch(InputMismatchException e){
                        System.out.println("Error: Format numèric invàlid");
                    }

                        //Introduir el teu pes
                    System.out.println("Put your weight (kg): ");
                    try {
                        weight = operacio.nextDouble();
                        if (weight < 0 || weight > 400) {
                           System.out.println("Error: L'edat ha de ser un enter positiu ≤ 400.");
                        } 
                        
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Format numèric invàlid");
                    }

                        //Introduir la teva alçada
                    System.out.println("Put your height (m): ");
                    try {
                        height = operacio.nextDouble();
                        if (height < 0.5 || height > 2.5) {
                           System.out.println("Error: L'alçada ha de ser un decimal positiu entre 0.5 i 2.5 metres");
                        }   
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Format numèric invàlid");
                    }
                    
                     
                break;

                case "b":
                System.out.println("a: para cambiar la dada de name");
                System.out.println("b: para cambiar la dada de edat");
                System.out.println("c: para cambiar la dada de pes");
                System.out.println("d: para cambiar la dada de alçada");
                menu = operacio.nextLine();
                    switch (menu) {
                        case "a":
                                //Introduir nom
                            System.out.println("Put your name: ");
                            name = operacio.nextLine();
                            if (name.isBlank()) { // esta vacio o solo son espacios
                                System.out.println("Error: Esta buit o nomes son espais");
                            }
                            break;
                        case "b":
                                    //Introduir edat
                            System.out.println("Put your age: ");
                            try{
                                age = operacio.nextInt();
                                if (age < 0 || age > 120) {
                                System.out.println("Error: L'edat ha de ser un enter positiu ≤ 120.");
                                } 
                            }catch(InputMismatchException e){
                                System.out.println("Error: Format numèric invàlid");
                            }

                            break;
                        case "c":
                                //Introduir el teu pes
                            System.out.println("Put your weight (kg): ");
                            try {
                                weight = operacio.nextInt();
                                if (weight < 0 || weight > 400) {
                                System.out.println("Error: L'edat ha de ser un enter positiu ≤ 400.");
                                } 
                                
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Format numèric invàlid");
                            }

                            break;
                        case "d":
                                    //Introduir la teva alçada
                            System.out.println("Put your weight (m): ");
                            try {
                                height = operacio.nextInt();
                                if (height < 0.5 || height > 2.5) {
                                System.out.println("Error: L'alçada ha de ser un decimal positiu entre 0.5 i 2.5 metres");
                                }   
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Format numèric invàlid");
                            }
                            break;
                    
                        default:
                        System.out.println("Error: No has introduit una opcio valida");
                            break;
                    }
                    break;
                case "c":
                    // imc
                        // Mathf.pow "potencia"
                        imc = weight / (height* height);
                    if (imc <18.5) {
                        imctype="Pes baix";
                    }
                    else if (imc >= 18.5 || imc <= 24.9){
                        imctype="Pes normal";
                    }
                    else if (imc >= 25 || imc <= 29.9) {
                        imctype="Sobrepès";
                    }
                    else if (imc < 30) {
                        imctype="Obesitat";
                    }
                        
                    // water
                    waterml = weight * water;
                    waterl = waterml / 1000; 

                    // birtday
                    int birtday = 2025 - age; 
                    
                    //cardiaca
                    int fc_max = 220 - age;

                    // imprimir resultats per pantalla
                    System.out.println("El teu nom es: " + name);
                    System.out.println("El teu imc es:  " + imc);
                    System.out.println("Y el tipus es: " + imctype);
                    System.out.println("Aigua recomendada al dia: " + waterl + " L");
                    System.out.println("El teu any de naixamente aproximat es: " + birtday);
                    break;

                case "d":
                System.exit(0);
                    break;
            
                default:
                System.out.println("No funciona, no has escollit cap opcio");
                    break;
            }
         }


        
    }
}
