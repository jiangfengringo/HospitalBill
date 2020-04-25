package idManage;

import java.text.SimpleDateFormat;
import java.util.*;

//账单管理
public class billManage {
	
	//唯一编号、项目编号、项目名称、详细信息、价格、生成日期、是否属于报销范围内
	int ID;
	int billID;
	public String billName;
	public String billMessage;
	public float billPrice;
	public String billDate;
	public int billType;
	
	public int reID() {
		
		return this.ID;
	}
	
	public int rebillID() {
		
		return this.billID;
	}
	
	//创建新的项目
	@SuppressWarnings("resource")
	public void interbill(int s) {
		
		this.ID = s;
		
		Scanner SsingleName = new Scanner(System.in);
		System.out.println("请输入项目名称:");
		this.billName = SsingleName.nextLine();
		
		Scanner SsingleMessage = new Scanner(System.in);
		System.out.println("请输入项目详细:");
		this.billMessage = SsingleMessage.nextLine();
		
		Scanner SsinglePrice = new Scanner(System.in);
		System.out.println("请输入项目价格:");
		this.billPrice = SsinglePrice.nextInt();
		
		//生成随机数作为billID
		Random r1= new Random();
		this.billID = r1.nextInt(100);

		//获取当前时间作为项目生成时间
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.billDate = dateFormat.format(now);
		
		//1为可报销，0为不可报销
		Scanner SsingleType = new Scanner(System.in);
		System.out.println("是否属于报销内？");
		this.billType = SsingleType.nextInt();
		
	}
	
	//显示某一个项目详细
	public void outbill() {
		System.out.println("\n" + "项目名称：" + this.billName + "\n" + "项目详细：" + this.billMessage + "\n" + "项目价格："+ this.billPrice + "\n" + "是否属于报销范围：" + this.billType + "\n" + "消费日期：" + this.billDate + "\n");
	}
	
	//显示隐藏信息
	public void outbillprivate() {
		
		System.out.println("\n" + "患者唯一编号：" + this.ID + "\n" + "项目编号：" + this.billID + "\n");
	}

}
