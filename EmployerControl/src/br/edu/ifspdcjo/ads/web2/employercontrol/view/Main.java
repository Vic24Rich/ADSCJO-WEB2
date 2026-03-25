package br.edu.ifspdcjo.ads.web2.employercontrol.view;

import br.edu.ifspdcjo.ads.web2.employercontrol.model.ComissionedEmployer;
import br.edu.ifspdcjo.ads.web2.employercontrol.model.Employer;
import br.edu.ifspdcjo.ads.web2.employercontrol.model.HourlyEmployer;
import br.edu.ifspdcjo.ads.web2.employercontrol.model.SalariedAndComissionedEmployer;
import br.edu.ifspdcjo.ads.web2.employercontrol.model.SalariedEmployer;

public class Main {

	public static void main(String[] args) {
		
		Employer empregado1 = new SalariedEmployer("Ana ", "1234", 2500);
		Employer empregado2 = new HourlyEmployer("João", "4321", 220, 12.5);
		Employer empregado3 = new ComissionedEmployer("Maria", "6543", 50000, 7.5);
		Employer empregado4 = new SalariedAndComissionedEmployer("Mario", "6789", 50000, 7.5, 2500);
		
		System.out.println(empregado1);
		System.out.println(empregado2);
		System.out.println(empregado3);
		System.out.println(empregado4);
		
		System.out.println("Rendimentos  = R$" + empregado1.calculateIncome());
		System.out.println("Rendimentos  = R$" + empregado2.calculateIncome());
		System.out.println("Rendimentos  = R$" + empregado3.calculateIncome());
		System.out.println("Rendimentos  = R$" + empregado4.calculateIncome());
		
		

	}

}
