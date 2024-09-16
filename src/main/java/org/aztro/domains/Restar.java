package org.aztro.domains;

import org.aztro.domains.abstracts.Operacion;

public class Restar extends Operacion {

    public Restar(float numA, float numB) {
        super(numA, numB);
    }

    @Override
    public void Operacion() {
        System.out.println(this.numA - this.numB);
    }
}
