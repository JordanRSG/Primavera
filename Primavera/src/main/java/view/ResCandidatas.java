package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResCandidatas extends JFrame{
	public ResCandidatas() 
	{
		super("Resultados");
    	Container tela = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(null);
    	
		JLabel lblMenu = new JLabel("Resultados");
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
		
		ImageIcon imagem = new ImageIcon("imgCadCandidatos.png");
	    Image img = imagem.getImage();
	    imagem = new ImageIcon(img);
	    JLabel fundo = new JLabel(imagem);
	   
	    JLabel Postura = new JLabel("Postura:");
	    Postura.setForeground(Color.BLACK);
	    Postura.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbPostura = new JTextField("");
		
		JLabel Charme = new JLabel("Charme:");
		Charme.setForeground(Color.BLACK);
		Charme.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbCharme = new JTextField("");
		
		JLabel Simpatia = new JLabel("Simpatia:");
		Simpatia.setForeground(Color.BLACK);
		Simpatia.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbSimpatia = new JTextField("");
		
		JLabel Desenvoltura = new JLabel("Desenvoltura:");
		Desenvoltura.setForeground(Color.BLACK);
		Desenvoltura.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbDesenvoltura = new JTextField("");
		
		JLabel Elegancia = new JLabel("Elegância:");
		Elegancia.setForeground(Color.BLACK);
		Elegancia.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbElegancia = new JTextField("");
		
		JLabel TrajePrimavera = new JLabel("Traje de primavera:");
		TrajePrimavera.setForeground(Color.BLACK);
		TrajePrimavera.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbTrajePrimavera = new JTextField("");
		
		JLabel TrajeGala = new JLabel("Traje de gala:");
		TrajeGala.setForeground(Color.BLACK);
		TrajeGala.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbTrajeGala = new JTextField("");
		
		JLabel NotaFinal = new JLabel("Nota Final:");
		NotaFinal.setForeground(Color.BLACK);
		NotaFinal.setFont(new Font("Calibri", Font.PLAIN, 25));
		JTextField txbNotaFinal = new JTextField("");
	    
	    JButton Gerar = new JButton("Gerar Relatório");
	    Gerar.setBackground(Color.BLACK);
	    Gerar.setBorderPainted(false);
	    Gerar.setFont(new Font("Calibri", Font.PLAIN, 25));
	    Gerar.setForeground(Color.WHITE);
	    
	    Gerar.addActionListener(new ActionListener(){
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
		txbPostura.setBounds(950, 363, 50, 25);
		Charme.setBounds(730, 400, 250, 50);
		txbCharme.setBounds(950, 413, 50, 25);
		Simpatia.setBounds(730, 450, 250, 50);
		txbSimpatia.setBounds(950, 463, 50, 25);
		Desenvoltura.setBounds(730, 500, 250, 50);
		txbDesenvoltura.setBounds(950, 513, 50, 25);
		NotaFinal.setBounds(1075, 450, 250, 50);
		txbNotaFinal.setBounds(1100, 500, 50, 25);
		Elegancia.setBounds(730, 550, 250, 50);
		txbElegancia.setBounds(950, 563, 50, 25);
		TrajePrimavera.setBounds(730, 600, 250, 50);
		txbTrajePrimavera.setBounds(950, 613, 50, 25);
		TrajeGala.setBounds(730, 650, 250, 50);
		txbTrajeGala.setBounds(950, 663, 50, 25);
		lblMenu.setBounds(550, 100, 410, 100);
	    lblTitulo.setBounds(250, 225, 410, 100);
	    lblTitulo2.setBounds(730, 225, 410, 100);
		jscroll.setBounds(250, 300, 300, 450);
		Gerar.setBounds(900, 725, 250, 40);
		Voltar.setBounds(650, 850, 100, 50);
		
	    tela.add(lblTitulo);
	    tela.add(lblTitulo2);
	    tela.add(Postura);
		tela.add(txbPostura);
		tela.add(Charme);
		tela.add(txbCharme);
		tela.add(Simpatia);
		tela.add(txbSimpatia);
		tela.add(Desenvoltura);
		tela.add(txbDesenvoltura);
		tela.add(Elegancia);
		tela.add(txbElegancia);
		tela.add(TrajePrimavera);
		tela.add(txbTrajePrimavera);
		tela.add(TrajeGala);
		tela.add(txbTrajeGala);
		tela.add(Voltar);
		tela.add(Gerar);
		tela.add(NotaFinal);
		tela.add(txbNotaFinal);
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