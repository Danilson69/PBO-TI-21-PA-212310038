import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan09 {
	
	public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<Integer>();

        String jumlahArr = JOptionPane.showInputDialog(null,
                           "Masukkan jumlah array",
                           "Input Jumlah Array",
                           JOptionPane.INFORMATION_MESSAGE);
        int pJumlahArr = Integer.parseInt(jumlahArr);

        for(int i = 0; i < pJumlahArr; i++) {
            String val = JOptionPane.showInputDialog(null,
                         "Masukkan angka:",
                         "Data array ke - " + i,
                         JOptionPane.INFORMATION_MESSAGE);
            int pVal = Integer.parseInt(val);
            angka.add(pVal);
        }

        String cetakArray = printArray(angka);

        JOptionPane.showMessageDialog(null, cetakArray, "Print Array", JOptionPane.INFORMATION_MESSAGE);

    }

    private static String printArray(ArrayList<Integer> val) {
        String output = "";
        int maxAngka = val.get(0);
        int minAngka = val.get(0);
        final int sizeVal = val.size();

        for(int i = 0; i < sizeVal; i++) {
            if(val.get(i) > maxAngka) {
                maxAngka = val.get(i);
            } else if(val.get(i) < minAngka) {
                minAngka = val.get(i);
            }
            output += "angka[" + i + "] = " + val.get(i) + "\n";
        }

        output += "\nNilai terbesar adalah " + maxAngka + "\n";
        output += "Nilai terkecil adalah " + minAngka;

        return output;
    }
	
}