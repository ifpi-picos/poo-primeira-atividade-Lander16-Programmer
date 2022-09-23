package br.edu.ifpi.dominio;

import java.time.LocalDate;

public class Curso {

    private String nomeCurso;
    private int cargaHorariaCurso;
    private String modalidadeCurso;
    private String nivelCurso;
    private LocalDate dataInicioCurso;
    private LocalDate dataFimCurso;
    private boolean gratuitoCurso;
    private Professor nomeProfCurso;
;
    public Curso(String nome, int cargaHoraria, String modalidade, String nivel, LocalDate dataInicio, LocalDate dataFim, boolean gratuito, Professor nomeProf) {
 
        this.nomeCurso = nome;
        this.cargaHorariaCurso = cargaHoraria;
        this.modalidadeCurso = modalidade;
        this.nivelCurso = nivel;
        this.dataInicioCurso = dataInicio;
        this.dataFimCurso = dataFim;
        this.gratuitoCurso = gratuito;
        this.nomeProfCurso = nomeProf;     
    }
    
    public String getnomeCurso() {
        
        return this.nomeCurso;
    }
    
    public void setnomeCurso(String nome) {
        
        this.nomeCurso = nome;
    }
    
    public int getcargaHorariaCurso() {
        
        return this.cargaHorariaCurso;
        
    }
    
    public void setcargaHorariaCurso(int cargaHoraria) {
        
        this.cargaHorariaCurso = cargaHoraria;
        
    }
    
    public String getmodalidadeCurso() {
        
        return this.modalidadeCurso;
        
    }
    
    public void setmodalidadeCurso(String modalidade) {
        
        this.modalidadeCurso = modalidade;
        
    }
    
    public String getnivelCurso() {
        
        return this.nivelCurso;
        
    }
    
    public void setnivelCurso(String nivel) {
        
        this.nivelCurso = nivel;
        
    }
    
    public LocalDate getdataInicioCurso() {
        
        return this.dataInicioCurso;
        
    }
    
    public void setdataIncioCurso(LocalDate dataInicio) {
        
        this.dataInicioCurso = dataInicio;
        
    }
    
    public LocalDate getdataFimCurso() {
        
        return this.dataFimCurso;
        
    }
    
    public void setdataFimCurso(LocalDate dataFim) {
        
        this.dataFimCurso = dataFim;
        
    }
    
    public boolean getgratuitoCurso() {
        
        return this.gratuitoCurso;
        
    }
    
    public void setgratuitoCurso(boolean gratuito) {
        
        this.gratuitoCurso = gratuito;
    
    }
    
    public Professor getnomeProfCurso() {
        
        return this.nomeProfCurso;
    }
    
    public void setnomeProfCurso(Professor nomeProf) {
        
        this.nomeProfCurso = nomeProf;

    }    

}
