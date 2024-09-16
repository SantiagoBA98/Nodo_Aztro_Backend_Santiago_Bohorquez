package org.aztro.domains;

import org.aztro.domains.abstracts.Operacion;

public class Sumar extends Operacion {

    public Sumar(float numA, float numB) {
        super(numA, numB);
    }

    @Override
    public void Operacion() {
        System.out.println(this.numA + this.numB);
    }
}
