package listaFinalTP;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class ListaFinalTP04 extends JFrame{
	private JButton confirmar;
	JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7,rotulo8,rotulo9,rotulo10,rotulo11,rotulo12;
	JTextField texto1, texto2, texto3, texto4,texto5,texto6,texto7,texto8,texto9,texto10,texto11,texto12;
	JButton b1, b2 ;
	
	public ListaFinalTP04() {
		
		super("Exemplo com JTextField");
		Container tela = getContentPane();
		setLayout(null);
		
		rotulo1 = new JLabel ("Nome");
		rotulo2 = new JLabel ("Rg");
		rotulo3 = new JLabel ("CPF");
		rotulo4 = new JLabel ("Idade");
		rotulo5 = new JLabel ("Endereço");
		rotulo6 = new JLabel ("fone res.");
		rotulo7 = new JLabel ("fone com.");
		rotulo8 = new JLabel ("Celular");
		rotulo9 = new JLabel ("Nome pai");
		rotulo10 = new JLabel ("Nome mãe");
		rotulo11  = new JLabel ("Nome conjuge");
		rotulo12  = new JLabel ("Sexo");
		
		
		texto1 = new JTextField(20);
		texto2 = new JTextField(20);
		texto3 = new JTextField(20);
		texto4 = new JTextField(20);
		texto5 = new JTextField(20);
		texto6 = new JTextField(20);
		texto7 = new JTextField(20);
		texto8 = new JTextField(20);
		texto9 = new JTextField(20);
		texto10 = new JTextField(20);
		texto11 = new JTextField(20);
		texto12 = new JTextField(20);
		
		
		rotulo1.setBounds(50,20,80,20);
		rotulo2.setBounds(50,60,80,20);
		rotulo3.setBounds(50,100,80,20);
		rotulo4.setBounds(50,140,80,20);
		rotulo5.setBounds(50,180,80,20);
		rotulo6.setBounds(50,220,80,20);
		rotulo7.setBounds(50,260,80,20);
		rotulo8.setBounds(50,300,80,20);
		rotulo9.setBounds(50,340,80,20);
		rotulo10.setBounds(50,380,80,20);
		rotulo11.setBounds(50,420,80,20);
		rotulo12.setBounds(50,460,80,20);
		
		
		texto1.setBounds(110,20,100,20);
		texto2.setBounds(110,60,100,20);
		texto3.setBounds(110,100,100,20);
		texto4.setBounds(110,140,100,20);
		texto5.setBounds(110,180,100,20);
		texto6.setBounds(110,220,100,20);
		texto7.setBounds(110,260,100,20);
		texto8.setBounds(110,300,100,20);
		texto9.setBounds(110,340,100,20);
		texto10.setBounds(110,380,100,20);
		texto11.setBounds(110,420,100,20);
		texto12.setBounds(110,460,100,20);
		
		
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(rotulo3);
		tela.add(rotulo4);
		tela.add(rotulo5);
		tela.add(rotulo6);
		tela.add(rotulo7);
		tela.add(rotulo8);
		tela.add(rotulo9);
		tela.add(rotulo10);
		tela.add(rotulo11);
		tela.add(rotulo12);
		
		tela.add(texto1);
		tela.add(texto2);
		tela.add(texto3);
		tela.add(texto4);
		tela.add(texto5);
		tela.add(texto6);
		tela.add(texto7);
		tela.add(texto8);
		tela.add(texto9);
		tela.add(texto10);
		tela.add(texto11);
		tela.add(texto12);
		
		setSize(800,600);
		setVisible(true);
		setLocationRelativeTo(null);
		
		b2 = new JButton("Confirmar");
		b2.setSize(100,25);
		b2.setLocation(115,500);
		b2.setFont(new Font("ScriptS",Font.ITALIC,12));
		b2.setBorder(BorderFactory.createLineBorder(Color.black,2));
		b2.setEnabled(true);
		
		setVisible(true);
		getContentPane().setLayout(null);
		getContentPane().add(b2);
	
		  
		
	}
	public static void main(String args[]) {
		ListaFinalTP04 app = new ListaFinalTP04();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}