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
public abstract class Producto implements ProductoDescontable{
    
    private int codigo;
    private int precio;
    private int stock;
    private String tipo;
    private String marca;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) throws Exception {
        String t=getTipo().toUpperCase();
        
        if ((t.equals("MARTILLO") && precio>=2000 )
                || t.equals("PINTURA")) {
            this.precio = precio;
        }else{
            throw new Exception("EL MARTILLO DEBE TENER UN PRECIO MAYOR O IGUAL A 2000");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) throws Exception {
        if (stock>=0) {
            this.stock = stock;
        }else{
            throw new Exception("EL STOCK DEBE SER MAYOR O IGUAL A 0");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws Exception {
        String t=tipo.toUpperCase();
        if (t.equals("MARTILLO") || t.equals("PINTURA")) {
            this.tipo = tipo;
        }else{
            throw new Exception("EL TIPO DEBE SER martillo O pintura");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Producto() {
    }

    public Producto(int codigo, int precio, int stock, String tipo, String marca) throws Exception {
        setCodigo(codigo);
        setTipo(tipo);
        setPrecio(precio);
        setStock(stock);        
        setMarca(marca);
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", stock=" + stock + ", tipo=" + tipo + ", marca=" + marca + '}';
    }
    
    public void imprimirInfo(){
        System.out.println("Código: " + getCodigo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Stock: " + getStock());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Marca: " + getMarca());
    }
    
    public double calcularTotal(int cantidad, String dia) throws Exception{
        if (cantidad<=getStock()) {
            
            double total=getPrecio()*cantidad-calcularDescuento(dia)*cantidad;
            this.stock=getStock()-cantidad;
            return total;            
        }else{
            throw new Exception("LA CANTIDAD NO PUEDE SER MAYOR AL STOCK");
        }
    }
    
}
