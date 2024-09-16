package org.aztro.domains;

import org.aztro.domains.abstracts.Operacion;

public class Multiplicar extends Operacion {

    public Multiplicar(float numA, float numB) {
        super(numA, numB);
    }

    @Override
    public void Operacion() {
        System.out.println(this.numA * this.numB);
    }
}
