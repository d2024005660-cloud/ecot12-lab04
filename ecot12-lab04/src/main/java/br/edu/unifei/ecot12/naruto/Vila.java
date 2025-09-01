package br.edu.unifei.ecot12.naruto;

import java.util.ArrayList;
import java.util.List;

public class Vila extends EntidadePolitica {
    private String localizacao;
    private String bandana;
    private List<Clan> clan=new ArrayList<Clan>();
    public Vila(Ser seress){
        super(seress);
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getBandana() {
        return bandana;
    }
    public void setBandana(String bandana) {
        this.bandana = bandana;
    }
    public List<Clan> getClan() {
        return clan;
    }
    public void setClan(List<Clan> clan) {
        this.clan = clan;
    }
}
