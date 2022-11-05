/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Transcript;

import com.mycompany.Transcript.Util;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nonyx
 */
public class StudentTableModel extends AbstractTableModel{
    List<Student> students = new ArrayList<>();
    String columnNames[] = {"ID", "Name", "PhoneNumber"};
    Class<?> columnClasses[] = {Integer.class, String.class, String.class};
    
    Map fieldMap = new HashMap();
    
    StudentTableModel(){
        fieldMap.put(0, "ID");
        fieldMap.put(1, "Name");
        fieldMap.put(2, "PhoneNumber");
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
        return columnIndex == 0 ? (int) result : (String) result;
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
