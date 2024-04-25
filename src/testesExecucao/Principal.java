package testesExecucao;

import models.Alimentacao;
import models.Diaria;
import models.Transporte;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        Alimentacao refeicoes = new Alimentacao();
        Transporte veiculo = new Transporte();
        Diaria diarias = new Diaria();

        //--------------------------------------------------------

        int opcao;
        do {
            System.out.println("Sistema de Gerenciamento de Despesas" +
                    "\n------------------------------------------------" +
                    "\nEscolha a despesa:" +
                    "\n1 - Alimentação" +
                    "\n2 - Transporte" +
                    "\n3 - Diarias" +
                    "\n4 - Analise de Despesa" +
                    "\n0 - Sair" +
                    "\n--> ");
            opcao = leitorNumero.nextInt();
            switch (opcao){
                case 1:
                    refeicoes.cadastrarDespesa();
                    break;
                case 2:
                    veiculo.cadastrarDespesa();
                    break;
                case 3:
                    diarias.cadastrarDespesa();
                    break;
            }
        } while (opcao != 0);
        refeicoes.cadastrarDespesa();
    }
}
