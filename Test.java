package mse_staj;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Test {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("ilk pencerem");
		jf.setSize(500,500);
		jf.setLocation(600,20);
		
		jf.getContentPane().setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("İsminizi Giriniz:");
		JTextField text1 = new JTextField(10);
		JButton button1 = new JButton("Tamam");
		
		jf.getContentPane().add(label1);
		jf.getContentPane().add(text1);
		jf.getContentPane().add(button1);

		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                label1.setText("Merhaba " + text1.getText());		
				
			}
			
		});
		
		JButton button2  = new JButton("Tıkla");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane panelimiz = new JOptionPane();
				panelimiz.showMessageDialog(null, "Panele Hoşgeldiniz.");
				
			}
		});
		
		JButton button3 = new JButton("Giriş");
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog( "Lütfen isminizi Giriniz");
                JOptionPane.showMessageDialog(null,"hoşgeldin "+ name);
                
			}
		});
		
		jf.getContentPane().add(button2);
		jf.getContentPane().add(button3);
		
		
		
		
		
		
		
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setVisible(true);
		
		
	}

}
