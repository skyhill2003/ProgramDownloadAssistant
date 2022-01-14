package tk.skyhill2003.programdownloadassistant.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp extends JFrame {
    private JButton button1;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new MainApp().mainPanel);
        frame.setTitle("ProgrammDownloadAssistant");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        // Test
    }

    public MainApp() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
