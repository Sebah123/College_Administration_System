package tableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Tarea;


public class TMTarea extends AbstractTableModel{
    
    private List<Tarea> lista;
    
    public TMTarea(List<Tarea> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tarea t = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return t.getId();
            case 1: 
                return t.getTitulo();
            case 2:
                return t.getDescripcion();
            case 3:
                return t.getAsignatura();
            default:
                return t.getEstado();
        }
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Titulo";
            case 2:
                return "Descripción";
            case 3:
                return "Asignatura";
            default: 
                return "Estado";
        }
    }
    
}
