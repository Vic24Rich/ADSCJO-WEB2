package br.edu.ifspdcjo.ads.web2.employercontrol.model;

public class SalariedAndComissionedEmployer extends ComissionedEmployer {
	
	private double salary;

	public SalariedAndComissionedEmployer(String name, String cpf, double salesValue, double comissionPercentege, double salary) {
		super(name, cpf, salesValue, comissionPercentege);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Empregado Assalariado"
	     + "\n[Salário = " + salary
		 + "\nValor das Vendas = " + salesValue + 
		   "\nPercentual de Comissões = " + comissionPercentege + 
		   "\nNome = " + name + 
		   "\nCPF = " + cpf;
	}
	
	@Override
	public double calculateIncome() {
		return salary + super.calculateIncome();
	}

}
