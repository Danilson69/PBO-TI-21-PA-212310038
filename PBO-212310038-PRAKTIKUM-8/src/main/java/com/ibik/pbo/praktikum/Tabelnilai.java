package com.ibik.pbo.praktikum;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabelnilai extends JFrame {
	Tabelnilai() {
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setSize(1000, 500);
        setTitle("Latihan5");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GenerateUI(this);
    }

    public static void main(String[] args) {
        new  Tabelnilai();
    }

    private void GenerateUI( Tabelnilai frame) {
        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        JMenuItem file1 = new JMenuItem("New");
        JMenuItem file2 = new JMenuItem("Save");
        JMenuItem file3 = new JMenuItem("Save as");
        JMenuItem file4 = new JMenuItem("Export");
        JMenuItem file5 = new JMenuItem("Import");
        JMenuItem file6 = new JMenuItem("Exit");
        fileMenu.add(file1);
        fileMenu.add(file2);
        fileMenu.add(file3);
        fileMenu.add(file4);
        fileMenu.add(file5);
        fileMenu.add(file6);


        frame.setJMenuBar(menuBar);

       
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frame.setContentPane(mainPanel);
       
       
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        JLabel headerTitle = new JLabel("FORM PENILAIAN MATAKULIAH PBO");
        headerPanel.add(headerTitle);
    
        Border lftPanelBorder = BorderFactory.createTitledBorder("Input Data Mahasiswa");
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setPreferredSize(new Dimension(500, 600));
        mainPanel.add(leftPanel, BorderLayout.WEST);
        

       
        JLabel npmLabel = new JLabel("NPM");
        npmLabel.setBounds(30, 40, 80, 30);
        leftPanel.add(npmLabel);
   

        JTextField inputNPM = new JTextField();
        inputNPM.setBounds(30, 80, 400, 30);
        leftPanel.add(inputNPM);
       
        JLabel gradeLabel = new JLabel("Nilai");
        gradeLabel.setBounds(30, 200, 80, 30);
        leftPanel.add(gradeLabel);

        JLabel namaLabel = new JLabel("Nama");
        namaLabel.setBounds(30, 120, 80, 30);
        leftPanel.add(namaLabel);

        JTextField inputNama = new JTextField();
        inputNama.setBounds(30, 160, 400, 30);
        leftPanel.add(inputNama);
        

        JRadioButton nilaiA = new JRadioButton("A");
        nilaiA.setBounds(25, 240, 50, 30);
        leftPanel.add(nilaiA);
       
 
        JRadioButton nilaiB = new JRadioButton("B");
        nilaiB.setBounds(100, 240, 50, 30);
        leftPanel.add(nilaiB);

        JRadioButton nilaiC = new JRadioButton("C");
        nilaiC.setBounds(175, 240, 50, 30);
        leftPanel.add(nilaiC);

        JRadioButton nilaiD = new JRadioButton("D");
        nilaiD.setBounds(250, 240, 50, 30);
        leftPanel.add(nilaiD);

        JRadioButton nilaiE = new JRadioButton("E");
        nilaiE.setBounds(325, 240, 50, 30);
        leftPanel.add(nilaiE);

        JRadioButton nilaiF = new JRadioButton("F");
        nilaiF.setBounds(400, 240, 50, 30);
        leftPanel.add(nilaiF);

        ButtonGroup nilai = new ButtonGroup();
        nilai.add(nilaiA);
        nilai.add(nilaiB);
        nilai.add(nilaiC);
        nilai.add(nilaiD);
        nilai.add(nilaiE);
        nilai.add(nilaiF);

        // // Button CRUD Data
        JButton btnSave = new JButton("Save");
        btnSave.setBounds(25, 280, 100, 30);
        leftPanel.add(btnSave);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(175, 280, 100, 30);
        leftPanel.add(btnDelete);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(325, 280, 100, 30);
        leftPanel.add(btnClear);
        // End of Panel Content
        leftPanel.setBorder(lftPanelBorder);
        // End of Form

        // Table
        Border tabel = BorderFactory.createTitledBorder("Data Mahasiswa");
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainPanel.add(rightPanel, BorderLayout.EAST);
     
        String data[][] = {
                { "212310038", "Danilson Daka", "A" },
                { "212310057", "Angelus Osvaldo", "B" },
                { "212310058", "Mattew", "C" }
        };
        String column[] = {
                "NPM",
                "Nama",
                "Nilai"
        };

        JTable output = new JTable(data, column);
        output.setBounds(22, 40, 480, 450);
        
        JScrollPane scrollPane = new JScrollPane(output);

        rightPanel.add(scrollPane);
        rightPanel.setBorder(tabel);
    }
}