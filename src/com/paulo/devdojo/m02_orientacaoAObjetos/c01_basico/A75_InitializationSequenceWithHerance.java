package com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico;

import com.paulo.devdojo.m02_orientacaoAObjetos.c01_basico.domain.Employee;

/* Quando trabalhamos com herança, a ordem de inicialização do objeto é alterada:
   1 - Alocação e inicialização dos atributos e métodos estáticos da classe pai, no momento que a JVM carrega a classe filha
   2 - Alocação e inicialização dos atributos e métodos estáticos da classe filha (O passo 1 e 2 serão executados apenas uma vez)
   3 - Alocação de espaço em memória para os atributos da classe pai
   4 - Inicialização dos atributos definidos para a classe pai
   5 - Execução dos blocos de inicialização da classe pai
   6 - Execução do construtor da classe pai
   7 - Alocação do espaço em memória para a instância do objeto filho
   8 - Inicialização dos atributos do objeto filho
   9 - Execução dos blocos de inicialização do objeto filho
   10 - Execução do construtor o objeto filho.
 */
public class A75_InitializationSequenceWithHerance {
    public static void main(String[] args) {
        Employee employee = new Employee("Paulo", 30, 'M', 3475, 6850, 7656);
        Employee employee2 = new Employee("Tiago", 37, 'M', 12000, 25000, 33000);
    }
}
