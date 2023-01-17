package com.ibik.pbo.praktikum;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameSlime extends JFrame implements KeyListener {
	private static final long serialVersionUID = 1L;
    private JLabel slime;
    private int x = 187;
    private int y = 203;
    private int speed = 9;

    public GameSlime() {
        setTitle("GameSlime");
        getContentPane().setBackground(Color.CYAN);
        setResizable(false);
        setSize(565, 438);
//        setBounds(100, 100, 656, 630);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        
        // Load image as icon
//        ImageIcon icon = new ImageIcon("/rocket.png");

        slime = new JLabel("");
        Image icon = new ImageIcon (this.getClass().getResource("/image/slimekanan.png")).getImage();
        slime.setIcon(new ImageIcon (icon));
        slime.setBounds(x, y, 203, 187);
        getContentPane().add(slime);

        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        // Move left
        if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) {
            x -= speed;
        }
        // Move right
        else if (keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) {
            x += speed;
        }
        // Move up
        else if (keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP) {
            y -= speed;
        }
        // Move down
        else if (keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN) {
            y += speed;
        }

        // Check if object is at the edge of the frame
        if (x < 0) {
            // Change object to another image
        	Image icon = new ImageIcon (this.getClass().getResource("/image/slimekanan.png")).getImage();
        	slime.setIcon(new ImageIcon (icon));
            x = 0;
        } else if (x > 405) {
            // Change object to another image
        	Image icon = new ImageIcon (this.getClass().getResource("/image/slimekiri.png")).getImage();
        	slime.setIcon(new ImageIcon (icon));
            x = 405;
        } else if (y < 0 || y > 290) {
            // Change object to another image
            y = slime.getY();
        }
        

        // Update label position
        slime.setBounds(x, y, slime.getWidth(), slime.getHeight());
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        GameSlime frame = new GameSlime();
        frame.setVisible(true);
    }
}