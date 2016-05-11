import java.awt.Color;
import java.rmi.registry.LocateRegistry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Exercicio51 {

	static JFrame janela = new JFrame();
	static JPanel tela = new JPanel();
	static JButton botao1 = new JButton("Cadastrar Cliente ");
	static JButton botao2 = new JButton("atualizar Cliente ");
	static JButton botao3 = new JButton("Excluir Cliente ");
	static JButton botao4 = new JButton("Consultar cliente");

	public static void main(String[] args) {

		janela();

	}

	// imprime uma caixa d edialogo
	static void imprimirMensagem() {
		JOptionPane.showMessageDialog(tela, "Bem vindo ao Sistema de Cadastro");

	}

	static void janela() {

		janela.setTitle("Sistema de Cadastro ");
		janela.setSize(500, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setVisible(true);
		janela.add(tela);
		tela();

	}

	static void tela() {
		tela.setBackground(Color.lightGray);
		tela.setLayout(null);
		tela.add(botao1);
		tela.add(botao2);
		tela.add(botao3);
		tela.add(botao4);
		botao1();
		botao2();
		botao3();
		botao4();
	}

static void botao1() {
		botao1.setSize(170, 50);
		botao1.setLocation(150, 15);
		botao1.setVisible(true);
		botao1.setBackground(Color.white);
	}
	
	static void botao2() {
		botao2.setSize(170, 50);
		botao2.setLocation(150, 100);
		botao2.setVisible(true);
		botao2.setBackground(Color.white);
	}

	
	static void botao3(){
		botao3.setSize(170, 50);
		botao3.setLocation(150, 200);
		botao3.setVisible(true);
		botao3.setBackground(Color.white);

		
	}
	
	static void botao4(){
		botao4.setSize(170, 50);
		botao4.setLocation(150, 300);
		botao4.setVisible(true);
		botao4.setBackground(Color.white);
	}
	
	
	static void telaCadastro(){
		
	}
	
	
}
