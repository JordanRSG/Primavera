package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame 
{
	public Menu() 
	{
		super("Menu");
    	Container tela = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(null);
    	
    	JLabel lblTitulo = new JLabel("Miss & Mister 2018");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Calibri", Font.PLAIN, 35));
			
		JLabel lbladministrador = new JLabel("Administrador");
		lbladministrador.setForeground(Color.WHITE);
		lbladministrador.setFont(new Font("Calibri", Font.PLAIN, 35));
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setFont(new Font("Algerian", Font.PLAIN, 120));
		
		JButton Candidatos = new JButton("Candidatos");
		Candidatos.setContentAreaFilled(false);
		Candidatos.setBorderPainted(false);
		Candidatos.setFont(new Font("Algerian", Font.PLAIN, 35));
		Candidatos.setForeground(Color.BLACK);
		
		JButton Jurados = new JButton("Jurados");
		Jurados.setContentAreaFilled(false);
		Jurados.setBorderPainted(false);
		Jurados.setFont(new Font("Algerian", Font.PLAIN, 35));
		Jurados.setForeground(Color.BLACK);
		
		JButton Sair = new JButton("Sair");
		Sair.setContentAreaFilled(false);
		Sair.setBorderPainted(false);
		Sair.setFont(new Font("Calibri", Font.PLAIN, 20));
		Sair.setForeground(Color.WHITE);
		
		ImageIcon imagem = new ImageIcon("imgMenu.png");
	    Image img = imagem.getImage();
	    imagem = new ImageIcon(img);
	    JLabel fundo = new JLabel(imagem);
	    
	    Sair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				App App = new App();
				App.setVisible(true);
				setVisible(false);
				dispose();
			}
	    });
	    
	    Candidatos.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Candidatos Candidatos = new Candidatos();
				Candidatos.setVisible(true);
				setVisible(false);
				dispose();
			}
	    });
	    
	    Jurados.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CadJurados CadJurados = new CadJurados();
				CadJurados.setVisible(true);
				setVisible(false);
				dispose();
			}
	    });
	    
	    fundo.setBounds(0, 0, 1427, 900);
	    lblMenu.setBounds(550, 100, 400, 100);
	    Candidatos.setBounds(590, 350, 250, 100);
	    Jurados.setBounds(560, 500, 250, 100);
		lblTitulo.setBounds(200, 760, 300, 100);
		lbladministrador.setBounds(1000, 760, 300, 100);
		Sair.setBounds(650, 850, 100, 50);
		
		tela.add(lblTitulo);
		tela.add(lbladministrador);
		tela.add(lblMenu);
		tela.add(Candidatos);
		tela.add(Jurados);
		tela.add(Sair);
		tela.add(fundo);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated (true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
}
