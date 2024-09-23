package org.aztro.domains.abstracts;

public abstract class Operacion {
    public double numA, numB, resultado;
    public String operacion;

    public Operacion(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public abstract void Operacion();


    public void imprimirResultado() {
        System.out.println("El resultado de la "+this.getOperacion()+" es: "+this.resultado);
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getOperacion() {
        return this.operacion;
    }
}
