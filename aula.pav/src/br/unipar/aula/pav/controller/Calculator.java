package br.unipar.aula.pav.controller;

public class Calculator {
	
	private double n1, n2, result;
	private String operator;
	
	public double calculator() {
		verifyOperator();
		return result;
	}
	
	public void verifyOperator() {
		if (operator == "+") {sum();}
		if (operator == "-") {sub();}
		if (operator == "/") {div();}
		if (operator == "*") {mult();}
	}
	
	public void sum() {
		result = n1 + n2;
	}
	public void div() {
		result = n1 / n2;
	}
	public void mult() {
		result = n1 * n2;
	}
	public void sub() {
		result = n1 - n2;
	}
	
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
}
