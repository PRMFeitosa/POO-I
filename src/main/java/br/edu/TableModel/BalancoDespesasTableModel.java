
package br.edu.TableModel;

import br.edu.entidades.Despesas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Paulo
 */
public class BalancoDespesasTableModel extends AbstractTableModel {
    
     private String[] colunas = new String[] {"Descrição", "Valor"};
    private List<Despesas> despesas;
    
    public BalancoDespesasTableModel(List<Despesas> despesas){
        this.despesas = despesas;
    }
    
    public int getRowCount() {
        return this.despesas.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Despesas des = despesas.get(rowIndex);
        switch(columnIndex){
            case 0:
                return des.getDescrição();
            case 1:
                return des.getValor();                       
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
            default:
                break;
        }
        return super.getColumnName(column);
    }
    
}
