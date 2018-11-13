package cn.calculator;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Calulator extends JFrame{
JTextField Text;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
JPanel p;
double num=0;
String numstr=null;
public Calulator(){
	this.setTitle("计算器");
	
	//实例按钮并设置按钮属性
	b1=new JButton("1" );
	b2=new JButton("2");
	b3=new JButton("3");
	b4=new JButton("+");
	b5=new JButton("4");
	b6=new JButton("5");
	b7=new JButton("6");
	b8=new JButton("-");
	b9=new JButton("7");
	b10=new JButton("8");
	b11=new JButton("9");
	b12=new JButton("*");
	b13=new JButton("c");
	b14=new JButton("0");
	b15=new JButton("=");
	b16=new JButton("/");
	b1.setBackground(Color.lightGray);
	b2.setBackground(Color.lightGray);
	b3.setBackground(Color.lightGray);
	b4.setBackground(Color.lightGray);
	b5.setBackground(Color.lightGray);
	b6.setBackground(Color.lightGray);
	b7.setBackground(Color.lightGray);
	b8.setBackground(Color.lightGray);
	b9.setBackground(Color.lightGray);
	b10.setBackground(Color.lightGray);
	b11.setBackground(Color.lightGray);
	b12.setBackground(Color.lightGray);
	b13.setBackground(Color.lightGray);
	b14.setBackground(Color.lightGray);
	b15.setBackground(Color.lightGray);
	b16.setBackground(Color.lightGray);
	//实例容器存放按钮
	p=new JPanel(new GridLayout(4, 4));
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	p.add(b5);
	p.add(b6);
	p.add(b7);
	p.add(b8);
	p.add(b9);
	p.add(b10);
	p.add(b11);
	p.add(b12);
	p.add(b13);
	p.add(b14);
	p.add(b15);
	p.add(b16);
	//设置按下按钮会发生的事件
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Text.setText(Text.getText()+"1");
		}
	});
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Text.setText(Text.getText()+"2");
		}
	});
	b3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Text.setText(Text.getText()+"3");
		}
	});
	b5.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Text.setText(Text.getText()+"4");
		}
	});
	b6.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Text.setText(Text.getText()+"5");
		}
	});
	b7.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Text.setText(Text.getText()+"6");
		}
	});
	b9.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Text.setText(Text.getText()+"7");
		}
	});
	b10.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Text.setText(Text.getText()+"8");
		}
	});
	b11.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Text.setText(Text.getText()+"9");
		}
	});
	b4/*加号*/.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			check();
			Text.setText("+");
			
			
		}
	});
	b8/*减号*/.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			check();
			Text.setText("-");
		}
	});
	b12/*乘号*/.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			check();
			Text.setText("*");
		}
	});
	b13.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Text.setText("0");
			num=0;
		}
	});
	b14.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Text.setText(Text.getText()+"0");
		}
	});
	b16/*除号*/.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			check();
			Text.setText("/");
		}
	});
	b15/*等于*/.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			check();
			Text.setText(""+num);
		}
	});
	//实例文本框
	Text=new JTextField();
	//涉资文本框不可编辑
	Text.setEditable(false);
	//设置窗口的布局为空，若不为空，则无法设置文本框和容器在窗口的位置
	this.setLayout(null);
	this.add(p);
	this.add(Text);
	//设置窗口，文本框，容器的基本属性
	Text.setBounds(0, 0, 300, 100);
	p.setBounds(0, 100, 300,300);
	Text.setFont(new Font("宋体",Font.BOLD,30));
	this.setBounds(100, 100, 310, 438);
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	this.setVisible(true);
	
}
//定义check方法
public double check() {
	numstr=Text.getText();
	if(numstr.indexOf("+")!=-1) {
		numstr=numstr.replace('+', '0');
		num=num+Double.parseDouble(numstr);
		return num;
	}else if(numstr.indexOf("-")!=-1) {
		numstr=numstr.replace('-', '0');
		num=num-Double.parseDouble(numstr);
		return num;
	}else if(numstr.indexOf("*")!=-1) {
		numstr=numstr.replace('*', '0');
		num=num*Double.parseDouble(numstr);
		return num;
	}else if(numstr.indexOf("/")!=-1) {
		numstr=numstr.replace('/', '0');
		num=num/Double.parseDouble(numstr);
		return num;
	}else
		return num=Double.parseDouble(numstr);}

public static void main(String[] args) {
	new Calulator();
}
}
