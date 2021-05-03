package com.company;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {


    private String string ="";
    private char operator;
    private String str1="";
    private String str2="";
    private double num1;
    private double num2;
    private double res;

    public void clear (){
        num1=0;
        num2=0;
    }
    public void minus(double num1, double num2) {
        this.res = num1 - num2;
        System.out.println(this.res);
        ;
    }

    public void plus(double x, double y) {
        this.res = num1 + num2;
        System.out.println(this.res);
    }

    public void multiply(double num1, double num2) {
        this.res = num1 * num2;
        System.out.println(this.res);
    }

    public void divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Can't div by zero.");
            return;
        }
        this.res = num1 / num2;
        System.out.println(this.res);
    }


    Calculator() {
        this.setLayout(null);
        this.setSize(400, 560);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createButton();


    }

    private void createButton() {
        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();
        JButton b6 = new JButton();
        JButton b5 = new JButton();
        JButton b7 = new JButton();
        JButton b8 = new JButton();
        JButton b9 = new JButton();
        JButton b0 = new JButton();
        JButton plus = new JButton();
        JButton minus = new JButton();
        JButton multi = new JButton();
        JButton divide = new JButton();
        JButton equals = new JButton();
        JButton point = new JButton();


        b1.setBounds(0, 360, 80, 80);
        b2.setBounds(80, 360, 80, 80);
        b3.setBounds(160, 360, 80, 80);
        b4.setBounds(0, 280, 80, 80);
        b5.setBounds(80, 280, 80, 80);
        b6.setBounds(160, 280, 80, 80);
        b7.setBounds(0, 200, 80, 80);
        b8.setBounds(80, 200, 80, 80);
        b9.setBounds(160, 200, 80, 80);
        b0.setBounds(0, 440, 160, 80);
        plus.setBounds(240, 200, 80, 80);
        minus.setBounds(240, 280, 80, 80);
        multi.setBounds(240, 360, 80, 80);
        divide.setBounds(240, 440, 80, 80);
        equals.setBounds(320, 360, 80, 160);
        point.setBounds(160, 440, 80, 80);


        add_Button(b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, plus, minus, multi, divide, equals, point);


        setText(b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, plus, minus, multi, divide, equals, point);

        b0.addActionListener((event) -> {
            string += "0";
        });
        b1.addActionListener((event) -> {
            string += "1";
        });
        b2.addActionListener((event) -> {
            string += "2";
        });
        b3.addActionListener((event) -> {
            string += "3";
        });
        b4.addActionListener((event) -> {
            string += "4";
        });
        b5.addActionListener((event) -> {
            string += "5";
        });
        b6.addActionListener((event) -> {
            string += "6";
        });
        b7.addActionListener((event) -> {
            string += "7";
        });
        b8.addActionListener((event) -> {
            string += "8";
        });
        b9.addActionListener((event) -> {
            string += "9";
        });
        plus.addActionListener((event) -> {
            string += "+";
        });
        minus.addActionListener((event) -> {
            string += "-";
        });
        multi.addActionListener((event) -> {
            string += "*";
        });
        divide.addActionListener((event) -> {
            string += "/";
        });
        equals.addActionListener((event) -> {
            System.out.println(string);
            calculator(string);
            switch_Operator(operator);
        });
    }

    private void switch_Operator(char operator) {
        switch (operator) {
            case (43): { //43==+
                plus(num1, num2);
                break;
            }
            case (45): {//42==-
                minus(num1, num2);
                break;
            }
            case (47): {//47==/
                divide(num1, num2);
                break;
            }
            case (42): {
                multiply(num1, num2);
                break;
            }
        }
    }

    public double calculator(String string) {
        double res = 0;
        char[] arr = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            arr[i] = string.charAt(i);
        }
        for (int i = 0; i < string.length(); i++) {
            if (arr[i] == 43 || arr[i] == 45 || arr[i] == 42 || arr[i] == 47) {
                operator = arr[i];

                for (int j = 0; j < i; j++) {
                    str1 += arr[j];
                }
                System.out.println(str1);
                for (int k = i + 1; k < string.length(); k++) {
                    str2 += arr[k];
                }
                System.out.println(str2);

            }
        }
        num1 = Integer.parseInt(str1);
        num2 = Integer.parseInt(str2);
        return operator;
    }

    ;

    private void add_Button(JButton b1, JButton b2, JButton b3, JButton b4, JButton b5, JButton b6, JButton b7, JButton b8, JButton b9, JButton b0, JButton plus, JButton minus, JButton multi, JButton divide, JButton equals, JButton point) {
        this.add(b0);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(plus);
        this.add(minus);
        this.add(multi);
        this.add(divide);
        this.add(equals);
        this.add(point);
    }

    private void setText(JButton b1, JButton b2, JButton b3, JButton b4, JButton b5, JButton b6, JButton b7, JButton b8, JButton b9, JButton b0, JButton plus, JButton minus, JButton multi, JButton divide, JButton equals, JButton point) {

        Font font = new Font(Font.SERIF, Font.BOLD, 15);

        b1.setText("1");
        b2.setText("2");
        b3.setText("3");
        b4.setText("4");
        b5.setText("5");
        b6.setText("6");
        b7.setText("7");
        b8.setText("8");
        b9.setText("9");
        b0.setText("0");
        plus.setText("+");
        minus.setText("-");
        multi.setText("*");
        divide.setText("/");
        point.setText(".");
        equals.setText("=");

    }


}
