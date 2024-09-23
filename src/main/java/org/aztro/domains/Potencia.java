package org.aztro.domains;

import org.aztro.domains.abstracts.Operacion;

public class Potencia extends Operacion{


    public Potencia(double numA, double numB) {
        super(numA, numB);
    }
    @Override
    public void Operacion() {
        this.setResultado(Math.pow(this.numA, this.numB));
        this.setOperacion("Potencia");
    }
}
