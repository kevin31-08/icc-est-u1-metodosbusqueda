
import java.util.jar.Attributes.Name;

import models.Product;
public class BusquedaBinaria {

    public int finByname(Product[] producs, String name){
        int bajo = 0 ; 
        int alto = producs.length-1;
        //definimos bajo y alto 

        while (bajo<= alto) {
            // definimos punto medio 
            int central =(bajo + alto)/2;
            // comparamos con la clave 
            if (producs[central].getName().equals(name)) {
                return central;
            }
            
            // si es igual ,retornamos el punto bajo 
            if (producs[central].getName().compareTo(name)<0) {
                bajo = central +1;
                
            }else{
                alto = central +1;
            }
            // si es mayor , actualizemos el index correspondiente 
            // si es menor , actualizamos el index correspondiente 
        }
        return -1;


    } 
    public void sortByName(Product[] products){
        for(int i = 0 ; i< products.length-1; i++ ){
            boolean ec= false;
            for(int j= 0; j< products.length-i-1;j++){
                if (products[j].getName().compareTo(products[j+1].getName())>0) {
                    Product aux = products[j];
                    products[j] = products[j+1];
                    products[j+1]= aux;
                    ec = true;
                }
               if (!ec) {
                break;
               }
            }


        }
    }
    
}
