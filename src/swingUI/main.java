package swingUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import idControl.*;
import idManage.*;

import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextArea;

public class main extends JFrame {

	private JPanel mainpanel;
	private JTextField textField;
	private JTextField textField_name;
	private JTextField textField_pasd;
	private JTextField textField_MID;
	private JTextField textField_Mindate;
	private JTextField textField_Mname;
	private JTextField textField_McaseID;
	private JTextField textField_Moutdate;
	private JTextField textField_Mage;
	private JTable table;
	private JTextField textField_CID;
	private JTextField textField_Cbilldate;
	private JTextField textField_Cbillname;
	private JTextField textField_CbillID;
	private JTextField textField_Cbillmessage;
	private JTextField textField_Cbillprice;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setTitle("\u533B\u7597\u8D26\u5355\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 650);
		mainpanel = new JPanel();
		mainpanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainpanel);
		mainpanel.setLayout(null);

		final JPanel panelcash = new JPanel();
		panelcash.setBounds(10, 10, 864, 600);
		mainpanel.add(panelcash);
		panelcash.setLayout(null);
		panelcash.setVisible(false);
		
		JLabel label_title = new JLabel("\u8D26\u5355\u7BA1\u7406");
		label_title.setForeground(Color.RED);
		label_title.setBounds(10, 10, 100, 20);
		panelcash.add(label_title);
		
		JLabel label_14 = new JLabel("ID\uFF1A");
		label_14.setBounds(50, 50, 60, 20);
		panelcash.add(label_14);
		
		JLabel label_15 = new JLabel("\u9879\u76EE\u660E\u7EC6\uFF1A");
		label_15.setBounds(270, 50, 80, 20);
		panelcash.add(label_15);
		
		JLabel label_16 = new JLabel("\u9879\u76EE\u540D\u79F0\uFF1A");
		label_16.setBounds(520, 50, 80, 20);
		panelcash.add(label_16);
		
		JLabel lblid_3 = new JLabel("\u9879\u76EEID\uFF1A");
		lblid_3.setBounds(50, 100, 60, 20);
		panelcash.add(lblid_3);
		
		JLabel label_18 = new JLabel("\u9879\u76EE\u65F6\u95F4\uFF1A");
		label_18.setBounds(270, 100, 80, 20);
		panelcash.add(label_18);
		
		JLabel label_19 = new JLabel("\u9879\u76EE\u4EF7\u683C\uFF1A");
		label_19.setBounds(520, 100, 80, 20);
		panelcash.add(label_19);
		
		JLabel label_20 = new JLabel("\u62A5\u9500\u5185\uFF1A");
		label_20.setBounds(690, 50, 60, 20);
		panelcash.add(label_20);
		
		textField_CID = new JTextField();
		textField_CID.setColumns(10);
		textField_CID.setBounds(100, 50, 160, 20);
		panelcash.add(textField_CID);
		
		textField_Cbilldate = new JTextField();
		textField_Cbilldate.setColumns(10);
		textField_Cbilldate.setBounds(330, 100, 120, 20);
		panelcash.add(textField_Cbilldate);
		
		textField_Cbillname = new JTextField();
		textField_Cbillname.setColumns(10);
		textField_Cbillname.setBounds(580, 50, 100, 20);
		panelcash.add(textField_Cbillname);
		
		textField_CbillID = new JTextField();
		textField_CbillID.setColumns(10);
		textField_CbillID.setBounds(100, 100, 100, 20);
		panelcash.add(textField_CbillID);
		
		textField_Cbillmessage = new JTextField();
		textField_Cbillmessage.setColumns(10);
		textField_Cbillmessage.setBounds(330, 50, 180, 20);
		panelcash.add(textField_Cbillmessage);
		
		textField_Cbillprice = new JTextField();
		textField_Cbillprice.setColumns(10);
		textField_Cbillprice.setBounds(580, 100, 100, 20);
		panelcash.add(textField_Cbillprice);

		final JComboBox comboBox_Cbilltype = new JComboBox();
		comboBox_Cbilltype.setBounds(750, 50, 50, 20);
		panelcash.add(comboBox_Cbilltype);
		comboBox_Cbilltype.addItem("");
		comboBox_Cbilltype.addItem("是");
		comboBox_Cbilltype.addItem("否");
		
		JLabel label_21 = new JLabel("\u901A\u8FC7");
		label_21.setBounds(50, 170, 60, 20);
		panelcash.add(label_21);
		
		final JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(110, 170, 100, 20);
		panelcash.add(comboBox_8);
		comboBox_8.addItem("");
		comboBox_8.addItem("billID");
		
		JLabel label_22 = new JLabel("\u4FEE\u6539");
		label_22.setBounds(220, 170, 60, 20);
		panelcash.add(label_22);
		
		final JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(280, 170, 100, 20);
		panelcash.add(comboBox_9);
		comboBox_9.addItem("");
		comboBox_9.addItem("billName");
		comboBox_9.addItem("billMessage");
		comboBox_9.addItem("billPrice");
		comboBox_9.addItem("billDate");
		comboBox_9.addItem("billType");

		JLabel label_23 = new JLabel("\u901A\u8FC7");
		label_23.setBounds(50, 230, 60, 20);
		panelcash.add(label_23);
		
		final JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setBounds(110, 230, 100, 20);
		panelcash.add(comboBox_10);
		comboBox_10.addItem("");
		comboBox_10.addItem("billID");
		
		JLabel label_24 = new JLabel("\u5220\u9664");
		label_24.setBounds(220, 230, 60, 20);
		panelcash.add(label_24);
		label_24.setVisible(false);
		
		final JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setBounds(280, 230, 100, 20);
		panelcash.add(comboBox_11);
		comboBox_11.setVisible(false);
	
		JLabel label_25 = new JLabel("\u901A\u8FC7");
		label_25.setBounds(50, 290, 60, 20);
		panelcash.add(label_25);
		
		final JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setBounds(110, 290, 100, 20);
		panelcash.add(comboBox_12);
		comboBox_12.addItem("");
		comboBox_12.addItem("ID");
		comboBox_12.addItem("billID");
		comboBox_12.addItem("billName");
		comboBox_12.addItem("billMessage");
		comboBox_12.addItem("billPrice");
		comboBox_12.addItem("billType");
		
		JLabel label_26 = new JLabel("\u4EE5\u53CA");
		label_26.setBounds(220, 290, 60, 20);
		panelcash.add(label_26);
		label_26.setVisible(false);
		
		final JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setBounds(280, 290, 100, 20);
		panelcash.add(comboBox_13);
		comboBox_13.setVisible(false);

		table_1 = new JTable();
		table_1.setBounds(50, 350, 750, 200);
		panelcash.add(table_1);
		
		final JLabel lblNewLabel_Cwarn = new JLabel("\u63D0\u793A\u4FE1\u606F");
		lblNewLabel_Cwarn.setForeground(Color.RED);
		lblNewLabel_Cwarn.setBounds(560, 190, 100, 30);
		panelcash.add(lblNewLabel_Cwarn);
		
		JButton button_5 = new JButton("\u6DFB\u52A0");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ID=0, billID=0, billtype=0;
				float billprice=0;
				String billname=null, billmessage=null, billdate=null, typecoach=null;

				ID=Integer.valueOf(textField_CID.getText());
				billID=Integer.valueOf(textField_CbillID.getText());
				billname=textField_Cbillname.getText();
				billprice=Integer.valueOf(textField_Cbillprice.getText());
				billmessage=textField_Cbillmessage.getText();
				billdate=textField_Cbilldate.getText();
				typecoach=(String)comboBox_Cbilltype.getSelectedItem();
				
				if(typecoach=="是"){
					billtype=1;
				}else if (typecoach=="否") {
					billtype=0;
				}else {
					billtype=-1;
				}
				
				billDataC bdc1=new billDataC();
				bdc1.insertdata(ID, billID, billname, billmessage, billprice, billdate, billtype);
				lblNewLabel_Cwarn.setText("添加成功！"+ID );

				textField_CID.setText("");
				textField_CbillID.setText("");
				textField_Cbillname.setText("");
				textField_Cbillmessage.setText("");
				textField_Cbilldate.setText("");
				textField_Cbillprice.setText("");
				comboBox_Cbilltype.setSelectedItem("");
				
			}
		});
		button_5.setBounds(700, 95, 100, 30);
		panelcash.add(button_5);
		
		JButton btnNewButton_9 = new JButton("GET");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time_random tr1=new time_random();
			    textField_CID.setText(Integer.toString(tr1.getrandomID()));
			}
		});
		btnNewButton_9.setBounds(200, 50, 60, 20);
		panelcash.add(btnNewButton_9);
		btnNewButton_9.setVisible(false);
		
		JButton button_11 = new JButton("GET");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField_CID.getText()!=null){
					time_random tr1=new time_random();
					textField_CbillID.setText(Integer.toString(tr1.getrandombillID(Integer.valueOf(textField_CID.getText()))));
					}else{
						System.out.println("请先获取ID值");
					}
			}
		});
		button_11.setBounds(200, 100, 60, 20);
		panelcash.add(button_11);
		
		JButton button_12 = new JButton("GET");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time_random tr1=new time_random();
				textField_Cbilldate.setText(tr1.timenow());
			}
		});
		button_12.setBounds(450, 100, 60, 20);
		panelcash.add(button_12);

		JButton btnNewButton_8 = new JButton("\u590D\u4F4D");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_CID.setText("");
				textField_CbillID.setText("");
				textField_Cbillname.setText("");
				textField_Cbillmessage.setText("");
				textField_Cbillprice.setText("");
				textField_Cbilldate.setText("");
				comboBox_8.setSelectedItem("");
				comboBox_9.setSelectedItem("");
				comboBox_10.setSelectedItem("");
				comboBox_11.setSelectedItem("");
				comboBox_12.setSelectedItem("");
				comboBox_13.setSelectedItem("");
				comboBox_Cbilltype.setSelectedItem("");
			}
		});
		btnNewButton_8.setBounds(560, 260, 90, 30);
		panelcash.add(btnNewButton_8);
		
		JButton button_6 = new JButton("\u4FEE\u6539");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			    String c2=(String)comboBox_9.getSelectedItem();//选择需要修改的项目
			    String s1=textField_Cbillname.getText()+textField_Cbilldate.getText()+textField_Cbillmessage.getText();
			    String s2=(String)comboBox_Cbilltype.getSelectedItem();
			    billDataC bdc1=new billDataC();
			    int a=Integer.valueOf(textField_CbillID.getText());
			    
				String c1=(String)comboBox_8.getSelectedItem();//选择billID
 
																					if(c2=="billPrice"){	
					bdc1.updatedata(a, c2, 0, "**", Integer.valueOf(textField_Cbillprice.getText()));
			    }else if(c2=="billType"){
				    if(s2=="是"){
				    	bdc1.updatedata(a, c2, 1, "**", 0);
					}else if(s2=="否"){
						bdc1.updatedata(a, c2, 0, "**", 0);
					}else {
						 System.out.println("billtype error!");
					}
				}else {
				    bdc1.updatedata(a, c2, 0, s1,0);
				}
				    lblNewLabel_Cwarn.setText("修改成功！"+a);
				}
		});
		button_6.setBounds(430, 165, 100, 30);
		panelcash.add(button_6);
		
		JButton button_7 = new JButton("\u5220\u9664");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=Integer.valueOf(textField_CbillID.getText());
				billDataC bdc1=new billDataC();
				bdc1.deletedatabillID(a);
				lblNewLabel_Cwarn.setText("删除成功！");
			}
		});
		button_7.setBounds(430, 225, 100, 30);
		panelcash.add(button_7);
		
		JButton button_8 = new JButton("\u67E5\u8BE2");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=(String)comboBox_12.getSelectedItem();
				ResultSet rs1=null;
				billDataC bdc1=new billDataC();
				jtable j1=new jtable();

				
				if(s1=="ID"){
					rs1=bdc1.querydata("ID", Integer.valueOf(textField_CID.getText()), "**", 0);
				}else if (s1=="billID") {
					rs1=bdc1.querydata("billID", Integer.valueOf(textField_CbillID.getText()), "**", 0);
				}else if (s1=="billName") {
					rs1=bdc1.querydata("billName", 0, (String)textField_Cbillname.getText(), 0);
				}else if (s1=="billType") {
					String s2=(String)comboBox_Cbilltype.getSelectedItem();
					if(s2=="是"){
						rs1=bdc1.querydata("billType", 1, "**", 0);
					}else if(s2=="否"){
						rs1=bdc1.querydata("billType", 0, "**", 0);
					}else {
						rs1=bdc1.querydata("billType", -1, "**", 0);
					}
				}else if (s1=="billPrice") {
					rs1=bdc1.querydata("billPrice", 0, "**", Integer.valueOf(textField_Cbillprice.getText()));
				}


					try {
						j1.displayResultSet(table_1, rs1);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		button_8.setBounds(430, 285, 100, 30);
		panelcash.add(button_8);

		JLabel lblid_5 = new JLabel("\u552F\u4E00ID");
		lblid_5.setBounds(70, 330, 85, 20);
		panelcash.add(lblid_5);
		
		JLabel lblid_6 = new JLabel("\u9879\u76EEID");
		lblid_6.setBounds(175, 330, 85, 20);
		panelcash.add(lblid_6);
		
		JLabel label_34 = new JLabel("\u9879\u76EE\u540D\u79F0");
		label_34.setBounds(280, 330, 85, 20);
		panelcash.add(label_34);
		
		JLabel label_35 = new JLabel("\u9879\u76EE\u660E\u7EC6");
		label_35.setBounds(385, 330, 85, 20);
		panelcash.add(label_35);
		
		JLabel label_36 = new JLabel("\u9879\u76EE\u4EF7\u683C");
		label_36.setBounds(490, 330, 85, 20);
		panelcash.add(label_36);
		
		JLabel label_37 = new JLabel("\u9879\u76EE\u65E5\u671F");
		label_37.setBounds(595, 330, 85, 20);
		panelcash.add(label_37);
		
		JLabel label_38 = new JLabel("\u662F\u5426\u62A5\u9500");
		label_38.setBounds(700, 330, 85, 20);
		panelcash.add(label_38);

		final JPanel panelmange = new JPanel();
		panelmange.setBounds(10, 10, 864, 600);
		mainpanel.add(panelmange);
		panelmange.setLayout(null);
		panelmange.setVisible(false);
		
		JLabel lblNewLabel_7 = new JLabel("\u4FE1\u606F\u7BA1\u7406");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setBounds(10, 10, 100, 20);
		panelmange.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("ID\uFF1A");
		lblNewLabel_8.setBounds(50, 50, 60, 20);
		panelmange.add(lblNewLabel_8);
		
		JLabel lblid_1 = new JLabel("\u5165\u9662\u65F6\u95F4\uFF1A");
		lblid_1.setBounds(270, 50, 80, 20);
		panelmange.add(lblid_1);
		
		JLabel label_4 = new JLabel("\u59D3\u540D\uFF1A");
		label_4.setBounds(560, 50, 60, 20);
		panelmange.add(label_4);
		
		JLabel lblid_2 = new JLabel("\u75C5\u5386ID\uFF1A");
		lblid_2.setBounds(50, 100, 60, 20);
		panelmange.add(lblid_2);
		
		JLabel label_6 = new JLabel("\u51FA\u9662\u65F6\u95F4\uFF1A");
		label_6.setBounds(270, 100, 80, 20);
		panelmange.add(label_6);
		
		JLabel label_7 = new JLabel("\u5E74\u9F84\uFF1A");
		label_7.setBounds(560, 100, 60, 20);
		panelmange.add(label_7);
		
		JLabel label_8 = new JLabel("\u6027\u522B\uFF1A");
		label_8.setBounds(700, 50, 60, 20);
		panelmange.add(label_8);
		
		textField_MID = new JTextField();
		textField_MID.setBounds(100, 50, 100, 20);
		panelmange.add(textField_MID);
		textField_MID.setColumns(10);
		
		textField_Mindate = new JTextField();
		textField_Mindate.setColumns(10);
		textField_Mindate.setBounds(350, 50, 140, 20);
		panelmange.add(textField_Mindate);
		
		textField_Mname = new JTextField();
		textField_Mname.setColumns(10);
		textField_Mname.setBounds(610, 50, 80, 20);
		panelmange.add(textField_Mname);
		
		textField_McaseID = new JTextField();
		textField_McaseID.setColumns(10);
		textField_McaseID.setBounds(100, 100, 100, 20);
		panelmange.add(textField_McaseID);
		
		textField_Moutdate = new JTextField();
		textField_Moutdate.setColumns(10);
		textField_Moutdate.setBounds(350, 100, 140, 20);
		panelmange.add(textField_Moutdate);
		
		textField_Mage = new JTextField();
		textField_Mage.setColumns(10);
		textField_Mage.setBounds(610, 100, 80, 20);
		panelmange.add(textField_Mage);

		final JComboBox comboBox_Msex = new JComboBox();
		comboBox_Msex.setBounds(750, 50, 50, 20);
		panelmange.add(comboBox_Msex);
		comboBox_Msex.addItem("");
		comboBox_Msex.addItem("男");
		comboBox_Msex.addItem("女");
		
		JLabel label = new JLabel("\u901A\u8FC7");
		label.setBounds(50, 170, 60, 20);
		panelmange.add(label);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(110, 170, 100, 20);
		panelmange.add(comboBox_1);
		comboBox_1.addItem("");
		comboBox_1.addItem("ID");
		
		JLabel label_5 = new JLabel("\u4FEE\u6539");
		label_5.setBounds(220, 170, 60, 20);
		panelmange.add(label_5);
		
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(280, 170, 100, 20);
		panelmange.add(comboBox_2);
		comboBox_2.addItem("");
		comboBox_2.addItem("name");
		comboBox_2.addItem("sex");
		comboBox_2.addItem("age");
		comboBox_2.addItem("indate");
		comboBox_2.addItem("outdate");
		
		JLabel label_9 = new JLabel("\u901A\u8FC7");
		label_9.setBounds(50, 230, 60, 20);
		panelmange.add(label_9);
		
		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(110, 230, 100, 20);
		panelmange.add(comboBox_3);
		comboBox_3.addItem("");
		comboBox_3.addItem("ID");
		
		JLabel label_10 = new JLabel("\u4EE5\u53CA");
		label_10.setBounds(220, 230, 60, 20);
		panelmange.add(label_10);
		label_10.setVisible(false);
		
		final JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(280, 230, 100, 20);
		panelmange.add(comboBox_4);
		comboBox_4.setVisible(false);
		
		JLabel label_11 = new JLabel("\u901A\u8FC7");
		label_11.setBounds(50, 290, 60, 20);
		panelmange.add(label_11);
		
		final JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(110, 290, 100, 20);
		panelmange.add(comboBox_5);
		comboBox_5.addItem("");
		comboBox_5.addItem("ID");
		comboBox_5.addItem("caseID");
		comboBox_5.addItem("name");
		comboBox_5.addItem("sex");
		comboBox_5.addItem("age");
		
		JLabel label_12 = new JLabel("\u6216\u8005");
		label_12.setBounds(220, 290, 60, 20);
		panelmange.add(label_12);
		label_12.setVisible(false);
		
		final JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(280, 290, 100, 20);
		panelmange.add(comboBox_6);
		comboBox_6.setVisible(false);
		
		table = new JTable();
		table.setBounds(50, 350, 750, 200);
		panelmange.add(table);

		JButton btnNewButton_6 = new JButton("GET");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time_random tr1=new time_random();
				textField_MID.setText(Integer.toString(tr1.getrandomID()));
			}
		});
		btnNewButton_6.setBounds(200, 50, 60, 20);
		panelmange.add(btnNewButton_6);
		
		JButton btnGet_1 = new JButton("GET");
		btnGet_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time_random tr1=new time_random();
				textField_Mindate.setText(tr1.timenow());
			}
		});
		btnGet_1.setBounds(490, 50, 60, 20);
		panelmange.add(btnGet_1);
		
		JButton btnGet = new JButton("GET");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField_MID.getText()!=null){
				time_random tr1=new time_random();
				textField_McaseID.setText(Integer.toString(tr1.getrandomcaseID(Integer.valueOf(textField_MID.getText()))));
				}else{
					System.out.println("请先获取ID值");
				}
			}
		});
		btnGet.setBounds(200, 100, 60, 20);
		panelmange.add(btnGet);
		
		JButton btnGet_2 = new JButton("GET");
		btnGet_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time_random tr1=new time_random();
				textField_Moutdate.setText(tr1.timenow());
			}
		});
		btnGet_2.setBounds(490, 100, 60, 20);
		panelmange.add(btnGet_2);
		
		final JLabel lblNewLabel_warn = new JLabel("\u63D0\u793A\u4FE1\u606F");
		lblNewLabel_warn.setForeground(Color.RED);
		lblNewLabel_warn.setBounds(560, 185, 200, 30);
		panelmange.add(lblNewLabel_warn);
		
		JButton btnNewButton_4 = new JButton("\u6DFB\u52A0");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ID=0, caseID=0, age;
				String name=null, sex=null, indate=null, outdate=null;

				ID=Integer.valueOf(textField_MID.getText());
				caseID=Integer.valueOf(textField_McaseID.getText());
				name=textField_Mname.getText();
				sex=(String)comboBox_Msex.getSelectedItem();
				age=Integer.valueOf(textField_Mage.getText());
				indate=textField_Mindate.getText();
				outdate=textField_Moutdate.getText();
				
				userDataC udc1=new userDataC();
				udc1.insertdata(ID, caseID, name, sex, age, indate, outdate);
				lblNewLabel_warn.setText("添加成功！"+ID );

				textField_MID.setText("");
				textField_McaseID.setText("");
				textField_Mname.setText("");
				textField_Mage.setText("");
				textField_Mindate.setText("");
				textField_Moutdate.setText("");
				comboBox_Msex.setSelectedItem("");
				
			}
		});
		btnNewButton_4.setBounds(700, 95, 100, 30);
		panelmange.add(btnNewButton_4);
		
		JButton button_1 = new JButton("\u4FEE\u6539");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=(String)comboBox_2.getSelectedItem();
				String s1=textField_Mname.getText()+textField_Mindate.getText()+textField_Moutdate.getText();
				String s2=(String)comboBox_Msex.getSelectedItem();
				userDataC udc1=new userDataC();
				int a=Integer.valueOf(textField_MID.getText());
				
				if(s=="age"){
					udc1.updatedata(a, s, Integer.valueOf(textField_Mage.getText()), "**");
				}else if(s=="sex"){
					udc1.updatedata(a, s, 0, s2);
				}else {
					udc1.updatedata(a, s, 0, s1);
				}
				lblNewLabel_warn.setText("修改成功！");
			}
		});
		button_1.setBounds(430, 165, 100, 30);
		panelmange.add(button_1);
		
		JButton button_2 = new JButton("\u5220\u9664");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a=Integer.valueOf(textField_MID.getText());
				userDataC udc1=new userDataC();
				udc1.deletedata("ID", a, "**");
				lblNewLabel_warn.setText("删除成功！");
			}
		});
		button_2.setBounds(430, 225, 100, 30);
		panelmange.add(button_2);
		
		JButton button_3 = new JButton("\u67E5\u8BE2");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=(String)comboBox_5.getSelectedItem();
				ResultSet rs1=null;
				userDataC udc1=new userDataC();
				jtable j1=new jtable();

				
				if(s1=="ID"){
					rs1=udc1.querytest("ID", Integer.valueOf(textField_MID.getText()), "**");
				}else if (s1=="caseID") {
					rs1=udc1.querytest("caseID", Integer.valueOf(textField_McaseID.getText()), "**");
				}else if (s1=="name") {
					rs1=udc1.querytest("name", 0, (String)textField_Mname.getText());
				}else if (s1=="sex") {
					//String ssex=(String)comboBox_Msex.getSelectedItem();
					rs1=udc1.querytest("sex", 0, (String)comboBox_Msex.getSelectedItem());
				}else if (s1=="age") {
					rs1=udc1.querytest("age", Integer.valueOf(textField_Mage.getText()), "**");
				}


					try {
						j1.displayResultSet(table, rs1);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		button_3.setBounds(430, 285, 100, 30);
		panelmange.add(button_3);

		JButton btnNewButton_7 = new JButton("\u590D\u4F4D");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_MID.setText("");
				textField_McaseID.setText("");
				textField_Mindate.setText("");
				textField_Moutdate.setText("");
				textField_Mname.setText("");
				textField_Mage.setText("");
				comboBox_1.setSelectedItem("");
				comboBox_2.setSelectedItem("");
				comboBox_3.setSelectedItem("");
				comboBox_4.setSelectedItem("");
				comboBox_5.setSelectedItem("");
				comboBox_6.setSelectedItem("");
				comboBox_Msex.setSelectedItem("");
			}
		});
		btnNewButton_7.setBounds(560, 255, 90, 30);
		panelmange.add(btnNewButton_7);
		
		JLabel label_13 = new JLabel("\u552F\u4E00ID");
		label_13.setBounds(70, 330, 85, 20);
		panelmange.add(label_13);
		
		JLabel lblid_7 = new JLabel("\u75C5\u5386ID");
		lblid_7.setBounds(175, 330, 85, 20);
		panelmange.add(lblid_7);
		
		JLabel label_39 = new JLabel("\u59D3\u540D");
		label_39.setBounds(280, 330, 85, 20);
		panelmange.add(label_39);
		
		JLabel label_40 = new JLabel("\u6027\u522B");
		label_40.setBounds(385, 330, 85, 20);
		panelmange.add(label_40);
		
		JLabel label_41 = new JLabel("\u5E74\u9F84");
		label_41.setBounds(490, 330, 85, 20);
		panelmange.add(label_41);
		
		JLabel label_42 = new JLabel("\u5165\u9662\u65E5\u671F");
		label_42.setBounds(595, 330, 85, 20);
		panelmange.add(label_42);
		
		JLabel label_43 = new JLabel("\u51FA\u9662\u65E5\u671F");
		label_43.setBounds(700, 330, 85, 20);
		panelmange.add(label_43);

		final JPanel panelprint = new JPanel();
		panelprint.setLocation(150, 10);
		mainpanel.add(panelprint);
		panelprint.setSize(600, 600);
		panelprint.setLayout(null);
		panelprint.setVisible(true);
		
		textField = new JTextField();
		textField.setBounds(100, 100, 400, 30);
		panelprint.add(textField);
		textField.setColumns(10);
		
		table_2 = new JTable();
		table_2.setBounds(0, 310, 600, 180);
		panelprint.add(table_2);
		table_2.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u60A8\u7684\u552F\u4E00ID\uFF1A");
		lblNewLabel.setBounds(100, 50, 500, 50);
		panelprint.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("\u6E29\u99A8\u63D0\u793A\uFF1A");
		lblNewLabel_2.setBounds(50, 150, 500, 20);
		panelprint.add(lblNewLabel_2);
		
		JLabel lblid = new JLabel("1\uFF0C\u5728\u8F93\u5165\u6846\u5185\u8F93\u5165\u60A8\u5165\u9662\u767B\u8BB0\u65F6\u7684\u552F\u4E00ID\uFF1B");
		lblid.setBounds(50, 180, 300, 20);
		panelprint.add(lblid);
		
		JLabel label_1 = new JLabel("2\uFF0C\u70B9\u51FB\u4E0B\u65B9\u6253\u5370\u6309\u94AE\uFF1B");
		label_1.setBounds(50, 210, 250, 20);
		panelprint.add(label_1);
		
		JLabel label_2 = new JLabel("3\uFF0C\u60A8\u7684\u8D26\u5355\u8BE6\u7EC6\u5C06\u663E\u793A\u5728\u663E\u793A\u5C4F\u4E0A\u3002");
		label_2.setBounds(50, 240, 250, 20);
		panelprint.add(label_2);
		
		JLabel label_3 = new JLabel("\u8D26\u5355\u6253\u5370");
		label_3.setForeground(Color.RED);
		label_3.setBounds(10, 10, 500, 20);
		panelprint.add(label_3);
			
		JLabel lblNewLabel_1 = new JLabel("\u7248\u6743\u6240\u5C5E\uFF1Acopyright CTZQH");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(10, 570, 300, 20);
		panelprint.add(lblNewLabel_1);

		JLabel lblNewLabel_9 = new JLabel("\u552F\u4E00ID");
		lblNewLabel_9.setBounds(5, 290, 85, 20);
		panelprint.add(lblNewLabel_9);
		
		JLabel lblid_4 = new JLabel("\u9879\u76EE\u7F16\u53F7");
		lblid_4.setBounds(90, 290, 85, 20);
		panelprint.add(lblid_4);
		
		JLabel label_17 = new JLabel("\u540D\u79F0");
		label_17.setBounds(175, 290, 85, 20);
		panelprint.add(label_17);
		
		JLabel label_27 = new JLabel("\u8BE6\u7EC6");
		label_27.setBounds(260, 290, 85, 20);
		panelprint.add(label_27);
		
		JLabel label_28 = new JLabel("\u4EF7\u683C");
		label_28.setBounds(345, 290, 85, 20);
		panelprint.add(label_28);
		
		JLabel label_29 = new JLabel("\u65E5\u671F");
		label_29.setBounds(430, 290, 85, 20);
		panelprint.add(label_29);
		
		JLabel label_30 = new JLabel("\u62A5\u9500\u5185");
		label_30.setBounds(515, 290, 85, 20);
		panelprint.add(label_30);
		
		JLabel lblNewLabel_10 = new JLabel("\u603B\u91D1\u989D\uFF1A");
		lblNewLabel_10.setBounds(10, 500, 80, 20);
		panelprint.add(lblNewLabel_10);
		
		final JLabel lbl_cashall = new JLabel("0");
		lbl_cashall.setBounds(100, 500, 60, 20);
		panelprint.add(lbl_cashall);
		lbl_cashall.setVisible(false);
		
		JLabel label_31 = new JLabel("\u62A5\u9500\u91D1\u989D\uFF1A");
		label_31.setBounds(200, 500, 80, 20);
		panelprint.add(label_31);
		
		final JLabel lbl_cashdelete = new JLabel("0");
		lbl_cashdelete.setBounds(290, 500, 60, 20);
		panelprint.add(lbl_cashdelete);
		lbl_cashdelete.setVisible(false);
		
		JLabel label_33 = new JLabel("\u5E94\u7F34\u91D1\u989D\uFF1A");
		label_33.setBounds(390, 500, 80, 20);
		panelprint.add(label_33);
		
		final JLabel lbl_cashpay = new JLabel("0");
		lbl_cashpay.setBounds(480, 500, 60, 20);
		panelprint.add(lbl_cashpay);
		lbl_cashpay.setVisible(false);
		
		JButton button = new JButton("\u6E05\u9664");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				table_2.setVisible(false);
				lbl_cashall.setVisible(false);
				lbl_cashdelete.setVisible(false);
				lbl_cashpay.setVisible(false);


			}
		});
		button.setBounds(460, 240, 90, 30);
		panelprint.add(button);
												
		JButton btnNewButton = new JButton("\u6253\u5370");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				
				int s=Integer.parseInt(textField.getText());
				billDataC b1=new billDataC();
				jtable j1=new jtable();
				try {
					String a1=Integer.toString(b1.checkbill(s));
					lbl_cashall.setText(a1);
					String a2=Integer.toString(b1.cashdelete);
					lbl_cashdelete.setText(a2);
					String a3=Integer.toString(b1.cashpay);
					lbl_cashpay.setText(a3);
					j1.displayResultSet(table_2, b1.querytest(s));
					table_2.setVisible(true);
					lbl_cashall.setVisible(true);
					lbl_cashdelete.setVisible(true);
					lbl_cashpay.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				}
		});
		btnNewButton.setBounds(460, 170, 90, 30);
		panelprint.add(btnNewButton);

		final JPanel panelload = new JPanel();
		panelload.setBackground(UIManager.getColor("Button.background"));
		panelload.setBounds(300, 200, 300, 200);
		mainpanel.add(panelload);
		panelload.setLayout(null);
		panelload.setVisible(false);
		
		JLabel lblNewLabel_3 = new JLabel("\u7528\u6237\u767B\u5F55");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(10, 10, 100, 20);
		panelload.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u8D26\u6237\uFF1A");
		lblNewLabel_4.setBounds(30, 50, 50, 20);
		panelload.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_5.setBounds(30, 90, 50, 20);
		panelload.add(lblNewLabel_5);
		
		textField_name = new JTextField();
		textField_name.setBounds(80, 50, 200, 30);
		panelload.add(textField_name);
		textField_name.setColumns(10);
		
		textField_pasd = new JTextField();
		textField_pasd.setBounds(80, 90, 200, 30);
		panelload.add(textField_pasd);
		textField_pasd.setColumns(10);

		final JLabel lblNewLabel_error = new JLabel("errormessage");
		lblNewLabel_error.setForeground(Color.RED);
		lblNewLabel_error.setBounds(30, 120, 250, 20);
		panelload.add(lblNewLabel_error);
		lblNewLabel_error.setVisible(false);
		
		JButton btnNewButton_3 = new JButton("\u53D6\u6D88");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelprint.setVisible(true);
				panelcash.setVisible(false);
				panelmange.setVisible(false);
				panelload.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(190, 150, 90, 30);
		panelload.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("\u767B\u5F55");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField_name.getText();
				String pasd=textField_pasd.getText();
				int a1=Integer.valueOf(name);
				int a2=Integer.valueOf(pasd);
				boolean t=false;
				if(a1==123){
					if(a2==123456){
						t=true;
					}
				}

				if(t){
					panelmange.setVisible(true);
					panelload.setVisible(false);
				}else{
					lblNewLabel_error.setText("用户账户名不存在或密码错误！");
					lblNewLabel_error.setVisible(true);
					textField_name.setText("");
					textField_pasd.setText("");
				}
			}
		});
		btnNewButton_2.setBounds(30, 150, 90, 30);
		panelload.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("\u66F4\u591A\u64CD\u4F5C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelprint.setVisible(false);
				panelcash.setVisible(false);
				panelmange.setVisible(false);
				panelload.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(430, 540, 120, 50);
		panelprint.add(btnNewButton_1);
		
		JButton btnNewButton_10 = new JButton("Help");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showMessageDialog(null, "    联系QQ768435120        获取更多信息", "Help", JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnNewButton_10.setForeground(UIManager.getColor("menuPressedItemB"));
		btnNewButton_10.setBounds(500, 10, 90, 20);
		panelprint.add(btnNewButton_10);
		
		JButton btnNewButton_5 = new JButton("\u8D26\u5355\u7BA1\u7406");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelmange.setVisible(false);
				panelcash.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(710, 170, 90, 60);
		panelmange.add(btnNewButton_5);
		
		JButton button_4 = new JButton("\u9000\u51FA\u7CFB\u7EDF");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelmange.setVisible(false);
				panelprint.setVisible(true);
			}
		});
		button_4.setBounds(710, 255, 90, 60);
		panelmange.add(button_4);
		
		JButton button_9 = new JButton("\u4FE1\u606F\u7BA1\u7406");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelcash.setVisible(false);
				panelmange.setVisible(true);
			}
		});
		button_9.setBounds(710, 170, 90, 60);
		panelcash.add(button_9);

		JButton button_10 = new JButton("\u9000\u51FA\u7CFB\u7EDF");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelcash.setVisible(false);
				panelprint.setVisible(true);
			}
		});
		button_10.setBounds(710, 255, 90, 60);
		panelcash.add(button_10);



	}
}
