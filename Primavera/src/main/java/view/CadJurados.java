package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadJurados extends JFrame{
	public CadJurados() 
	{
		super("Cadastro de Jurados");
    	Container tela = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(null);
    	
		JLabel lblMenu = new JLabel("Jurados");
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setFont(new Font("Algerian", Font.PLAIN, 66));
		
		JLabel lblTitulo = new JLabel("Escolher Jurado:");
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Calibri", Font.PLAIN, 35));
		
		JLabel lblTitulo2 = new JLabel("Cadastrar Jurado:");
		lblTitulo2.setForeground(Color.BLACK);
		lblTitulo2.setFont(new Font("Calibri", Font.PLAIN, 35));
		
		JButton Voltar = new JButton("Voltar");
		Voltar.setContentAreaFilled(false);
		Voltar.setBorderPainted(false);
		Voltar.setFont(new Font("Calibri", Font.PLAIN, 20));
		Voltar.setForeground(Color.WHITE);
		
		DefaultListModel Jurados = new DefaultListModel();
		JList list = new JList(Jurados);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		Jurados.add(0,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(1,"YYYYYYYYYYYYYYY YY YYYYYYYY");
		Jurados.add(2,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(3,"zzzzzz XXXXXXXXX zz");
		Jurados.add(4,"xxx vvvvvvvvvvvv XXXXXXX");
		Jurados.add(5,"XXXXvXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(6,"vvvvvvvvvvvvvv XXXXXXXXX XXXXXXX");
		Jurados.add(7,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(8,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(9,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(10,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(11,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(12,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(13,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(14,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(15,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(16,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(17,"YYYYYYYYYYYYYYY YY YYYYYYYY");
		Jurados.add(18,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(19,"zzzzzz XXXXXXXXX zz");
		Jurados.add(20,"xxx vvvvvvvvvvvv XXXXXXX");
		Jurados.add(21,"XXXXvXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(22,"vvvvvvvvvvvvvv XXXXXXXXX XXXXXXX");
		Jurados.add(23,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(24,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(25,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(26,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(27,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(28,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(29,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(30,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Jurados.add(31,"ultimo XXXXXXXXX XXXXXXX");
		JScrollPane jscroll = new JScrollPane(list);
		
		ImageIcon imagem = new ImageIcon("imgCadCandidatos.png");
	    Image img = imagem.getImage();
	    imagem = new ImageIcon(img);
	    JLabel fundo = new JLabel(imagem);
	   
	    JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbNome = new JTextField("");
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbSenha = new JTextField();
	    
	    JButton Login = new JButton("Cadastrar");
		Login.setBackground(Color.BLACK);
		Login.setBorderPainted(false);
		Login.setFont(new Font("Calibri", Font.PLAIN, 25));
		Login.setForeground(Color.WHITE);
	    
		Login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
	    });
		
		Voltar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Menu Menu = new Menu();
				Menu.setVisible(true);
				setVisible(false);
				dispose();
			}
	    });
		
	    fundo.setBounds(0, 0, 1427, 900);
	    lblMenu.setBounds(550, 100, 410, 100);
	    lblTitulo.setBounds(250, 225, 410, 100);
	    lblTitulo2.setBounds(730, 225, 410, 100);
		jscroll.setBounds(250, 300, 300, 450);
		lblNome.setBounds(730, 350, 250, 50);
		txbNome.setBounds(730, 400, 400, 25);
		lblSenha.setBounds(730, 450, 250, 50);
		txbSenha.setBounds(730, 500, 400, 25);
		Login.setBounds(850, 600, 150, 40);
		Voltar.setBounds(650, 850, 100, 50);
		
	    tela.add(lblTitulo);
	    tela.add(lblTitulo2);
	    tela.add(lblNome);
		tela.add(Voltar);
		tela.add(txbNome);
		tela.add(lblSenha);
		tela.add(txbSenha);
		tela.add(Login);
	    tela.add(jscroll);
		tela.add(lblMenu);
		tela.add(fundo);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated (true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
}