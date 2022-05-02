package tableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Alumno;

public class TMAlumno extends AbstractTableModel {

    private List<Alumno> lista;

    public TMAlumno(List<Alumno> lista) {
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
        Alumno a = lista.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return a.getId();
            case 1:
                return a.getNombre();
            case 2:
                return a.getRut();
            case 3:
                return a.getTelefono();
            default:
                return a.getCurso();

        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Estudiante";
            case 2:
                return "Rut";
            case 3:
                return "Telefono";
            default:
                return "Curso";
        }
    }

}
