package Ej1Basico;

public class Cuenta {
    private String  nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;



    public Cuenta() {
        super();
    }

    public Cuenta(Cuenta copia) {
        super();
        this.nombre = copia.getNombre();
        this.numeroCuenta = copia.getNumeroCuenta();
        this.tipoInteres = copia.getTipoInteres();
        this.saldo = copia.getSaldo();
    }

    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        super();
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getTipoInteres() {
        return tipoInteres;
    }
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingreso(double importe) {
        boolean resultado = false;
        if(importe >= 0) {
            this.saldo += importe;
            resultado = true;
        }
        return resultado;
    }

    public boolean reintegro(double importe) {
        boolean resultado = false;
        if(importe >= 0) {
            if(this.saldo >= importe) {
                this.saldo -= importe;
                resultado=true;
            }
        }
        return resultado;
    }

    public boolean transferencia(Cuenta destino, double importe) {
        boolean resultado = false;
        if(this.saldo >= importe) {
            reintegro(importe);
            destino.ingreso(importe);
            resultado = true;
        }
        return resultado;
    }


}
