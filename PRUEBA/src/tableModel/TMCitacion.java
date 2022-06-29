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
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
