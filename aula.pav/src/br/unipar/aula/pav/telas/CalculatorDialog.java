package br.unipar.aula.pav.telas;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;

import br.unipar.aula.pav.controller.Calculator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class CalculatorDialog extends Dialog {
	Calculator calculo = new Calculator();
	
	private Text jFdisplay;
	private String value1, value2, sinal;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public CalculatorDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(null);
		
		jFdisplay = new Text(container, SWT.BORDER);
		jFdisplay.setFont(SWTResourceManager.getFont("Segoe UI", 24, SWT.NORMAL));
		jFdisplay.setBounds(5, 10, 343, 84);
		
		Button buttonSeven = new Button(container, SWT.NONE);
		buttonSeven.setBounds(5, 100, 64, 49);
		buttonSeven.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				jFdisplay.setText(jFdisplay.getText() + "7");
			}
		});
		buttonSeven.setText("7");
		
		Button buttonEight = new Button(container, SWT.NONE);
		buttonEight.setBounds(75, 100, 63, 48);
		buttonEight.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				jFdisplay.setText(jFdisplay.getText() + "8");
			}
		});
		buttonEight.setText("8");
		
		Button buttonNine = new Button(container, SWT.NONE);
		buttonNine.setBounds(144, 100, 64, 49);
		buttonNine.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				jFdisplay.setText(jFdisplay.getText() + "9");
			}
		});
		buttonNine.setText("9");
		
		Button buttonSum = new Button(container, SWT.NONE);
		buttonSum.setBounds(214, 100, 64, 49);
		buttonSum.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value1 = jFdisplay.getText();
				jFdisplay.setText("");
				calculo.setN1(Double.parseDouble(value1));
				sinal = "+";
				calculo.setOperator(sinal);
			}
		});
		buttonSum.setText("+");
		
		Button buttonCe = new Button(container, SWT.NONE);
		buttonCe.setBounds(284, 100, 64, 49);
		buttonCe.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String textToModify = jFdisplay.getText();
				jFdisplay.setText(textToModify.substring(0, textToModify.length() - 1));
			}
		});
		buttonCe.setText("CE");
		
		Button buttonFour = new Button(container, SWT.NONE);
		buttonFour.setBounds(5, 155, 64, 49);
		buttonFour.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				jFdisplay.setText(jFdisplay.getText() + "4");
			}
		});
		buttonFour.setText("4");
		
		Button buttonFive = new Button(container, SWT.NONE);
		buttonFive.setBounds(75, 155, 64, 49);
		buttonFive.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				jFdisplay.setText(jFdisplay.getText() + "5");
			}
		});
		buttonFive.setText("5");
		
		Button buttonSix = new Button(container, SWT.NONE);
		buttonSix.setBounds(144, 155, 64, 49);
		buttonSix.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				jFdisplay.setText(jFdisplay.getText() + "6");
			}
		});
		buttonSix.setText("6");
		
		Button buttonSub = new Button(container, SWT.NONE);
		buttonSub.setBounds(214, 155, 64, 49);
		buttonSub.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value1 = jFdisplay.getText();
				jFdisplay.setText("");
				calculo.setN1(Double.parseDouble(value1));
				sinal = "-";
				calculo.setOperator(sinal);
			}
		});
		buttonSub.setText("-");
		
		Button buttonC = new Button(container, SWT.NONE);
		buttonC.setBounds(284, 155, 64, 49);
		buttonC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value1 = "";
				value2 = "";
				sinal = "";
				jFdisplay.setText("");
			}
		});
		buttonC.setText("C");
		
		Button buttonOne = new Button(container, SWT.NONE);
		buttonOne.setBounds(5, 210, 64, 49);
		buttonOne.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				jFdisplay.setText(jFdisplay.getText() + "1");
			}
		});
		buttonOne.setText("1");
		
		Button buttonTwo = new Button(container, SWT.NONE);
		buttonTwo.setBounds(75, 210, 64, 49);
		buttonTwo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				jFdisplay.setText(jFdisplay.getText() + "2");
			}
		});
		buttonTwo.setText("2");
		
		Button buttonThree = new Button(container, SWT.NONE);
		buttonThree.setBounds(144, 210, 64, 49);
		buttonThree.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				jFdisplay.setText(jFdisplay.getText() + "3");
			}
		});
		buttonThree.setText("3");
		
		Button buttonDiv = new Button(container, SWT.NONE);
		buttonDiv.setBounds(214, 210, 64, 49);
		buttonDiv.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value1 = jFdisplay.getText();
				jFdisplay.setText("");
				calculo.setN1(Double.parseDouble(value1));
				sinal = "/";
				calculo.setOperator(sinal);
			}
		});
		buttonDiv.setText("/");
		
		Button buttonEqual = new Button(container, SWT.NONE);
		buttonEqual.setBounds(284, 210, 64, 104);
		buttonEqual.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value2 = jFdisplay.getText();
				calculo.setN2(Double.parseDouble(value2));
				jFdisplay.setText(calculo.getN1() + calculo.getOperator() + calculo.getN2() + "=" + calculo.calculator());
			}
		});
		buttonEqual.setText("=");
		
		Button buttonZero = new Button(container, SWT.NONE);
		buttonZero.setBounds(5, 265, 133, 49);
		buttonZero.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				jFdisplay.setText(jFdisplay.getText() + "0");
			}
		});
		buttonZero.setText("0");
		
		Button buttonPoint = new Button(container, SWT.NONE);
		buttonPoint.setBounds(144, 265, 64, 49);
		buttonPoint.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				jFdisplay.setText(jFdisplay.getText() + ".");
			}
		});
		buttonPoint.setText(".");
		
		Button buttonMult = new Button(container, SWT.NONE);
		buttonMult.setBounds(214, 265, 64, 49);
		buttonMult.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				value1 = jFdisplay.getText();
				jFdisplay.setText("");
				calculo.setN1(Double.parseDouble(value1));
				sinal = "*";
				calculo.setOperator(sinal);
			}
		});
		buttonMult.setText("*");

		return container;
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(372, 406);
	}

}
