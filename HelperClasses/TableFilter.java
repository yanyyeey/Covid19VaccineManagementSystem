package HelperClasses;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class TableFilter {

    private static TableRowSorter<TableModel> rowSorter;

    public static void filter(JTable jTable, String condition, String query) {
        rowSorter = new TableRowSorter<>(jTable.getModel());
        jTable.setRowSorter(rowSorter);

        if (query != condition) {
            rowSorter.setRowFilter(RowFilter.regexFilter(query));
        } else {
            jTable.setRowSorter(rowSorter);
        }
    }
    
    public static void filterTwoQuery(JTable jTable, String condition1, String condition2, String query1, String query2) {
        rowSorter = new TableRowSorter<>(jTable.getModel());
        jTable.setRowSorter(rowSorter);
        
        ArrayList<RowFilter<Object, Object>> andFilters = new ArrayList<RowFilter<Object, Object>>();
        RowFilter<Object,Object> query1Filter = RowFilter.regexFilter(query1);
        RowFilter<Object,Object> query2Filter = RowFilter.regexFilter(query2);
        andFilters.add(query1Filter);
        andFilters.add(query2Filter);
        

        if(query2.equals(condition2)){
            if(query1 != condition1){
                rowSorter.setRowFilter(RowFilter.regexFilter(query1));
            }else{
               jTable.setRowSorter(rowSorter); 
            }
        }else{
            rowSorter.setRowFilter(RowFilter.andFilter(andFilters));
        }
            
    }
}
