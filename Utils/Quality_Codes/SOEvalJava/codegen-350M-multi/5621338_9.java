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
        if (table == null){
            JTable add = new Table();
            add.setLayout(new WrapLayout());
            JLabel label = new JLabel("Adding table null layout");
            label.setForeground(Color.red);
            label.setFont(new Font("Tahoma Bold",Font.BOLD,30));
            add.add(label);
            add.setToolTipText("Adding table null layout");
            panel.add(table,1);
        }
    }
}

