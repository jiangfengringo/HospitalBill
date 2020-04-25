package idManage;

import java.text.SimpleDateFormat;
import java.util.*;

//患者信息管理
public class userManage 
{
	//患者的唯一编号、病历编号、姓名、性别、年龄、入院日期、出院日期
	int ID;
	int caseID;
	public String name;
	public String sex;
	public int age;
	public String indate;
	public String outdate;
	
	public int reID() {
		
		return this.ID;
	}
	
	public int recaseID() {
		
		return this.caseID;
	}
	
	
	//增加一个新患者
	@SuppressWarnings("resource")
	public void interuser() 
	{
		Scanner Sname = new Scanner(System.in);
		System.out.println("请输入患者姓名:");
		this.name = Sname.nextLine();
		
		Scanner Ssex = new Scanner(System.in);
		System.out.println("请输入患者性别:");
		this.sex = Ssex.nextLine();
		
		Scanner Sage = new Scanner(System.in);
		System.out.println("请输入患者年龄:");
		this.age = Sage.nextInt();
		
		//获取当前时间作为入院时间
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.indate = dateFormat.format(now);
		
		//获取随机数作为账单唯一编号
		Random r1= new Random();
		this.ID = r1.nextInt(1000);
		
		//获取一个随机数作为病历唯一编号，同时保证随机数不与账单编号相同
		do
		{
			Random r2 = new Random();
		this.caseID = r2.nextInt(1000);
		}
		while(this.ID == this.caseID);
	}
	
	//患者出院时获取当前时间并打印出信息
	public void outuser() {
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.outdate = dateFormat.format(now);
		
		System.out.println("\n" + "患者姓名：" + this.name + "\n" + "患者性别：" + this.sex + "\n" + "患者年龄：" + this.age + "\n" + "\n" + "入院日期：" + this.indate + "\n" + "出院日期：" + this.outdate + "\n");
	}
	
	public void outuserprivate() {
		
		System.out.println("\n" + "患者唯一编号：" + this.ID + "\n" + "患者病历编号：" + this.caseID + "\n");
	}

}
