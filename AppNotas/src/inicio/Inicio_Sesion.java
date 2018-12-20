package inicio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


class MarcoSession extends JFrame{
	
	private Image icon;
	
	public MarcoSession() {
			
		setTitle("Notes N More");
		
		setBounds(600, 300, 400, 600);
		
		setResizable(false);
		
		LaminaSession milamina = new LaminaSession();
		
		add(milamina);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		try {
			icon = ImageIO.read(new File("img/icon.png"));
			ImageIcon icono = new ImageIcon(icon);
		}catch(IOException e) {
			System.out.println("La imagen de icono no se encuentra");
		}
		
		
		setIconImage(icon);
		
	}
	
}

class LaminaSession extends JPanel{
	
	private JButton btn_iniciar_session;
	private JButton btn_registrarse;
	private JLabel img_inicio;
	private Image icono_principal;
	private JLabel texto_login;
	private JTextField txt_usuario;
	private JPasswordField txt_contrasena;
	private JLabel lbl_usuario;
	private JLabel lbl_contrasena;
	
	
	public LaminaSession() {
		
		
		setLayout(null);
		
		setBackground(new Color(0, 206, 201)); 
		
		ponerImagen();
		ponerBotones();
		ponerTextos();
		ponerCuadrosTextos();
		
		
	}
	
	public void ponerImagen() {
		
		try {
			icono_principal = ImageIO.read(new File("img/notesnmore_pequeno.png"));
			
			ImageIcon icono = new ImageIcon(icono_principal);
			
			img_inicio = new JLabel();
			img_inicio.setBounds(120,20,150,100);
			img_inicio.setIcon(icono);
			
			add(img_inicio);
			
		}catch(IOException e) {
			System.out.println("La imagen no se encuentra");
		}
		
	}
	
	public void ponerTextos() {
		
		texto_login = new JLabel("Login");
		texto_login.setFont(new Font("Montserrat", Font.BOLD, 30));
		texto_login.setForeground(Color.DARK_GRAY);
		texto_login.setBounds(150, 120, 100, 50);
		
		
		lbl_usuario = new JLabel("Usuario");
		lbl_usuario.setFont(new Font("Montserrat", Font.BOLD, 20));
		lbl_usuario.setForeground(Color.DARK_GRAY);
		lbl_usuario.setBounds(160, 190, 100, 50);
		
		lbl_contrasena = new JLabel("Contraseña");
		lbl_contrasena.setFont(new Font("Montserrat", Font.BOLD, 20));
		lbl_contrasena.setForeground(Color.DARK_GRAY);
		lbl_contrasena.setBounds(150, 270, 150, 50);
		
		add(lbl_contrasena);
		add(lbl_usuario);
		add(texto_login);
		
	}
	
	public void ponerCuadrosTextos() {
		
		txt_usuario = new JTextField();
		txt_usuario.setFont(new Font("Montserrat", Font.BOLD, 15));
		txt_usuario.setBounds(80, 240, 250, 30);
		
		txt_contrasena = new JPasswordField();
		txt_contrasena.setFont(new Font("Montserrat", Font.BOLD, 15));
		txt_contrasena.setBounds(80, 320, 250, 30);
		
		add(txt_usuario);
		add(txt_contrasena);
		
	}
	
	public void ponerBotones() {
				
		
		Image logo_entrar;
		Image logo_registrarse;
		
		try {
			logo_entrar = ImageIO.read(new File("img/entrar.png"));
			logo_registrarse = ImageIO.read(new File("img/registrar.png"));
			
			ImageIcon icono_registro = new ImageIcon(logo_registrarse);
			ImageIcon icono = new ImageIcon(logo_entrar);
			
			btn_iniciar_session = new JButton("Iniciar Session", icono);
			btn_registrarse = new JButton("Registrarse", icono_registro);
			
		}catch(IOException e) {
			System.out.println("La imagen no se encuentra");
		}
		
		
		btn_iniciar_session.setFont(new Font("Montserrat", Font.BOLD, 15));
		btn_iniciar_session.setFocusable(false);
		btn_iniciar_session.setForeground(Color.WHITE);
		btn_iniciar_session.setBackground(new Color(250, 177, 160));
		Border line = new LineBorder(Color.WHITE);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);
		btn_iniciar_session.setBorder(compound);
		btn_iniciar_session.setBounds(80,420,250,50);
		
		
		btn_registrarse.setFont(new Font("Montserrat", Font.BOLD, 15));
		btn_registrarse.setFocusable(false);
		btn_registrarse.setForeground(Color.WHITE);
		btn_registrarse.setBackground(new Color(250, 177, 160));
		btn_registrarse.setBorder(compound);
		btn_registrarse.setBounds(80,480,250,50);
		
		
		
		
		add(btn_registrarse);
		add(btn_iniciar_session);
	}
	
	
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			
		}
	}
	
	
}