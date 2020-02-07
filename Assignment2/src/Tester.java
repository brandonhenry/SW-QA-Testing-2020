import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/**
 * @author unknown
 */
public class Tester extends JFrame {

    Helper helper;

    public Tester() {
        initComponents();

        helper = new Helper();
    }

    private void button1ActionPerformed(ActionEvent e) {
        if (bmi.isSelected()){
            resultsLabel.setText(helper.getBMI((int) feetVal.getValue(), (int) inchVal.getValue(), (int) weightVal.getValue()));
        } else if (savings.isSelected()){

            resultsLabel.setText(helper.checkRetirement((int) ageVal.getValue(), Integer.parseInt(salaryVal.getText()),
                    Integer.parseInt(percentSavedVal.getText()), Integer.parseInt(goalVal.getText())));
        }
    }

    private void bmiActionPerformed(ActionEvent e) {
        savings.setSelected(false);
    }

    private void savingsActionPerformed(ActionEvent e) {
        bmi.setSelected(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        weightVal = new JSpinner();
        label2 = new JLabel();
        feetVal = new JSpinner();
        label9 = new JLabel();
        inchVal = new JSpinner();
        separator1 = new JSeparator();
        label3 = new JLabel();
        ageVal = new JSpinner();
        label4 = new JLabel();
        salaryVal = new JTextField();
        label5 = new JLabel();
        percentSavedVal = new JTextField();
        label6 = new JLabel();
        goalVal = new JTextField();
        separator2 = new JSeparator();
        bmi = new JRadioButton();
        savings = new JRadioButton();
        label7 = new JLabel();
        resultsLabel = new JLabel();
        start = new JButton();

        //======== this ========
        setTitle("QA SW Assignment 2");
        setResizable(false);
        setMaximizedBounds(new Rectangle(0, 0, 400, 400));
        setBackground(new Color(51, 51, 51));
        setForeground(new Color(51, 51, 51));
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
            "[45]" +
            "[]" +
            "[22]" +
            "[14]" +
            "[18]"));

        //---- label1 ----
        label1.setText("Weight (lb)");
        contentPane.add(label1, "cell 0 0 1 2");
        contentPane.add(weightVal, "cell 1 0 1 2");

        //---- label2 ----
        label2.setText("Height (ft)");
        contentPane.add(label2, "cell 3 0");
        contentPane.add(feetVal, "cell 4 0");

        //---- label9 ----
        label9.setText("Height (in)");
        contentPane.add(label9, "cell 3 1");
        contentPane.add(inchVal, "cell 4 1");
        contentPane.add(separator1, "cell 0 2 5 1");

        //---- label3 ----
        label3.setText("Age");
        contentPane.add(label3, "cell 0 3");
        contentPane.add(ageVal, "cell 1 3");

        //---- label4 ----
        label4.setText("Salary (Yearly)");
        contentPane.add(label4, "cell 3 3");

        //---- salaryVal ----
        salaryVal.setText("10000");
        contentPane.add(salaryVal, "cell 4 3");

        //---- label5 ----
        label5.setText("Percent Saved");
        contentPane.add(label5, "cell 0 4");

        //---- percentSavedVal ----
        percentSavedVal.setText("20");
        contentPane.add(percentSavedVal, "cell 1 4");

        //---- label6 ----
        label6.setText("Goal");
        contentPane.add(label6, "cell 3 4");

        //---- goalVal ----
        goalVal.setText("100000");
        contentPane.add(goalVal, "cell 4 4");
        contentPane.add(separator2, "cell 0 5 5 1");

        //---- bmi ----
        bmi.setText("BMI Checker");
        bmi.setSelected(true);
        bmi.addActionListener(e -> bmiActionPerformed(e));
        contentPane.add(bmi, "cell 1 6");

        //---- savings ----
        savings.setText("Savings Checker");
        savings.addActionListener(e -> savingsActionPerformed(e));
        contentPane.add(savings, "cell 3 6");

        //---- label7 ----
        label7.setText("Result:");
        contentPane.add(label7, "cell 1 7");
        contentPane.add(resultsLabel, "cell 3 7");

        //---- start ----
        start.setText("Start");
        start.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(start, "cell 0 8 5 1");
        setSize(425, 315);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JSpinner weightVal;
    private JLabel label2;
    private JSpinner feetVal;
    private JLabel label9;
    private JSpinner inchVal;
    private JSeparator separator1;
    private JLabel label3;
    private JSpinner ageVal;
    private JLabel label4;
    private JTextField salaryVal;
    private JLabel label5;
    private JTextField percentSavedVal;
    private JLabel label6;
    private JTextField goalVal;
    private JSeparator separator2;
    private JRadioButton bmi;
    private JRadioButton savings;
    private JLabel label7;
    private JLabel resultsLabel;
    private JButton start;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
