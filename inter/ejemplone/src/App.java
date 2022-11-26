import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception {

        JFrame frame =new JFrame("botom text");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);;

        JButton button = new JButton("presiona");
        frame.getContentPane().add(button);

        JButton button2 = new JButton("presiona pero este no ");
        frame.getContentPane().add(button2);

        frame.setVisible(true);

        System.out.println("Hello, World!");
    
    }
}
