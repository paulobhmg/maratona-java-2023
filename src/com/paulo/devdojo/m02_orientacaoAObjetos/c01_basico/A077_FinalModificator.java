package com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico;

import com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico.domain.Car;

/* O modificador de acesso FINAL é utilizado quando precisamos impedir que o valor de um atributo seja alterado.
   1 - Para tipos primitivos: O valor da constante não será alterado
   2 - Para classes: A classe não será herdada e consequentemente seus métodos não serão sobrescritos
   3 - Para referências à objetos: A variável que faz referência à um objeto não poderá ter a referência trocada, ou seja,
       não é possível atribuir um novo objeto para uma variável que já referencia um objeto.
       Ainda sim, é possível alterar os atributos do objeto. O que não será alterado é apenas sua referência.
 */
public class A077_FinalModificator {
    public static void main(String[] args) {
        Car pulse = new Car("Fiat", "Pulse", "Cinza", 2023);
        System.out.println(Car.getMaxSpeed());
        System.out.println(pulse);
        System.out.println("---------------------------------------");

        final Car polo = new Car("Wolkswagem", "Polo", "Cinza", 2023);
        polo.setColor("Branco");
        System.out.println(polo);

        // É possível alterar o atributo do objeto normalmente, mas ao tentar atribuir uma nova referência à variável, não é possivel.
        //  polo = new Car("Chevrolet", "Onix", "Branco", 2023);
    }
}
