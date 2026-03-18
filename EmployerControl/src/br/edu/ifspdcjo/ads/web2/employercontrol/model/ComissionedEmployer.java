package br.edu.ifspdcjo.ads.web2.employercontrol.model;

public class ComissionedEmployer extends Employer {

	protected double salesValue;
	protected double comissionSales;
	
	public ComissionedEmployer(String name, String cpf, double salesValue, double comissionSales) {
		super(name, cpf);
		this.salesValue = salesValue;
		this.comissionSales = comissionSales;
	}

	public double getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(double salesValue) {
		this.salesValue = salesValue;
	}

	public double getComissionSales() {
		return comissionSales;
	}

	public void setComissionSales(double comissionSales) {
		this.comissionSales = comissionSales;
	}

	@Override
	public String toString() {
		return "ComissionedEmployer "
		  + "\n[Valor das Vendas       = " + salesValue + 
		     "\nPercentual de Comissão = " + comissionSales + 
		     "\nNome                   = " + name
		   + "\nCPF                    = " + cpf + "]";
	}
	
	@Override
	public double calculateIncome() {
		return salesValue * comissionSales * 100;
	}

}
