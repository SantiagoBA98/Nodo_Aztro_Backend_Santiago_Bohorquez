package org.aztro.domains;

import org.aztro.domains.abstracts.Operacion;

public class Dividir extends Operacion {
    public Dividir(float numA, float numB) {
        super(numA, numB);
    }

    @Override
    public void Operacion() {
        System.out.println(numA / numB);
    }
}
