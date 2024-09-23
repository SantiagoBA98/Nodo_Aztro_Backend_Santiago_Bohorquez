package org.aztro.domains;

import org.aztro.domains.abstracts.Operacion;

public class Dividir extends Operacion {
    public Dividir(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public void Operacion() {
        try{
            this.setResultado(this.numA / this.numB);
            this.setOperacion("Division");
        }catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por 0");
        }
    }
}
