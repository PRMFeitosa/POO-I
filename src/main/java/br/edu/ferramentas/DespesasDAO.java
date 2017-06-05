
package br.edu.ferramentas;

import br.edu.entidades.Despesas;
import br.edu.util.HibernateUtil;
import java.util.Date;
import java.util.List;
import javax.swing.JFormattedTextField;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Paulo
 */
public class DespesasDAO extends GenericDAO<Despesas> {

    @Override
    public List<Despesas> listar() {
        List<Despesas> despesas = null;
        try{
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            despesas = this.sessao.createCriteria(Despesas.class).list();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            this.sessao.close();
        }
        return despesas;
    }
    
    public List<Despesas> listar(Date DataIni, Date DataFim) {
        List<Despesas> despesas = null;
        try{
            this.sessao = HibernateUtil.getSessionFactory().openSession();
            despesas = this.sessao.createCriteria(Despesas.class)
                    .add(Restrictions.between("data", DataIni, DataFim)).list();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            this.sessao.close();
        }
        return despesas;
    }

  
    
}
