import models.Persona;


public class BusquedaBinaria {

    public int finByname(Persona[] personas , int edad ){
        int bajo = 0;
        int alto = personas.length - 1;
        // definimos bajo y alto
        while (bajo <= alto) {
            for(int i = bajo ; i<= alto;i++ ){
                System.out.print(personas[i].getEdad() + " | ");
            }
            System.out.println();
            // definimos punto medio
            int central = (bajo + alto) / 2;

            // obtenemos el valor del cintro
            int valorCentral = personas[central].getEdad();
           

            // mostramos el estado actual
            System.out.print( "bajo=" + bajo + " " + " alto=" + alto + " "+ " centro=" + central +" " +" valorCentro=" + valorCentral);
             if (personas[central].getEdad() == edad) {
                System.out.print(" " +  "--> ENCONTRADO");
                return central; 
            }

            // comparamos con la clave
            int comparacion = valorCentral - edad ;
   
            // si es menor, buscamos hacia la derecha
            if (comparacion < 0) {

                System.out.print(" " + "--> DERECHA");

                // actualizamos el index correspondiente
                bajo = central + 1;

            } else {

                System.out.print(" " + "--> IZQUIERDA");

                // si es mayor, actualizamos el index correspondiente
                alto = central - 1;
            }
            System.out.println();
        }

        return -1;
    }

    public void sortByName(Persona[] personas){

        for(int i = 0; i < personas.length - 1; i++ ){

            boolean ec = false;

            for(int j = 0; j < personas.length - i - 1; j++){

                if (personas[j].getEdad()< personas[j +1].getEdad() ) {

                    Persona aux = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = aux;

                    ec = true;
                }
            }

            if (!ec) {
                break;
            }
        }
    }
}