package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {

    private JPanel Calculator;
    private JTextField textField1;
    private JRadioButton on;
    private JRadioButton off;
    private JButton backspace;
    private JButton cButton;
    private JButton btnadd;
    private JButton btnSubtract;
    private JButton btnMultiply;
    private JButton btnDivide;
    private JButton btnEquals;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton btndot;
    private JButton a0Button;
    private JLabel lblNum;

    double num,ans;
    int calculation;

    public calculator() {
        on.setEnabled(false);


        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"9");
            }
        });
        off.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disable();
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        on.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enable();
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+"0");
            }
        });
        btndot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText()+".");
            }
        });
        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length =textField1.getText().length();
                int number =textField1.getText().length() -1;
                String store;

                if(length > 0)
                {
                    StringBuilder back = new StringBuilder(textField1.getText());
                    back.deleteCharAt(number);
                    store=back.toString();
                    textField1.setText(store);
                }
            }
        });
        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num =Double.parseDouble(textField1.getText());
                calculation =1;
                textField1.setText("");
                lblNum.setText(num + "+");


            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               mathcalc();
                lblNum.setText("");
            }
        });
        btnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num =Double.parseDouble(textField1.getText());
                calculation =2;
                textField1.setText("");
                lblNum.setText(num + "-");
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num =Double.parseDouble(textField1.getText());
                calculation =3;
                textField1.setText("");
                lblNum.setText(num + "*");
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num =Double.parseDouble(textField1.getText());
                calculation =4;
                textField1.setText("");
                lblNum.setText(num + "/");
            }
        });
    }
    public  void mathcalc()
    {
        switch (calculation)
        {
            case 1 :
                ans = num + Double.parseDouble(textField1.getText());
            textField1.setText(Double.toString(ans));
            break;

            case 2 :
                ans = num - Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(ans));
                break;

            case 3 :
                ans = num * Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(ans));
                break;

            case 4 :
                ans = num + Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(ans));
                break;
        }
    }
    public void disable()
    {
        on.setEnabled(true);
        off.setEnabled(false);
        textField1.setEnabled(false);
        btnadd.setEnabled(false);
        btnSubtract.setEnabled(false);
        btnDivide.setEnabled(false);
        a0Button.setEnabled(false);
        a1Button.setEnabled(false);
        a2Button.setEnabled(false);
        a3Button.setEnabled(false);
        a4Button.setEnabled(false);
        a5Button.setEnabled(false);
        a6Button.setEnabled(false);
        a7Button.setEnabled(false);
        a8Button.setEnabled(false);
        a9Button.setEnabled(false);
        btndot.setEnabled(false);
        backspace.setEnabled(false);
        cButton.setEnabled(false);
        btnMultiply.setEnabled(false);
        btnEquals.setEnabled(false);

    }
    public void enable()
    {
        on.setEnabled(false);
        off.setEnabled(true);
        textField1.setEnabled(true);
        btnadd.setEnabled(true);
        btnSubtract.setEnabled(true);
        btnDivide.setEnabled(true);
        a0Button.setEnabled(true);
        a1Button.setEnabled(true);
        a2Button.setEnabled(true);
        a3Button.setEnabled(true);
        a4Button.setEnabled(true);
        a5Button.setEnabled(true);
        a6Button.setEnabled(true);
        a7Button.setEnabled(true);
        a8Button.setEnabled(true);
        a9Button.setEnabled(true);
        btndot.setEnabled(true);
        backspace.setEnabled(true);
        cButton.setEnabled(true);
        btnMultiply.setEnabled(true);
        btnEquals.setEnabled(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
