package com.paulo.devdojo.m03_exceptions.unchecked;

import com.paulo.devdojo.m02_orientacaoAObjetos.c05_polimorphism.domain.order.Order;

/* Exceções do tipo RuntimeException normalmente estão relacionadas à erros na lógica do programa.
   Elas não são previstas pelo programador e serão lançadas em tempo de execução.
 */
public class A096_RuntimeException {
    public static void main(String[] args) {
        Order order = null;
        try {
            System.out.println(order.toString());
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
