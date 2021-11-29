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
public interface ProductoDescontable {
    
    final double porcentajeDescuento=8/100;
    
    public int calcularDescuento(String dia);
    
}
