/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.TableModel;

import br.edu.entidades.Funcionario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Paulo
 */
public class FuncionarioTableModel extends AbstractTableModel {
    
     private String[] colunas = new String[] {"Nome", "Telefone", "RG", "CPF", "DataNascimento", "Função", "E-mail"};
    private List<Funcionario> funcionario;
    
    public FuncionarioTableModel(List<Funcionario> funcionario){
        this.funcionario = funcionario;
    }
    
    public int getRowCount() {
        return this.funcionario.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario fun = funcionario.get(rowIndex);
        switch(columnIndex){
            case 0:
                return fun.getNome();
            case 1:
                return fun.getTelefone();
            case 2:
                return fun.getRg();
            case 3:
                return fun.getCpf();
            case 4:
                return fun.getDataNascimento();
            case 5:
                return fun.getFuncao();
            case 6:
                return fun.getEmail(); 
            default:
                break;
        }
       return null;
    }
    
    @Override
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
            case 4:
                return colunas[4];
            case 5:
                return colunas[5];
            case 6:
                return colunas[6];
            default:
                break;
        }
        return super.getColumnName(column);
    }
    
}
