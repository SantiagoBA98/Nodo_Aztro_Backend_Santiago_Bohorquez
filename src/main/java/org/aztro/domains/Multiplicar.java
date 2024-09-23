package org.aztro.domains;

import org.aztro.domains.abstracts.Operacion;

public class Multiplicar extends Operacion {

    public Multiplicar(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public void Operacion() {
        this.setResultado(this.numA * this.numB);
        this.setOperacion("Multiplicación");
        setResultado(this.resultado);
    }
}
