package br.unipar.aula.pav;

import org.eclipse.swt.widgets.Display;

import br.unipar.aula.pav.telas.CadastroDialog;

public class TrabMain {

	public static void main(String[] args) {
		CadastroDialog cadastroDialog = new CadastroDialog(Display.getDefault().getActiveShell());
		cadastroDialog.open();
		
	}

}
