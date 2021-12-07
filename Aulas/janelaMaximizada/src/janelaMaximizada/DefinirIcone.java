package janelaMaximizada;
import javax.swing.*;
public class DefinirIcone extends JFrame {
	public DefinirIcone() {
		super("Como definir o icone para a janela");
		ImageIcon icone = new ImageIcon("Bibliotecas\\Imagens/edicao-de-imagem");
		setIconImage(icone.getImage());
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String args[]) {
		DefinirIcone app = new DefinirIcone();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
