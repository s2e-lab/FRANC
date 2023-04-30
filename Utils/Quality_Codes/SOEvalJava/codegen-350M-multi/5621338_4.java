import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import javax.swing.*;
import javax.swing.table.*;


class ID_5621338{
    /**
     * Add JTable in JPanel with null layout
     */
    public static void addTable(JPanel panel, JTable table) {
        final JLabel label = new JLabel("");
        panel.add(label);
        JPanel row = new JPanel(new GridLayout(1, 2));
        panel.add(row);
        final JTextField textField = new JTextField("0123456789");
        panel.add(textField);
        JButton button = new JButton("Add");
}
}