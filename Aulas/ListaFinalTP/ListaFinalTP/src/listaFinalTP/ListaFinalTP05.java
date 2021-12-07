package listaFinalTP;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class ListaFinalTP05 extends JFrame{
	private JButton confirmar;
	JLabel rotulo1,rotulo2;
	JTextField texto1, texto2;
	JButton b1, b2 ;
	

	
	public ListaFinalTP05() {
		
		super("Emprestimo livro aluno");
		Container tela = getContentPane();
		setLayout(null);
		
		
		rotulo1 = new JLabel ("Nome");
		rotulo2 = new JLabel ("Classe");
		
		
		
		texto1 = new JTextField(20);
		texto2 = new JTextField(20);
	
		
		rotulo1.setBounds(50,20,80,20);
		rotulo2.setBounds(50,60,80,20);
	
		
		texto1.setBounds(110,20,100,20);
		texto2.setBounds(110,60,100,20);
		
		
		tela.add(rotulo1);
		tela.add(rotulo2);
		
		
		tela.add(texto1);
		tela.add(texto2);
	
		setSize(500,300);
		setVisible(true);
		setLocationRelativeTo(null);
		
		b2 = new JButton("Emprestar");
		b2.setSize(100,25);
		b2.setLocation(200,200);
		b2.setFont(new Font("ScriptS",Font.ITALIC,12));
		b2.setBorder(BorderFactory.createLineBorder(Color.black,2));
		b2.setEnabled(true);
		
		setVisible(true);
		getContentPane().setLayout(null);
		getContentPane().add(b2);
	}

	
	public static void main(String args[]) {
		ListaFinalTP05 app = new ListaFinalTP05();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}