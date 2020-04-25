package swingUI;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
 


import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class jtable {
	/**
     * 功能：实现结果集的表格显示
     */
    @SuppressWarnings("rawtypes")
	public static void displayResultSet(JTable table, ResultSet rs)
            throws SQLException {
        //
        rs.beforeFirst();// 指针移到第一条记录前面
        boolean hasRecords = rs.next();
 
        if (!hasRecords) { // 记录集为空，提示一条消息
            JOptionPane.showMessageDialog(table, "无相关记录", "Check your input!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
 
        Vector<String> columnHeads = new Vector<String>();// 用于存储表头字段(列名)
        Vector<Vector> rows = new Vector<Vector>();// 用于存储记录行
        try {
            // 获取字段的名称
            ResultSetMetaData rsmd = rs.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); ++i)
                columnHeads.addElement(rsmd.getColumnName(i));
 
            do {// 获取记录集
                rows.addElement(getNextRow(rs, rsmd));
            } while (rs.next());
            // 建立相应的TableModel,并将TableModel应用到Table中显示出来
            DefaultTableModel model = new DefaultTableModel(rows, columnHeads);
            table.setModel(model);
            return;
        } catch (SQLException exc) {
            JOptionPane.showMessageDialog(table, exc.toString(),
                    "Check your input!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
    }
    
    /**
     * 被displayResultSet(JTable table, ResultSet rs)调用, 以Vector形式返回一个记录行
     */
    @SuppressWarnings("rawtypes")
	private static Vector getNextRow(ResultSet rs, ResultSetMetaData rsmd)
            throws SQLException {
        Vector<String> currentRow = new Vector<String>();
        for (int i = 1; i <= rsmd.getColumnCount(); ++i)
            currentRow.addElement(rs.getString(i));
        return currentRow; // 返回一条记录
    }
 

}
