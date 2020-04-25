package idControl;

import java.util.Scanner;
import java.sql.*;

import idManage.*;

public class userControl {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		userDataC d1=new userDataC();
		billDataC c1=new billDataC();
		
		c1.testdata();
		c1.selectdata("ID", 314, "******");
		
		d1.testdata();
		d1.selectdata("age",12,"******");

		boolean endcode = false;
		
		Scanner S1 = new Scanner(System.in);
		System.out.println("是否加入新的患者信息？" + "\n"+ "1/0");
		int p1 = S1.nextInt();
		if(p1 == 1)
		{
			endcode = true;
			while(endcode){
				
				userManage u1 = new userManage();
			    u1.interuser();
			    billManage b1 = new billManage();
			    b1.interbill(u1.reID());
			    b1.outbill();
			    u1.outuser();
			    
			    Scanner S3 = new Scanner(System.in);
				System.out.println("是否打印隐藏信息？" + "\n" + "1/0");
				int p3 = S3.nextInt(); 
			    if(p3 == 1){
			    	
			    	u1.outuserprivate();
			    	b1.outbillprivate();
			    }
			    
			    c1.insertdata(b1.reID(), b1.rebillID(), b1.billName, b1.billMessage, b1.billPrice, b1.billDate, b1.billType);
			    c1.selectdata("ID", b1.reID(), "******");
			    c1.checkbill(314);
			    d1.insertdata(u1.reID(), u1.recaseID(), u1.name, u1.sex, u1.age, u1.indate, u1.outdate);
			    d1.selectdata("ID", u1.reID(), "******");
			    
			    Scanner S2 = new Scanner(System.in);
				System.out.println("是否退出？" + "\n" + "1/0");
				int p2 = S2.nextInt(); 
			    if(p2 == 1){
			    	
			    	endcode = false;
			    }
			    
			}
		}
		
		else if(p1 == 0)
		{
			System.out.println("谢谢使用");
		}
		else
		{
			System.out.println("输入错误");
		}

		
	}

}
