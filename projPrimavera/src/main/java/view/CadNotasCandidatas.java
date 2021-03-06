package view;

import javax.swing.*;

import controller.AvaliacaoJpaDAO;
import controller.CandidatoJpaDAO;
import model.Candidatos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CadNotasCandidatas extends JFrame{
	public CadNotasCandidatas() 
	{
		super("Cadastro de Notas");
    	Container tela = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(null);
    	
		JLabel lblMenu = new JLabel("Candidatas");
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
		
		DefaultListModel list1 = new DefaultListModel();
		
		final JList list = new JList(list1);
		list.setFont(new Font("Calibri", Font.PLAIN, 25));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		
		List<Candidatos> cad = CandidatoJpaDAO.getInstance().findSexF();
		for(int i = 0; i < cad.size(); i++) {
			list1.add(i,cad.get(0).getNome());
		}
		
		JScrollPane jscroll = new JScrollPane(list);
		
		ImageIcon imagem = new ImageIcon("imgCadCandidatos.png");
	    Image img = imagem.getImage();
	    imagem = new ImageIcon(img);
	    JLabel fundo = new JLabel(imagem);
	   
	    JLabel Postura = new JLabel("Postura:");
	    Postura.setForeground(Color.BLACK);
	    Postura.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbPostura = new JTextField("");
		txbPostura.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel Charme = new JLabel("Charme:");
		Charme.setForeground(Color.BLACK);
		Charme.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbCharme = new JTextField("");
		txbCharme.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel Simpatia = new JLabel("Simpatia:");
		Simpatia.setForeground(Color.BLACK);
		Simpatia.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbSimpatia = new JTextField("");
		txbSimpatia.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel Desenvoltura = new JLabel("Desenvoltura:");
		Desenvoltura.setForeground(Color.BLACK);
		Desenvoltura.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbDesenvoltura = new JTextField("");
		txbDesenvoltura.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel Elegancia = new JLabel("Elegância:");
		Elegancia.setForeground(Color.BLACK);
		Elegancia.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbElegancia = new JTextField("");
		txbElegancia.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel TrajePrimavera = new JLabel("Traje de primavera:");
		TrajePrimavera.setForeground(Color.BLACK);
		TrajePrimavera.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbTrajePrimavera = new JTextField("");
		txbTrajePrimavera.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel TrajeGala = new JLabel("Traje de gala:");
		TrajeGala.setForeground(Color.BLACK);
		TrajeGala.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbTrajeGala = new JTextField("");
		txbTrajeGala.setFont(new Font("Calibri", Font.PLAIN, 25));
		
	    JButton Login = new JButton("Cadastrar");
		Login.setBackground(Color.BLACK);
		Login.setBorderPainted(false);
		Login.setFont(new Font("Calibri", Font.PLAIN, 25));
		Login.setForeground(Color.WHITE);
	    
		Login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					AvaliacaoJpaDAO instance = AvaliacaoJpaDAO.getInstance();
					model.Avaliacao Avaliacao = new model.Avaliacao();
					if(list.isSelectionEmpty()){
						JOptionPane.showMessageDialog(null,"Selecione uma candidata para avaliar!");
					}else {
						Avaliacao.setIdCand(list.getSelectedIndex());
						Avaliacao.setIdJur(1);
						Avaliacao.setpostura(txbPostura.getText());
						Avaliacao.setCharme(txbCharme.getText());
						Avaliacao.setSimpatia(txbSimpatia.getText());
						Avaliacao.setDesenvoltura(txbDesenvoltura.getText());
						Avaliacao.setElegancia(txbElegancia.getText());
						Avaliacao.setTrajePrimavera(txbTrajePrimavera.getText());
						Avaliacao.setTrajeGala(txbTrajeGala.getText());
					}
					instance.persist(Avaliacao);
					JOptionPane.showMessageDialog(null,"Incluído!");
					txbPostura.setText("");
					txbCharme.setText(""); 
					txbSimpatia.setText(""); 
					txbDesenvoltura.setText(""); 
					txbElegancia.setText(""); 
					txbTrajePrimavera.setText(""); 
					txbTrajeGala.setText(""); 
				} catch (Exception e1) {
					e1.printStackTrace();
				}
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
		Login.setBounds(900, 725, 150, 40);
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