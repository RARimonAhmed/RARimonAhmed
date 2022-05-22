
package snakeprojecttest;
import javax.swing.JFrame;
public class Main {
    public Main(){
        JFrame frame = new JFrame();
        Gamepanal gamepanal = new Gamepanal();
        frame.add(gamepanal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake Game By Rimon Ahmed.");
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
