package br.edu.ifspdcjo.ads.web2.employercontrol.model;

public class ComissionedEmployer extends Employer {

	protected double salesValue;
	protected double comissionPercentege;
	
	public ComissionedEmployer(String name, String cpf, double salesValue, double comissionPercentege) {
		super(name, cpf);
		this.salesValue = salesValue;
		this.comissionPercentege = comissionPercentege;
	}

	public double getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(double salesValue) {
		this.salesValue = salesValue;
	}

	public double getcomissionPercentege() {
		return comissionPercentege;
	}

	public void setcomissionPercentege(double comissionPercentege) {
		this.comissionPercentege = comissionPercentege;
	}

	@Override
	public String toString() {
		return "ComissionedEmployer "
		  + "\n[Valor das Vendas       = " + salesValue + 
		     "\nPercentual de Comissão = " + comissionPercentege + 
		     "\nNome                   = " + name
		   + "\nCPF                    = " + cpf + "]";
	}
	
	@Override
	public double calculateIncome() {
		return salesValue * (comissionPercentege / 100);
	}

}
