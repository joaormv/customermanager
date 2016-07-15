package com.app.bse.bsemanager.Beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by João on 07/07/2016.
 */

public class Emprestimo implements Serializable {

    private String clienteNome;
    private double valor;
    private int qntParcelas;
    private double valorParcela;
    private String dataEmprestimo;
    private String banco;
    private String corretora;

    public Emprestimo(String clienteNome, double valor, int qntParcelas, double valorParcela, String dataEmprestimo, String banco, String corretora) {
        this.clienteNome = clienteNome;
        this.valor = valor;
        this.qntParcelas = qntParcelas;
        this.valorParcela = valorParcela;
        this.dataEmprestimo = dataEmprestimo;
        this.banco = banco;
        this.corretora = corretora;
    }

    //Getters -----------------------------


    public String getClienteNome() {
        return clienteNome;
    }

    public double getValor() {
        return valor;
    }

    public int getQntParcelas() {
        return qntParcelas;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getBanco() {
        return banco;
    }

    public String getCorretora() {
        return corretora;
    }

    //Setters --------------------------------


    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQntParcelas(int qntParcelas) {
        this.qntParcelas = qntParcelas;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setCorretora(String corretora) {
        this.corretora = corretora;
    }

    public static List<Emprestimo> getEmprestimos(){

        List<Emprestimo> emprestimos = new ArrayList<>();

        emprestimos.add(new Emprestimo("Maria Joaquina Silva Sauro", 1500.00, 3, 500.00, "12/03/2015", "Itau BMG", "Credlink"));
        emprestimos.add(new Emprestimo("Maria Joaquina Silva Sauro", 1500.00, 3, 500.00, "12/03/2015", "Daicoval", "Credlink"));
        emprestimos.add(new Emprestimo("Maria Joaquina Silva Sauro", 1500.00, 3, 500.00, "12/03/2015", "Cruzeiro do Sul", "Credlink"));
        emprestimos.add(new Emprestimo("Maria Joaquina Silva Sauro", 1500.00, 3, 500.00, "12/03/2015", "Panamericano", "Credlink"));

        return emprestimos;

    }
}
