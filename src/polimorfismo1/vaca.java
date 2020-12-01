/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo1;

/**
 *
 * @author Bryner Bonilla
 */
public class vaca extends animal {

    public vaca(String nombre, String tipo_alimentacion, int edad) {
        super(nombre, tipo_alimentacion, edad);
    }

   
    
    @Override
    public void alimentacion() {
        System.out.println("como hiervas");
    }

    @Override
    public void correr() {
        System.out.println("corro en mis cuatro patas");
    }
    
}
