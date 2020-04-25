package idControl;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class billDataC {
	public int cashall=0, cashdelete=0, cashpay=0;
	
	public ResultSet querydata(String s, int sno, String sinfo, float sprice) {
		 ResultSet res = null;

		 Connection con;
		    String driver = "com.mysql.jdbc.Driver";            //����������
		    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
		    String user = "root";                //MySQL���õ��û���
		    String password = "";                //MySQL���õ�����
			
			try {
			    Class.forName(driver);
	            con = DriverManager.getConnection(url,user,password);
	            
	            PreparedStatement psql;
	            int ID, billID, billType;
	            float billPrice;
	            String billName, billMessage, billDate, sbillType;
	            
	            if(s=="ID"){
	            	psql = con.prepareStatement("select * from billmanage where ID = ?");
	                psql.setInt(1, sno);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getFloat("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                    
	                }
	                
	                /*res.close();
	                psql.close();
	                con.close();*/
	                 
	            }else if (s=="billID") {
	            	psql = con.prepareStatement("select * from billmanage where billID = ?");
	                psql.setInt(1, sno);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getFloat("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                /*res.close();
	                psql.close();
	                con.close();*/
	                
				}else if (s=="billName") {
					psql = con.prepareStatement("select * from billmanage where billName = ?");
	                psql.setString(1, sinfo);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getFloat("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                /*res.close();
	                psql.close();
	                con.close();*/
	                
				}else if (s=="billMessage") {
					psql = con.prepareStatement("select * from billmanage where billMessage = ?");
	                psql.setString(1, sinfo);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getFloat("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                /*res.close();
	                psql.close();
	                con.close();*/
	                
				}else if (s=="billPrice") {
					psql = con.prepareStatement("select * from billmanage where billPrice = ?");
	                psql.setFloat(1, sprice);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getFloat("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                /*res.close();
	                psql.close();
	                con.close();*/
	                
				}else if (s=="billDate") {
					psql = con.prepareStatement("select * from billmanage where billDate = ?");
	                psql.setString(1, sinfo);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getFloat("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                /*res.close();
	                psql.close();
	                con.close();*/
	                
				}else if (s=="billType") {
					psql = con.prepareStatement("select * from billmanage where billType = ?");
	                psql.setInt(1, sno);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getFloat("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                /*res.close();
	                psql.close();
	                con.close();*/
	                
				}else {
					System.out.println("�����ѯѡ�0000");
				}
	            } catch(ClassNotFoundException e) {   
	                //���ݿ��������쳣����
	                System.out.println("�޷��ҵ������ļ���");   
	                e.printStackTrace();   
	                } catch(SQLException e) {
	                    //���ݿ�����ʧ���쳣����
	                    e.printStackTrace();  
	                    } catch (Exception e) {
	                        // TODO: handle exception
	                        e.printStackTrace();
	                        } finally {
	                            System.out.println("bill��ѯ�ɹ���");
	                            }
			return res;
	}
	
	
	public ResultSet querytest(int s) {
        ResultSet res = null;
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //����������
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
	    String user = "root";                //MySQL���õ��û���
	    String password = "";                //MySQL���õ�����
	    
	    try {
		    Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            
            PreparedStatement psql;

            int ID, billID, billPrice, billType;
            String billName, billMessage, billDate, sbillType;
            
            	psql = con.prepareStatement("select * from billmanage where ID = ?");
                psql.setInt(1, s);
                res = psql.executeQuery();
                /*while(res.next()){
                    ID = res.getInt("ID");
                    billID = res.getInt("billID");
                    billName = res.getString("billName");
                    billMessage = res.getString("billMessage");
                    billPrice = res.getInt("billPrice");
                    billDate = res.getString("billDate");
                    billType = res.getInt("billType");
                    if(billType==1){
                    	sbillType = "�ɱ���";
                    }else {
						sbillType = "���ɱ���";
					}
                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
                }*/
                
                //res.close();
                //psql.close();
                //con.close();
                } catch(ClassNotFoundException e) {   
	                //���ݿ��������쳣����
	                System.out.println("�޷��ҵ������ļ���");   
	                e.printStackTrace();   
	                } catch(SQLException e) {
	                    //���ݿ�����ʧ���쳣����
	                    e.printStackTrace();  
	                    } catch (Exception e) {
	                        // TODO: handle exception
	                        e.printStackTrace();
	                        } finally {
	                            System.out.println("bill���Գɹ�");
	                            }
		
		return res;
	}
	
	public void deletedatabillID(int sbillID) {
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //����������
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
	    String user = "root";                //MySQL���õ��û���
	    String password = "";                //MySQL���õ�����
		
		try {
		    Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            
            PreparedStatement psql;
            
            	psql = con.prepareStatement("delete from billManage where billID = ?");
                psql.setInt(1, sbillID);
                psql.executeUpdate();
            	
                psql.close();
                con.close();
		} catch(ClassNotFoundException e) {   
            //���ݿ��������쳣����
            System.out.println("�޷��ҵ������ļ���");   
            e.printStackTrace();   
            } catch(SQLException e) {
                //���ݿ�����ʧ���쳣����
                e.printStackTrace();  
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                    } finally {
                        System.out.println("billɾ���ɹ���");
                        }
	}
	
	//�������ݱ��ܷ�ɹ�����
		public void testdata() {
			
			Connection con;
		    String driver = "com.mysql.jdbc.Driver";            //����������
		    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
		    String user = "root";                //MySQL���õ��û���
		    String password = "";                //MySQL���õ�����
			
			try {
			    Class.forName(driver);
	            //1.getConnection()����������MySQL���ݿ⣡��
	            con = DriverManager.getConnection(url,user,password);
	            if(!con.isClosed())
	                System.out.println("bill���ݿ����ӳɹ���");
	            //2.����statement���������ִ��SQL��䣡��
	            Statement teststmt = con.createStatement();
	            //Ҫִ�е�SQL���
	            String sql = "select * from billmanage";
	            //3.ResultSet�࣬������Ż�ȡ�Ľ��������
	            ResultSet rs = teststmt.executeQuery(sql);
	            if(!rs.next())
	            	System.out.println("bill���ݻ�ȡʧ�ܣ�");
	            rs.close();
	            teststmt.close();
	            con.close();
			    } catch(ClassNotFoundException e) {   
	                //���ݿ��������쳣����
	                System.out.println("�޷��ҵ������ļ���");   
	                e.printStackTrace();   
	                } catch(SQLException e) {
	                    //���ݿ�����ʧ���쳣����
	                    e.printStackTrace();  
	                    } catch (Exception e) {
	                        // TODO: handle exception
	                        e.printStackTrace();
	                        } finally {
	                            System.out.println("bill���Գɹ�");
	                            }
			}
		
		
		public PrintStream selectdata(String s, int sno, String sinfo) {
			
			Connection con;
		    String driver = "com.mysql.jdbc.Driver";            //����������
		    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
		    String user = "root";                //MySQL���õ��û���
		    String password = "";                //MySQL���õ�����
		    PrintStream ti = null;
			
			try {
			    Class.forName(driver);
	            con = DriverManager.getConnection(url,user,password);
	            
	            PreparedStatement psql;
	            ResultSet res;
	            int ID, billID, billPrice, billType;
	            String billName, billMessage, billDate, sbillType;
	            
	            if(s=="ID"){
	            	psql = con.prepareStatement("select * from billmanage where ID = ?");
	                psql.setInt(1, sno);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getInt("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                    ti=System.out;
	                    
	                }
	                
	                res.close();
	                psql.close();
	                con.close();
	                 
	            }else if (s=="billID") {
	            	psql = con.prepareStatement("select * from billmanage where billID = ?");
	                psql.setInt(1, sno);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getInt("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                res.close();
	                psql.close();
	                con.close();
	                
				}else if (s=="billName") {
					psql = con.prepareStatement("select * from billmanage where billName = ?");
	                psql.setString(1, sinfo);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getInt("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                res.close();
	                psql.close();
	                con.close();
	                
				}else if (s=="billMessage") {
					psql = con.prepareStatement("select * from billmanage where billMessage = ?");
	                psql.setString(1, sinfo);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getInt("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                res.close();
	                psql.close();
	                con.close();
	                
				}else if (s=="billPrice") {
					psql = con.prepareStatement("select * from billmanage where billPrice = ?");
	                psql.setInt(1, sno);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getInt("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                res.close();
	                psql.close();
	                con.close();
	                
				}else if (s=="billDate") {
					psql = con.prepareStatement("select * from billmanage where billDate = ?");
	                psql.setString(1, sinfo);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getInt("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                res.close();
	                psql.close();
	                con.close();
	                
				}else if (s=="billType") {
					psql = con.prepareStatement("select * from billmanage where billType = ?");
	                psql.setInt(1, sno);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getInt("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType = "�ɱ���";
	                    }else {
							sbillType = "���ɱ���";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                res.close();
	                psql.close();
	                con.close();
	                
				}else {
					System.out.println("�����ѯѡ�0000");
				}
	            } catch(ClassNotFoundException e) {   
	                //���ݿ��������쳣����
	                System.out.println("�޷��ҵ������ļ���");   
	                e.printStackTrace();   
	                } catch(SQLException e) {
	                    //���ݿ�����ʧ���쳣����
	                    e.printStackTrace();  
	                    } catch (Exception e) {
	                        // TODO: handle exception
	                        e.printStackTrace();
	                        } finally {
	                            System.out.println("bill��ѯ�ɹ���");
	                            }
			return ti;
			}
		
		public void insertdata(int sID, int sbillID, String sbillName, String sbillMessage, Float sbillPrice, String sbillDate, int sbillType) {
			
			Connection con;
		    String driver = "com.mysql.jdbc.Driver";            //����������
		    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
		    String user = "root";                //MySQL���õ��û���
		    String password = "";                //MySQL���õ�����
		    
		    try {
		    	Class.forName(driver);
	            con = DriverManager.getConnection(url,user,password);

	            PreparedStatement psql;
	            
	            
	            //Ԥ����������ݣ���������������--������
	            psql = con.prepareStatement("insert into billManage (ID,billID,billName,billMessage,billPrice,billDate,billType) values(?,?,?,?,?,?,?)");
	            psql.setInt(1, sID);   
	            psql.setInt(2, sbillID);
	            psql.setString(3, sbillName);    
	            psql.setString(4, sbillMessage);
	            psql.setFloat(5, sbillPrice); 
	            psql.setString(6, sbillDate);
	            psql.setInt(7, sbillType); 
	            psql.executeUpdate();           //ִ�и���
	            
	            psql.close();
		    	con.close();
			} catch(ClassNotFoundException e) {   
	            //���ݿ��������쳣����
	            System.out.println("�޷��ҵ������ļ���");   
	            e.printStackTrace();   
	            } catch(SQLException e) {
	                //���ݿ�����ʧ���쳣����
	                e.printStackTrace();  
	                } catch (Exception e) {
	                    // TODO: handle exception
	                    e.printStackTrace();
	                    } finally {
	                        System.out.println("bill��ӳɹ���");
	                        }
		}
		
		public void deletedata(int sID, int sbillID, String sbillName) {
			
			Connection con;
		    String driver = "com.mysql.jdbc.Driver";            //����������
		    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
		    String user = "root";                //MySQL���õ��û���
		    String password = "";                //MySQL���õ�����
			
			try {
			    Class.forName(driver);
	            con = DriverManager.getConnection(url,user,password);
	            
	            PreparedStatement psql;
	            
	            	psql = con.prepareStatement("delete from billManage where ID = ? and billID = ? and billName =?");
	                psql.setInt(1, sID);
	                psql.setInt(2, sbillID);
	                psql.setString(3, sbillName);
	                psql.executeUpdate();
	            	
	                psql.close();
	                con.close();
	                 
	          /*  }else if (s=="billID") {
	            	psql = con.prepareStatement("delete from userManage where caseID = ?");
	                psql.setInt(1, sno);
	                psql.executeUpdate();
	            	
	                psql.close();
	                con.close();
	                
				}else if (s=="name") {
	            	psql = con.prepareStatement("delete from userManage where name = ?");
	                psql.setString(1, sinfo);
	                psql.executeUpdate();
	            	
	                psql.close();
	                con.close();
	                
				}else if (s=="sex") {
	            	psql = con.prepareStatement("delete from userManage where sex = ?");
	                psql.setString(1, sinfo);
	                psql.executeUpdate();
	            	
	                psql.close();
	                con.close();
	                
				}else if (s=="age") {
					psql = con.prepareStatement("delete from userManage where age = ?");
	                psql.setInt(1, sno);
	                psql.executeUpdate();
	            	
	                psql.close();
	                con.close();
	                
				}else if (s=="indate") {
	            	psql = con.prepareStatement("delete from userManage where indate = ?");
	                psql.setString(1, sinfo);
	                psql.executeUpdate();
	            	
	                psql.close();
	                con.close();
	                
				}else if (s=="outdate") {
	            	psql = con.prepareStatement("delete from userManage where outdate = ?");
	                psql.setString(1, sinfo);
	                psql.executeUpdate();
	            	
	                psql.close();
	                con.close();
	                
				}else {
					System.out.println("�����ѯѡ�0000");
				}*/
	            } catch(ClassNotFoundException e) {   
	                //���ݿ��������쳣����
	                System.out.println("�޷��ҵ������ļ���");   
	                e.printStackTrace();   
	                } catch(SQLException e) {
	                    //���ݿ�����ʧ���쳣����
	                    e.printStackTrace();  
	                    } catch (Exception e) {
	                        // TODO: handle exception
	                        e.printStackTrace();
	                        } finally {
	                            System.out.println("billɾ���ɹ���");
	                            }
		}
		
		public void updatedata(int sbillID, String s, int sno, String sinfo, float sprice) {
			
			Connection con;
		    String driver = "com.mysql.jdbc.Driver";            //����������
		    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
		    String user = "root";                //MySQL���õ��û���
		    String password = "";                //MySQL���õ�����
			
			try {
			    Class.forName(driver);
	            con = DriverManager.getConnection(url,user,password);
	            
	            PreparedStatement psql;
	            
	           if (s=="billName") {
			        psql = con.prepareStatement("update billManage set billName = ? where billID = ?");
			        psql.setString(1, sinfo);       
			        psql.setInt(2, sbillID);              
			        psql.executeUpdate();
					
	                psql.close();
	                con.close();
	                
				}else if (s=="billMessage") {
			        psql = con.prepareStatement("update billManage set billMessage = ? where billID = ?");
			        psql.setString(1, sinfo);       
			        psql.setInt(2, sbillID);              
			        psql.executeUpdate();
					
	                psql.close();
	                con.close();
	                
				}else if (s=="billPrice") {
			        psql = con.prepareStatement("update billManage set billPrice = ? where billID = ?");
			        psql.setFloat(1, sprice);       
			        psql.setInt(2, sbillID);              
			        psql.executeUpdate();
					
	                psql.close();
	                con.close();
	                
				}else if (s=="billDate") {
			        psql = con.prepareStatement("update billManage set billDate = ? where billID = ?");
			        psql.setString(1, sinfo);       
			        psql.setInt(2, sbillID);              
			        psql.executeUpdate();
					
	                psql.close();
	                con.close();
	                
				}else if (s=="billType") {
			        psql = con.prepareStatement("update billManage set billType = ? where billID = ?");
			        psql.setInt(1, sno);       
			        psql.setInt(2, sbillID);              
			        psql.executeUpdate();
					
	                psql.close();
	                con.close();
	                
				}else {
					System.out.println("�������ѡ�0000");
				}
	            } catch(ClassNotFoundException e) {   
	                //���ݿ��������쳣����
	                System.out.println("�޷��ҵ������ļ���");   
	                e.printStackTrace();   
	                } catch(SQLException e) {
	                    //���ݿ�����ʧ���쳣����
	                    e.printStackTrace();  
	                    } catch (Exception e) {
	                        // TODO: handle exception
	                        e.printStackTrace();
	                        } finally {
	                            System.out.println("bill���³ɹ���");
	                            }
		}

        public int checkbill(int sID) {
        	
        	Connection con;
            String driver = "com.mysql.jdbc.Driver";            //����������
            String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
            String user = "root";                //MySQL���õ��û���
            String password = "";                //MySQL���õ�����
            
            int checkout=0, uncheckout=0;
            
            
            try {
            	Class.forName(driver);
	            con = DriverManager.getConnection(url,user,password);
	            
	            PreparedStatement psql;
	            ResultSet res;
	            int ID, billID, billPrice, billType, checkoutNo=0, uncheckNo=0;
	            String billName, billMessage, billDate, sbillType;
	            
	            	psql = con.prepareStatement("select * from billmanage where ID = ?");
	                psql.setInt(1, sID);
	                res = psql.executeQuery();
	                while(res.next()){
	                    ID = res.getInt("ID");
	                    billID = res.getInt("billID");
	                    billName = res.getString("billName");
	                    billMessage = res.getString("billMessage");
	                    billPrice = res.getInt("billPrice");
	                    billDate = res.getString("billDate");
	                    billType = res.getInt("billType");
	                    if(billType==1){
	                    	sbillType="������";
	                    	checkout = checkout + billPrice;
	                    	checkoutNo++;
	                    }else {
	                    	sbillType="������";
							uncheckout = uncheckout + billPrice;
							uncheckNo++;
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                cashdelete=checkout;
	                cashpay=uncheckout;
	                cashall=cashdelete+cashpay;
	                
	                
	                System.out.println("\n" + "���������ѣ�" + checkout + "\t" + "���������ѱ�����" + checkoutNo + "\t" + "���������ѣ�" + uncheckout + "\t" + "���������ѱ�����"+uncheckNo+"\n");
	                res.close();
	                psql.close();
	                con.close();
	                 
        	    } catch(ClassNotFoundException e) {   
                    //���ݿ��������쳣����
                    System.out.println("�޷��ҵ������ļ���");   
                    e.printStackTrace();   
                    } catch(SQLException e) {
                        //���ݿ�����ʧ���쳣����
                        e.printStackTrace();  
                        } catch (Exception e) {
                            // TODO: handle exception
                            e.printStackTrace();
                            } finally {
                                System.out.println("bill����ɹ�");
                                }
            
        	return cashall;
        }
}
