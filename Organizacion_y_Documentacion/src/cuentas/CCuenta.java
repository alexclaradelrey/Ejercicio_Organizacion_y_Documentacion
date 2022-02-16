package cuentas;

/**
 * CCuenta.
 * 
 * Clase que maneja las cuentas de los clientes. En esta clase se puede ingresar, retirar y consultar
 * el saldo de la cuenta de los mismos.
 * 
 * @since 07-02-2022
 * @author Alex
 */
public class CCuenta {

	/**
	 * Nombre del cliente
	 */
    private String nombre;
    /**
	 * Cuenta del cliente
	 */
    private String cuenta;
    /**
	 * Saldo del cliente
	 */
    private double saldo;
    /**
	 * Tipo de interés de la cuenta del cliente
	 */
    private double tipoInteres;

    public CCuenta() {
    }
    
    /**
	 * Constructor
	 * 
	 * @param nom Nombre del cliente.
	 * @param cue Número de cuenta.
	 * @param sal Saldo de la cuenta.
	 * @param tipo Tipo de interés de la cuenta.
	 */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
	 * Devuelve el saldo de la cuenta.
	 * 
	 * @return Saldo de la cuenta del cliente.
	 */
    public double estado() {
        return getSaldo();
    }

    /**
	 * Ingresa (si es posible) la cantidad indicada.
	 * 
	 * @param cantidad Cantidad a ingresar.
	 * @throws Exception
	 */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
	 * Retira (si es posible) la cantidad indicada.
	 * 
	 * @param cantidad Cantidad a retirar.
	 * @throws Exception
	 */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
	 * @return el nombre del cliente asociado a la cuenta
	 */
    private String getNombre() {
		return nombre;
	}
    /**
	 * @param nuevo nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el numero de la cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}
	/**
	 * @param nuevo numero de cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * @return el saldo de la cuenta
	 */
	private double getSaldo() {
		return saldo;
	}
	/**
	 * @param nuevo saldo de la cuenta
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return el tipo de interés de la cuenta
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}
	/**
	 * @param nuevo tipo de interés de la cuenta
	 */
	private void setTipoInteres(double tipoInterés) {
		this.tipoInteres = tipoInterés;
	}
}