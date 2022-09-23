import java.time.LocalDate;

import br.edu.ifpi.dominio.Aluno;
import br.edu.ifpi.dominio.Curso;
import br.edu.ifpi.dominio.Professor;

public class App {

    public static void main(String[] args) throws Exception {

        Aluno a1 = new Aluno("Joe Kathleen", LocalDate.of(2001, 1, 16), "joe2001@gmail.com");
        
        a1.setnomeAluno("Denise Oliveira");
        a1.setdataNascAluno(LocalDate.of(1997, 7, 19));
        a1.setemailAluno("olivernise00@gmail.com");
        a1.setnomeAluno("Jean Carlos");
        a1.setemailAluno("jeancarlos2000@gmail.com");
        
        a1.getdadosAluno();
        
        System.out.println();
        
        Professor p1 = new Professor("Peter John", "john2018@gmail.com", "Doutor");
        
        p1.setemailProf("peter.john.prof@gamil.com");
        
        p1.getdadosProf();
        
        System.out.println();
  
        Curso c1 = new Curso("Fundamentos da Programação", 72, "Online", "Técnico", LocalDate.of(2022, 3, 5), LocalDate.of(2022, 8, 14), false, p1);
        
        c1.setcargaHorariaCurso(60);
        c1.setdataFimCurso(LocalDate.of(2022, 6, 18));
        c1.setgratuitoCurso(false);
        
        
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
        
        System.out.println("Certificamos que a aluna " + a1.getnomeAluno() + " nascida em " + a1.getdataNascAluno() + " utilizando o email " + a1.getemailAluno() + " concluiu do curso " + c1.getnomeCurso() + " com carga horária de " +c1.getcargaHorariaCurso() + "h" + " na modalidade " + c1.getmodalidadeCurso() + " de nível " + c1.getnivelCurso() + " com início em " + c1.getdataInicioCurso() + " e término em " + c1.getdataFimCurso() + " pago" + " ministrado pelo professor " + p1.getnomeProf());

        System.out.println();

        a1.getdadosAluno();

        System.out.println();

        Professor p2 = new Professor("Lorena Silva", "lorena.silva.prof@gmail.com", "Mestra");

        p2.getdadosProf();

        System.out.println();

        System.out.println("Dados do Curso\n");

        Curso c2 = new Curso("Curso Básico da Linguaguem Java", 64, "Online", "Não especiícado", LocalDate.of(2022, 7, 1), LocalDate.of(2022, 9, 20), true, p2);
        
        System.out.println("Nome: " + c2.getnomeCurso());
        System.out.println("Carga Horária: " + c2.getcargaHorariaCurso() + "h");
        System.out.println("Modalidade: " + c2.getmodalidadeCurso());
        System.out.println("Nível: " + c2.getnivelCurso());
        System.out.println("Data de início: " + c2.getdataInicioCurso());
        System.out.println("Data de Término: " + c2.getdataFimCurso());
        System.out.println("Gratuito: " + c2.getgratuitoCurso());
        System.out.println("Professor: " + p2.getnomeProf());
        
        System.out.println();

        System.out.println("Dados do Certificado");
        
        System.out.println();
        
        System.out.println("Nome: " + a1.getnomeAluno());
        System.out.println("Data de nascimento: " + a1.getdataNascAluno());
        System.out.println("Email: " + a1.getemailAluno());
        System.out.println("Nome: " + c2.getnomeCurso());
        System.out.println("Carga Horária: " + c2.getcargaHorariaCurso() + "h");
        System.out.println("Modalidade: " + c2.getmodalidadeCurso());
        System.out.println("Nível: " + c2.getnivelCurso());
        System.out.println("Data de início: " + c2.getdataInicioCurso());
        System.out.println("Data de Término: " + c2.getdataFimCurso());
        System.out.println("Gratuito: " + c2.getgratuitoCurso());
        System.out.println("Professor: " + p2.getnomeProf());
        
        System.out.println();
        
        System.out.println("Certificamos que a aluna " + a1.getnomeAluno() + " nascida em " + a1.getdataNascAluno() + " utilizando o email " + a1.getemailAluno() + " concluiu do curso " + c2.getnomeCurso() + " com carga horária de " +c2.getcargaHorariaCurso() + "h" + " na modalidade " + c2.getmodalidadeCurso() + " de nível " + c2.getnivelCurso() + " com início em " + c2.getdataInicioCurso() + " e término em " + c2.getdataFimCurso() + " gratuito" + " ministrado pelo professora " + p2.getnomeProf());
        
    }

}
