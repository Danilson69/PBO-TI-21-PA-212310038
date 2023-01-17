package com.ibik.pbo.praktikum;

import javax.swing.JOptionPane;
import com.ibik.pbo.praktikum.*;
import com.ibik.pbo.praktikum.Tess.LoginFrom;

public class MainApps {
    public static void main(String[] args) {
        DBConnection db = new DBConnection();
        try {
            db.connect();
            // RegisterForm regForm = new RegisterForm();
            LoginFrom login = new LoginFrom();
            login.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}