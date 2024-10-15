import javax.swing.*;
import java.awt.event.*;

class NumButton {
 public JButton createBtn(String name, int bound) {
  JButton b = new JButton(name);
  b.setBounds(100,bound,50,40);
  return b;
 }
}

class calc {
 public calc() {
  NumButton num = new NumButton();
  JFrame f = new JFrame();
  JButton n1 = num.createBtn("1",50);
  JButton n2 = num.createBtn("2",100);
  JButton n3 = num.createBtn("3",150);
  JButton n4 = num.createBtn("4",200);
  JButton n5 = num.createBtn("5",250);
  JButton n6 = num.createBtn("6",300);
  JButton n7 = num.createBtn("7",350);
  JButton n8 = num.createBtn("8",400);
  JButton n9 = num.createBtn("9",450);
  JButton n0 = num.createBtn("0",500);
  f.add(n1);
  f.add(n2);
  f.add(n3);
  f.add(n4);
  f.add(n5);
  f.add(n6);
  f.add(n7);
  f.add(n8);
  f.add(n9);
  f.add(n0);
  f.setSize(1000,1000);
  f.setLayout(null);
  f.setVisible(true);
 }

 public static void main(String[] args) {
  new calc();
 }
}
