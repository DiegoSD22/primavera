/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

/**
 *
 * @author T-107
 */
public class TarjetaNomina extends Tarjetas{
    
    private String nombre;
    private int numero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TarjetaNomina(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    
    public void pagar(){
        System.out.println("Pagar nomina");
    }
    
}
