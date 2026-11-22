import javax.swing.JOptionPane;

public class LoopingActivity3 {
public static void main(String[] args) {
    double balance = 20000.00;

    double amount = Double.parseDouble(
            JOptionPane.showInputDialog("Enter amount: "));


    while (amount != 0) {
        if (amount < 0 && balance + amount < 0) {
            JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
        } else {
            balance += amount;
        }

        JOptionPane.showMessageDialog(null,
                "Outstanding balance: P" + String.format("%.2f", balance));

        amount = Double.parseDouble(
                JOptionPane.showInputDialog("Enter amount:"));

    }
}
