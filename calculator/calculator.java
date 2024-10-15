import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calc {
 private JFrame f;
 private JTextField display;
 private double number1, number2;
 private char operation;

 public calc() {
  f = new JFrame();
  f.setSize(300, 300);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setLayout(new BorderLayout());

  display = new JTextField();
  display.setEditable(false);

  JPanel btnPanel = new JPanel(new GridLayout(4, 4));

  String[] labels = {"1", "2", "3", "+",
                "4", "5", "6", "-",
                "7", "8", "9", "%",
                "0", "*", "/", "="};

  for (String label : labels) {
   JButton btn = new JButton(label);
   btn.addActionListener(new ButtonListener());
   btnPanel.add(btn);
  }

  f.add(display, BorderLayout.NORTH);
  f.add(btnPanel, BorderLayout.CENTER);
  f.setVisible(true);
 }

 private class ButtonListener implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
   String command = e.getActionCommand();

   switch (command) {
    case "0": case "1": case "2": case "3": case "4":
    case "5": case "6": case "7": case "8": case "9":
     display.setText(display.getText() + command); 
     break;
    case "+": case "-": case "*": case "/": case "%":
     number1 = Double.parseDouble(display.getText());
     operation = command.charAt(0);
     display.setText(""); 
     break;
    case "=":
     number2 = Double.parseDouble(display.getText());
     double result = calculate(number1, number2, operation);
     display.setText(String.valueOf(result)); 
     break;
   }
  }

  private double calculate(double num1, double num2, char op) {
   switch (op) {
    case '+': return num1 + num2;
    case '-': return num1 - num2;
    case '*': return num1 * num2;
    case '/': 
     if(num2 != 0) return num1 / num2;
     else {
      JOptionPane.showMessageDialog(null, "Error! Division by zero is not allowed.");
      return 0;
     }
     case '%': return num1 % num2;
     default: return 0;
    }
   }
  }

  public static void main(String[] args) {
   new calc();
  }
 }
