import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class SimpleWindow extends JFrame{

    
    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);
    
    public SimpleWindow() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
        setLayout(null);
        setTitle("Web Crawler");
        
        JPanel panel = new JPanel();
        setContentPane(panel);
        panel.add(textArea);
        
        textArea.setName("TextArea");
        textArea.setText("Juvia loves Gray-sama");
        textArea.setEditable(false);
       
        
        //var spane = new JScrollPane(textArea);
        
        //
        //add(spane);
        //spane.setVisible(true);
        System.out.println(this.getComponentAt(0, 0));
        
    }
    
    public static void main(String[] args) {
        SimpleWindow sw = new SimpleWindow();
    }

}
