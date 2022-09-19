public class Certificado {
    
    private Aluno nomeAlunoCert;
    private Aluno dataNascAlunoCert;
    private Aluno emailAlunoCert;
    private Curso nomeCursoCert;
    private Curso cargaHorariaCursoCert;
    private Curso modalidadeCursoCert;
    private Curso nivelCursoCert;
    private Curso dataInicioCursoCert;
    private Curso dataFimCursoCert;
    private Curso gratuitoCursoCert;
    private Professor nomeProfCursoCert;
    
    
    public Certificado(Aluno nomeAluno, Aluno dataNascAluno, Aluno emailAluno, Curso nomeCurso, Curso cargaHorariaCurso, Curso modalidadeCurso, Curso nivelCurso, Curso dataInicioCurso, Curso dataFimCurso, Curso gratuitoCurso, Professor nomeProfCurso) {
        
        this.nomeAlunoCert = nomeAluno;
        this.dataNascAlunoCert = dataNascAluno;
        this.emailAlunoCert = emailAluno;
        this.nomeCursoCert = nomeCurso;
        this.cargaHorariaCursoCert = cargaHorariaCurso;
        this.modalidadeCursoCert = modalidadeCurso;
        this.nomeCursoCert = nomeCurso;
        this.dataInicioCursoCert = dataInicioCurso;
        this.dataFimCursoCert = dataFimCurso;
        this.gratuitoCursoCert = gratuitoCurso;
        this.nomeProfCursoCert = nomeProfCurso;
        
    }   
    
    public Aluno getnomeAlunoCert() {
        
        return this.nomeAlunoCert;
        
    }
    
    public void setnomeAlunoCert(Aluno nomeAluno) {
        
      this.nomeAlunoCert = nomeAluno;
        
    }
    
    public Aluno getdataNascAlunoCert() {
        
        return this.dataNascAlunoCert;
        
    }
    
    public void setdataNascAluno(Aluno dataNascAluno) {
        
        this.dataNascAlunoCert = dataNascAluno;
        
    }
    
    public Aluno getemailAlunoCert() {
        
        return this.emailAlunoCert;
        
    }
    
    public void setemailAlunoCert(Aluno emailAluno) {
        
        this.emailAlunoCert = emailAluno;
    
    }
    
    public Curso getnomeCursoCert() {
        
        return this.nomeCursoCert;
        
    }
    
    public void setnomeCursoCert(Curso nomeCurso) {
        
        this.nomeCursoCert = nomeCurso;
    
    }
    
    public Curso getcargaHorariaCursoCert() {
        
        return this.cargaHorariaCursoCert;
        
    }
    
    public void setcagaHorariaCursoCert(Curso cargaHorariaCurso) {
        
        this.cargaHorariaCursoCert = cargaHorariaCurso;
    
    }
    
    public Curso getmodalidadeCursoCert() {
        
        return this.modalidadeCursoCert;
        
    }
    
    public void setmodalidadeCursoCert(Curso modalidadeCurso) {
        
        this.modalidadeCursoCert = modalidadeCurso;
    
    }
    
    public Curso getnivelCursoCert() {
        
        return this.nivelCursoCert;
        
    }
    
    public void setnivelCursoCert(Curso nivelCurso) {
        
        this.nivelCursoCert = nivelCurso;
        
    }
    
    public Curso getdataInicioCursoCert() {
        
        return this.dataInicioCursoCert;
        
    }
    
    public void setdataIncioCursoCert(Curso dataInicioCurso) {
        
        this.dataInicioCursoCert = dataInicioCurso;
    
    }
    
    public Curso getdataFimCursoCert() {
        
        return this.dataFimCursoCert;
        
    }
    
    public void setdataFimCursoCert(Curso dataFimCurso) {
        
        this.dataFimCursoCert = dataFimCurso;
        
    }
    
    public Curso getgratuitoCursoCert() {
        
        return this.gratuitoCursoCert;
        
    }
    
    public void setgratuitoCursoCert(Curso gratuitoCurso) {
        
        this.gratuitoCursoCert = gratuitoCurso;
    
    }
    
    public Professor getnomeProfCert() {
        
        return this.nomeProfCursoCert;
        
    }
    
    public void setnomeProfCursoCert(Professor nomeProfCurso) {
        
        this.nomeProfCursoCert = nomeProfCurso;

    }    
}
