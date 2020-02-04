import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Tue Feb 04 14:38:26 CST 2020
 */



/**
 * @author unknown
 */
public class Tester extends JFrame {
    public Tester() {
        initComponents();
        Helper helper = new Helper();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        spinner1 = new JSpinner();
        label2 = new JLabel();
        spinner2 = new JSpinner();
        label9 = new JLabel();
        spinner3 = new JSpinner();
        label3 = new JLabel();
        spinner4 = new JSpinner();
        label4 = new JLabel();
        textField1 = new JTextField();
        separator1 = new JSeparator();
        label5 = new JLabel();
        textField2 = new JTextField();
        label6 = new JLabel();
        goalText = new JTextField();
        separator2 = new JSeparator();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        label7 = new JLabel();
        resultsLabel = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("QA SW Assignment 2");
        setResizable(false);
        setMaximizedBounds(new Rectangle(0, 0, 400, 400));
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[84,fill]" +
            "[85,fill]" +
            "[58,fill]" +
            "[44,fill]0" +
            "[85,fill]",
            // rows
            "[44]" +
            "[17]" +
            "[19]" +
            "[32]" +
            "[]" +
            "[]" +
            "[45]" +
            "[]" +
            "[22]" +
            "[14]" +
            "[18]"));

        //---- label1 ----
        label1.setText("Weight (lb)");
        contentPane.add(label1, "cell 0 0 1 2");
        contentPane.add(spinner1, "cell 1 0 1 2");

        //---- label2 ----
        label2.setText("Height (ft)");
        contentPane.add(label2, "cell 3 0");
        contentPane.add(spinner2, "cell 4 0");

        //---- label9 ----
        label9.setText("Height (in)");
        contentPane.add(label9, "cell 3 1");
        contentPane.add(spinner3, "cell 4 1");

        //---- label3 ----
        label3.setText("Age");
        contentPane.add(label3, "cell 0 3");
        contentPane.add(spinner4, "cell 1 3");

        //---- label4 ----
        label4.setText("Salary (Yearly)");
        contentPane.add(label4, "cell 3 3");
        contentPane.add(textField1, "cell 4 3");
        contentPane.add(separator1, "cell 0 4 5 1");

        //---- label5 ----
        label5.setText("Percent Saved");
        contentPane.add(label5, "cell 0 6");
        contentPane.add(textField2, "cell 1 6");

        //---- label6 ----
        label6.setText("Goal");
        contentPane.add(label6, "cell 3 6");
        contentPane.add(goalText, "cell 4 6");
        contentPane.add(separator2, "cell 0 7 5 1");

        //---- radioButton1 ----
        radioButton1.setText("BMI Checker");
        radioButton1.setSelected(true);
        contentPane.add(radioButton1, "cell 1 8");

        //---- radioButton2 ----
        radioButton2.setText("Savings Checker");
        contentPane.add(radioButton2, "cell 3 8");

        //---- label7 ----
        label7.setText("Result:");
        contentPane.add(label7, "cell 1 9");
        contentPane.add(resultsLabel, "cell 3 9");

        //---- button1 ----
        button1.setText("Start");
        contentPane.add(button1, "cell 0 10 5 1");
        setSize(425, 315);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JSpinner spinner1;
    private JLabel label2;
    private JSpinner spinner2;
    private JLabel label9;
    private JSpinner spinner3;
    private JLabel label3;
    private JSpinner spinner4;
    private JLabel label4;
    private JTextField textField1;
    private JSeparator separator1;
    private JLabel label5;
    private JTextField textField2;
    private JLabel label6;
    private JTextField goalText;
    private JSeparator separator2;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JLabel label7;
    private JLabel resultsLabel;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
