package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConNotasCandidatas extends JFrame{
	public ConNotasCandidatas() 
	{
		super("Cadastro de Notas");
    	Container tela = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(null);
    	
		JLabel lblMenu = new JLabel("Notas");
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setFont(new Font("Algerian", Font.PLAIN, 66));
		
		JLabel lblTitulo = new JLabel("Escolher Candidata:");
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Calibri", Font.PLAIN, 35));
		
		JLabel lblTitulo2 = new JLabel("Avaliação: ");
		lblTitulo2.setForeground(Color.BLACK);
		lblTitulo2.setFont(new Font("Calibri", Font.PLAIN, 35));
		
		JButton Voltar = new JButton("Voltar");
		Voltar.setContentAreaFilled(false);
		Voltar.setBorderPainted(false);
		Voltar.setFont(new Font("Calibri", Font.PLAIN, 20));
		Voltar.setForeground(Color.WHITE);
		
		DefaultListModel Candidatas = new DefaultListModel();
		JList list = new JList(Candidatas);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		Candidatas.add(0,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(1,"YYYYYYYYYYYYYYY YY YYYYYYYY");
		Candidatas.add(2,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(3,"zzzzzz XXXXXXXXX zz");
		Candidatas.add(4,"xxx vvvvvvvvvvvv XXXXXXX");
		Candidatas.add(5,"XXXXvXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(6,"vvvvvvvvvvvvvv XXXXXXXXX XXXXXXX");
		Candidatas.add(7,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(8,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(9,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(10,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(11,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(12,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(13,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(14,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(15,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(16,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(17,"YYYYYYYYYYYYYYY YY YYYYYYYY");
		Candidatas.add(18,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(19,"zzzzzz XXXXXXXXX zz");
		Candidatas.add(20,"xxx vvvvvvvvvvvv XXXXXXX");
		Candidatas.add(21,"XXXXvXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(22,"vvvvvvvvvvvvvv XXXXXXXXX XXXXXXX");
		Candidatas.add(23,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(24,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(25,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(26,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(27,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(28,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(29,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(30,"XXXXXXXXX XXXXXXXXX XXXXXXX");
		Candidatas.add(31,"ultimo XXXXXXXXX XXXXXXX");
		JScrollPane jscroll = new JScrollPane(list);
		
		ImageIcon imagem = new ImageIcon("imgCandidatosNotas.png");
	    Image img = imagem.getImage();
	    imagem = new ImageIcon(img);
	    JLabel fundo = new JLabel(imagem);
	   
	    JLabel Postura = new JLabel("Postura:");
	    Postura.setForeground(Color.BLACK);
	    Postura.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbPostura = new JTextField("");
		JTextField txbPostura2 = new JTextField("");
		
		JLabel Charme = new JLabel("Charme:");
		Charme.setForeground(Color.BLACK);
		Charme.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbCharme = new JTextField("");
		JTextField txbCharme2 = new JTextField("");
		
		JLabel Simpatia = new JLabel("Simpatia:");
		Simpatia.setForeground(Color.BLACK);
		Simpatia.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbSimpatia = new JTextField("");
		JTextField txbSimpatia2 = new JTextField("");
		
		JLabel Desenvoltura = new JLabel("Desenvoltura:");
		Desenvoltura.setForeground(Color.BLACK);
		Desenvoltura.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbDesenvoltura = new JTextField("");
		JTextField txbDesenvoltura2 = new JTextField("");
		
		JLabel Elegancia = new JLabel("Elegância:");
		Elegancia.setForeground(Color.BLACK);
		Elegancia.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbElegancia = new JTextField("");
		JTextField txbElegancia2 = new JTextField("");
		
		JLabel TrajePrimavera = new JLabel("Traje de primavera:");
		TrajePrimavera.setForeground(Color.BLACK);
		TrajePrimavera.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbTrajePrimavera = new JTextField("");
		JTextField txbTrajePrimavera2 = new JTextField("");
		
		JLabel TrajeGala = new JLabel("Traje de gala:");
		TrajeGala.setForeground(Color.BLACK);
		TrajeGala.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbTrajeGala = new JTextField("");
		JTextField txbTrajeGala2 = new JTextField("");
		
	    JButton Alterar = new JButton("Alterar");
	    Alterar.setContentAreaFilled(false);
	    Alterar.setBorderPainted(false);
	    Alterar.setFont(new Font("Calibri", Font.PLAIN, 25));
	    Alterar.setForeground(Color.WHITE);
	    
	    Alterar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
	    });
		
		Voltar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CandidatosJur CandidatosJur = new CandidatosJur();
				CandidatosJur.setVisible(true);
				setVisible(false);
				dispose();
			}
	    });
		
	    fundo.setBounds(0, 0, 1427, 900);
	    Postura.setBounds(730, 350, 250, 50);
		txbPostura.setBounds(1008, 363, 50, 25);
		txbPostura2.setBounds(1170, 363, 50, 25);
		Charme.setBounds(730, 400, 250, 50);
		txbCharme.setBounds(1008, 413, 50, 25);
		txbCharme2.setBounds(1170, 413, 50, 25);
		Simpatia.setBounds(730, 450, 250, 50);
		txbSimpatia.setBounds(1008, 463, 50, 25);
		txbSimpatia2.setBounds(1170, 463, 50, 25);
		Desenvoltura.setBounds(730, 500, 250, 50);
		txbDesenvoltura.setBounds(1008, 513, 50, 25);
		txbDesenvoltura2.setBounds(1170, 513, 50, 25);
		Elegancia.setBounds(730, 550, 250, 50);
		txbElegancia.setBounds(1008, 563, 50, 25);
		txbElegancia2.setBounds(1170, 563, 50, 25);
		TrajePrimavera.setBounds(730, 600, 250, 50);
		txbTrajePrimavera.setBounds(1008, 613, 50, 25);
		txbTrajePrimavera2.setBounds(1170, 613, 50, 25);
		TrajeGala.setBounds(730, 650, 250, 50);
		txbTrajeGala.setBounds(1008, 663, 50, 25);
		txbTrajeGala2.setBounds(1170, 663, 50, 25);
		lblMenu.setBounds(550, 100, 410, 100);
	    lblTitulo.setBounds(250, 225, 410, 100);
	    lblTitulo2.setBounds(730, 225, 410, 100);
		jscroll.setBounds(250, 300, 300, 450);
		Alterar.setBounds(1040, 725, 150, 40);
		Voltar.setBounds(650, 850, 100, 50);
		
	    tela.add(lblTitulo);
	    tela.add(lblTitulo2);
	    tela.add(Postura);
		tela.add(txbPostura);
		tela.add(txbPostura2);
		tela.add(Charme);
		tela.add(txbCharme);
		tela.add(txbCharme2);
		tela.add(Simpatia);
		tela.add(txbSimpatia);
		tela.add(txbSimpatia2);
		tela.add(Desenvoltura);
		tela.add(txbDesenvoltura);
		tela.add(txbDesenvoltura2);
		tela.add(Elegancia);
		tela.add(txbElegancia);
		tela.add(txbElegancia2);
		tela.add(TrajePrimavera);
		tela.add(txbTrajePrimavera);
		tela.add(txbTrajePrimavera2);
		tela.add(TrajeGala);
		tela.add(txbTrajeGala);
		tela.add(txbTrajeGala2);
		tela.add(Voltar);
		tela.add(Alterar);
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