package ModeloMenu;

import br.edu.telas.TelaBalancoFinanceiro;
import br.edu.telas.TelaCadastroDespesas;
import br.edu.telas.TelaCadastroFuncionario;
import br.edu.telas.TelaCadastroServicos;
import br.edu.telas.TelaTabelaDespesas;
import br.edu.telas.TelaTabelaFuncionario;
import br.edu.telas.TelaTabelaServicos;

/**
 *
 * @author Paulo Feitosa
 */
public class ChamaTelasAction implements ChamaTelas{

    @Override
    public void BalancoFinanceiro() {
        TelaBalancoFinanceiro show = new TelaBalancoFinanceiro();
        show.setVisible(true);
        }

    @Override
    public void CadastroDespesas() {
        TelaCadastroDespesas show = new TelaCadastroDespesas();
        show.setVisible(true);
        }

    @Override
    public void CadastroFuncionario() {
        TelaCadastroFuncionario show = new TelaCadastroFuncionario();
        show.setVisible(true);
        }

    @Override
    public void CadastroServicos() {
        TelaCadastroServicos show = new TelaCadastroServicos();
        show.setVisible(true);
        }

    @Override
    public void TabelaDespesas() {
        TelaTabelaDespesas show = new TelaTabelaDespesas();
        show.setVisible(true);
        }

    @Override
    public void tabelaFuncionario() {
        TelaTabelaFuncionario show = new TelaTabelaFuncionario();
        show.setVisible(true);
        }    

    @Override
    public void tabelaServicos() {
        TelaTabelaServicos show = new TelaTabelaServicos();
        show.setVisible(true);
        }
    
}
