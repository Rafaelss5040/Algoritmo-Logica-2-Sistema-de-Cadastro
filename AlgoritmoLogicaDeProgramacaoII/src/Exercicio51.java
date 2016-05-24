import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Exercicio51 {

	static JFrame janela = new JFrame();
	static JFrame jCadastro = new JFrame();
	static JPanel tela = new JPanel();
	static JPanel telaCad = new JPanel();

	static JButton botaoCadastrar = new JButton("Cadastrar Cliente");
	static JButton botaoAtualizar = new JButton("Atualizar Cliente");
	static JButton botaoExcluir = new JButton("Excluir Cliente");
	static JButton botaoConsultar = new JButton("Consultar cliente");

	static JButton botaoSalvar = new JButton("Salvar");
	static JButton botaoCancelar = new JButton("Cancelar");

	public static void main(String[] args) {
		janelaInicial();

	}

	static void janelaInicial() {

		janela.setTitle("Sistema de Cadastro ");
		janela.setSize(500, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setVisible(true);
		janela.add(tela);
		telaInicial();
		acaoBotao();
	}

	static void telaInicial() {
		tela.setBackground(Color.lightGray);
		tela.setLayout(null);
		tela.add(botaoCadastrar).setBounds(150, 15, 170, 50);
		botaoCadastrar.setBackground(Color.white);
		tela.add(botaoAtualizar).setBounds(150, 100, 170, 50);
		botaoAtualizar.setBackground(Color.white);
		tela.add(botaoExcluir).setBounds(150, 200, 170, 50);
		botaoExcluir.setBackground(Color.white);
		tela.add(botaoConsultar).setBounds(150, 300, 170, 50);
		botaoConsultar.setBackground(Color.white);

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

		// Define as máscaras
		MaskFormatter mascaraCep = null;
		MaskFormatter mascaraNome = null;
		MaskFormatter mascaraSobrenome = null;
		MaskFormatter mascaraTel = null;
		MaskFormatter mascaraCpf = null;
		MaskFormatter mascaraRg = null;
		MaskFormatter mascaraData = null;
		MaskFormatter mascaraEmail = null;

		try {
			mascaraNome = new MaskFormatter("UUUUUUUUUUUUUUU");
			mascaraSobrenome = new MaskFormatter("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
			mascaraCep = new MaskFormatter("#####-###");
			mascaraTel = new MaskFormatter("(##)####-####");
			mascaraCpf = new MaskFormatter("###.###.###-##");
			mascaraRg = new MaskFormatter("##.###.###-#");
			mascaraEmail = new MaskFormatter("******************************");
			mascaraData = new MaskFormatter("##/##/####");
			mascaraCep.setPlaceholderCharacter('_');
			mascaraTel.setPlaceholderCharacter('_');
			mascaraCpf.setPlaceholderCharacter('_');
			mascaraRg.setPlaceholderCharacter('_');
			mascaraData.setPlaceholderCharacter('_');
		} catch (ParseException excp) {
			System.err.println("Erro na formatação: " + excp.getMessage());
			System.exit(-1);
		}

		JLabel textoNome = new JLabel("Nome:");
		JLabel textoSobrenome = new JLabel("Sobrenome:");
		JLabel textEmail = new JLabel("e-mail:");
		JLabel texTelefone = new JLabel("Telefone:");
		JLabel textCelular = new JLabel("Celular:");
		JLabel textRg = new JLabel("RG:");
		JLabel textCpf = new JLabel("CPF:");
		JLabel textDataNasc = new JLabel("Data de nascimento:");
		JFormattedTextField escreverNome = new JFormattedTextField(mascaraNome);
		JFormattedTextField escreverSobrenome = new JFormattedTextField(mascaraSobrenome);
		JFormattedTextField escreverEmail = new JFormattedTextField(mascaraEmail);

		JFormattedTextField escreverTelefone = new JFormattedTextField(mascaraTel);
		JFormattedTextField escreverCelular = new JFormattedTextField(mascaraTel);
		JFormattedTextField escreverRg = new JFormattedTextField(mascaraRg);
		JFormattedTextField escreverCpf = new JFormattedTextField(mascaraCpf);
		JFormattedTextField escreverDataNasc = new JFormattedTextField(mascaraData);

		telaCad.setBackground(Color.LIGHT_GRAY);
		telaCad.setLayout(null);

		// dados pessoais
		telaCad.add(textoNome).setBounds(25, 55, 150, 10);
		telaCad.add(escreverNome).setBounds(25, 70, 100, 25);
		telaCad.add(textoSobrenome).setBounds(190, 55, 200, 10);
		telaCad.add(escreverSobrenome).setBounds(190, 70, 215, 25);
		telaCad.add(textCpf).setBounds(25, 110, 50, 10);
		telaCad.add(escreverCpf).setBounds(25, 125, 95, 25);
		telaCad.add(textRg).setBounds(190, 110, 50, 10);
		telaCad.add(escreverRg).setBounds(190, 125, 95, 25);
		telaCad.add(textDataNasc).setBounds(350, 110, 250, 10);
		telaCad.add(escreverDataNasc).setBounds(350, 125, 70, 25);

		// dados contato
		telaCad.add(textEmail).setBounds(25, 210, 50, 10);
		telaCad.add(escreverEmail).setBounds(25, 225, 290, 25);
		telaCad.add(texTelefone).setBounds(25, 160, 100, 10);
		telaCad.add(escreverTelefone).setBounds(25, 175, 95, 25);
		telaCad.add(textCelular).setBounds(350, 160, 150, 10);
		telaCad.add(escreverCelular).setBounds(350, 175, 95, 25);

		telaCad.add(botaoSalvar).setBounds(25, 525, 75, 25);
		telaCad.add(botaoCancelar).setBounds(450, 525, 90, 25);

	}

	static void JanelaAtualizar() {
		JFrame jAtualizar = new JFrame("Atualização de Clientes");
		jAtualizar.setTitle("Cadastrar Cliente");
		jAtualizar.setSize(580, 615);
		jAtualizar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jAtualizar.setLocationRelativeTo(null);
		jAtualizar.setResizable(true);
		jAtualizar.setVisible(true);
		// Falta terminar essa interface

	}

	static void JanelaExcluir() {
		JFrame jExcluir = new JFrame("Excluir Cliente");
		jExcluir.setTitle("Excluir Cliente");
		jExcluir.setSize(580, 615);
		jExcluir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jExcluir.setLocationRelativeTo(null);
		jExcluir.setResizable(true);
		jExcluir.setVisible(true);
		exibirJanelaExcluir();
		// falta terminar essa interface
	}

	static void exibirJanelaExcluir() {

	}

	static void acaoBotao() {
		botaoCadastrar.addActionListener(new ActionListener() {

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
				janelaInicial();

			}
		});
		botaoAtualizar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				janela.setVisible(false);
				JanelaAtualizar();
			}
		});
		botaoExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				janela.setVisible(false);
				JanelaExcluir();
			}
		});
	}

}
