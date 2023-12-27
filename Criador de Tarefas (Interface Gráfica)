package view;
import java.awt.GridLayout;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.util.ArrayList;
import java.awt.SystemColor;


/*ENUNCIADO:
O programa tem como função a criação de uma lista de tarefas usando checkboxes, que interagem com a barra de progresso calculando o numero de tarefas selecionadas pelo numero total de tarefas criadas.

PS:
O usuário digita o texto no campo e clica em "+", ele deve digitar textos menores que 12 caracteres e não pode ser uma String vazia. Senão o sistema não irá permitir a criação da nova checkbox e emitirá uma mensagem de erro.
Após ele criar uma tarefa, ela é adicionada ao Painel em forma de checkbox. O painel está organizado em 2 colunas, a proxima tarefa será inserida na segunda coluna. 
Se a ultima tarefa está na segunda coluna, a proxima tarefa será inserida na linha abaixo na primeira coluna. O usuário tem o limite máximo de 10 tarefas.
*/
public class ItemC {

    public JFrame frame;
    private JTextField novatarefa;
    private JProgressBar progresso;
    private int totalTarefas = 0;
    private int tarefasConcluidas = 0;
    private ArrayList <JCheckBox> listaTarefas = new ArrayList<>();
    private JPanel panelTarefas;
    private JLabel lblNewLabel_1;
    private JLabel mensagem;
    private JButton btnNewButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ItemC window = new ItemC();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ItemC() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(SystemColor.menu);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Lista de Tarefas");
        lblNewLabel.setForeground(new Color(0, 128, 128));
        lblNewLabel.setFont(new Font("Queen of Camelot", Font.PLAIN, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(0, 11, 434, 23);
        frame.getContentPane().add(lblNewLabel);

        panelTarefas = new JPanel();
        panelTarefas = new JPanel(new GridLayout(0, 2));
        panelTarefas.setBackground(SystemColor.menu);
        panelTarefas.setBounds(10, 45, 211, 150);
        frame.getContentPane().add(panelTarefas);

        progresso = new JProgressBar();
        progresso.setForeground(new Color(0, 128, 128));
        progresso.setBounds(10, 210, 414, 14);
        frame.getContentPane().add(progresso);

        novatarefa = new JTextField();
        novatarefa.setBounds(255, 125, 97, 22);
        frame.getContentPane().add(novatarefa);
        novatarefa.setColumns(10);

        JButton mais = new JButton("+");
        mais.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarTarefa();
            }
        });
        mais.setBounds(362, 125, 49, 23);
        frame.getContentPane().add(mais);
        
        lblNewLabel_1 = new JLabel("Adicionar nova tarefa");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setForeground(new Color(47, 79, 79));
        lblNewLabel_1.setBounds(258, 98, 153, 14);
        frame.getContentPane().add(lblNewLabel_1);
        
        mensagem = new JLabel("Você excedeu o limite de tarefas!");
        mensagem.setFont(new Font("Tahoma", Font.PLAIN, 9));
        mensagem.setForeground(SystemColor.menu);
        mensagem.setHorizontalAlignment(SwingConstants.CENTER);
        mensagem.setBounds(251, 62, 160, 14);
        frame.getContentPane().add(mensagem);
        
        btnNewButton = new JButton("Limpar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		novatarefa.setText("");
        	    progresso.setValue(0);
        	    listaTarefas.clear();
        	    panelTarefas.removeAll();
        	    panelTarefas.revalidate();
        	    panelTarefas.repaint();
        	    totalTarefas = 0;
        	    tarefasConcluidas = 0;
        	    mensagem.setForeground(new Color(240,255,240));
        	    
        	}
        });
        btnNewButton.setBounds(255, 158, 156, 23);
        frame.getContentPane().add(btnNewButton);

        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void adicionarTarefa() {
    if (totalTarefas < 10) {
    	String nova = novatarefa.getText();
    	int tamanhoString = nova.length();
    	if (tamanhoString <= 12 && tamanhoString > 0) {
	        JCheckBox novaCheckBox = new JCheckBox(novatarefa.getText());
	        novaCheckBox.addItemListener(new ItemListener() {
	            public void itemStateChanged(ItemEvent e) {
	                if (e.getStateChange() == ItemEvent.SELECTED) {
	                    tarefasConcluidas++;
	                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
	                    tarefasConcluidas--;
	                }
	                atualizarBarraProgresso();
	            } 
	            
	        });
	
	        listaTarefas.add(novaCheckBox);
	        totalTarefas++;
	
	        atualizarBarraProgresso();
	
	        panelTarefas.add(novaCheckBox);
	
	        panelTarefas.revalidate();
	
	        novatarefa.setText("");
	        
        } else if (tamanhoString > 12) {
        	JOptionPane.showMessageDialog(null, "Por favor, digite no máximo 12 caracteres.\nIsso é para garantir que todos os componentes da lista sejam visíveis.");
        } else if (novatarefa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode criar tarefas vazias, digite algo");
        }
    }else {
    	mensagem.setForeground(Color.RED);
    }}

    private void atualizarBarraProgresso() {
        int porcentagem = (int) ((double) tarefasConcluidas / totalTarefas * 100);
        progresso.setValue(porcentagem);
    }
}
