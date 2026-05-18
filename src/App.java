import java.util.ArrayList;
import java.util.Scanner;

import models.Persona;

public class App {

    public static void main(String[] args ){

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero de personas que desea ingresar....:):");
        int num = teclado.nextInt();
        Persona[] personas = new Persona[num];
        for(int i = 0; i< personas.length;i++){
            Persona personita = new Persona();
            System.out.println("Ingrese Persona: ");
            System.out.print("Nombre: ");
            String nombre = teclado.next();
            System.out.print("Edad: ");
            int edad = teclado.nextInt();
            personita.setNombre(nombre);
            personita.setEdad(edad);
            personas[i]= personita;

        }  
        
        System.out.println("Ingrese la edad que desea buscar: ");
        int edadBuscada = teclado.nextInt();
        BusquedaBinaria bBinaria = new BusquedaBinaria();
        int res = bBinaria.finByname(personas, edadBuscada);
        if (res>= 0) {
            System.out.println("\n La persona con la edad"+" " + edadBuscada +" " + "es" + " "+ personas[res].getNombre() );
        }else{
            System.out.println("\n No se enocntro ");
        }
    }
    
}
