
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Teste {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Estudante e=new Estudante();
        e.setCurso("Informatica");
        pessoa.setNome("Samira");
        pessoa.setDataNascimento(new Date());
        
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.save(e);
        session.getTransaction().commit();
        
        session.close();
    }
}
