package br.unipar.aula.pav;

import org.eclipse.swt.widgets.Display;
//import br.unipar.aula.pav.telas.CadastroDialog;
import br.unipar.aula.pav.telas.CalculatorDialog;

public class TrabMain {

	public static void main(String[] args) {
		CalculatorDialog calculator = new CalculatorDialog(Display.getDefault().getActiveShell());
		calculator.open();
	}

}
