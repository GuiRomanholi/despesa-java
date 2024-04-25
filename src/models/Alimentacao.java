package models;

import java.util.Scanner;

public class Alimentacao extends Despesa{

    private String nomeRestaurante;
    private int qtdRefeicao;

    @Override
    public void cadastrarDespesa() {
        //descricao, valor (super classe)
        //nome restaurante, qtdRefeicao (sub classe)
        Scanner leitor = new Scanner(System.in);
        super.cadastrarDespesa();
        System.out.println("Digite o nome do restaurante: ");
        this.nomeRestaurante = leitor.nextLine();
    }

    @Override
    public void calcularDespesa() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de refeições: ");
        this.qtdRefeicao = leitor.nextInt();
        setValor(this.qtdRefeicao * 18);

    }

    @Override
    public void listaeDespesa() {
        System.out.println("Despesas" +
                "\n----------------------------\n" +
                "Descrição: " + super.getDescricao() +
                "\nNome do Restaurante: " + this.nomeRestaurante +
                "\nQuantidade de Refeições: " + this.qtdRefeicao +
                "\nValor ToTal: " + super.getValor());
    }

    // gettesr e setters
    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public int getQtdRefeicao() {
        return qtdRefeicao;
    }

    public void setQtdRefeicao(int qtdRefeicao) {
        this.qtdRefeicao = qtdRefeicao;
    }
}
