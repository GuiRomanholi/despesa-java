package models;

import java.util.Scanner;

public abstract class Despesa {
    //atributos
    private String descricao;
    private double valor;


    //métodos

    public void cadastrarDespesa(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a descrição da despesa:");
        this.descricao = leitor.nextLine();
        this.valor = 0;
    }


    //um metodo abstrato é ultilizado em uma classe abstrata
    //Quando a responsabilidade de codificar um metodo é do filho
    public abstract void calcularDespesa();

    public abstract void listaeDespesa();





    //getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
