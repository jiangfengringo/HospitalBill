package idManage;

import java.text.SimpleDateFormat;
import java.util.*;

//�˵�����
public class billManage {
	
	//Ψһ��š���Ŀ��š���Ŀ���ơ���ϸ��Ϣ���۸��������ڡ��Ƿ����ڱ�����Χ��
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
	
	//�����µ���Ŀ
	@SuppressWarnings("resource")
	public void interbill(int s) {
		
		this.ID = s;
		
		Scanner SsingleName = new Scanner(System.in);
		System.out.println("��������Ŀ����:");
		this.billName = SsingleName.nextLine();
		
		Scanner SsingleMessage = new Scanner(System.in);
		System.out.println("��������Ŀ��ϸ:");
		this.billMessage = SsingleMessage.nextLine();
		
		Scanner SsinglePrice = new Scanner(System.in);
		System.out.println("��������Ŀ�۸�:");
		this.billPrice = SsinglePrice.nextInt();
		
		//�����������ΪbillID
		Random r1= new Random();
		this.billID = r1.nextInt(100);

		//��ȡ��ǰʱ����Ϊ��Ŀ����ʱ��
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.billDate = dateFormat.format(now);
		
		//1Ϊ�ɱ�����0Ϊ���ɱ���
		Scanner SsingleType = new Scanner(System.in);
		System.out.println("�Ƿ����ڱ����ڣ�");
		this.billType = SsingleType.nextInt();
		
	}
	
	//��ʾĳһ����Ŀ��ϸ
	public void outbill() {
		System.out.println("\n" + "��Ŀ���ƣ�" + this.billName + "\n" + "��Ŀ��ϸ��" + this.billMessage + "\n" + "��Ŀ�۸�"+ this.billPrice + "\n" + "�Ƿ����ڱ�����Χ��" + this.billType + "\n" + "�������ڣ�" + this.billDate + "\n");
	}
	
	//��ʾ������Ϣ
	public void outbillprivate() {
		
		System.out.println("\n" + "����Ψһ��ţ�" + this.ID + "\n" + "��Ŀ��ţ�" + this.billID + "\n");
	}

}
