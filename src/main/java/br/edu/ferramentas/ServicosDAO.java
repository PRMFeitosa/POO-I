
package br.edu.ferramentas;

import br.edu.entidades.Funcionario;
import br.edu.entidades.Servicos;
import br.edu.util.HibernateUtil;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author Paulo
 */
public class ServicosDAO extends GenericDAO<Servicos> {

    
     public List<Servicos> listar() {
        List<Servicos> servicos = null;
        try{
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            servicos = this.sessao.createCriteria(Servicos.class).list();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            this.sessao.close();
        }
        return servicos;
    }  
     
      public List<Servicos> listar(Date DataIni, Date DataFim) {
        List<Servicos> servicos = null;
        try{
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            servicos = this.sessao.createCriteria(Servicos.class)
                    .add(Restrictions.ge("data", DataIni))
                    .add(Restrictions.le("data", DataFim)).list();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            this.sessao.close();
        }
        return servicos;
    }
    
    public List<Servicos> listar(JComboBox<Object> fun) {
         List<Servicos> servicos = null;
        try{
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            servicos = this.sessao.createCriteria(Servicos.class)
                    .add(Restrictions.eq("Funcionario", fun)).list();                  
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            this.sessao.close();
        }
        return servicos;    }
    
}
