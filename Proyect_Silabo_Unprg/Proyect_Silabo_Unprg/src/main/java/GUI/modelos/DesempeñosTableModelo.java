package GUI.modelos;

import entidades.Desempeño;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DesempeñosTableModelo extends AbstractTableModel {

    private List<Desempeño> desempeño;
    private final String[] columnas = {"Desempeño", "Unidad"};

    public List<Desempeño> getDesempeño() {
        return desempeño;
    }

    public void setDesempeño(List<Desempeño> desempeño) {
        this.desempeño = desempeño;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        int cantidad = 0;

        if (this.desempeño != null) {
            cantidad = this.desempeño.size();
        }

        return cantidad;
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Object valor = "";

        if (this.desempeño != null) {
            switch (columnIndex) {
                case 0 ->
                    valor = this.desempeño.get(rowIndex).getDesempeño();
                case 1 ->
                    valor = this.desempeño.get(rowIndex).getUnidad().getNombre();
                default ->
                    throw new AssertionError();
            }
        }
        return valor;
    }

    @Override
    public String getColumnName(int column) {
        return this.columnas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return java.lang.String.class;

            case 1:
                return java.lang.String.class;
        }
        return super.getColumnClass(columnIndex); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 1; // Solo se puede editar la columna "Unidad" (nombre)
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        if (desempeño != null && rowIndex >= 0 && rowIndex < desempeño.size()) {
            Desempeño d = desempeño.get(rowIndex);
            if (columnIndex == 1) {
                d.getUnidad().setNombre((String) value); // ✅ Actualiza el nombre de la unidad
                fireTableCellUpdated(rowIndex, columnIndex); // 🔔 Notifica el cambio
            }
        }
    }
}
