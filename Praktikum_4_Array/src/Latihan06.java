import javax.swing.JOptionPane;

public class Latihan06 {
	
	public static void main(String[] args) {
        Latihan06 mainApps = new Latihan06();
		int[][] matriksA = new int[2][2];
		int[][] matriksB = new int[2][2];
		
		final int BARIS = matriksA.length;
		final int KOLOM = matriksA[0].length;
		
		for(int i = 0; i < BARIS; i++) {
			for(int j = 0; j < KOLOM; j++) {
				String valuesMatA = JOptionPane.showInputDialog(null,
									"Masukkan angka:",
									"Matriks A[" + i + "][" + j + "]",
									JOptionPane.QUESTION_MESSAGE);
				matriksA[i][j] = Integer.parseInt(valuesMatA);
			}
		}
		
		for(int x = 0; x < BARIS; x++) {
			for(int y = 0; y < KOLOM; y++) {
				String valuesMatB = JOptionPane.showInputDialog(null,
									"Masukkan angka:",
									"Matriks B[" + x + "][" + y + "]",
									JOptionPane.QUESTION_MESSAGE);
				matriksB[x][y] = Integer.parseInt(valuesMatB);
			}
		}
		
        String output = "";
        String outMatriksA = "Matriks A:\n" + mainApps.printArray(matriksA); 
        String outMatriksB = "\nMatriks B:\n" + mainApps.printArray(matriksB); 

        output += outMatriksA + outMatriksB;
		
		JOptionPane.showMessageDialog(null, output);
	}

    private String printArray(int[][] val) {
        String output = "";

        for(int i = 0; i < val.length; i++) {
            for(int j = 0; j < val[0].length; j++) {
                output += val[i][j] + " ";
            }
            output += "\n";
        }

        return output;
    }
    
}