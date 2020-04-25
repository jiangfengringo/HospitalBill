package idControl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



//��Ϊ���߿����ģ��
public class userDataC {
	
	public ResultSet querytest(String s,int sno, String sinfo) {
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
            int ID, caseID, age;
            String name, sex, indate, outdate;
            
            if(s=="ID"){
            	psql = con.prepareStatement("select * from usermanage where ID = ?");
                psql.setInt(1, sno);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }
                
                /*res.close();
                psql.close();
                con.close();*/
                 
            }else if (s=="caseID") {
				psql = con.prepareStatement("select * from usermanage where caseID = ?");
                psql.setInt(1, sno);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }
                
                /*res.close();
                psql.close();
                con.close();*/
                
			}else if (s=="name") {
				psql = con.prepareStatement("select * from usermanage where name = ?");
                psql.setString(1, sinfo);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }

                /*res.close();
                psql.close();
                con.close();*/
                
			}else if (s=="sex") {
				psql = con.prepareStatement("select * from usermanage where sex = ?");
                psql.setString(1, sinfo);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }

                /*res.close();
                psql.close();
                con.close();*/
                
			}else if (s=="age") {
				psql = con.prepareStatement("select * from usermanage where age = ?");
                psql.setInt(1, sno);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }
                
                /*res.close();
                psql.close();
                con.close();*/
                
			}else if (s=="indate") {
				psql = con.prepareStatement("select * from usermanage where indate = ?");
                psql.setString(1, sinfo);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }
                
                /*res.close();
                psql.close();
                con.close();*/
                
			}else if (s=="outdate") {
				psql = con.prepareStatement("select * from usermanage where indate = ?");
                psql.setString(1, sinfo);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }
                
                /*res.close();
                psql.close();
                con.close();*/
                
			}else {
				System.out.println("���󣡾����룺udc001");
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
                            System.out.println("user��ѯ�ɹ���");
                            }
		return res;
	}
	
	//��Ϊ���߱����Ӳ���
	public void testdata() {
		
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //����������
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
	    String user = "root";                //MySQL���õ��û���
	    String password = "";                //MySQL���õ�����
		
		try {
		    Class.forName(driver);
            //1.getConnection()����������MySQL���ݿ�
            con = DriverManager.getConnection(url,user,password);
            if(!con.isClosed())
                System.out.println("user���ӳɹ���");
            //2.����statement���������ִ��SQL���
            Statement teststmt = con.createStatement();
            //Ҫִ�е�SQL���
            String sql = "select * from usermanage";
            //3.ResultSet�࣬������Ż�ȡ�Ľ����
            ResultSet rs = teststmt.executeQuery(sql);
            if(!rs.next())
            	System.out.println("user���ݻ�ȡʧ�ܣ�");
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
                            System.out.println("user���Գɹ�");
                            }
		}
	
	//��Ϊ��ѯ,s�����ѯ������int������sno��string������sinfo
	public void selectdata(String s, int sno, String sinfo) {
		
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //����������
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
	    String user = "root";                //MySQL���õ��û���
	    String password = "";                //MySQL���õ�����
		
		try {
		    Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            
            PreparedStatement psql;
            ResultSet res;
            int ID, caseID, age;
            String name, sex, indate, outdate;
            
            if(s=="ID"){
            	psql = con.prepareStatement("select * from usermanage where ID = ?");
                psql.setInt(1, sno);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }
                
                res.close();
                psql.close();
                con.close();
                 
            }else if (s=="caseID") {
				psql = con.prepareStatement("select * from usermanage where caseID = ?");
                psql.setInt(1, sno);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }
                
                res.close();
                psql.close();
                con.close();
                
			}else if (s=="name") {
				psql = con.prepareStatement("select * from usermanage where name = ?");
                psql.setString(1, sinfo);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }

                res.close();
                psql.close();
                con.close();
                
			}else if (s=="sex") {
				psql = con.prepareStatement("select * from usermanage where sex = ��");
                psql.setString(1, sinfo);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }

                res.close();
                psql.close();
                con.close();
                
			}else if (s=="age") {
				psql = con.prepareStatement("select * from usermanage where age = ?");
                psql.setInt(1, sno);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }
                
                res.close();
                psql.close();
                con.close();
                
			}else if (s=="indate") {
				psql = con.prepareStatement("select * from usermanage where indate = ?");
                psql.setString(1, sinfo);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }
                
                res.close();
                psql.close();
                con.close();
                
			}else if (s=="outdate") {
				psql = con.prepareStatement("select * from usermanage where indate = ?");
                psql.setString(1, sinfo);
                res = psql.executeQuery();
                while(res.next()){
                    ID = res.getInt("ID");
                    caseID = res.getInt("caseID");
                    name = res.getString("name");
                    sex = res.getString("sex");
                    age = res.getInt("age");
                    indate = res.getString("indate");
                    outdate = res.getString("outdate");
                    System.out.println("\n" + ID + "\t" + caseID + "\t" + name + "\t" + sex + "\t" + age + "\t" + indate + "\t" + outdate + "\n");
                }
                
                res.close();
                psql.close();
                con.close();
                
			}else {
				System.out.println("���󣡾����룺udc001");
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
                            System.out.println("user��ѯ�ɹ���");
                            }
		}
	
	//��Ϊ���
	public void insertdata(int sID, int scaseID, String sname, String ssex, int sage, String sindate, String soutdate) {
		
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //����������
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
	    String user = "root";                //MySQL���õ��û���
	    String password = "";                //MySQL���õ�����
	    
	    try {
	    	Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);

            PreparedStatement psql;
            
            
            psql = con.prepareStatement("insert into userManage (ID,caseID,name,sex,age,indate,outdate) values(?,?,?,?,?,?,?)");
            psql.setInt(1, sID);   
            psql.setInt(2, scaseID);
            psql.setString(3, sname);    
            psql.setString(4, ssex);
            psql.setInt(5, sage); 
            psql.setString(6, sindate);
            psql.setString(7, soutdate);
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
                        System.out.println("user��ӳɹ���");
                        }
	}
	
	//��Ϊɾ��
	public void deletedata(String s, int sno, String sinfo) {
		
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //����������
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
	    String user = "root";                //MySQL���õ��û���
	    String password = "";                //MySQL���õ�����
		
		try {
		    Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            
            PreparedStatement psql;
            
            if(s=="ID"){
            	psql = con.prepareStatement("delete from userManage where ID = ?");
                psql.setInt(1, sno);
                psql.executeUpdate();
            	
                psql.close();
                con.close();
                 
            }else if (s=="caseID") {
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
				System.out.println("����ɾ��ѡ�0000");
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
                            System.out.println("userɾ���ɹ���");
                            }
	}
	
	//��Ϊ����
	public void updatedata(int sID, String s, int sno, String sinfo) {
		
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //����������
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URLָ��Ҫ�������ݿ���
	    String user = "root";                //MySQL���õ��û���
	    String password = "";                //MySQL���õ�����
		
		try {
		    Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            
            PreparedStatement psql;
            
           if (s=="name") {
				//Ԥ������£��޸ģ�����
		        psql = con.prepareStatement("update userManage set name = ? where ID = ?");
		        psql.setString(1, sinfo);       
		        psql.setInt(2, sID);              
		        psql.executeUpdate();
				
                psql.close();
                con.close();
                
			}else if (s=="sex") {
				//Ԥ������£��޸ģ�����
		        psql = con.prepareStatement("update userManage set sex = ? where ID = ?");
		        psql.setString(1, sinfo);       
		        psql.setInt(2, sID);              
		        psql.executeUpdate();
				
                psql.close();
                con.close();
                
			}else if (s=="age") {
				//Ԥ������£��޸ģ�����
		        psql = con.prepareStatement("update userManage set age = ? where ID = ?");
		        psql.setInt(1, sno);       
		        psql.setInt(2, sID);              
		        psql.executeUpdate();
				
                psql.close();
                con.close();
                
			}else if (s=="indate") {
				//Ԥ������£��޸ģ�����
		        psql = con.prepareStatement("update userManage set indate = ? where ID = ?");
		        psql.setString(1, sinfo);       
		        psql.setInt(2, sID);              
		        psql.executeUpdate();
				
                psql.close();
                con.close();
                
			}else if (s=="outdate") {
				//Ԥ������£��޸ģ�����
		        psql = con.prepareStatement("update userManage set outdate = ? where ID = ?");
		        psql.setString(1, sinfo);       
		        psql.setInt(2, sID);              
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
                            System.out.println("user���³ɹ���");
                            }
	}
	
    }
