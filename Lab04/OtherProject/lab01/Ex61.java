package Main;
import java.swing.JOptionPane;

public class Ex61 {
	public static void main(String[] arg) {
        int option = javax.swing.JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        javax.swing.JOptionPane.showMessageDialog(null, "You chose " + (option == javax.swing.JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
