package com.paulo.devdojo.m02_orientacaoAObjetos.basico.domain;

/* Atributos estáticos não fazem parte da instância do objeto, mas sim da classe que aquele objeto pertence.
   É utilizado quando os objetos possuem atributos em comum, ou seja, as alterações feitas em atributos estáticos refletirão
   em todos os objetos daquela classe.

   Eles são inicializados antes mesmo de existir uma instância do objeto, por esse motivo, não é possível acessá-los
   de métodos não estáticos.

   Métodos estáticos podem ser utilizados sem a existência do objeto, sendo referenciado pelo próprio nome da classe.
   Não é possível usar o this em métodos estáticos, pois há a possibilidade de não existir objeto, então não é possível
   referenciá-lo.

   Diferente dos blocos de inicialização comuns, os blocos estáticos são executados apenas uma vez, no carregamento da classe.
   Como os atributos inicializados são válidos para todas as instâncias, ele é inicializado apenas uma vez.

   Quando temos atributos e blocos estáticos, a ordem de inicialização muda:
   1 - Alocação e inicialização de atributos estáticos
   2 - Execução dos blocos estáticos (Apenas uma vez)
   3 - Atribuição das variáveis de instância com valores default ou predefinidos
   4 - Execução dos blocos de inicialização comuns
   5 - Execução do construtor.
 */

public class Car {
    private static final double MAX_SPEED;
    private String mark;
    private String model;
    private String color;
    int year;

    static {
        MAX_SPEED = 250;
        System.out.println("Inside static block: " + MAX_SPEED);
    }

    {
        this.color = "undefined";
        System.out.println("Color inside normal block: " + this.color);
    }

    public Car(){}
    public Car(String mark, String model, String color, int year) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.year = year;

        System.out.println("Color in the constructor: " + this.color);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String cor) {
        this.color = cor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //O método toString aqui não poderá mais ser sobrescrito em novas classes que extendam Car.
    public final String toString(){
        return String.format("Mark: %s, model: %s, year: %d, color: %s, max speed: %.2f", mark, model, year, color, MAX_SPEED);
    }

    public static double getMaxSpeed() {
        return MAX_SPEED;
    }
}
