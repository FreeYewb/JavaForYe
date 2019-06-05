package com.bo.wen.ye.lie100.conBox;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

//��ɫѡ����������ʾ

public class IconComboBoxDemo extends JFrame{

	JLabel iconLabel=null;  //������Ӧ�б��ѡ��ı仯
	JComboBox iconComboBox=null;  //���Ƶ�ѡ��������

   	public IconComboBoxDemo(){

      //����Object��ά����,���ڳ�ʼ��������,��������Ϊͼ��,��ʾ�ı�,��ʾ�ı�
   	  Object[][] obj={
   	  	{new ImageIcon("1.gif"),"����","�ṩ���ε�������Ϣ"},
   	  	{new ImageIcon("2.gif"),"����","�ṩ���µ�������Ѷ���ŵ�ġ����е�..."},
   	  	{new ImageIcon("3.gif"),"����","����������"},
   	  	{new ImageIcon("4.gif"),"Ӱ��","Ӱ������"},
   	  	{new ImageIcon("5.gif"),"�Ҿ�","�Ҿ�����"},
   	  };

   	  //��ʼ��������
      iconComboBox = new JComboBox();
      iconComboBox.setMaximumRowCount(3);  //��������������
      iconComboBox.setRenderer(new IconRenderer()); //���õ�Ԫ������
      for (int i=0;i<obj.length;i++){   //���������е�����Ԫ�ص���������
        iconComboBox.addItem(obj[i]);
      }


      //��ʼ��iconLabel��Ϣ
      iconLabel = new JLabel();

      //�������¼�����,��������ʵ��
      iconComboBox.addActionListener(new ActionListener(){
      	public void actionPerformed(ActionEvent evt){  //�����¼�
      	  Object[] obj = (Object[])iconComboBox.getSelectedItem();  //�õ�ѡ�������,�˴�Ϊһά����
      	  iconLabel.setIcon((Icon)obj[0]);  //����iconLabel��ͼ��
      	  iconLabel.setText(obj[1].toString());  //����iconLabel���ı�
       }
      });

      //�����������������
      this.getContentPane().setLayout(new BorderLayout());  //���ò��ֹ�����
      this.getContentPane().add(iconComboBox,BorderLayout.NORTH); //���Ϸ�����������
      this.getContentPane().add(iconLabel,BorderLayout.CENTER);  //���м�����iconLabel,������Ӧѡ��ı仯
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //�رմ���ʱ�˳�����
      this.setSize(350,260);  //���ô��ڳߴ�
      this.setVisible(true);  //��ʾ����
   	}

   	public static void main(String[] args){
      new IconComboBoxDemo();
   	}
}