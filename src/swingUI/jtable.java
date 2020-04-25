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
     * ���ܣ�ʵ�ֽ�����ı����ʾ
     */
    @SuppressWarnings("rawtypes")
	public static void displayResultSet(JTable table, ResultSet rs)
            throws SQLException {
        //
        rs.beforeFirst();// ָ���Ƶ���һ����¼ǰ��
        boolean hasRecords = rs.next();
 
        if (!hasRecords) { // ��¼��Ϊ�գ���ʾһ����Ϣ
            JOptionPane.showMessageDialog(table, "����ؼ�¼", "Check your input!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
 
        Vector<String> columnHeads = new Vector<String>();// ���ڴ洢��ͷ�ֶ�(����)
        Vector<Vector> rows = new Vector<Vector>();// ���ڴ洢��¼��
        try {
            // ��ȡ�ֶε�����
            ResultSetMetaData rsmd = rs.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); ++i)
                columnHeads.addElement(rsmd.getColumnName(i));
 
            do {// ��ȡ��¼��
                rows.addElement(getNextRow(rs, rsmd));
            } while (rs.next());
            // ������Ӧ��TableModel,����TableModelӦ�õ�Table����ʾ����
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
     * ��displayResultSet(JTable table, ResultSet rs)����, ��Vector��ʽ����һ����¼��
     */
    @SuppressWarnings("rawtypes")
	private static Vector getNextRow(ResultSet rs, ResultSetMetaData rsmd)
            throws SQLException {
        Vector<String> currentRow = new Vector<String>();
        for (int i = 1; i <= rsmd.getColumnCount(); ++i)
            currentRow.addElement(rs.getString(i));
        return currentRow; // ����һ����¼
    }
 

}
