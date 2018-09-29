package view;

import javax.persistence.*;
import javax.swing.*;


import controller.CandidatoJpaDAO;
import model.Candidatos;

import java.sql.Connection;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CadCandidatos extends JFrame{
	public CadCandidatos() 
	{
		super("Cadastro de Candidatos");
    	Container tela = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(null);
    	
		JLabel lblMenu = new JLabel("Candidatos");
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setFont(new Font("Algerian", Font.PLAIN, 66));
		
		JLabel lblTitulo = new JLabel("Escolher Candidato:");
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Calibri", Font.PLAIN, 35));
		
		JLabel lblTitulo2 = new JLabel("Cadastrar Candidato:");
		lblTitulo2.setForeground(Color.BLACK);
		lblTitulo2.setFont(new Font("Calibri", Font.PLAIN, 35));
		
		JButton Voltar = new JButton("Voltar");
		Voltar.setContentAreaFilled(false);
		Voltar.setBorderPainted(false);
		Voltar.setFont(new Font("Calibri", Font.PLAIN, 20));
		Voltar.setForeground(Color.WHITE);
		
		JComboBox  list1 = new JComboBox();
		/*
		List<Candidatos> cad = CandidatoJpaDAO.getInstance().findAll();
		for(int i = 0; i < cad.size(); i++) {
			list1.addItem(cad.get(i).getNome());
		}
		*/
		
		ImageIcon imagem = new ImageIcon("imgCadCandidatos.png");
	    Image img = imagem.getImage();
	    imagem = new ImageIcon(img);
	    JLabel fundo = new JLabel(imagem);
	   
	    JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbNome = new JTextField("");
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setForeground(Color.BLACK);
		lblTurma.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbTurma = new JTextField();
	    
	    JButton Login = new JButton("Cadastrar");
		Login.setBackground(Color.BLACK);
		Login.setBorderPainted(false);
		Login.setFont(new Font("Calibri", Font.PLAIN, 25));
		Login.setForeground(Color.WHITE);
	    
		Login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Connection connection;
				try {
					CandidatoJpaDAO instance = CandidatoJpaDAO.getInstance();
					model.Candidatos Candidatos = new model.Candidatos();
					Candidatos.setNome(txbNome.getText());
					Candidatos.setTurma(txbTurma.getText());
					Candidatos.setSexo(true);
					
					instance.persist(Candidatos);
					System.out.println("Incluído");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
	    });
		
		Voltar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				view.Candidatos Candidatos = new view.Candidatos();
				Candidatos.setVisible(true);
				setVisible(false);
				dispose();
			}
	    });
		
	    fundo.setBounds(0, 0, 1427, 900);
	    lblMenu.setBounds(550, 100, 410, 100);
	    lblTitulo.setBounds(250, 225, 410, 100);
	    lblTitulo2.setBounds(730, 225, 410, 100);
		list1.setBounds(250, 300, 300, 25);
		lblNome.setBounds(730, 350, 250, 50);
		txbNome.setBounds(730, 400, 400, 25);
		lblTurma.setBounds(730, 450, 250, 50);
		txbTurma.setBounds(730, 500, 400, 25);
		Login.setBounds(850, 600, 150, 40);
		Voltar.setBounds(650, 850, 100, 50);
		
	    tela.add(lblTitulo);
	    tela.add(lblTitulo2);
	    tela.add(lblNome);
		tela.add(txbNome);
		tela.add(lblTurma);
		tela.add(Voltar);
		tela.add(txbTurma);
		tela.add(Login);
	    tela.add(list1);
		tela.add(lblMenu);
		tela.add(fundo);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated (true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
}