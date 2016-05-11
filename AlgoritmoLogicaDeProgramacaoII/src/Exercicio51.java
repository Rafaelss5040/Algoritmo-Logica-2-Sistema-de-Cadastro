import java.awt.Color;
import java.rmi.registry.LocateRegistry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio51 {

	static JFrame janela = new JFrame();
	static JFrame jCadastro = new JFrame();
	static JPanel tela = new JPanel();
	static JPanel telaCad = new JPanel();
	
	static JButton botao1 = new JButton("Cadastrar Cliente ");
	static JButton botao2 = new JButton("atualizar Cliente ");
	static JButton botao3 = new JButton("Excluir Cliente ");
	static JButton botao4 = new JButton("Consultar cliente");
	
	static JLabel textoNome = new JLabel("Nome");
	static JTextField escreverNome = new JTextField();
	static JLabel textoSobrenome = new JLabel("Sobrenome");
	static JTextField escreverSobrenome = new JTextField();
	
	
	

	public static void main(String[] args) {

		janelaCadastro();

	}

	// imprime uma caixa de edialogo
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
		executarBotao1();
	}

static void executarBotao1 () {
	
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
	
	
	

	static void janelaCadastro(){
		
		jCadastro.setTitle("Cadastrar Cliente");
		jCadastro.setSize(550, 615);
		jCadastro.setLocationRelativeTo(null);
		jCadastro.setResizable(false);
		jCadastro.setVisible(true);
		jCadastro.add(telaCad);
		telaCadastro();
	}

	static void telaCadastro(){
		telaCad.setBackground(Color.LIGHT_GRAY);
		telaCad.setLayout(null);
		telaCad.add(textoNome);
		telaCad.add(escreverNome);
		telaCad.add(textoSobrenome);
		telaCad.add(escreverSobrenome);
		
		cadastarNome();
		cadastarSobrenome();
		
	}

	static void cadastarNome(){
		textoNome.setLocation(25, 45);
		textoNome.setSize(150,10);
		textoNome.setVisible(true);
		textoNome.setLayout(null);
		
		escreverNome.setLocation(80, 40);
		escreverNome.setSize(100,25);
		escreverNome.setVisible(true);
		
	}

	static void cadastarSobrenome(){
		textoSobrenome.setLocation(225, 45);
		textoSobrenome.setSize(200,10);
		textoSobrenome.setVisible(true);
		textoSobrenome.setLayout(null);
		
		escreverSobrenome.setLocation(310, 40);
		escreverSobrenome.setSize(215,25);
		escreverSobrenome.setVisible(true);
	}
}
