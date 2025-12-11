package PEO;
import java.util.Scanner;

public class ConversorNumeric {
    
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        boolean volemContinuar = true;
        
        
        while (volemContinuar) {
            System.out.println("\n--- CONVERSOR DE SISTEMES DE NUMERACIO ---");
            System.out.print("Introdueix un numero decimal: ");
            
            int numeroEntrat = teclat.nextInt();
            
            
            if (numeroEntrat < 0) {
                System.out.println("Error: Introdueix un numero positiu.");
                continue;
            }
            
            mostrarConversions(numeroEntrat);
            teclat.nextLine();
            
            System.out.print("\nVols convertir un altre numero? (s/n): ");
            String respostaUsuari = teclat.nextLine();
            
            if (!respostaUsuari.equals("s")) {
                volemContinuar = false;
                System.out.println("Finalitzat");
            }
        }
        
        teclat.close();
    }
    
   
    public static int calcularPotencia(int base, int exponent) {
        int valorFinal = 1;
        
        for (int i = 0; i < exponent; i++) {
            valorFinal = valorFinal * base;
        }
        
        return valorFinal;
    }
    
    
    public static String decimalABinari(int numeroDecimal) {
        
        if (numeroDecimal == 0) {
            return "0b0";
        }
        
        String resultBinari = "";
        int numeroDividir = numeroDecimal;
        
        
        while (numeroDividir > 0) {
            int restaDivisio = numeroDividir % 2;
            resultBinari = restaDivisio + resultBinari;
            numeroDividir = numeroDividir / 2;
        }
        
        return "0b" + resultBinari;
    }
    
    
    public static String decimalAOctal(int numeroDecimal) {
        
        if (numeroDecimal == 0) {
            return "0o0";
        }
        
        String resultOctal = "";
        int numeroDividir = numeroDecimal;
        
        
        while (numeroDividir > 0) {
            int restaDivisio = numeroDividir % 8;
            resultOctal = restaDivisio + resultOctal;
            numeroDividir = numeroDividir / 8;
        }
        
        return "0o" + resultOctal;
    }
    
    
    public static String decimalAHexadecimal(int numeroDecimal) {
       
        if (numeroDecimal == 0) {
            return "0x0";
        }
        
        String resultHexadecimal = "";
        int numeroDividir = numeroDecimal;
        
        
        while (numeroDividir > 0) {
            int restaDivisio = numeroDividir % 16;
            
            
            String digitHexa = "";
            switch (restaDivisio) {
                case 0: digitHexa = "0"; break;
                case 1: digitHexa = "1"; break;
                case 2: digitHexa = "2"; break;
                case 3: digitHexa = "3"; break;
                case 4: digitHexa = "4"; break;
                case 5: digitHexa = "5"; break;
                case 6: digitHexa = "6"; break;
                case 7: digitHexa = "7"; break;
                case 8: digitHexa = "8"; break;
                case 9: digitHexa = "9"; break;
                case 10: digitHexa = "A"; break;
                case 11: digitHexa = "B"; break;
                case 12: digitHexa = "C"; break;
                case 13: digitHexa = "D"; break;
                case 14: digitHexa = "E"; break;
                case 15: digitHexa = "F"; break;
            }
            
            resultHexadecimal = digitHexa + resultHexadecimal;
            numeroDividir = numeroDividir / 16;
        }
        
        return "0x" + resultHexadecimal;
    }
    
    
    public static void mostrarConversions(int numeroDecimal) {
        System.out.println("\n--- RESULTATS DE LA CONVERSIO ---");
        System.out.println("Decimal: " + numeroDecimal);
        System.out.println("Binari: " + decimalABinari(numeroDecimal));
        System.out.println("Octal: " + decimalAOctal(numeroDecimal));
        System.out.println("Hexadecimal: " + decimalAHexadecimal(numeroDecimal));
    }
}