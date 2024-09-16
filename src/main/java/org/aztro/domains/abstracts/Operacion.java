package org.aztro.domains.abstracts;

public abstract class Operacion {
    public float numA, numB;

    public Operacion(float numA, float numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public abstract void Operacion();
}
