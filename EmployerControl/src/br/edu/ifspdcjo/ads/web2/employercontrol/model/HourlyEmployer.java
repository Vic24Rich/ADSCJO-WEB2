package br.edu.ifspdcjo.ads.web2.employercontrol.model;

public class HourlyEmployer extends Employer {

	private int numberOfHoursWorked;
	private double valueHoursWorked;
	
	public HourlyEmployer(String name, String cpf, int numberOfHoursWorked, double valueHoursWorked) {
		super(name, cpf);
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.valueHoursWorked = valueHoursWorked;
	}

	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public double getValueHoursWorked() {
		return valueHoursWorked;
	}

	public void setValueHoursWorked(double valueHoursWorked) {
		this.valueHoursWorked = valueHoursWorked;
	}

	@Override
	public String toString() {
		return "Empregado Banco de horas " +
			"\n[Numero de horas trabalhas = " + numberOfHoursWorked + 
			 "\nValor da hora trabalhada  = " + valueHoursWorked
		   + "\nNome                      = " + name + 
		     "\nCPF                       = " + cpf + "]";
	}
	
	@Override
	public double calculateIncome() {
		return numberOfHoursWorked * valueHoursWorked;
	}
	

}
