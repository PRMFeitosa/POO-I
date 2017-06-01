
package br.edu.TableModel;

import br.edu.entidades.Servicos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Paulo
 */
public class ServicosTableModel extends AbstractTableModel {
    
    private String[] colunas = new String[] {"Descrição", "Valor", "Data", "Funcionário"};
    private List<Servicos> servicos;
    
    public ServicosTableModel(List<Servicos> servicos){
        this.servicos = servicos;
    }
    
    public int getRowCount() {
        return this.servicos.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Servicos ser = servicos.get(rowIndex);
        switch(columnIndex){
            case 0:
                return ser.getServico();
            case 1:
                return ser.getValorTotal();
            case 2:
                return ser.getData();
            case 3:
                return ser.getFuncionario(); 
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
            default:
                break;
        }
        return super.getColumnName(column);
    }
    
}
