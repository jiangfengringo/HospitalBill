package swingUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class time_random {

	public String timenow() {
		String time;
    	Date now = new Date();
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	time = dateFormat.format(now);
    	return time;
	}
	
	public int getrandomID() {
		
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
	    String user = "root";                //MySQL配置的用户名
	    String password = "";                //MySQL配置的密码
	    int r=0000;
		
		try {
		    Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
        
            PreparedStatement psql;
            ResultSet res;

            	
        	do{
            	Random r1= new Random();
        		r = r1.nextInt(10000);
        		
        		psql = con.prepareStatement("select * from usermanage where ID = ?");
                psql.setInt(1, r);
                res = psql.executeQuery();
                }while(res.next());
                
                res.close();
                psql.close();
                con.close();
		}catch(ClassNotFoundException e) {   
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
                                System.out.println("随机数获取成功"+r);
                                }
		return r;
		
	}
	
	public int getrandombillID(int sID) {
		
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
	    String user = "root";                //MySQL配置的用户名
	    String password = "";                //MySQL配置的密码
	    int r=0000;
		
		try {
		    Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
        
            PreparedStatement psql;
            ResultSet res;

            	
        	do{
            	Random r1= new Random();
        		r = r1.nextInt(10000);

        		psql = con.prepareStatement("select * from billmanage where ID = ? and billID = ?");
                psql.setInt(1, sID);
                psql.setInt(1, r);
                res = psql.executeQuery();
                }while(res.next());
                
                res.close();
                psql.close();
                con.close();
		}catch(ClassNotFoundException e) {   
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
                                System.out.println("随机数获取成功"+r);
                                }
		return r;
		
		
	}
	
	public int getrandomcaseID(int sID) {
		
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
	    String user = "root";                //MySQL配置的用户名
	    String password = "";                //MySQL配置的密码
	    int r=0000;
		
		try {
		    Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
        
            PreparedStatement psql;
            ResultSet res;

            	
        	do{
            	Random r1= new Random();
        		r = r1.nextInt(10000);

        		psql = con.prepareStatement("select * from usermanage where ID = ? and caseID = ?");
                psql.setInt(1, sID);
                psql.setInt(1, r);
                res = psql.executeQuery();
                }while(res.next());
                
                res.close();
                psql.close();
                con.close();
		}catch(ClassNotFoundException e) {   
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
                                System.out.println("随机数获取成功"+r);
                                }
		return r;
		
		
	}

}
