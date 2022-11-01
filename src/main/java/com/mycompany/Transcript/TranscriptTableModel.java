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
public class TranscriptTableModel extends AbstractTableModel{
    List<Transcript> transcripts = new ArrayList<>();
    String columnNames[] = {"StudentName", "CourseTitle", "CreditHour", "LetterGrade", "GradePoint"};
    Class<?> columnClasses[] = {String.class, String.class, Integer.class, Character.class, Float.class};
    
    Map fieldMap = new HashMap();
    
    TranscriptTableModel(){
        fieldMap.put(0, "StudentName");
        fieldMap.put(1, "CourseTitle");
        fieldMap.put(2, "CreditHour");
        fieldMap.put(3, "LetterGrade");
        fieldMap.put(4, "GradePoint");
    }
    
    @Override
    public int getRowCount(){
        return transcripts.size();
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
