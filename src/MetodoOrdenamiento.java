import models.Persona;

public class MetodoOrdenamiento {
    public static ordenar(Persona[] persons){

       int  movimiento = -1;

        for(int i = 0; i< persons.length;i++){
            int j = i; 
            Persona aux = persons[i];
            System.out.println("|"+ movimiento + " ");
            while (j> 0) {
                if (!orden(persons[j-1],aux)) {
                    break;
                }
                persons[j]=persons[j-1];
                j--;
            }
            persons[j]=aux;
            for(int numeros : persons ){
                System.out.println(numeros+ " ");

            }
            int numero ;
            if(j>0){
                numero= j-1;

            }else {
                numero=-1;
            }
            String cambionumero;
            if (cambia) {
                cambionumero = "Deerecha"
                
            }else cambionumero = "Izquierda"
            System.out.println("bajo = "+ numero);
            if(numero != -1)
        }

    }

    
}
