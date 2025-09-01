package br.edu.unifei.ecot12.naruto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Shinobi extends Ser {
    private String sexo;
    private Date nascimento;
    private String categoria;
    private boolean renegado;
    private List<KekkeiGenkai> Keis = new ArrayList<KekkeiGenkai>();
    private Time time;
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public boolean isRenegado() {
        return renegado;
    }
    public void setRenegado(boolean renegado) {
        this.renegado = renegado;
    }
    public List<KekkeiGenkai> getKeis() {
        return Keis;
    }
    public void setKeis(List<KekkeiGenkai> keis) {
        Keis = keis;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
    
}
