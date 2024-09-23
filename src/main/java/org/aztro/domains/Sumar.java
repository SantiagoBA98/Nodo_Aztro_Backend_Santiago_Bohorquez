package org.aztro.domains;

import org.aztro.domains.abstracts.Operacion;

public class Sumar extends Operacion {

    public Sumar(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public void Operacion() {
        this.setResultado(this.numA + this.numB);
        this.setOperacion("Suma");
        setResultado(this.resultado);
    }
}
