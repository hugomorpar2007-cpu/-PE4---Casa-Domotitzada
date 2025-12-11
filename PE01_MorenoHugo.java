package PEO;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PE01_MorenoHugo {

    public static void main(String[] args) {
        

        //Variables

                //Variables name
        String name;
        String lastname1;
        String lastname2;


            //Variables date
        int fechaNacimiento;
        boolean adult;
        LocalDate fechaActual = LocalDate.now(); // Fecha actual
                //Variable year
        int y;
                //Variable mouth
        int m;
                //Variable day
        int d;
        
            //Variables varies
        String city;
        int postalcode;
        String username;
        String password;
        boolean studient;

        String user;
        String passwordpass;


        //Crear scanner
        
        Scanner register = new Scanner(System.in);

        //Registre

            //Nom sencer
        
        System.out.println("Introduex el teu nom:");
        name = register.next();

        System.out.println("Introduex el teu primer cognom:");
        lastname1 = register.next();

        System.out.println("Introduex el teu segon cognom:");
        lastname2 = register.next();

            //Data de naixament
        
        System.out.print("Any de nacimiento: ");
        y = register.nextInt();
        System.out.print("Mes de nacimiento: ");
        m = register.nextInt();
        System.out.print("Día de nacimiento: ");
        d = register.nextInt();

        LocalDate nacimiento = LocalDate.of(y, m, d);
        LocalDate hoy = LocalDate.now();
        
        fechaNacimiento = Period.between(nacimiento, hoy).getYears();
        adult = fechaNacimiento >= 18;

            //Introdueix ciutat
        System.out.println("Introduex la teva ciutat:");
        city = register.next();

            //Introduex el codi postal
        System.out.println("Introduex el teu codi postal:");
        postalcode = register.nextInt();


            //Introduex el teu usuari
        System.out.println("Introduex el teu usuari:");
        username = register.next();


            //Introduex la teva contrasenya
        System.out.println("Introduex la teva contrasenya:");
        password = register.next();

            //Ets estudiant?
        System.out.println("Ets estudiant?:");
        studient = register.nextBoolean();

        
            //Mitssatje que el registre s'ha completat 
        System.out.println("El registre s'ha completat correctament");

        //Iniciar sessio

        System.out.println("Introduex el teu usuari: ");
        user = register.next();
        System.out.println("Introduex la teva contrasenya: ");
        passwordpass = register.next();


            //Ja que les dues variables son String ho compararem amb el equals
        boolean usercorrect = (user.equals(username));
        boolean passwordcorrect = (password.equals(passwordpass));

        
            //Comparar variables de usercorrect i passwordcorrect per pasar a boolean
        boolean correct = (usercorrect && passwordcorrect);
        

        System.out.println("Has iniciat correctament? " + correct);


        //Mostrar dades

        
        System.out.println("Nom Complet " + name + " " + lastname1 + " " + lastname2);
        System.out.println("La teva edat es: " + fechaNacimiento);
        System.out.println("Ets major d'edad? " + adult);
        System.out.println("Ets estudiant? " + studient);

        register.close();
    }
}