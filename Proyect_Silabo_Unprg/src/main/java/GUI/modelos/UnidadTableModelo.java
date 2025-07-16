package GUI.modelos;

import entidades.Unidad;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UnidadTableModelo extends AbstractTableModel {

    private List<Unidad> unidades;

    private final String[] columnas = {"Desempeño", "Habilidades Requeridas", "Semanas", "Conocimientos", "Actividades", "Evidencia de Aprendizaje"};

    public void setUnidades(List<Unidad> lista) {
        this.unidades = lista;
        fireTableDataChanged();
    }

    public List<Unidad> getUnidades() {
        return unidades;
    }

    @Override
    public int getRowCount() {
        return (unidades != null) ? unidades.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Unidad u = unidades.get(rowIndex);
        if (u == null) {
            return "";
        }

        return switch (columnIndex) {
            case 0 ->
                (u.getDesempeño() != null) ? u.getDesempeño() : "";
            case 1 ->
                (u.getHabilidadesRequeridas() != null) ? u.getHabilidadesRequeridas() : "";
            case 2 ->
                (u.getSemanas() != null) ? u.getSemanas() : "";
            case 3 ->
                (u.getConocimientos() != null) ? u.getConocimientos() : "";
            case 4 ->
                (u.getActividades() != null) ? u.getActividades() : "";
            case 5 ->
                (u.getEvidenciaAprendizaje() != null) ? u.getEvidenciaAprendizaje() : "";
            default ->
                "";
        };
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        if (unidades == null || value == null) {
            return;
        }

        Unidad u = unidades.get(rowIndex);
        String texto = value.toString().trim();

        switch (columnIndex) {
            case 1 ->
                u.setHabilidadesRequeridas(texto);
            case 2 ->
                u.setSemanas(texto);
            case 3 ->
                u.setConocimientos(texto);
            case 4 ->
                u.setActividades(texto);
            case 5 ->
                u.setEvidenciaAprendizaje(texto);
        }

        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void agregarUnidadVacia() {
        Unidad nueva = new Unidad();
        nueva.setDesempeño("");
        nueva.setHabilidadesRequeridas("");
        nueva.setSemanas("");
        nueva.setConocimientos("");
        nueva.setActividades("");
        nueva.setEvidenciaAprendizaje("");

        unidades.add(nueva);
        fireTableDataChanged();
    }
}
