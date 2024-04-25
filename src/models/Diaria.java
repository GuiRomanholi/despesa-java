package models;

import java.util.Scanner;

public class Diaria extends Despesa{
    private double qtdDiaria;

    @Override
    public void calcularDespesa() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de diárias: ");
        this.qtdDiaria = leitor.nextDouble();
        setValor(this.qtdDiaria * 50);

    }

    @Override
    public void listaeDespesa() {
        System.out.println("Despesas de Transporte" +
                "\n----------------------------\n" +
                "Descrição: " + super.getDescricao() +
                "\nQuantidade de Diarias: " + this.qtdDiaria +
                "\nValor ToTal: " + super.getValor());
    }

    public double getQtdDiaria() {
        return qtdDiaria;
    }

    public void setQtdDiaria(double qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }
}
