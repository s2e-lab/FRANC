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
        JLabel jLabel1 = new JLabel("Null layout in table");
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(jLabel1, gbc);


}
}