import models.Product;

public class App {

    public static void main(String[] args ){
        Product[] producs ={
            new Product("lapton", 20),
            new Product("cell",200),
            new Product("television", 3000),
            new Product("monitor", 132),
            new Product("pantalla", 13234)
        };
        BusquedaBinaria bBusqueda = new BusquedaBinaria();
        bBusqueda.sortByName(producs);
        for(Product productr : producs){
            System.out.println(productr);
        }

        BusquedaBinaria bBinaria = new BusquedaBinaria();
        int res = bBinaria.finByname(producs, "lapton");
        if (res>= 0) {
            System.out.println("Entre en pos = "+res);
        }else{
            System.out.println("no se enocntro ");
        }
    }
    
}
