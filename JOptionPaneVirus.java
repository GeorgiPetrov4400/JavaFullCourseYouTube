import javax.swing.JOptionPane;

public class JOptionPaneVirus {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "This is some useless info",
                "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "The euro is 1.95583",
                "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "What's going on?",
                "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your computer has a VIRUS!",
                "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is error",
                "title", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Do you like it to code?",
                "Title", JOptionPane.YES_NO_OPTION);

        String name = JOptionPane.showInputDialog("What is your name");
        System.out.println("Hello " + name);

        String[] responses = {"Thank you", "You will be", "No"};
        JOptionPane.showOptionDialog(null, "You will be programmer", "Future",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
    }
}
