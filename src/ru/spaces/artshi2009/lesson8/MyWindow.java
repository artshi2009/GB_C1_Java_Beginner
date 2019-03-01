package ru.spaces.artshi2009.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyWindow extends JFrame {
    private JButton[] buttons = {new JButton("1"), new JButton("2"), new JButton("3"),
                                new JButton("4"), new JButton("5"), new JButton("6"),
                                new JButton("7"), new JButton("8"), new JButton("9"),
                                new JButton(". "), new JButton("0"), new JButton("=")};
    private JButton[] opertors = {new JButton("/ "), new JButton("*"), new JButton("- "), new JButton("+")};
    private JButton clear = new JButton("CE");
    private JTextArea label = new JTextArea();

    private double value1 = 0;
    private double value2 = 0;
    private String operator = "";

    private int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;


    MyWindow() {
        System.out.println(screenWidth + " x " + screenHeight);

        drawWindow();
        drawElements();
        setOnButtonClickListener();

        setVisible(true);
    }

    private void drawElements() {
        JRootPane pane = getRootPane();
        pane.setLayout(null);

        pane.add(label);
        Insets insets = pane.getInsets();

        Dimension size;

        label.setBounds(20 + insets.left, 40 + insets.top,200, 30);

        label.setBackground(new Color(178, 178, 178));
        label.setForeground(new Color(0, 0, 0));

        int shiftButtonsX = 0;
        int shiftButtonsY = 1;
        for(int i = 0; i < buttons.length; i++) {
            shiftButtonsX += 50;
            pane.add(buttons[i]);
            size = buttons[i].getPreferredSize();
            buttons[i].setBounds(-30 + shiftButtonsX + insets.left, 120 + shiftButtonsY + insets.top, size.width, size.height);
            if ((shiftButtonsY + i) % 3 == 0){
                shiftButtonsY += 30;
                shiftButtonsX = 0;
            }
        }

        int shiftOperatosY = 0;
        for (JButton opertor : opertors) {
            pane.add(opertor);
            size = opertor.getPreferredSize();
            opertor.setBounds(180 + insets.left, 120 + shiftOperatosY + insets.top, size.width, size.height);
            shiftOperatosY += 30;
        }

        pane.add(clear);
        size = clear.getPreferredSize();
        clear.setBounds(116 + insets.left, 90 + insets.top, size.width, size.height);
    }

    private void drawWindow() {
        int widthWindow = 260;
        int heightWindow = 300;
        setBounds(screenWidth / 2 - widthWindow / 2,screenHeight / 2 - heightWindow / 2, widthWindow, heightWindow);
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

    }

    private void setOnButtonClickListener() {
        buttons[0].addActionListener(e -> {
            label.setText(label.getText() + 1);
            if (value1 == 0){
                value1 = Double.valueOf(label.getText());
            }else value2 = Double.valueOf(label.getText());
        });

        buttons[1].addActionListener(e -> {
            label.setText(label.getText() + 2);
            if (value1 == 0){
                value1 = Double.valueOf(label.getText());
            }else value2 = Double.valueOf(label.getText());
        });

        buttons[2].addActionListener(e -> {
            label.setText(label.getText() + 3);
            if (value1 == 0){
                value1 = Double.valueOf(label.getText());
            }else value2 = Double.valueOf(label.getText());
        });

        buttons[3].addActionListener(e -> {
            label.setText(label.getText() + 4);
            if (value1 == 0){
                value1 = Double.valueOf(label.getText());
            }else value2 = Double.valueOf(label.getText());
        });

        buttons[4].addActionListener(e -> {
            label.setText(label.getText() + 5);
            if (value1 == 0){
                value1 = Double.valueOf(label.getText());
            }else value2 = Double.valueOf(label.getText());
        });

        buttons[5].addActionListener(e -> {
            label.setText(label.getText() + 6);
            if (value1 == 0){
                value1 = Double.valueOf(label.getText());
            }else value2 = Double.valueOf(label.getText());
        });

        buttons[6].addActionListener(e -> {
            label.setText(label.getText() + 7);
            if (value1 == 0){
                value1 = Double.valueOf(label.getText());
            }else value2 = Double.valueOf(label.getText());
        });

        buttons[7].addActionListener(e -> {
            label.setText(label.getText() + 8);
            if (value1 == 0){
                value1 = Double.valueOf(label.getText());
            }else value2 = Double.valueOf(label.getText());
        });

        buttons[8].addActionListener(e -> {
            label.setText(label.getText() + 9);
            if (value1 == 0){
                value1 = Double.valueOf(label.getText());
            }else value2 = Double.valueOf(label.getText());
        });

            buttons[9].addActionListener(e -> {
                try {
                    label.setText(label.getText() + ".");
                } catch (Exception e1){
                    System.out.println();
                }
            });


        buttons[10].addActionListener(e -> {
            label.setText(label.getText() + 0);
            if (value1 == 0){
                value1 = Double.valueOf(label.getText());
            }else value2 = Double.valueOf(label.getText());
        });

        buttons[11].addActionListener(e -> {
            double num = value1;
            double num1 = value2;
            String strOp = operator;

            Calculate calc = new Calculate();
            String res = String.valueOf(calc.calc(num, strOp, num1));
            label.setText(res);
        });

        opertors[0].addActionListener(e -> {
            value1 = Double.valueOf(label.getText());
            label.setText("");
            operator = "/";
        });

        opertors[1].addActionListener(e -> {
            value1 = Double.valueOf(label.getText());
            label.setText("");
            operator = "*";
        });

        opertors[2].addActionListener(e -> {
            value1 = Double.valueOf(label.getText());
            label.setText("");
            operator = "-";
        });

        opertors[3].addActionListener(e -> {
            value1 = Double.valueOf(label.getText());
            label.setText("");
            operator = "+";
        });

        clear.addActionListener(e -> {
            value1 = 0;
            value2 = 0;
            label.setText("");
        });
    }
}
