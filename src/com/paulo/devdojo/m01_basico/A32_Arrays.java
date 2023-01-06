package com.paulo.devdojo.m01_basico;

/* Arrays são objetos indexados que permitem alocar no mesmo espaço de memória um conjunto de valores do mesmo tipo.
   Por padrão, ao instanciar um array, seus elementos recebem valores padrão, de acordo com o tipo do array.
   É importante saber que não é permitido acessar elementos de um array nulo. */
public class A32_Arrays {
    public static void main(String[] args) {
        String[] familia = new String[6];

        // A primeira posição do array é o índice 0 e assim sucessivamente.
        familia[0] = "Marilene";
        familia[1] = "Ronaldo";
        familia[2] = "Tiago";
        familia[3] = "Renato";
        familia[4] = "Paulo";
        familia[5] = "Augusto";

        // Não é possível acessar uma posição que não existe. Sendo assim, o comando abaixo gera uma exceção em tempo de execução.
          // familia[6] = "Hellen";

        // Percorrendo array
        for (int i = 0; i < familia.length; i++) {
            System.out.println(familia[i]);
        }
        System.out.println("-------------------");

        //Percorrendo array com forEach
        for (String membro : familia) {
            System.out.println(membro);
        }
        System.out.println("-------------------------------");

    /* Existem também os arrays multidimencionais. Esses arrays funcionam como matrizes, permitindo armazenar os
       dados no formato de linha e coluna.
       Diferente dos arrays comuns, onde cada índice é um valor de tipo específico, aqui, cada índice faz
       referência para um novo array. */

        int[][] diasDosMeses = new int[12][];
        diasDosMeses[0] = new int[31];
        diasDosMeses[1] = new int[28];
        diasDosMeses[2] = new int[31];
        diasDosMeses[3] = new int[30];
        diasDosMeses[4] = new int[31];
        diasDosMeses[5] = new int[30];
        diasDosMeses[6] = new int[31];
        diasDosMeses[7] = new int[31];
        diasDosMeses[8] = new int[30];
        diasDosMeses[9] = new int[31];
        diasDosMeses[10] = new int[30];
        diasDosMeses[11] = new int[31];

        System.out.println("Percorrendo array multidimencional...");

        for (int i = 0; i < diasDosMeses.length; i++) {
            for (int j = 0; j < diasDosMeses[i].length; j++) {
                diasDosMeses[i][j] = j + 1;
            }
        }

        for (int i = 0; i < diasDosMeses.length; i++) {
            System.out.print("Mês " + (i + 1) + ": ");
            for (int j = 0; j < diasDosMeses[i].length; j++) {
                System.out.print(diasDosMeses[i][j]);
                if (j < diasDosMeses[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("");
        }
        System.out.println("------------------------------");

        System.out.println("Percorrendo array multidimencional com forEach...");

        int contador = 1;
        for (int[] mes : diasDosMeses) {
            System.out.print("Mês " + contador + ": ");
            for (int dia : mes) {
                System.out.print(dia + ",");
            }
            contador++;
            System.out.println("");
        }
        System.out.println("------------------------------");

    /* Existem algumas regras para declaração de arrays comuns e multidimencionais, nos casos em que
       deseja-se instanciar e definir os valores para o array na sua declaração. */

        System.out.println("Entendendo inicialização de arrays comuns...");

        int[] normalArray1 = new int[5]; // Array vazio
        int[] normalArray2 = {1, 2, 3, 4, 5};
        int[] normalArray3 = new int[]{6, 7, 8, 9, 10};

        for (int i = 0; i < 5; i++) {
            System.out.printf("Array1: %d, Array2: %d, Array3: %d\n", normalArray1[i], normalArray2[i], normalArray3[i]);
        }
        System.out.println("------------------------------");

        System.out.println("Entendendo a inicialização de arrays multidimencionais....");

        // Para este primeiro exemplo, ao instanciar os arrays internos, devemos utilizar a sintaxe new int[]{...} para popular.
        int[][] multiArray1 = new int[2][];
        multiArray1[0] = new int[]{1, 2};
        multiArray1[1] = new int[]{3, 4}; // Não é permitido usar diretamente {3,4}.

        int[][] multiArray2 = new int[2][2];
        multiArray2[0] = new int[]{1, 2};
        multiArray2[1] = new int[]{3, 4};

        int[][] multiArray3 = {{1, 2}, {3, 4}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Array1: %d, Array2: %d, Array3: %d\n", multiArray1[i][j], multiArray2[i][j], multiArray3[i][j]);
            }
        }

    /* Simulando inicialização inválida para array multidimencional. A sintaxe abaixo não é permitida e vai ocasionar erro em tempo de execução.
      int[][] multiArray4 = new int[2][];
      multiArray4[0] = {1,2};
      multiArray4[1] = {2,3};
    */

   /* Outro erro bem comum é tentar acessar uma posição nula em um array, ocasionando um nullPointerException.
      Nos exemplos abaixo, estamos tentando acessar um array normal que está nulo e também o array da posição 0 do array multidimencional.
      Como apenas a base do array multidimencional foi definida, ao acessar o array interno, obtemos também o nullPointerException */
        int[] normalArray4 = null;
        int[][] multiArray5 = new int[2][];

        try {
            System.out.println(normalArray4[0]);
            System.out.println(multiArray5[0][1]);
        } catch (NullPointerException e) {
            System.out.println("Erro ao acessar array nulo.");
        }
    }
}