
package br.edu.entidades;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Paulo
 */
@Entity
@Table(name="funcionario")
public class Funcionario {

        @Id
	@GeneratedValue
	private Integer id;
        
        @Column(length=60, nullable=false)
	private String nome;

	@Column (length=20, nullable=false)
        private Integer telefone;
        
        @Column (length=30, nullable=false)
        @Temporal(javax.persistence.TemporalType.DATE)
        private Date dataNascimento;
        
        @Column (length=30, nullable=false)
        private String Funcao;
        
        @Column (length=20, nullable=false)
        private Integer cpf;
        
        @Column (length=30, nullable=false)
        private Integer rg;
        
        @Column (length=30, nullable=false)
        private String email;
       
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
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the Funcao
     */
    public String getFuncao() {
        return Funcao;
    }

    /**
     * @param Funcao the Funcao to set
     */
    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    /**
     * @return the cpf
     */
    public Integer getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public Integer getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(Integer rg) {
        this.rg = rg;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }    

    @Override
    public String toString() {
        return nome; //To change body of generated methods, choose Tools | Templates.
    }
    
    
        
        
    
}
