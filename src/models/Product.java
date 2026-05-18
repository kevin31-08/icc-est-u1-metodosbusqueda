package models;

public class Product {
    private String name;
    private int cantidad;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Product(String name, int cantidad) {
        this.name = name;
        this.cantidad = cantidad;
    }
    public Product() {
    }
    @Override
    public String toString() {
        return "Poduct [name=" + name + ", cantidad=" + cantidad + "]";
    } 
    
}
