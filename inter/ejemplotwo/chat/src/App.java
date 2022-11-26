import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("bottom text");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("archivo");
        JMenu helpMenu =new JMenu("ayuda");
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        JMenuItem openItem = new JMenuItem("abrir");
        JMenuItem savItem = new JMenuItem("Save como");
        fileMenu.add(openItem);
        helpMenu.add(savItem);
            

        JPanel panel = new JPanel();
        JLabel messagLabel = new JLabel("mensaje: ");
        JTextField chatTextField = new JTextField(10);
        JButton sendButton = new JButton("enviar: ");
        JButton resetButton = new JButton("restablecer");
        panel.setLayout(new FlowLayout());
        panel.add(messagLabel);
        panel.add(chatTextField);
        panel.add(sendButton);
        panel.add(resetButton);

        JTextArea chatHistory = new JTextArea();
        chatHistory.setEditable(false);

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, chatHistory);

      
    
        frame.setVisible(true);

        sendButton.addActionListener(addMessage(chatTextField.getText(), chatHistory,chatTextField));
        resetButton.addActionListener(resetTextField(chatTextField));
    
    }

        public static void resetTextField(JTextField target){
            target.setText("");
        }

        public static void addMessage(String message, JTextArea targetTextArea, JTextField targetTextField){
            targetTextArea.append("\nUsuario1 dice:"+message);
            resetTextField(targetTextField);
        }
    }

   


