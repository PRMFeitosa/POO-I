package br.edu.ferramentas;


import br.edu.entidades.Funcionario;
import br.edu.util.HibernateUtil;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class FuncionarioDAO extends GenericDAO<Funcionario> {

     public List<Funcionario> listar() {
        List<Funcionario> funcionarios = null;
        try{
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            funcionarios = this.sessao.createCriteria(Funcionario.class).list();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            this.sessao.close();
        }
        return funcionarios;
    }
   
     
   
}