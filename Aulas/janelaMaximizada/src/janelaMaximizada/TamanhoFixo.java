package janelaMaximizada;
import javax.swing.*;

public class TamanhoFixo extends JFrame {
	public TamanhoFixo() {
		super("Uma janela n�o dimensionavel");
		setResizable(false);
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String args[]) {
		TamanhoFixo app = new TamanhoFixo();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
