/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentmanagementsystem.ui;

import com.studentmanagementsystem.Student;
import com.studentmanagementsystem.Util;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Method;
import javax.swing.table.AbstractTableModel;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author user
 */
public class StudentListTableModel extends AbstractTableModel {
    List<Student> students = new ArrayList<>();
    String columnNames[] = {"ID", "First Name", "Last Name", "Year", "Semester"};
    Class<?> columnClasses[] = {Integer.class, String.class, String.class, Integer.class, Integer.class};
    
    Map fieldMap = new HashMap();
    
    public StudentListTableModel() {
        fieldMap.put(0, "Id");
        fieldMap.put(1, "FirstName");
        fieldMap.put(2, "LastName");
        fieldMap.put(3, "Year");
        fieldMap.put(4, "Semester");
    }
    
    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var methodName = String.format("get%s", (String) fieldMap.get(columnIndex));
        Method method = Util.getByMethodName(students.get(rowIndex), methodName);
        Object result = Util.callMethod(method, students.get(rowIndex));
        return columnIndex == 1 || columnIndex == 2 ? (String) result : (int) result;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClasses[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
}
