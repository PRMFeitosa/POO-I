
package br.edu.TableModel;

import br.edu.entidades.Despesas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Paulo
 */
public class DespesasTableModel extends AbstractTableModel {

    private String[] colunas = new String[] {"Descrição", "Valor", "Data"};
    private List<Despesas> despesas;
    
    public DespesasTableModel(List<Despesas> despesas){
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
            case 2:
                return des.getData();            
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
            default:
                break;
        }
        return super.getColumnName(column);
    }
}
    
    
    

