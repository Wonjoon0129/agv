/*
 * Created by JFormDesigner on Fri Dec 06 14:57:19 CST 2024
 */

package org.example.UserInterfFace;

import java.awt.*;
import javax.swing.*;

/**
 * @author shanchen
 */
public class AGVUI extends JFrame {
    public AGVUI() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setTitle("AGVs\u8c03\u5ea6\u7cfb\u7edf");
        setResizable(false);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("\u8bfb\u53d6AGV");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(0, 0), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("\u8bfb\u53d6\u4efb\u52a1\u5217\u8868");
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(180, 0), button2.getPreferredSize()));

        //---- button3 ----
        button3.setText("\u8ba1\u7b97\u7ed3\u679c");
        contentPane.add(button3);
        button3.setBounds(new Rectangle(new Point(360, 0), button3.getPreferredSize()));

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
