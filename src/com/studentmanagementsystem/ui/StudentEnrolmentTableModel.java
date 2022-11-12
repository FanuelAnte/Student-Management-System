/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentmanagementsystem.ui;

import com.studentmanagementsystem.model.Course;
import com.studentmanagementsystem.model.Enrolment;
import javax.swing.table.AbstractTableModel;
import com.studentmanagementsystem.model.Util;
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
public class StudentEnrolmentTableModel extends AbstractTableModel {
    List<Enrolment> enrolments = new ArrayList<>();
    List<Enrolment> matchedEnrolments = new ArrayList<>();
    List<Course> courses = new ArrayList<>();
    String columnNames[] = {"Code", "Course Name", "Credit Hours", "Year", "Semester", "Enrolled"};
    Class<?> columnClasses[] = {String.class, String.class, Integer.class, Integer.class, Integer.class, boolean.class};

    Map fieldMap = new HashMap();

    public StudentEnrolmentTableModel() {
        matchEnrolmentData();
        fieldMap.put(0, "Code");
        fieldMap.put(1, "Name");
        fieldMap.put(2, "CreditHours");
        fieldMap.put(3, "Year"); 
        fieldMap.put(4, "Semester");
        fieldMap.put(5, "Enrolled");
    }
    
    
    @Override
    public int getRowCount() {
        return courses.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    public List<Enrolment> matchEnrolmentData() {
        for (Course course: courses) {
            for (Enrolment enrolment: enrolments) {
                if (enrolment.getCourse().getId() == course.getId()) {
                    matchedEnrolments.add(enrolment);
                }
            }
        }
        
        return matchedEnrolments;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var methodName = String.format("get%s", (String) fieldMap.get(columnIndex));
        Method method;
        Object result;
        if (columnIndex == 5) {
            method = Util.getByMethodName(matchEnrolmentData().get(rowIndex), methodName);
            result = Util.callMethod(method, matchEnrolmentData().get(rowIndex));
        } else {
            method = Util.getByMethodName(courses.get(rowIndex), methodName);
            result = Util.callMethod(method, courses.get(rowIndex));
        }
        return result;
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
