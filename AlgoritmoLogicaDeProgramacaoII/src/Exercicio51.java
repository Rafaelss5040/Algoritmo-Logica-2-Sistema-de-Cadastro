import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio51 {

	static JFrame janela = new JFrame();
	static JFrame jCadastro = new JFrame();
	static JPanel tela = new JPanel();
	static JPanel telaCad = new JPanel();

	static JButton botCadastrar = new JButton("Cadastrar Cliente");
	static JButton botao2 = new JButton("Atualizar Cliente");
	static JButton botao3 = new JButton("Excluir Cliente");
	static JButton botao4 = new JButton("Consultar cliente");

	static JButton botaoSalvar = new JButton("Salvar");
	static JButton botaoCancelar = new JButton("Cancelar");

	public static void main(String[] args) {
		janela();

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
		acaoBotao();
	}

	static void tela() {
		tela.setBackground(Color.lightGray);
		tela.setLayout(null);
		tela.add(botCadastrar).setBounds(150, 15, 170, 50);
		botCadastrar.setBackground(Color.white);
		tela.add(botao2).setBounds(150, 100, 170, 50);
		botao2.setBackground(Color.white);
		tela.add(botao3).setBounds(150, 200, 170, 50);
		botao3.setBackground(Color.white);
		tela.add(botao4).setBounds(150, 300, 170, 50);
		botao4.setBackground(Color.white);

	}

	static void janelaCadastro() {

		jCadastro.setTitle("Cadastrar Cliente");
		jCadastro.setSize(580, 615);
		jCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jCadastro.setLocationRelativeTo(null);
		jCadastro.setResizable(false);
		jCadastro.setVisible(true);
		jCadastro.add(telaCad);
		telaCadastro();
		acaoBotao();
	}

	static void telaCadastro() {
		JLabel textoNome = new JLabel("Nome:");
		JLabel textoSobrenome = new JLabel("Sobrenome:");
		JLabel textEmail = new JLabel("e-mail:");
		JLabel texTelefone = new JLabel("Telefone:");
		JLabel textCelular = new JLabel("Celular:");
		JLabel textRg = new JLabel("RG:");
		JLabel textCpf = new JLabel("CPF:");
		JLabel textDataNasc = new JLabel("Data de nascimento:");
		JTextField escreverNome = new JTextField();
		JTextField escreverSobrenome = new JTextField();
		JTextField escreverEmail = new JTextField();

		JTextField escreverTelefone = new JTextField();
		JTextField escreverCelular = new JTextField();
		JTextField escreverRg = new JTextField();
		JTextField escreverCpf = new JTextField();
		JTextField escreverDataNasc = new JTextField();

		telaCad.setBackground(Color.LIGHT_GRAY);
		telaCad.setLayout(null);

		// dados pessoais
		telaCad.add(textoNome).setBounds(25, 35, 150, 10);
		telaCad.add(escreverNome).setBounds(25, 50, 100, 25);
		telaCad.add(textoSobrenome).setBounds(190, 35, 200, 10);
		telaCad.add(escreverSobrenome).setBounds(190, 50, 215, 25);
		telaCad.add(textCpf).setBounds(25, 90, 50, 10);
		telaCad.add(escreverCpf).setBounds(25, 105, 115, 25);
		telaCad.add(textRg).setBounds(190, 90, 50, 10);
		telaCad.add(escreverRg).setBounds(190, 105, 115, 25);
		telaCad.add(textDataNasc).setBounds(350, 90, 250, 10);

		// dados contato
		telaCad.add(escreverDataNasc).setBounds(350, 95, 115, 25);
		telaCad.add(textEmail).setBounds(25, 190, 50, 10);
		telaCad.add(escreverEmail).setBounds(25, 205, 290, 25);
		telaCad.add(texTelefone).setBounds(25, 140, 100, 10);
		telaCad.add(escreverTelefone).setBounds(25, 155, 115, 25);
		telaCad.add(textCelular).setBounds(350, 140, 150, 10);
		telaCad.add(escreverCelular).setBounds(350, 155, 115, 25);

		telaCad.add(botaoSalvar).setBounds(25, 525, 75, 25);
		telaCad.add(botaoCancelar).setBounds(450, 525, 90, 25);
		

	}

	static void acaoBotao() {
		botCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				janela.setVisible(false);
				janelaCadastro();
				
			}
		});
	botaoCancelar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			jCadastro.setVisible(false);
			janela();
			
			
		}
	});
	}

}
