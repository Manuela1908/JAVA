package view;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class QuestaoA {

	private JFrame frame;
	private JTextField num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestaoA window = new QuestaoA();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuestaoA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Verificação");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(130, 34, 157, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite um número");
		lblNewLabel_1.setBounds(40, 111, 102, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(40, 148, 102, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		num = new JTextField();
		num.setBounds(182, 108, 128, 20);
		frame.getContentPane().add(num);
		num.setColumns(10);
		
		JTextPane result = new JTextPane();
		result.setEditable(false);
		result.setBounds(182, 142, 128, 20);
		frame.getContentPane().add(result);
				
		JToggleButton perfeito = new JToggleButton("Perfeito");
		perfeito.setBounds(40, 201, 80, 23);
		frame.getContentPane().add(perfeito);
		
		perfeito.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        String input = num.getText();

	        for (char c : input.toCharArray()) {
	            if (!Character.isDigit(c)) {
	                JOptionPane.showMessageDialog(null, "Digite apenas números");
	                return;
	            }
	        }
	        int numero = Integer.parseInt(input);
	        int somaDivisores = 0;

	        for (int i = 1; i < numero; i++) {
	            if (numero % i == 0) {
	                somaDivisores += i;
	            }
	        }

	        if (somaDivisores == numero) {
	            JOptionPane.showMessageDialog(null, "O número é perfeito");
	            result.setText(String.valueOf(somaDivisores));
	        } else {
	            JOptionPane.showMessageDialog(null, "O número não é perfeito");
	            result.setText(String.valueOf(somaDivisores));
	        }
	    }
	});

		
		JToggleButton dsu = new JToggleButton("DSU");
		dsu.setBounds(130, 201, 74, 23);
		frame.getContentPane().add(dsu);
		
		JToggleButton sair = new JToggleButton("Sair");
		sair.setBounds(304, 201, 80, 23);
		frame.getContentPane().add(sair);
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		JToggleButton limpar = new JToggleButton("limpar");
		limpar.setBounds(214, 201, 80, 23);
		frame.getContentPane().add(limpar);
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num.setText("");
				result.setText("");
			}
		});
		
		
		dsu.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	        if (num.getText().isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Digite um número antes");
	        } else {
	            String input = num.getText();

	            for (char c : input.toCharArray()) {
	                if (!Character.isDigit(c) || input.isEmpty()) {
	                    JOptionPane.showMessageDialog(null, "Digite apenas números inteiros");
	                    return;
	                }
	            }

	            int numero = Integer.parseInt(input);

	            if (numero >= 10 && numero <= 99) {
	                int dezena = numero / 10;
	                int unidade = numero % 10;
	                int soma = dezena + unidade;
	                String resultado = "" + dezena + soma + unidade;

	                JOptionPane.showMessageDialog(null, "Número: " + numero);
	                JOptionPane.showMessageDialog(null, "Digito da dezena: " + dezena);
	                JOptionPane.showMessageDialog(null, "Digito da unidade: " + unidade);
	                JOptionPane.showMessageDialog(null, "Soma da dezena com unidade: " + soma);
	                result.setText(resultado);

	            } else {
	                JOptionPane.showMessageDialog(null, "O número deve conter 2 dígitos");
	            }
	        }
	    }
	});
	}
}
