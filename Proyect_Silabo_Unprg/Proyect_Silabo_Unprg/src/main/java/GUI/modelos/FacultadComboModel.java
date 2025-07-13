
package GUI.modelos;

import entidades.Facultad;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class FacultadComboModel extends AbstractListModel<String> implements ComboBoxModel<String> {
   
    private List<Facultad> facul;
    private Facultad seleccionado= null;

    public List<Facultad> getFacul() {
        return facul;
    }

    public void setFacul(List<Facultad> facul) {
        this.facul = facul;
    }

    public Facultad getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Facultad seleccionado) {
        this.seleccionado = seleccionado;
    }

    @Override
    public int getSize() {
        int cantidad = 0;
        if (this.facul != null) {
            cantidad = this.facul.size();
        }
        return cantidad;
    }

    @Override
    public String getElementAt(int index) {
        return this.facul.get(index).getAbreviatura();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.seleccionado = null;
        if (anItem != null) {

            for (Facultad facul : this.facul) {
                if (facul.getAbreviatura().equals(anItem.toString()) == true) {
                    this.seleccionado = facul;
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
