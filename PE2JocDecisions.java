package PEO;

import java.util.Scanner;

public class PE2JocDecisions {
    public static void main(String[] args) {
        

        //Creem la variable per el menu i per la desicio inicial
        int menu = 0;
        boolean desicio0;

        //Desicio 0
        System.out.println("Estàs visitant un museu d’art antic en una exposició exclusiva, quan et quedes sol accidentalment en una sala tancada.");
        System.out.println("A la paret del fons, hi ha un quadre cobert amb una tela polsegosa. Sembla fora de lloc.");

        System.out.println("Tens dos opcions Destapar el quadre (1) o deixar-lot tapat i continuar explorant la sala (2)" );
        
        //Creem l'escaner i demane l'opcio que vol triar
        Scanner men = new Scanner(System.in);

        menu = men.nextInt();
        
        //Desicio 0  
        switch (menu) {
            case 1:
                desicio0 = true;
                
            case 2:
                desicio0 = false;
                break;
        
            default:
                System.out.println("Error");
                break;
        }
    //Desicio 1
    System.out.println("Estàs sol en una sala silenciosa…");
    System.out.println("Tens l'opcio d'anar per una porta lateral misteriosa (1) o pujar les escales cap a una galeria superior (2)");
    menu = men.nextInt();
     
        switch (menu) {
                case 1:
                //Desicio 2
                System.out.println("Entras per una porta lateral misteriosa");
                System.out.println("Com has entrar per la porta lateral, arribes a un passadís on el temps sembla aturat.");
                System.out.println("El final, es bifurca:");
                System.out.println("Pots anar cap al passadís amb llums vermelles (1) o per al passadis que fa olor de pintura fresca (2)");
                menu = men.nextInt();
                
                switch (menu) {
                    case 1:
                        //Desicio 3
                        System.out.println("Vas cap al passadís amb llums vermelles");
                        System.out.println("Com has entrar al passadís amb llums vermelles arribes a una escultura coberta amb un llenç negre i una inscripció estranya.");
                        System.out.println("Destapar l’escultura (1) o No tocar l'escultura (2)");
                        menu = men.nextInt();
                        switch (menu) {
                            case 1:
                                if (desicio0 = true) {
                                    System.out.println("Si vas amb el quadre destapat: l’escultura cobra vida i et guia cap a una sortida secreta (Final feliç).");
                                }
                                else{
                                    System.out.println("Si no havies destapat el quadre: l’escultura t’absorbeix dins un somni etern (Final tràgic).");

                                }

                                break;
                            case 2:
                                System.out.println("Si no la toques: desapareix davant teu i quedes sol, sense respostes (Final neutre).");
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                    //Desicio 3
                        System.out.println("Vas cap al passadis que fa olor de pintura fresca");
                        System.out.println("Passadís amb olor de pintura fresca: comences a escoltar passos que no són teus.");
                        System.out.println("Destapar l'escultura (1) o No tocar l'escultura (2)");
                        menu = men.nextInt();
                        switch (menu) {
                            case 1:
                                if (desicio0 = true) {
                                    System.out.println("Si t’amagues amb el quadre destapat: descobreixes una porta secreta darrere d’un llenç i escapes (Final misteriós segur).");
                                }
                                else{
                                    System.out.println("Si t’amagues sense el quadre destapat: caus dins una trampa d’il·lusions òptiques i quedes atrapat (Final tràgic).");

                                }

                                break;
                            case 2:
                                System.out.println("Si t’enfrontes: una figura et toca i quedes congelat en una pintura (Final tràgic).");
                                break;
                            default:
                            System.out.println("Error");
                                break;
                        }
                        break;
                    default:
                    System.out.println("Error");
                        break;
                }
                    break;

                case 2:
                //Desicio 2
                    System.out.println("Pujar les escales cap a una galeria superior");
                    System.out.println("Estàs sol en una sala silenciosa…");
                    System.out.println("Si puges les escales cap a la galeria superior, arribes a una sala on tots els quadres es mouen lentament.");
                    System.out.println("Un en particular brilla amb llum daurada.");
                    System.out.println("Pots tocar el quadre daurat (1) o observar-los en silenci (2)");
                    menu = men.nextInt();
                    switch (menu) {
                        case 1:
                        if (desicio0 = true) {
                           System.out.println("Tocar el quadre amb el quadre encantat ja destapat: et converteixes en un mestre del temps dins el món dels quadres (Final fantàstic)."); 
                        }
                        else {
                            System.out.println("Tocar-lo sense haver destapat l’altre quadre: quedes atrapat com a personatge dins una pintura (Final fantàstic).");
                        }
                            break;
                        case 2:
                        System.out.println("Seure a observar-los: et sents en pau i l’ambient et reconforta (Final tranquil).");
                            break;
                    
                        default:
                        System.out.println("Error");
                            break;
                    }
                    break;
            
                default:
                System.out.println("Error");
                    break;
            }
            
    }
    
}
