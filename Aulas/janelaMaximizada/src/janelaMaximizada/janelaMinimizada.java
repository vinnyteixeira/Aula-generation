package janelaMaximizada;
import javax.swing.*;

public class janelaMinimizada extends JFrame{
	public janelaMinimizada() {
		super("Como exibir a janela minimizada");
		setSize(300, 150);
		setVisible(true);
		setExtendedState(ICONIFIED);
	}
	public static void main(String args[]) {
		janelaMinimizada app = new janelaMinimizada();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
