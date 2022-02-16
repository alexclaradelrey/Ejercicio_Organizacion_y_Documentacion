package cuentas;

/**
 * Main.
 * 
 * Clase con el m�todo ejecutable main. Incluye, adem�s, el m�todo operativa_cuenta.
 * 
 * @since 07-02-2022
 * @author Alex
 */
public class Main {

	/**
	 * M�todo main.
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio L�pez", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual );

        operativa_cuenta(cuenta1, 2300);
    }

    /**
     * M�todo creado con Refactorizar. Engloba toda la operativa del objeto cuenta1 (retirar e ingresar).
     * 
     * @param cuenta1
     * @param cantidad (creado con Refactorizar)
     */
	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		try {
            cuenta1.retirar(cantidad);
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