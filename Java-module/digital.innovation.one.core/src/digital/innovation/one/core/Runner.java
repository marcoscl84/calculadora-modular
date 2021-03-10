package digital.innovation.one.core;

import digital.innovation.one.utils.Calculadora;

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        //exemplos de saidas
        System.out.println(calculadora.div(15,3));
        System.out.println(calculadora.multi(15,3));
        System.out.println(calculadora.sub(15,3));
        System.out.println(calculadora.sum(15,3));
    }
}
