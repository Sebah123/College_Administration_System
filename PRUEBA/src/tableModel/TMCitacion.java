package tableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Citacion;

public class TMCitacion extends AbstractTableModel {

    private List<Citacion> lista;

    public TMCitacion(List<Citacion> lista) {
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
        Citacion c = lista.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return c.getId();
            case 1:
                return c.getCurso();
            case 2:
                return c.getAlumno();
            case 3:
                return c.getRazon();
            case 4:
                return c.getDescripcion();
            default:
                return c.getFecha();

        }

    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Curso";
            case 2:
                return "Alumno";
            case 3:
                return "Razon";
            case 4:
                return "Descripcion";
            default:
                return "Fecha";
        }
    }

}
