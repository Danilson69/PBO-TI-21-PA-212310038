import javax.swing.JOptionPane;

public class Latihan05 {
	public static void main(String[] args) {
		String fields[] = {"Nama Lengkap", "Alamat", "No Telp"};
		final int sizeFields = fields.length;
		
		for(int i = 0; i < sizeFields; i++) {
			String values = JOptionPane.showInputDialog(null, "Masukkan " + fields[i] + ":", "Data array ke - " + i, JOptionPane.INFORMATION_MESSAGE);
			fields[i] = values;
		}
		
		String output = "";	
		
		for(int j = 0; j < sizeFields; j++) {
			String fieldsOutput[] = {"Nama Lengkap", "Alamat", "No Telp"};
			output += fieldsOutput[j] + ": " + fields[j] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, output);
	}
	
}