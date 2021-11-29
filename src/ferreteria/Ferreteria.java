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
public class Ferreteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            Martillo m1=new Martillo('G', 1, 5000, 20, "martillo", "ACME");
            Martillo m2=new Martillo('p', 2, 15000, 5, "martillo", "ACME");
            
            Pintura p1=new Pintura(5, 3, 10000, 50, "pintura", "CERECITA");
            Pintura p2=new Pintura(10, 4, 8000, 50, "pintura", "CERECITA");
            
            m1.imprimirInfo();
            int descuento=m1.calcularDescuento("Viernes");
            System.out.println("EL DESCUENTO ES: " + descuento);
            
            p1.imprimirInfo();
            int descuento2=p1.calcularDescuento("Lunes");
            System.out.println("EL DESCUENTO ES: " + descuento2);
            
            double total1=m1.calcularTotal(3, "Viernes");
            System.out.println("EL TOTAL POR 3 MARTILLOS UN VIERNES ES: " + total1);
            
            double total2=p1.calcularTotal(1, "Lunes");
            System.out.println("EL TOTAL POR 1 LITRO DE PINTURA ES: " + total2);
            
            //ARRAYLIST
            Bodega b=new Bodega();
            b.agregarProducto(m1);
            b.agregarProducto(m2);
            b.agregarProducto(p1);
            b.agregarProducto(p2);
            
            b.listarTodo();
            b.eliminarProducto(2);
            b.listarProducto(3);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
