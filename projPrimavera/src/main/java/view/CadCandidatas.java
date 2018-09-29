package view;

import javax.swing.*;

import org.hibernate.Session;

import controller.CandidatoJpaDAO;
import model.Candidatos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CadCandidatas extends JFrame{
	public CadCandidatas() 
	{
		super("Cadastro de Candidatos");
    	Container tela = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(null);
    	
		JLabel lblMenu = new JLabel("Candidatas");
		lblMenu.setForeground(Color.WHITE);
		lblMenu.setFont(new Font("Algerian", Font.PLAIN, 66));
		
		JLabel lblTitulo = new JLabel("Escolher Candidata:");
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Calibri", Font.PLAIN, 35));
		
		JLabel lblTitulo2 = new JLabel("Cadastrar Candidata:");
		lblTitulo2.setForeground(Color.BLACK);
		lblTitulo2.setFont(new Font("Calibri", Font.PLAIN, 35));
		
		JButton Voltar = new JButton("Voltar");
		Voltar.setContentAreaFilled(false);
		Voltar.setBorderPainted(false);
		Voltar.setFont(new Font("Calibri", Font.PLAIN, 20));
		Voltar.setForeground(Color.WHITE);
		
		DefaultListModel list1 = new DefaultListModel();
		
		JList list = new JList(list1);
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
	   
	    JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbNome = new JTextField("");
		txbNome.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setForeground(Color.BLACK);
		lblTurma.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JTextField txbTurma = new JTextField();
		txbTurma.setFont(new Font("Calibri", Font.PLAIN, 25));
		
	    JButton Login = new JButton("Cadastrar");
		Login.setBackground(Color.BLACK);
		Login.setBorderPainted(false);
		Login.setFont(new Font("Calibri", Font.PLAIN, 25));
		Login.setForeground(Color.WHITE);
	    
		Login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				model.Candidatos Candidatos = new model.Candidatos();
				Candidatos.setNome(txbNome.getText());
				Candidatos.setTurma(txbTurma.getText());
				Candidatos.setSexo(false);
				
				CandidatoJpaDAO novo = CandidatoJpaDAO.getInstance();
				novo.merge(Candidatos);
				JOptionPane.showMessageDialog(null,"Incluído!");
				txbNome.setText("");
				txbTurma.setText("");
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
		jscroll.setBounds(250, 300, 300, 450);
		lblNome.setBounds(730, 350, 250, 50);
		txbNome.setBounds(730, 400, 400, 25);
		lblTurma.setBounds(730, 450, 250, 50);
		txbTurma.setBounds(730, 500, 400, 25);
		Login.setBounds(850, 600, 150, 40);
		Voltar.setBounds(650, 850, 100, 50);
		
	    tela.add(lblTitulo);
		tela.add(Voltar);
	    tela.add(lblTitulo2);
	    tela.add(lblNome);
		tela.add(txbNome);
		tela.add(lblTurma);
		tela.add(txbTurma);
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
