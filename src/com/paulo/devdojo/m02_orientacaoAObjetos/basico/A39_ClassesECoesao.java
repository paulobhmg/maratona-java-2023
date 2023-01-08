package com.paulo.devdojo.m02_orientacaoAObjetos.basico;

import com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain.Estudante;
import com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain.Pessoa;
import com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain.Professor;

/* No conteúdo do múdulo 1, utilizamos variáveis primitivas de forma isolada. Quando trabalhamos com objetos, entramos no contexto
   de referência, ou seja, uma variável do tipo Pessoa é uma referência à um objeto desse mesmo tipo e possui atributos em sua composição, que podem
   ser de tipo primitivo ou outros objetos. Nesse contexto, chamamos as variávies de atributos de instâncias.

   Falar sobre COESÃO significa dizer que uma classe deve ter um objetivo específico. Quanto mais específico for a função da classe, mais coesa ela é.
   Por exemplo, ao invés de definir atributos String para o nome do professor em uma classe Estudante, é mais coeso ter uma classe Professor, que será
   uma composição na classe Estudante.

   A baixa coesão gera alto acoplamento e a alta coesão, o baixo acoplamento.
   Alto acoplamento é ruim, pois torna a classe dependente de informações que não são pertinentes à ela.
   Baixo acoplamento é bom, pois quanto menos acoplada a classe for, melhor é sua manutenabilidade. */
public class A39_ClassesECoesao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Paulo", 30, 'M');
        System.out.println(pessoa);
        System.out.println("---------------------------");

        System.out.println("Testando a coesão com as classes Estudante e Professor.");
        Professor professor = new Professor("Willian Suane", 36, 'M', "Java Viradao no Jiraya");
        Estudante estudante = new Estudante("Paulo", 30, 'M', professor);

        System.out.println(professor);
        System.out.println(estudante);
    }
}
