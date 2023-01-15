import java.util.Scanner;

public class Latihan02 {

	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		int nilai[] = new int [2];
		int nilaiInput;
		
		for(int i = 0; i < nilai.length; i++) {
			System.out.println("Masukan Nilai Array indeks ke -" + i +  "=");
			nilaiInput = inputUser.nextInt();
			nilai[i]= nilaiInput;
		}
		for(int j =0; j < nilai.length; j++) {
			System.out.println("Array["+ j+"]"+nilai[j]);
		}
		inputUser.close();
	}

}