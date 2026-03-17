import javax.swing.JOptionPane;

public class Main2 {

	public static void main(String[] args) {
		int numero1, numero2, soma;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º numero inteiro: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º numero inteiro: "));
		
		soma = numero1  + numero2;
		
		JOptionPane.showMessageDialog(null, "Soma = " + soma);

	}

}
