/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI_and_TableModels;

import model_classes.*;
import Services.TranscriptService;
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
public class TranscriptTableModel extends AbstractTableModel {

    List<Transcript> transcripts = new ArrayList<>();
    String columnNames[] = {"ID", "Student-ID", "CourseTitle", "CreditHour", "LetterGrade", "GradePoint"};
    Class<?> columnClasses[] = {Integer.class, Object.class,String.class, Integer.class, Character.class, Integer.class};

    public String getColumnNames() {
        String name = "";
        for (int i = 0; i < columnNames.length; i++) {
            name += columnNames[i] + ", ";
        }
        return name;
    }

    Map fieldMap = new HashMap();

    TranscriptTableModel() {
        fieldMap.put(0, "ID");
        fieldMap.put(1, "StudentID");
        fieldMap.put(2, "CourseTitle");
        fieldMap.put(3, "CreditHour");
        fieldMap.put(4, "LetterGrade");
        fieldMap.put(5, "GradePoint");
    }

    @Override
    public int getRowCount() {
        return transcripts.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var methodName = String.format("get%s", (String) fieldMap.get(columnIndex));
        Method method = Util.getByMethodName(transcripts.get(rowIndex), methodName);
        Object result = Util.callMethod(method, transcripts.get(rowIndex));
        return columnIndex == 0 || columnIndex == 3 || columnIndex == 5 ? (int) result : columnIndex == 4 ? (char) result : (String) result;
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
        return columnIndex != 0;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Transcript transcript = transcripts.get(rowIndex);
        String column = (String) fieldMap.get(columnIndex);
        var methodName = String.format("set%s", (String) fieldMap.get(columnIndex));
        Method method = Util.getByMethodName(transcripts.get(rowIndex), methodName, String.class);
        Util.callMethod(method, transcripts.get(rowIndex), aValue);

        fireTableCellUpdated(rowIndex, columnIndex);

        TranscriptService service = new TranscriptService();
        service.update(transcript, column, (String) aValue);
    }
}
