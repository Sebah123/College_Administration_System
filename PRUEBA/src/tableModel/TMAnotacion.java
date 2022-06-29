package tableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Anotacion;

public class TMAnotacion extends AbstractTableModel {

    private List<Anotacion> lista;

    public TMAnotacion(List<Anotacion> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Anotacion a = lista.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return a.getId();
            case 1:
                return a.getTipo();
            case 2:
                return a.getCurso();
            case 3:
                return a.getAlumno();
            case 4:
                return a.getDescripcion();
            default:
                return a.getA();

        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Tipo";
            case 2:
                return "Curso";
            case 3:
                return "Alumno";
            case 4:
                return "Descripción";
            default:
                return "Fecha";
        }
    }
}
