package guipekan8_2511532026;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class tugasguipekan8_2511532026 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNilai;
	private JTextField textFieldHadir;
	private JTextField lblHasil;
	/**
	 * @wbp.nonvisual location=-9,8
	 */
	private final JPanel panel = new JPanel();
	/**
	 * @wbp.nonvisual location=-9,8
	 */
	private final JPanel panel_1 = new JPanel();
	/**
	 * @wbp.nonvisual location=1,8
	 */
	private final JPanel panel_2 = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tugasguipekan8_2511532026 frame = new tugasguipekan8_2511532026();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tugasguipekan8_2511532026() {
		panel_1.setBackground(new Color(0, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNilaiAkhir = new JLabel("Nilai Akhir");
		lblNilaiAkhir.setFont(new Font("Segoe UI Black", Font.PLAIN, 10));
		lblNilaiAkhir.setBounds(10, 54, 58, 12);
		contentPane.add(lblNilaiAkhir);
		
		textFieldNilai = new JTextField();
		textFieldNilai.setBounds(88, 51, 96, 18);
		contentPane.add(textFieldNilai);
		textFieldNilai.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kehadiran(%)");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 10));
		lblNewLabel.setBounds(10, 90, 81, 12);
		contentPane.add(lblNewLabel);
		
		textFieldHadir = new JTextField();
		textFieldHadir.setBounds(88, 87, 96, 18);
		contentPane.add(textFieldHadir);
		textFieldHadir.setColumns(10);
		
		JButton btnNewButton = new JButton("Cek Hasil");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nilai = Integer.parseInt(textFieldNilai.getText());
				int hadir = Integer.parseInt(textFieldHadir.getText());

				if (nilai >= 75 && hadir >= 80) {
				    lblHasil.setText("KAMU LULUS");
				    lblHasil.setForeground(Color.GREEN);
				} else {
				    lblHasil.setText("COBA TAHUN DEPAN");
				    lblHasil.setForeground(Color.RED);
				}
			}
		});
		btnNewButton.setBounds(235, 68, 115, 20);
		contentPane.add(btnNewButton);
		
		JLabel hasil = new JLabel("Hasil");
		hasil.setFont(new Font("Segoe UI Black", Font.PLAIN, 10));
		hasil.setBounds(202, 149, 92, 32);
		contentPane.add(hasil);
		
		lblHasil = new JTextField();
		lblHasil.setBounds(136, 191, 177, 32);
		contentPane.add(lblHasil);
		lblHasil.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PENILAIAN LULUS ATAU TIDAK LULUS");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 10));
		lblNewLabel_1.setBounds(122, 10, 228, 42);
		contentPane.add(lblNewLabel_1);

	}
}
