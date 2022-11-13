/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Transcript;

import java.awt.Component;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author nonyx
 */


/*class StudentTableRenderer implements TableCellRenderer{
    private TableCellRenderer defaultRenderer;
    public StudentTableRenderer(TableCellRenderer renderer){
        defaultRenderer = renderer;
    }
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        if(value instanceof Component)
            return (Component)value;
        return defaultRenderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}*/

public class StudentTableModel extends AbstractTableModel{
    List<Student> students = new ArrayList<>();
    String columnNames[] = {"ID", "Name", "PhoneNumber", "Date", "Email", "Major", "Gender"};
    Class<?> columnClasses[] = {Integer.class, String.class, String.class, Date.class, String.class, String.class, String.class};
    
    Map fieldMap = new HashMap();
    
    StudentTableModel(){
        fieldMap.put(0, "ID");
        fieldMap.put(1, "Name");
        fieldMap.put(2, "PhoneNumber");
        fieldMap.put(3, "Date");
        fieldMap.put(4, "Email");
        fieldMap.put(5, "Major");
        fieldMap.put(6, "Gender");
    }
    
    @Override
    public int getRowCount(){
        return students.size();
    }
    @Override
    public int getColumnCount(){
        return columnNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        var methodName = String.format("get%s", (String) fieldMap.get(columnIndex));
        Method method = Util.getByMethodName(students.get(rowIndex), methodName);
        Object result = Util.callMethod(method, students.get(rowIndex));
        return columnIndex == 0 ? (int) result : (Object) result;
    }
    @Override
    public String getColumnName(int columnIndex){
        return columnNames[columnIndex];
    }
    @Override
    public Class<?> getColumnClass(int columnIndex){
        return columnClasses[columnIndex];
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return columnIndex != 0;
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        Student student = students.get(rowIndex);
        String column = (String) fieldMap.get(columnIndex);
        var methodName = String.format("%set%s", (String) fieldMap.get(columnIndex));
        Method method = Util.getByMethodName(students.get(rowIndex), methodName, String.class);
        Util.callMethod(method, students.get(rowIndex), aValue);
        
        fireTableCellUpdated(rowIndex, columnIndex);
    }
}
