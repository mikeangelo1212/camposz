package programa;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SerieFibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField txtValorInicial1;
	private JTextField txtValorInicial2;
	private JTextField txtNumDeIteraciones;

	// Lanza la aplicacion.
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					SerieFibonacci frame = new SerieFibonacci();
					frame.setVisible(true);
				} 
				catch (Exception x) 
				{
					x.printStackTrace();
				}
			}
		});
	}
		//DefaultListModel listModel;
		private JTextField textField_3;
	// Crea la ventana
	public SerieFibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				//listModel =new DefaultListModel();
				String texto1 = txtValorInicial1.getText();
				String texto2 =  txtValorInicial2.getText();
				
				int x=0,y=0;
				try
				{
					x = Integer.parseInt(texto1);
					y = Integer.parseInt(texto2);
				}
				catch(NumberFormatException ex)
				{
					System.err.println("No se puede convertir a numero");
					ex.printStackTrace();
				}
					textField_3.setText(texto1+" \n"+texto2+" \n");
					
		        int m = Integer.parseInt(txtNumDeIteraciones.getText());
		        int a=1;
		        while(a<m)
		        {
		            int z= x+y;
		            String anterior = textField_3.getText();
		            textField_3.setText(anterior+" \n"+z);
		            x=y;
		            y=z;
		            a++;
		        }
			}
		});
		btnInsertar.setBounds(246, 20, 89, 23);
		contentPane.add(btnInsertar);
		
		JButton btnDespejar = new JButton("Despejar");
		btnDespejar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				txtValorInicial1.setText("");
				txtValorInicial2.setText("");
				txtNumDeIteraciones.setText("");
				textField_3.setText("");
				System.out.println("Limpiado");
				
			}
		});
		btnDespejar.setBounds(246, 51, 89, 23);
		contentPane.add(btnDespejar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//boton para cerrar SerieFibonacci
				System.exit(WIDTH);
			}
		});
		btnSalir.setBounds(246, 90, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("Valor inicial 1");
		lblNewLabel.setBounds(43, 24, 63, 14);
		contentPane.add(lblNewLabel);
		
		txtValorInicial1 = new JTextField();
		txtValorInicial1.setBounds(116, 21, 86, 20);
		contentPane.add(txtValorInicial1);
		txtValorInicial1.setColumns(10);
		
		txtValorInicial2 = new JTextField();
		txtValorInicial2.setBounds(116, 52, 86, 20);
		contentPane.add(txtValorInicial2);
		txtValorInicial2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor inicial 2");
		lblNewLabel_1.setBounds(43, 55, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("No. de iteraciones");
		lblNewLabel_2.setBounds(43, 94, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNumDeIteraciones = new JTextField();
		txtNumDeIteraciones.setBounds(137, 91, 36, 20);
		contentPane.add(txtNumDeIteraciones);
		txtNumDeIteraciones.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(29, 137, 344, 118);
		textField_3.setEditable(false);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
