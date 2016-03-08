import javax.swing.JOptionPane;

public class TestDropDown {

    public static void main(String[] args) {
        String[] choices = new String[]{"cats", "dogs"};
        String choice = askUser(choices);
        System.out.println("selected: " + choice);
    }

    static String askUser(String[] choices) {
        String s = (String) JOptionPane.showInputDialog(
                null,
                "make your choice",
                "Try GUI",
                JOptionPane.PLAIN_MESSAGE,
                null,
                choices,
                choices[0]);
        return s;
    }
}







//source: http://stackoverflow.com/questions/13408238/simple-java-gui-as-a-popup-window-and-drop-down-menu