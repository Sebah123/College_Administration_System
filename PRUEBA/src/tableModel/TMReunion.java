package tableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Reunion;

public class TMReunion extends AbstractTableModel {

    private List<Reunion> lista;

    public TMReunion(List<Reunion> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reunion r = lista.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return r.getId();
            case 1:
                return r.getCurso();
            default:
                return r.getHora();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Curso";
            default:
                return "Fecha";
        }
    }
}
