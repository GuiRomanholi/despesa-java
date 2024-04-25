package models;

import java.util.Scanner;

public class Transporte extends Despesa{

    private double kmPercorrida;
    private double pedagio;


    //esses são abstratos em Despesa logo eles vem pelo generate
    @Override
    public void calcularDespesa() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quilometragem percorrida: ");
        this.kmPercorrida = leitor.nextDouble();
        System.out.println("Digite o valor pago em pedágios: ");
        this.pedagio = leitor.nextDouble();
        setValor(this.kmPercorrida * 3 + this.pedagio);

    }

    @Override
    public void listaeDespesa() {
        System.out.println("Despesas de Transporte" +
                "\n----------------------------\n" +
                "Descrição: " + super.getDescricao() +
                "\nQuilometragem percorrida: " + this.kmPercorrida +
                "\nPedágios: " + this.pedagio +
                "\nValor ToTal: " + super.getValor());
    }
}
