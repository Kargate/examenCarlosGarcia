/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examenUT4;


public class Main {

    public static void main(String[] args) {
    	//señalo el nombre micuenta/boton derecho/refactor/rename/ pongo cuenta1
    	CCuenta cuenta1;
        double saldoActual;
        
        //señalo codigo/boton derecho/refactor/Extract method/ pongo operativa_cuenta
        operativa_cuenta(0);
    }
    //señalo el metodo/boton derecho/refactor/change method signature/add/edit/pones float, cantidad, y 0 como valor por defecto
	public static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
            //modificado
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
