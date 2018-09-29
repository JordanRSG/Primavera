package view;

import javax.swing.*;

import controller.CandidatoJpaDAO;
import controller.JuradoJpaDAO;
import model.Candidatos;
import model.Jurados;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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
		
		DefaultListModel list1 = new DefaultListModel();
		JList list = new JList(list1);
		list.setFont(new Font("Calibri", Font.PLAIN, 25));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		
		List<Jurados> jur = JuradoJpaDAO.getInstance().findAll();
		for(int i = 0; i < jur.size(); i++) {
			list1.add(i,jur.get(0).getNome());
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
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Calibri", Font.PLAIN, 25));
		final JPasswordField txbSenha = new JPasswordField();
		txbSenha.setFont(new Font("Calibri", Font.PLAIN, 25));
		
	    JButton Login = new JButton("Cadastrar");
		Login.setBackground(Color.BLACK);
		Login.setBorderPainted(false);
		Login.setFont(new Font("Calibri", Font.PLAIN, 25));
		Login.setForeground(Color.WHITE);
	    
		Login.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					JuradoJpaDAO instance = JuradoJpaDAO.getInstance();
					model.Jurados Jurado = new model.Jurados();
					Jurado.setNome(txbNome.getText());
					char a[] = txbSenha.getPassword();
					String pass = new String(a);
					Jurado.setSenha(pass);
					
					instance.persist(Jurado);
					JOptionPane.showMessageDialog(null,"Incluído!");
					txbNome.setText("");
					txbSenha.setText("");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
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