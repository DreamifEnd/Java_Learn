/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-02-22
 * @Time: 9:04
 */
import javax.swing.*;
public class Test {
    public static void main(String[] args) {
         JFrame frame = new JFrame("test");
         JPanel panel = new JPanel();
         JButton button = new JButton("A swing button");
         panel.setBorder(BorderFactory.createTitledBorder("JPanel"));
         panel.add(button);
         frame.add(panel);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(1200,700);
         frame.setLocation(0,0);
         frame.setVisible(true);
    }
}
