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
        JPanel jp = new JPanel();
        jp.setLayout(new BoxLayout(jp, BoxLayout.X_AXIS));
        JPanel panel1 = new JPanel();
	panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel1.add(boxPanel(jp));
        panel1.add(table);
        panel.add(panel1);
    }

    /** 
     * BoxPanel panel. BoxPanel panel is added 
     * in JPanel class.
     */
}