package org.aztro.domains;

import org.aztro.domains.abstracts.Operacion;

public class Restar extends Operacion {

    public Restar(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public void Operacion() {
        this.setResultado(this.numA - this.numB);
        this.setOperacion("Resta");
        setResultado(this.resultado);
    }
}
