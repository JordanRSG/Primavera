package view;

import javax.swing.*;

import controller.AdministradorJpaDAO;
import controller.CandidatoJpaDAO;
import controller.JuradoJpaDAO;
import model.Administrador;
import model.Candidatos;
import model.Jurados;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class App extends JFrame
{
    public static void main( String[] args )
    {
    	App app = new App();
		app.setVisible(true);
    }
    public App() {
    	super("login");
    	Container tela = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(null);
    	
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Algerian", Font.PLAIN, 120));
		
		JLabel lblNome = new JLabel("Nome de Usuário:");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Algerian", Font.PLAIN, 25));
		final JTextField txbNome = new JTextField("");
		txbNome.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Algerian", Font.PLAIN, 25));
		final JPasswordField txbSenha = new JPasswordField();
		txbSenha.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		ButtonGroup gp = new ButtonGroup();
		final JRadioButton jur = new JRadioButton("Entrar como Jurado",false);
		final JRadioButton adm = new JRadioButton("Entrar como Administrador",false);
		jur.setFont(new Font("Algerian", Font.PLAIN, 18));
		adm.setFont(new Font("Algerian", Font.PLAIN, 18));
		gp.add(jur);
		gp.add(adm);
		jur.setOpaque(false);
		adm.setOpaque(false);
		
		JButton Login = new JButton("Ok");
		Login.setBackground(Color.BLACK);
		Login.setBorderPainted(false);
		Login.setFont(new Font("Calibri", Font.PLAIN, 25));
		Login.setForeground(Color.WHITE);
		
		JButton Sair = new JButton("Sair");
		Sair.setContentAreaFilled(false);
		Sair.setBorderPainted(false);
		Sair.setFont(new Font("Calibri", Font.PLAIN, 20));
		Sair.setForeground(Color.WHITE);
		
		ImageIcon imagem = new ImageIcon("imgLogin.png");
	    Image img = imagem.getImage();
	    imagem = new ImageIcon(img);
	    JLabel fundo = new JLabel(imagem);
	    
	    Login.addActionListener(new ActionListener(){
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e){
				try{
					DefaultListModel list1 = new DefaultListModel();
					List<Administrador> adm = AdministradorJpaDAO.getInstance().findAll();
					list1.add(0,adm.get(0).getNome());
				}catch(Exception a){
					JOptionPane.showMessageDialog(null,"Administrador não existe!");
					JOptionPane.showMessageDialog(null,"Cadastrar um novo agora");
					String nome = JOptionPane.showInputDialog(null,"Insira o nome do administrador");
					String senha = JOptionPane.showInputDialog(null,"Insira a senha do administrador");
					
					AdministradorJpaDAO instance = AdministradorJpaDAO.getInstance();
					model.Administrador Administrador = new model.Administrador();
					Administrador.setNome(nome);
					Administrador.setSenha(senha);
					instance.persist(Administrador);
					JOptionPane.showMessageDialog(null,"Incluído!");
				}
				if(jur.isSelected()) {
					if(txbNome.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Usuário nulo ou inválido!");
					}else {
						if(JuradoJpaDAO.getInstance().findNome(txbNome.getText()) != null) {
							DefaultListModel list1 = new DefaultListModel();
							try{
								List<Jurados> jur = JuradoJpaDAO.getInstance().findNome(txbNome.getText());
								list1.add(0,jur.get(0).getNome());
								char a[] = txbSenha.getPassword();
								String pass = new String(a);
								if(jur.get(0).getSenha().equals(pass)) {
									MenuJur MenuJur = new MenuJur();
									MenuJur.setVisible(true);
									setVisible(false);
									dispose();
								}else {
									JOptionPane.showMessageDialog(null,"Senha incorreta!");
								}
							}catch(Exception a){
								JOptionPane.showMessageDialog(null,"Usuário não existe!");
							}
						}else {
							JOptionPane.showMessageDialog(null,"Usuário não existe!");
						}
					}
				}else if(adm.isSelected()){
					if(txbNome.getText().equals("")) {
						JOptionPane.showMessageDialog(null,"Usuário nulo ou inválido!");
					}else {
						if(AdministradorJpaDAO.getInstance().findNome(txbNome.getText()) != null) {
							DefaultListModel list1 = new DefaultListModel();
							try{
								List<Administrador> adm = AdministradorJpaDAO.getInstance().findNome(txbNome.getText());
								list1.add(0,adm.get(0).getNome());
								char a[] = txbSenha.getPassword();
								String pass = new String(a);
								if(adm.get(0).getSenha().equals(pass)) {
									Menu Menu = new Menu();
									Menu.setVisible(true);
									setVisible(false);
									dispose();
								}else {
									JOptionPane.showMessageDialog(null,"Senha incorreta!");
								}
							}catch(Exception a){
								JOptionPane.showMessageDialog(null,"Usuário não existe!");
							}
						}else {
							JOptionPane.showMessageDialog(null,"Usuário não existe!");
						}
					}
				}else {
					JOptionPane.showMessageDialog(null,"Escolha uma opção!");
				}
			}

	    });
	    
	    Sair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Alert Alert = new Alert();
				Alert.setVisible(true);
				setVisible(false);
				dispose();
				System.exit(0);
			}
	    });
	    
	    fundo.setBounds(0, 0, 1427, 900);
	    lblLogin.setBounds(800, 100, 400, 100);
		lblNome.setBounds(700, 300, 250, 100);
		txbNome.setBounds(700, 370, 400, 25);
		lblSenha.setBounds(700, 400, 250, 100);
		txbSenha.setBounds(700, 470, 400, 25);
		jur.setBounds(700, 540, 350, 25);
		adm.setBounds(700, 580, 350, 25);
		Login.setBounds(1100, 550, 100, 40);
		Sair.setBounds(650, 850, 100, 50);
		
		tela.add(lblLogin);
		tela.add(lblNome);
		tela.add(txbNome);
		tela.add(lblSenha);
		tela.add(txbSenha);
		tela.add(jur);
		tela.add(adm);
		tela.add(Login);
		tela.add(Sair);
		tela.add(fundo);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated (true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
    	}
}
