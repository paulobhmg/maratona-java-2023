package com.paulo.devdojo.m03_exceptions.unchecked;

/* Como já visto, exceções do tipo unchecked não são obrigatoriamente tratadas, mas caso sejam lançadas, podem ocasionar
   na parada do sistema, quando não são tratadas.

   É possível tratar uma exceção dentro do método que ela pertence ou lançar uma exceção, que poderá ser tratada no momento
   em que o método é chamado.  */
public class A098_ThrowingUncheckedException {
    public static void main(String[] args) {
        // Para esse método, é importante observar que divisões por 0 agora retornam infinity, evitando o travamento do sistema.
        System.out.println(divisionByZeroWithTreatment(10, 0));

        System.out.println(divisionByZeroWithTreatment(10, 0));

        try {
            System.out.println(divisionByZeroThrowingExternalTreatment(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    // Aqui a exceção será tratada dentro do método, ou seja, caso ocorra algo errado na divisão, informa sobre o erro e retorna 0.
    public static double divisionByZeroWithTreatment(double num1, double num2) {
        try {
            return num1 / num2;
        } catch(ArithmeticException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
        return 0;
    }

    /* Caso ocorra algo, o método lança uma exceção, possibilitando que ela seja tratada por quem está utilizando.
       Quando lançamos uma exceção do tipo unchecked, é possível informar na assinatura do método a possibilidade
       de lançar uma exceção. Isso auxilia quem esta chamando o método, pois informa do risco de exceção, mas para
       exceções do tipo unchecked não é obrigatório especificar na assinatura do método. */
    public static double divisionByZeroThrowingExternalTreatment(double number1, double number2) throws IllegalArgumentException {
        if(number2 == 0) {
            throw new IllegalArgumentException("Invalid argument: Number2 cannot be zero.");
        }
        return number1/number2;
    }

    // Fazer o cálculo por zero sem tratamento vai ocasionar exceção em tempo de execução.
    public static double divisionByZeroWithoutTreatment(double number1, double number2) {
        return number1 / number2;
    }
}
