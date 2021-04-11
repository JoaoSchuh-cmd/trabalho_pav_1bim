package br.unipar.aula.pav.telas;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import br.unipar.aula.pav.controller.CadastroController;

public class CadastroDialog extends TitleAreaDialog {

	
	private CadastroController controller = new CadastroController();
	private Text txtNome;
	private Text txtUsuario;
	private Text txtSenha;
	private Text txtConfirmarSenha;
	private Text txtEmail;
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public CadastroDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		container.setLayout(new GridLayout(2, false));
		
		setTitle("Cadastro");
		setMessage("Informe os dados cadastrais requisitados para realizar o cadastro.");
		//NOME
		Label lblNome = new Label(container, SWT.NONE);
		lblNome.setText("Nome");
		lblNome.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		
		txtNome = new Text(container, SWT.BORDER);
		txtNome.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		//USUARIO
		Label lblUsuario = new Label(container, SWT.NONE);
		lblUsuario.setText("Usuário");
		lblUsuario.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		
		txtUsuario = new Text(container, SWT.BORDER);
		txtUsuario.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		//SENHA
		Label lblSenha = new Label(container, SWT.NONE);
		lblSenha.setText("Senha");
		lblSenha.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		
		txtSenha = new Text(container, SWT.BORDER | SWT.PASSWORD);
		txtSenha.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		//CONFIRMAR SENHA
		Label lblConfirmarSenha = new Label(container, SWT.NONE);
		lblConfirmarSenha.setText("Confirme sua senha");
		lblConfirmarSenha.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		
		txtConfirmarSenha = new Text(container, SWT.BORDER | SWT.PASSWORD);
		txtConfirmarSenha.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		//EMAIL
		Label lblEmail = new Label(container, SWT.NONE);
		lblEmail.setText("Email");
		lblEmail.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		
		txtEmail = new Text(container, SWT.BORDER);
		txtEmail.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		//FIM
		return area;
	}
	
	@Override
	protected void okPressed() {
		
		String usuario = txtUsuario.getText();
		String senha = txtSenha.getText();
		String nome = txtNome.getText();
		String email = txtEmail.getText();
		String confSenha = txtConfirmarSenha.getText();
		
			if (!controller.efetuarCadastro(usuario, senha, nome, email, confSenha)) {
				return;
			}
		super.okPressed();
	}
	
	/**
	 * Create contents of the button bar.
	 * @param parent
	 */

	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(550, 450);
	}

	public static Shell getActiveShell() {
		return Display.getDefault().getActiveShell();
	}
	
}
