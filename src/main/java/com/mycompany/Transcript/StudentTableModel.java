/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Transcript;

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
    String columnNames[] = {"SchoolID", "Name", "PhoneNumber", "Payment", "EditTranscript"};
    Class<?> columnClasses[] = {Integer.class, String.class, String.class, String.class, String.class};
    
    Map fieldMap = new HashMap();
    
    StudentTableModel(){
        fieldMap.put(0, "SchoolID");
        fieldMap.put(1, "Name");
        fieldMap.put(2, "PhoneNumber");
        fieldMap.put(3, "Payment");
        fieldMap.put(4, "EditTranscript");
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
        return String.class;
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
        return true;
    }
}
