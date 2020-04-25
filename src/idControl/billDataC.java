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
		    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
		    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
		    String user = "root";                //MySQL配置的用户名
		    String password = "";                //MySQL配置的密码
			
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                /*res.close();
	                psql.close();
	                con.close();*/
	                
				}else {
					System.out.println("错误查询选项！0000");
				}
	            } catch(ClassNotFoundException e) {   
	                //数据库驱动类异常处理
	                System.out.println("无法找到驱动文件！");   
	                e.printStackTrace();   
	                } catch(SQLException e) {
	                    //数据库连接失败异常处理
	                    e.printStackTrace();  
	                    } catch (Exception e) {
	                        // TODO: handle exception
	                        e.printStackTrace();
	                        } finally {
	                            System.out.println("bill查询成功！");
	                            }
			return res;
	}
	
	
	public ResultSet querytest(int s) {
        ResultSet res = null;
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
	    String user = "root";                //MySQL配置的用户名
	    String password = "";                //MySQL配置的密码
	    
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
                    	sbillType = "可报销";
                    }else {
						sbillType = "不可报销";
					}
                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
                }*/
                
                //res.close();
                //psql.close();
                //con.close();
                } catch(ClassNotFoundException e) {   
	                //数据库驱动类异常处理
	                System.out.println("无法找到驱动文件！");   
	                e.printStackTrace();   
	                } catch(SQLException e) {
	                    //数据库连接失败异常处理
	                    e.printStackTrace();  
	                    } catch (Exception e) {
	                        // TODO: handle exception
	                        e.printStackTrace();
	                        } finally {
	                            System.out.println("bill测试成功");
	                            }
		
		return res;
	}
	
	public void deletedatabillID(int sbillID) {
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
	    String user = "root";                //MySQL配置的用户名
	    String password = "";                //MySQL配置的密码
		
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
            //数据库驱动类异常处理
            System.out.println("无法找到驱动文件！");   
            e.printStackTrace();   
            } catch(SQLException e) {
                //数据库连接失败异常处理
                e.printStackTrace();  
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                    } finally {
                        System.out.println("bill删除成功！");
                        }
	}
	
	//测试数据表能否成功连接
		public void testdata() {
			
			Connection con;
		    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
		    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
		    String user = "root";                //MySQL配置的用户名
		    String password = "";                //MySQL配置的密码
			
			try {
			    Class.forName(driver);
	            //1.getConnection()方法，连接MySQL数据库！！
	            con = DriverManager.getConnection(url,user,password);
	            if(!con.isClosed())
	                System.out.println("bill数据库连接成功！");
	            //2.创建statement类对象，用来执行SQL语句！！
	            Statement teststmt = con.createStatement();
	            //要执行的SQL语句
	            String sql = "select * from billmanage";
	            //3.ResultSet类，用来存放获取的结果集！！
	            ResultSet rs = teststmt.executeQuery(sql);
	            if(!rs.next())
	            	System.out.println("bill数据获取失败！");
	            rs.close();
	            teststmt.close();
	            con.close();
			    } catch(ClassNotFoundException e) {   
	                //数据库驱动类异常处理
	                System.out.println("无法找到驱动文件！");   
	                e.printStackTrace();   
	                } catch(SQLException e) {
	                    //数据库连接失败异常处理
	                    e.printStackTrace();  
	                    } catch (Exception e) {
	                        // TODO: handle exception
	                        e.printStackTrace();
	                        } finally {
	                            System.out.println("bill测试成功");
	                            }
			}
		
		
		public PrintStream selectdata(String s, int sno, String sinfo) {
			
			Connection con;
		    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
		    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
		    String user = "root";                //MySQL配置的用户名
		    String password = "";                //MySQL配置的密码
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
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
	                    	sbillType = "可报销";
	                    }else {
							sbillType = "不可报销";
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                res.close();
	                psql.close();
	                con.close();
	                
				}else {
					System.out.println("错误查询选项！0000");
				}
	            } catch(ClassNotFoundException e) {   
	                //数据库驱动类异常处理
	                System.out.println("无法找到驱动文件！");   
	                e.printStackTrace();   
	                } catch(SQLException e) {
	                    //数据库连接失败异常处理
	                    e.printStackTrace();  
	                    } catch (Exception e) {
	                        // TODO: handle exception
	                        e.printStackTrace();
	                        } finally {
	                            System.out.println("bill查询成功！");
	                            }
			return ti;
			}
		
		public void insertdata(int sID, int sbillID, String sbillName, String sbillMessage, Float sbillPrice, String sbillDate, int sbillType) {
			
			Connection con;
		    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
		    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
		    String user = "root";                //MySQL配置的用户名
		    String password = "";                //MySQL配置的密码
		    
		    try {
		    	Class.forName(driver);
	            con = DriverManager.getConnection(url,user,password);

	            PreparedStatement psql;
	            
	            
	            //预处理添加数据，其中有两个参数--“？”
	            psql = con.prepareStatement("insert into billManage (ID,billID,billName,billMessage,billPrice,billDate,billType) values(?,?,?,?,?,?,?)");
	            psql.setInt(1, sID);   
	            psql.setInt(2, sbillID);
	            psql.setString(3, sbillName);    
	            psql.setString(4, sbillMessage);
	            psql.setFloat(5, sbillPrice); 
	            psql.setString(6, sbillDate);
	            psql.setInt(7, sbillType); 
	            psql.executeUpdate();           //执行更新
	            
	            psql.close();
		    	con.close();
			} catch(ClassNotFoundException e) {   
	            //数据库驱动类异常处理
	            System.out.println("无法找到驱动文件！");   
	            e.printStackTrace();   
	            } catch(SQLException e) {
	                //数据库连接失败异常处理
	                e.printStackTrace();  
	                } catch (Exception e) {
	                    // TODO: handle exception
	                    e.printStackTrace();
	                    } finally {
	                        System.out.println("bill添加成功！");
	                        }
		}
		
		public void deletedata(int sID, int sbillID, String sbillName) {
			
			Connection con;
		    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
		    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
		    String user = "root";                //MySQL配置的用户名
		    String password = "";                //MySQL配置的密码
			
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
					System.out.println("错误查询选项！0000");
				}*/
	            } catch(ClassNotFoundException e) {   
	                //数据库驱动类异常处理
	                System.out.println("无法找到驱动文件！");   
	                e.printStackTrace();   
	                } catch(SQLException e) {
	                    //数据库连接失败异常处理
	                    e.printStackTrace();  
	                    } catch (Exception e) {
	                        // TODO: handle exception
	                        e.printStackTrace();
	                        } finally {
	                            System.out.println("bill删除成功！");
	                            }
		}
		
		public void updatedata(int sbillID, String s, int sno, String sinfo, float sprice) {
			
			Connection con;
		    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
		    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
		    String user = "root";                //MySQL配置的用户名
		    String password = "";                //MySQL配置的密码
			
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
					System.out.println("错误更新选项！0000");
				}
	            } catch(ClassNotFoundException e) {   
	                //数据库驱动类异常处理
	                System.out.println("无法找到驱动文件！");   
	                e.printStackTrace();   
	                } catch(SQLException e) {
	                    //数据库连接失败异常处理
	                    e.printStackTrace();  
	                    } catch (Exception e) {
	                        // TODO: handle exception
	                        e.printStackTrace();
	                        } finally {
	                            System.out.println("bill更新成功！");
	                            }
		}

        public int checkbill(int sID) {
        	
        	Connection con;
            String driver = "com.mysql.jdbc.Driver";            //驱动程序名
            String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
            String user = "root";                //MySQL配置的用户名
            String password = "";                //MySQL配置的密码
            
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
	                    	sbillType="报销内";
	                    	checkout = checkout + billPrice;
	                    	checkoutNo++;
	                    }else {
	                    	sbillType="报销外";
							uncheckout = uncheckout + billPrice;
							uncheckNo++;
						}
	                    System.out.println("\n" + ID + "\t" + billID + "\t" + billName + "\t" + billMessage + "\t" + billPrice + "\t" + billDate + "\t" + sbillType + "\n");
	                }
	                
	                cashdelete=checkout;
	                cashpay=uncheckout;
	                cashall=cashdelete+cashpay;
	                
	                
	                System.out.println("\n" + "报销内消费：" + checkout + "\t" + "报销内消费笔数：" + checkoutNo + "\t" + "报销外消费：" + uncheckout + "\t" + "报销外消费笔数："+uncheckNo+"\n");
	                res.close();
	                psql.close();
	                con.close();
	                 
        	    } catch(ClassNotFoundException e) {   
                    //数据库驱动类异常处理
                    System.out.println("无法找到驱动文件！");   
                    e.printStackTrace();   
                    } catch(SQLException e) {
                        //数据库连接失败异常处理
                        e.printStackTrace();  
                        } catch (Exception e) {
                            // TODO: handle exception
                            e.printStackTrace();
                            } finally {
                                System.out.println("bill结算成功");
                                }
            
        	return cashall;
        }
}
