package br.com.javacurso.lambda;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ExemploDesktop {
	
	public static void main(String[] args) {
		
		JFrame tela = new JFrame("Tela do Sistema");
		JButton botao = new JButton("Clique Aqui");
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(tela, "Olá, eu sou o Groot!");
			}
		});
		tela.add(botao);
		tela.setSize(200, 200);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
	}

}
