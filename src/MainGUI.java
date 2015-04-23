import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.GridBagLayout; 
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame; 
import javax.swing.JButton;
import javax.swing.JFileChooser; 
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.File; 
public class MainGUI extends JFrame{

JLabel label = new JLabel("Vyberit fayl z koordynatamy");
JLabel labe2= new JLabel("Vidobrazhennya karty");
static JButton fileopen1= new JButton("Zavantazhte kfayl z koordynatamy mist");
static JButton button = new JButton("Znayty kartu naykorotshych shlyahiv");


public MainGUI() {
      JPanel panel = new JPanel();
      this.setTitle("Графічний інтерфейс для пошуку найкоротших шляхів в Україні");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,400);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(0,1));
		this.setVisible(true);
      panel.add(label);
      panel.add(fileopen1);
      panel.add(labe2);
      panel.add(button);
      this.add(panel);}  

public static void gui () {
FileFilter filter = new FileNameExtensionFilter("text files", "txt"); 
JFileChooser fileopen = new JFileChooser();
fileopen.addChoosableFileFilter(filter); 
int ret = fileopen.showDialog(null, "Select file"); 
if (ret == JFileChooser.APPROVE_OPTION) { 
File file= fileopen.getSelectedFile(); 
String fname = file.getName();
Mistax.fname=fname;
System.out.println(Mistax.fname);
}
}

static class ChooserListener implements  ActionListener {
public void actionPerformed(ActionEvent actionEvent) { 
gui();
}
}

public void addFileChooser () {
fileopen1.addActionListener(new ChooserListener());
}

static public void addButtonListener() {
button.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
new Graf();
}
});}


     
public static void main(String[] args) {
MainGUI b=new MainGUI();
b.addFileChooser();
addButtonListener();
//b.gui();
}
}