package br.unipar.aula.pav.controller;

import org.eclipse.jface.dialogs.MessageDialog;

import br.unipar.aula.pav.telas.CadastroDialog;

public class CadastroController {
	
	public boolean efetuarCadastro(String usuario, String senha, String nome, String email, String confSenha) {
		
		if (nome.length() <= 10) {
			MessageDialog.openWarning(CadastroDialog.getActiveShell(), "ERRO!", "O nome inserido possui menos de dez caracteres. Por favor, informe seu nome completo." );
		return false;
		}
		
		if (senha.length() <= 8) {
				MessageDialog.openWarning(CadastroDialog.getActiveShell(), "ERRO!", "A senha inserida é inferior a oito caracteres." );
			return false;
		}
		if (!confSenha.equals(senha)) {
				MessageDialog.openWarning(CadastroDialog.getActiveShell(), "ERRO!", "A senha confirmada é diferente da senha inserida." );
			return false;
		}
		
			MessageDialog.openInformation(CadastroDialog.getActiveShell(), 
					"Confirmação de cadastro", "Cadastro realizado com sucesso!" + 
							"\n \n \n" + 
							"Dados Cadastrados: " +
							"\n \n \n" +
							"Nome:" + nome +
							"\n \n" + 
							"Usuario: " + usuario +
							"\n \n" +
							"Senha: " + senha +
							"\n \n" +
							"Email: " + email 
			);
		return true;
	}

}
