package view;

import javax.swing.*;

import controller.AvaliacaoJpaDAO;
import controller.CandidatoJpaDAO;
import model.Avaliacao;
import model.Candidatos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ConNotasCandidatos extends JFrame{
	public ConNotasCandidatos() 
	{
		super("Cadastro de Notas");
    	Container tela = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(null);
    	
		JLabel lblMenu = new JLabel("Candidatos");
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setFont(new Font("Algerian", Font.PLAIN, 66));
		
		JLabel lblTitulo = new JLabel("Escolher Candidato:");
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
		
		List<Candidatos> cad = CandidatoJpaDAO.getInstance().findSexM();
		for(int i = 0; i < cad.size(); i++) {
			list1.add(i,cad.get(0).getNome());
		}
		
		JScrollPane jscroll = new JScrollPane(list);
		
		ImageIcon imagem = new ImageIcon("imgCandidatosNotas.png");
	    Image img = imagem.getImage();
	    imagem = new ImageIcon(img);
	    JLabel fundo = new JLabel(imagem);
	   
	    JLabel Postura = new JLabel("Postura:");
	    Postura.setForeground(Color.BLACK);
	    Postura.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbPostura = new JTextField("");
		final JTextField txbPostura2 = new JTextField("");
		txbPostura.setFont(new Font("Calibri", Font.PLAIN, 25));
		txbPostura2.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel Charme = new JLabel("Charme:");
		Charme.setForeground(Color.BLACK);
		Charme.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbCharme = new JTextField("");
		final JTextField txbCharme2 = new JTextField("");
		txbCharme.setFont(new Font("Calibri", Font.PLAIN, 25));
		txbCharme2.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel Simpatia = new JLabel("Simpatia:");
		Simpatia.setForeground(Color.BLACK);
		Simpatia.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbSimpatia = new JTextField("");
		final JTextField txbSimpatia2 = new JTextField("");
		txbSimpatia.setFont(new Font("Calibri", Font.PLAIN, 25));
		txbSimpatia2.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel Desenvoltura = new JLabel("Desenvoltura:");
		Desenvoltura.setForeground(Color.BLACK);
		Desenvoltura.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbDesenvoltura = new JTextField("");
		final JTextField txbDesenvoltura2 = new JTextField("");
		txbDesenvoltura.setFont(new Font("Calibri", Font.PLAIN, 25));
		txbDesenvoltura2.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel Elegancia = new JLabel("Elegância:");
		Elegancia.setForeground(Color.BLACK);
		Elegancia.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbElegancia = new JTextField("");
		final JTextField txbElegancia2 = new JTextField("");
		txbElegancia.setFont(new Font("Calibri", Font.PLAIN, 25));
		txbElegancia2.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel TrajePrimavera = new JLabel("Traje de primavera:");
		TrajePrimavera.setForeground(Color.BLACK);
		TrajePrimavera.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbTrajePrimavera = new JTextField("");
		final JTextField txbTrajePrimavera2 = new JTextField("");
		txbTrajePrimavera.setFont(new Font("Calibri", Font.PLAIN, 25));
		txbTrajePrimavera2.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel TrajeGala = new JLabel("Traje de gala:");
		TrajeGala.setForeground(Color.BLACK);
		TrajeGala.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbTrajeGala = new JTextField("");
		final JTextField txbTrajeGala2 = new JTextField("");
		txbTrajeGala.setFont(new Font("Calibri", Font.PLAIN, 25));
		txbTrajeGala2.setFont(new Font("Calibri", Font.PLAIN, 25));
		
	    JButton Alterar = new JButton("Alterar");
	    Alterar.setContentAreaFilled(false);
	    Alterar.setBorderPainted(false);
	    Alterar.setFont(new Font("Calibri", Font.PLAIN, 25));
	    Alterar.setForeground(Color.WHITE);
	    if(list.isSelectionEmpty()) {
	    }else{
	    	List<Avaliacao> ava = AvaliacaoJpaDAO.getInstance().findById(list.getSelectedIndex());
	 	    txbPostura.setText(ava.get(0).getPostura());
	 	    txbCharme.setText(ava.get(0).getCharme());
	 	    txbSimpatia.setText(ava.get(0).getSimpatia());
	 	    txbDesenvoltura.setText(ava.get(0).getDesenvoltura());
	 	    txbElegancia.setText(ava.get(0).getElegancia());
	 	    txbTrajePrimavera.setText(ava.get(0).getTrajePrimavera());
	 	    txbTrajeGala.setText(ava.get(0).getTrajeGala());
	    }
	    Alterar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					if(list.isSelectionEmpty()){
						JOptionPane.showMessageDialog(null,"Selecione um candidato!");
				    }else{
				    	AvaliacaoJpaDAO instance = AvaliacaoJpaDAO.getInstance();
				    	model.Avaliacao Avaliacao = new model.Avaliacao();
				    	List<Avaliacao> ava = AvaliacaoJpaDAO.getInstance().findById(list.getSelectedIndex());
				    	Avaliacao.setIdCand(list.getSelectedIndex());
				    	Avaliacao.setIdJur(1);
				    	Avaliacao.setpostura(txbPostura2.getText());
				    	Avaliacao.setCharme(txbCharme2.getText());
						Avaliacao.setSimpatia(txbSimpatia2.getText());
						Avaliacao.setDesenvoltura(txbDesenvoltura2.getText());
						Avaliacao.setElegancia(txbElegancia2.getText());
						Avaliacao.setTrajePrimavera(txbTrajePrimavera2.getText());
						Avaliacao.setTrajeGala(txbTrajeGala2.getText());
						instance.persist(Avaliacao);
						JOptionPane.showMessageDialog(null,"Incluído!");
						txbPostura.setText("");
						txbCharme.setText(""); 
						txbSimpatia.setText(""); 
						txbDesenvoltura.setText(""); 
						txbElegancia.setText(""); 
						txbTrajePrimavera.setText(""); 
						txbTrajeGala.setText(""); 
				    }
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
	    });
		
		Voltar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CandidatosNotas CandidatosNotas = new CandidatosNotas();
				CandidatosNotas.setVisible(true);
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