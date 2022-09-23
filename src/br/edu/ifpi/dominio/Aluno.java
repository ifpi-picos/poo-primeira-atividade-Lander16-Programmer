package br.edu.ifpi.dominio;

import java.time.LocalDate;

public class Aluno {

    
    private String nomeAluno;
    private LocalDate dataNascAluno;
    private String emailAluno;
    
    public Aluno(String nome, LocalDate dataNasc, String email) {
        
        this.nomeAluno = nome;
        this.dataNascAluno = dataNasc;
        this.emailAluno = email;
        
    }
    
    public String getnomeAluno() {
        
        return this.nomeAluno;
    }
    
    public void setnomeAluno(String nome) {
        
        this.nomeAluno = nome;
        
    }
    
    public LocalDate getdataNascAluno() {
        
        return this.dataNascAluno;
        
    }
    
    public void setdataNascAluno(LocalDate dataNasc) {
        
        this.dataNascAluno = dataNasc;
        
    }
    
    public String getemailAluno() {
        
        return this.emailAluno;
        
    }
    
    public void setemailAluno(String email) {
        
        this.emailAluno = email;
        
    }
    
    public void getdadosAluno() {
        
        System.out.println("Dados do Aluno");
        
        System.out.println();
        
        System.out.println("Nome: " + getnomeAluno());
        System.out.println("Data de nascimento: " + getdataNascAluno());
        System.out.println("Email: " + getemailAluno());
    }

}
