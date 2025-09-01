package br.edu.unifei.ecot12.naruto;

import java.util.ArrayList;
import java.util.List;

public abstract class Ser {
    private String nome;
    private String apelido;
    private int chakra;
    private Vila nasceu;
    private List<Jutsu> jutsus;
    private List<ArtefatoMistico> artefatos = new ArrayList<ArtefatoMistico>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public int getChakra() {
        return chakra;
    }
    public void setChakra(int chakra) {
        this.chakra = chakra;
    }
    public Vila getNasceu() {
        return nasceu;
    }
    public void setNasceu(Vila nasceu) {
        this.nasceu = nasceu;
    }
    public List<Jutsu> getJutsus() {
        return jutsus;
    }
    public void setJutsus(List<Jutsu> jutsus) {
        this.jutsus = jutsus;
    }
    public List<ArtefatoMistico> getArtefatos() {
        return artefatos;
    }
    public void setArtefatos(List<ArtefatoMistico> artefatos) {
        this.artefatos = artefatos;
    }
    
}
