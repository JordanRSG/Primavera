package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Candidatos extends JFrame{
	public Candidatos() 
	{
		super("Candidatos");
    	Container tela = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(null);
    	
		JLabel lblMenu = new JLabel("Candidatos");
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setFont(new Font("Algerian", Font.PLAIN, 66));
		
		JButton Masculino = new JButton("Masculino");
		Masculino.setContentAreaFilled(false);
		Masculino.setBorderPainted(false);
		Masculino.setFont(new Font("Algerian", Font.PLAIN, 30));
		Masculino.setForeground(Color.WHITE);
		
		JButton Feminino = new JButton("Feminino");
		Feminino.setContentAreaFilled(false);
		Feminino.setBorderPainted(false);
		Feminino.setFont(new Font("Algerian", Font.PLAIN, 35));
		Feminino.setForeground(Color.WHITE);
		
		JButton Voltar = new JButton("Voltar");
		Voltar.setContentAreaFilled(false);
		Voltar.setBorderPainted(false);
		Voltar.setFont(new Font("Calibri", Font.PLAIN, 20));
		Voltar.setForeground(Color.WHITE);
		
		ImageIcon imagem = new ImageIcon("imgCandidatos.png");
	    Image img = imagem.getImage();
	    imagem = new ImageIcon(img);
	    JLabel fundo = new JLabel(imagem);
	    
	    Masculino.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CadCandidatos CadCandidatos = new CadCandidatos();
				CadCandidatos.setVisible(true);
				setVisible(false);
				dispose();
			}
	    });
	    
	    Feminino.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CadCandidatas CadCandidatas = new CadCandidatas();
				CadCandidatas.setVisible(true);
				setVisible(false);
				dispose();
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
	    lblMenu.setBounds(550, 100, 400, 100);
	    Masculino.setBounds(463, 415, 250, 100);
	    Feminino.setBounds(730, 415, 250, 100);
	    Voltar.setBounds(650, 850, 100, 50);
		
		tela.add(lblMenu);
		tela.add(Voltar);
		tela.add(Masculino);
		tela.add(Feminino);
		tela.add(fundo);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated (true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
}