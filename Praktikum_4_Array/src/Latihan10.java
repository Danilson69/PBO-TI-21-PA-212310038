import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan10 {

	public static void main(String[] args) {
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList<String> fieldsValue = new ArrayList<String>();
        fields.add("Nama Lengkap");
        fields.add("Alamat");
        fields.add("No Telp");

        for(int i = 0; i < fields.size(); i++) {
            String values = JOptionPane.showInputDialog(null,
                            "Masukkan " + fields.get(i),
                            "Data array ke - " + i,
                            JOptionPane.INFORMATION_MESSAGE);
            fieldsValue.add(values);
        }

        String output = "";

        for(int i = 0; i < fields.size(); i++) {
            output += fields.get(i) + ": " + fieldsValue.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, output);
    }
	
}