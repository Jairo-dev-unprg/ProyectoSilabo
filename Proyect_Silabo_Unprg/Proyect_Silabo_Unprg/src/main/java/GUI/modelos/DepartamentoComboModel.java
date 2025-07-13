
package GUI.modelos;

import entidades.DepartamentoAcademico;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class DepartamentoComboModel extends AbstractListModel<String> implements ComboBoxModel<String> {
    
    private List<DepartamentoAcademico> depa;
    private DepartamentoAcademico seleccionado= null;

    public List<DepartamentoAcademico> getDepa() {
        return depa;
    }

    public void setDepa(List<DepartamentoAcademico> depa) {
        this.depa = depa;
    }

    public DepartamentoAcademico getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(DepartamentoAcademico seleccionado) {
        this.seleccionado = seleccionado;
    }


    @Override
    public int getSize() {
        int cantidad = 0;
        if (this.depa != null) {
            cantidad = this.depa.size();
        }
        return cantidad;
    }

    @Override
    public String getElementAt(int index) {
        return this.depa.get(index).getNombre();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.seleccionado = null;
        if (anItem != null) {

            for (DepartamentoAcademico Departa : this.depa) {
                if (Departa.getNombre().equals(anItem.toString()) == true) {
                    this.seleccionado = Departa;
                    return;
                }
            }
        }
    }

    @Override
    public Object getSelectedItem() {
        String valor = "";
        if (this.seleccionado != null) {
            valor = this.seleccionado.getNombre();
        }
        return valor;

    }
}
