
package br.edu.entidades;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author Paulo
 */

@Entity
@Table(name="despesas")
public class Despesas {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    
     @Id
     @GeneratedValue
     private Integer id;
     
     @Column (length=50, nullable=false)
     private String descri��o;
     
     @Column (length=15, nullable=false)
     private double valor;
     
     @Column (length=30, nullable=false)
     @Temporal(javax.persistence.TemporalType.DATE)
     private Date data;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    /**
     * @return the descri��o
     */
    public String getDescri��o() {
        return descri��o;
    }

    /**
     * @param descri��o the descri��o to set
     */
    public void setDescri��o(String descri��o) {
        String oldDescri��o = this.descri��o;
        this.descri��o = descri��o;
        changeSupport.firePropertyChange("descri\u00e7\u00e3o", oldDescri��o, descri��o);
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        double oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        Date oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
     
}
