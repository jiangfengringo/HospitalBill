package idManage;

import java.text.SimpleDateFormat;
import java.util.*;

//������Ϣ����
public class userManage 
{
	//���ߵ�Ψһ��š�������š��������Ա����䡢��Ժ���ڡ���Ժ����
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
	
	
	//����һ���»���
	@SuppressWarnings("resource")
	public void interuser() 
	{
		Scanner Sname = new Scanner(System.in);
		System.out.println("�����뻼������:");
		this.name = Sname.nextLine();
		
		Scanner Ssex = new Scanner(System.in);
		System.out.println("�����뻼���Ա�:");
		this.sex = Ssex.nextLine();
		
		Scanner Sage = new Scanner(System.in);
		System.out.println("�����뻼������:");
		this.age = Sage.nextInt();
		
		//��ȡ��ǰʱ����Ϊ��Ժʱ��
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.indate = dateFormat.format(now);
		
		//��ȡ�������Ϊ�˵�Ψһ���
		Random r1= new Random();
		this.ID = r1.nextInt(1000);
		
		//��ȡһ���������Ϊ����Ψһ��ţ�ͬʱ��֤����������˵������ͬ
		do
		{
			Random r2 = new Random();
		this.caseID = r2.nextInt(1000);
		}
		while(this.ID == this.caseID);
	}
	
	//���߳�Ժʱ��ȡ��ǰʱ�䲢��ӡ����Ϣ
	public void outuser() {
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.outdate = dateFormat.format(now);
		
		System.out.println("\n" + "����������" + this.name + "\n" + "�����Ա�" + this.sex + "\n" + "�������䣺" + this.age + "\n" + "\n" + "��Ժ���ڣ�" + this.indate + "\n" + "��Ժ���ڣ�" + this.outdate + "\n");
	}
	
	public void outuserprivate() {
		
		System.out.println("\n" + "����Ψһ��ţ�" + this.ID + "\n" + "���߲�����ţ�" + this.caseID + "\n");
	}

}
