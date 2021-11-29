/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteria;

/**
 *
 * @author duoc
 */
public class Martillo extends Producto{
    
    private char tamanio;

    public char getTamanio() {
        return tamanio;
    }

    public void setTamanio(char tamanio) throws Exception {
        String t=String.valueOf(tamanio).toUpperCase();
        if (t.equals("G") || t.equals("P")) {
            this.tamanio = tamanio;
        }else{
            throw new Exception("EL TAMAÑO DEBE SER G o P");
        }
    }

    public Martillo() {
    }

    public Martillo(char tamanio, int codigo, int precio, int stock, String tipo, String marca) throws Exception{
        super(codigo, precio, stock, tipo, marca);
        setTamanio(tamanio);
    }

    @Override
    public String toString() {
        return "Martillo{" + "tamanio=" + tamanio + '}';
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Tamaño: " + getTamanio());
    }

    @Override
    public int calcularDescuento(String dia) {
        int descuento=0;
        if (dia.equals("Viernes")) {
            descuento=(int)(super.getPrecio()*porcentajeDescuento);
        }
        
        return descuento;
    }
    
}
