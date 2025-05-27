package org.example;

import java.time.LocalDateTime;

public class Galinheiro {

    private String nome;
    private int qtdGalinhas;
    private int qtdOvosDia;
    private LocalDateTime dataUltimaColeta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdGalinhas() {
        return qtdGalinhas;
    }

    public void setQtdGalinhas(int qtdGalinhas) {
        this.qtdGalinhas = qtdGalinhas;
    }

    public int getQtdOvosDia() {
        return qtdOvosDia;
    }

    public void setQtdOvosDia(int qtdOvosDia) {
        this.qtdOvosDia = qtdOvosDia;
    }

    public LocalDateTime getDataUltimaColeta() {
        return dataUltimaColeta;
    }

    public void setDataUltimaColeta(LocalDateTime dataUltimaColeta) {
        this.dataUltimaColeta = dataUltimaColeta;
    }

    public Galinheiro(String nome, int qtdGalinhas, int qtdOvosDia) {
        this.nome = nome;
        this.qtdGalinhas = qtdGalinhas;
        this.qtdOvosDia = qtdOvosDia;
        this.dataUltimaColeta = LocalDateTime.now();
    }

    public int calcularProducaoMensal() {
        return qtdOvosDia * 30; // Considerando 30 dias no mês
    }

    public int calcularProducaoDiaria() {
        return qtdOvosDia;
    }

    public void mostrarInfo() {
        System.out.println("================");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Quantidade de Galinhas: "+ this.qtdGalinhas);
        System.out.println("Quantidade de Ovos por Dia por Galinha: "+ this.qtdOvosDia);
        System.out.println("Data e Hora da Criação: "+ this.dataUltimaColeta);
        System.out.println("Produção Diária de Ovos: "+ this.calcularProducaoDiaria() + " ovos");
        System.out.println("Produção Mensal de Ovos: "+ this.calcularProducaoMensal() + " ovos");
        System.out.println("================");
    }
}
