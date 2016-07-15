package com.app.bse.bsemanager.Beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by João on 07/07/2016.
 */

public class Cliente implements Serializable {

    private String nome;
    private String cpf;
    private String rg;
    private long matricula;
    private String data_nasc;
    private Endereco endereco;
    private String orgao;
    private String convenio;
    private String tel1;
    private String tel2;


    public Cliente(String nome, String rg, String cpf, long matricula, String data_nasc, String orgao, String convenio, String tel1, String tel2, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.data_nasc = data_nasc;
        this.orgao = orgao;
        this.convenio = convenio;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.endereco = endereco;

    }

    //Getters ---------------------------------------

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public String getOrgao() {
        return orgao;
    }

    public String getConvenio() {
        return convenio;
    }

    public String getTel1() {
        return tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    //Setters ------------------------------

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static List<Cliente> getClientes(){

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Maria Joaquina Amadeu Amaral", "57896321-7", "369.569.478-98", 456789, "13/04/1898", "Escola", "PMSP", "4978-7825", "5689-7421", Endereco.getEndereco()));
        clientes.add(new Cliente("João Henrique Pataki Bernades", "57896321-7", "369.569.478-98", 456789, "13/04/1898", "Escola", "PMSP", "4978-7825", "5689-7421", Endereco.getEndereco()));
        clientes.add(new Cliente("Carlos José da Silva", "57896321-7", "369.569.478-98", 456789, "13/04/1898", "Escola", "PMSP", "4978-7825", "5689-7421", Endereco.getEndereco()));
        clientes.add(new Cliente("Aline Aparecida Ferreira", "57896321-7", "369.569.478-98", 456789, "13/04/1898", "Escola", "PMSP", "4978-7825", "5689-7421", Endereco.getEndereco()));
        clientes.add(new Cliente("Carlos Alberto Doido Varrido", "57896321-7", "369.569.478-98", 456789, "13/04/1898", "Escola", "PMSP", "4978-7825", "5689-7421", Endereco.getEndereco()));
        return clientes;
    }
}
