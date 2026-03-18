package br.edu.ifspdcjo.ads.web2.employercontrol.model;

public class SalariedEmployer extends Employer {
	
	private double salary;

	public SalariedEmployer(String name, String cpf, double salary) {
		super(name, cpf);
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
		return "Asalariado "
		  + "\n[Salario = " + salary + 
		    " \nNome    = " + name + 
			 "\nCPF     = " + cpf + "]";
	}
	
	public double calculateIncome() {
		return salary;
	}
	
	
	
}
