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
public class Pintura extends Producto{
    
    private int litros;

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public Pintura() {
    }

    public Pintura(int litros, int codigo, int precio, int stock, String tipo, String marca) throws Exception {
        super(codigo, precio, stock, tipo, marca);
        setLitros(litros);
    }

    @Override
    public String toString() {
        return "Pintura{" + "litros=" + litros + '}';
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo(); 
        System.out.println("Litros: " + getLitros());
    }

    @Override
    public int calcularDescuento(String dia) {
        int descuento=0;
        if (dia.equals("Lunes")) {
            descuento=(int)(super.getPrecio()*porcentajeDescuento);            
        }
        return descuento;
    }
    
    
    
}
