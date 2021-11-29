/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteria;

import java.util.ArrayList;

/**
 *
 * @author duoc
 */
public class Bodega {
    
    ArrayList<Producto> lista;

    public Bodega() {
        lista=new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) throws Exception{
        for (Producto producto : lista) {
            if (p.getCodigo()==producto.getCodigo()) {
                throw new Exception("EL CÓDIGO YA EXISTE");
            }
        }
        lista.add(p);
        System.out.println("PRODUCTO AGREGADO");
    }
    
    public void eliminarProducto(int codigo) throws Exception{
        if (buscarProducto(codigo)) {
            for (Producto producto : lista) {
                if (codigo==producto.getCodigo()) {
                    lista.remove(producto);
                    System.out.println("PRODUCTO ELIMINADO");
                    break;
                }
            }
        }else{
            throw new Exception("EL CÓDIGO NO EXISTE");
        }
    }
    
    public void listarProducto(int codigo) throws Exception{
        if (buscarProducto(codigo)) {
            for (Producto producto : lista) {
                if (codigo==producto.getCodigo()) {
                    producto.imprimirInfo();
                }
            }
        }else{
            throw new Exception("EL CÓDIGO NO EXISTE");
        }
    }
    
    /*MËTODO TIPO PRUEBA*/
    public void listarTodo(){
        System.out.println("LISTA DE TODOS LOS PRODUCTOS");
        for (Producto producto : lista) {
            producto.imprimirInfo();
            System.out.println("------------------------");
        }
    }
    
    public boolean buscarProducto(int codigo){
        boolean respuesta=false;
        for (Producto producto : lista) {
            if (codigo==producto.getCodigo()) {
                respuesta=true;
            }
        }
        return respuesta;
    }
    
    
}
