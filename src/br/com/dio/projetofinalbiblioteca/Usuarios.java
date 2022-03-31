package br.com.dio.projetofinalbiblioteca;

import java.util.List;

public abstract class Usuarios {
    private String nome;
    private double pendencias;
    private int limiteDias, limiteLivros;
    private boolean estado;
    private int numEmprestimos;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPendencias() {
        return pendencias;
    }

    public void setPendencias(double pendencias) {
        this.pendencias = pendencias;
    }

    public int getLimiteDias() {
        return limiteDias;
    }

    public void setLimiteDias(int limiteDias) {
        this.limiteDias = limiteDias;
    }

    public int getLimiteLivros() {
        return limiteLivros;
    }

    public void setLimiteLivros(int limiteLivros) {
        this.limiteLivros = limiteLivros;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNumEmprestimos() {
        return numEmprestimos;
    }

    public void setNumEmprestimos(int numEmprestimos) {
        this.numEmprestimos = numEmprestimos;
    }
}
