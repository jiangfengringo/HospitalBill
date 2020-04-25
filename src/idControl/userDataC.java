package idControl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



//此为患者库管理模块
public class userDataC {
	
	public ResultSet querytest(String s,int sno, String sinfo) {
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
				System.out.println("错误！纠错码：udc001");
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
                            System.out.println("user查询成功！");
                            }
		return res;
	}
	
	//此为患者表连接测试
	public void testdata() {
		
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
	    String user = "root";                //MySQL配置的用户名
	    String password = "";                //MySQL配置的密码
		
		try {
		    Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库
            con = DriverManager.getConnection(url,user,password);
            if(!con.isClosed())
                System.out.println("user连接成功！");
            //2.创建statement类对象，用来执行SQL语句
            Statement teststmt = con.createStatement();
            //要执行的SQL语句
            String sql = "select * from usermanage";
            //3.ResultSet类，用来存放获取的结果集
            ResultSet rs = teststmt.executeQuery(sql);
            if(!rs.next())
            	System.out.println("user数据获取失败！");
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
                            System.out.println("user测试成功");
                            }
		}
	
	//此为查询,s输入查询项名，int型输入sno，string型输入sinfo
	public void selectdata(String s, int sno, String sinfo) {
		
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
	    String user = "root";                //MySQL配置的用户名
	    String password = "";                //MySQL配置的密码
		
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
				psql = con.prepareStatement("select * from usermanage where sex = ？");
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
				System.out.println("错误！纠错码：udc001");
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
                            System.out.println("user查询成功！");
                            }
		}
	
	//此为添加
	public void insertdata(int sID, int scaseID, String sname, String ssex, int sage, String sindate, String soutdate) {
		
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
	    String user = "root";                //MySQL配置的用户名
	    String password = "";                //MySQL配置的密码
	    
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
                        System.out.println("user添加成功！");
                        }
	}
	
	//此为删除
	public void deletedata(String s, int sno, String sinfo) {
		
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
	    String user = "root";                //MySQL配置的用户名
	    String password = "";                //MySQL配置的密码
		
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
				System.out.println("错误删除选项！0000");
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
                            System.out.println("user删除成功！");
                            }
	}
	
	//此为更新
	public void updatedata(int sID, String s, int sno, String sinfo) {
		
		Connection con;
	    String driver = "com.mysql.jdbc.Driver";            //驱动程序名
	    String url = "jdbc:mysql://localhost:3306/hospitalmanaged?characterEncoding=UTF-8";                  //URL指向要访问数据库名
	    String user = "root";                //MySQL配置的用户名
	    String password = "";                //MySQL配置的密码
		
		try {
		    Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            
            PreparedStatement psql;
            
           if (s=="name") {
				//预处理更新（修改）数据
		        psql = con.prepareStatement("update userManage set name = ? where ID = ?");
		        psql.setString(1, sinfo);       
		        psql.setInt(2, sID);              
		        psql.executeUpdate();
				
                psql.close();
                con.close();
                
			}else if (s=="sex") {
				//预处理更新（修改）数据
		        psql = con.prepareStatement("update userManage set sex = ? where ID = ?");
		        psql.setString(1, sinfo);       
		        psql.setInt(2, sID);              
		        psql.executeUpdate();
				
                psql.close();
                con.close();
                
			}else if (s=="age") {
				//预处理更新（修改）数据
		        psql = con.prepareStatement("update userManage set age = ? where ID = ?");
		        psql.setInt(1, sno);       
		        psql.setInt(2, sID);              
		        psql.executeUpdate();
				
                psql.close();
                con.close();
                
			}else if (s=="indate") {
				//预处理更新（修改）数据
		        psql = con.prepareStatement("update userManage set indate = ? where ID = ?");
		        psql.setString(1, sinfo);       
		        psql.setInt(2, sID);              
		        psql.executeUpdate();
				
                psql.close();
                con.close();
                
			}else if (s=="outdate") {
				//预处理更新（修改）数据
		        psql = con.prepareStatement("update userManage set outdate = ? where ID = ?");
		        psql.setString(1, sinfo);       
		        psql.setInt(2, sID);              
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
                            System.out.println("user更新成功！");
                            }
	}
	
    }
