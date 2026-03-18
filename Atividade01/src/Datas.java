public class Datas {
	private int dia, mes, ano;
	
	public Datas(int dia, int mes, int ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	
	public int getDia() {
        return dia;
    }
	
	public void setDia(int dia) {
        if (dia > 0 && dia <= 30) {
    		this.dia = dia;
        } else {
        	this.dia = 1;
        }
    }
	
	public int getMes() {
        return mes;
    }
	
	public void setMes(int mes) {
		if (mes > 0 && mes <= 12) {
    		this.mes = mes;
        } else {
        	this.mes = 1;
        }
    }
	
	public int getAno() {
        return ano;
    }
	
	public void setAno(int ano) {
		if (ano >= 1900) {
    		this.ano = ano;
        } else {
        	this.ano = 1;
        }
    }
	
	public void imprimirDados() {
        System.out.println("A data é: "+dia+" / "+mes+" / "+ano);
    }
}