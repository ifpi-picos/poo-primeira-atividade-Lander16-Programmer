package br.edu.ifpi.dominio;

public class Professor {
    
    private String nomeProf;
    private String emailProf;
    private String formacaoProf;
    
    
    public Professor(String nome, String email, String formacao) {
        
        this.nomeProf = nome;
        this.emailProf = email;
        this.formacaoProf = formacao;
        
    }
    
    public String getnomeProf() {
        
        return this.nomeProf;
        
    }
    
    public void setnomeProf(String nome) {
        
       this.nomeProf = nome;
        
    }
    
    public String getemailProf() {
        
        return this.emailProf;
        
    }
    
    public void setemailProf(String email) {
        
        this.emailProf = email;
    }
    
    public String getformacaoProf() {
        
        return this.formacaoProf;
        
    }
    
    public void setformacaoProf(String formacao) {
        
        
        this.formacaoProf = formacao;
        
    }
    
    public void getdadosProf() {
        
        System.out.println("Dados do Professor");
        
        System.out.println();
        
        System.out.println("Nome: " + getnomeProf());
        System.out.println("Email: " + getemailProf());
        System.out.println("Formação: " + getformacaoProf());
    } 

}