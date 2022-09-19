import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        Aluno a1 = new Aluno("Joe Kathleen", LocalDate.of(2001, 1, 16), "joe2001@gmail.com");
        
        a1.setnomeAluno("Denise Oliveira");
        a1.setdataNascAluno(LocalDate.of(1997, 7, 19));
        a1.setemailAluno("olivernise00@gmail.com");
        
        a1.getdadosAluno();
        
        System.out.println();
        
        Professor p1 = new Professor("Peter John", "john2018@gmail.com", "Doutor");
        
        p1.setemailProf("peter.john.prof@gamil.com");
        
        p1.getdadosProf();
        
        System.out.println();
  
        Curso c1 = new Curso("Fundamentos da Programação", 72, "Online", "Técnico", LocalDate.of(2022, 3, 5), LocalDate.of(2022, 8, 14), true, p1);
        
        c1.setcargaHorariaCurso(60);
        c1.setdataFimCurso(LocalDate.of(2022, 6, 18));
        
        
        System.out.println("Dados do Curso\n");
        
        System.out.println("Nome: " + c1.getnomeCurso());
        System.out.println("Carga Horária: " + c1.getcargaHorariaCurso() + "h");
        System.out.println("Modalidade: " + c1.getmodalidadeCurso());
        System.out.println("Nível: " + c1.getnivelCurso());
        System.out.println("Data de início: " + c1.getdataInicioCurso());
        System.out.println("Data de Término: " + c1.getdataFimCurso());
        System.out.println("Gratuito: " + c1.getgratuitoCurso());
        System.out.println("Professor: " + p1.getnomeProf());
        
        System.out.println();
        
        //Certificado cert1 = new Certificado(a1, a1, a1, c1, c1, c1, c1, c1, c1, c1, p1);

        //cert1.getnomeAlunoCert();
        
        System.out.println("Dados do Certificado");
        
        System.out.println();
        
        System.out.println("Nome: " + a1.getnomeAluno());
        System.out.println("Data de nascimento: " + a1.getdataNascAluno());
        System.out.println("Email: " + a1.getemailAluno());
        System.out.println("Nome: " + c1.getnomeCurso());
        System.out.println("Carga Horária: " + c1.getcargaHorariaCurso() + "h");
        System.out.println("Modalidade: " + c1.getmodalidadeCurso());
        System.out.println("Nível: " + c1.getnivelCurso());
        System.out.println("Data de início: " + c1.getdataInicioCurso());
        System.out.println("Data de Término: " + c1.getdataFimCurso());
        System.out.println("Gratuito: " + c1.getgratuitoCurso());
        System.out.println("Professor: " + p1.getnomeProf());
        
        System.out.println();
        
        System.out.println("Certificamos que a aluna " + a1.getnomeAluno() + " nascida em " + a1.getdataNascAluno() + " utilizando o email " + a1.getemailAluno() + " partcipou do curso " + c1.getnomeCurso() + " com carga horária de " +c1.getcargaHorariaCurso() + "h" + " na modalidade " + c1.getmodalidadeCurso() + " de nível " + c1.getnivelCurso() + " com início em " + c1.getdataInicioCurso() + " e término em " + c1.getdataFimCurso() + " gratuito" + " ministrado pelo professor " + p1.getnomeProf());

    }

}
