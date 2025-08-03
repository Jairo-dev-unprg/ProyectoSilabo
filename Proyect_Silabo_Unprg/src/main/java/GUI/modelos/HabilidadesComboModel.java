
package GUI.modelos;


import entidades.HabilidadRequerida;
import entidades.Unidad;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class HabilidadesComboModel extends AbstractListModel<String> implements ComboBoxModel<String>{
    private List<HabilidadRequerida> habi;
    private HabilidadRequerida seleccionado;

    public List<HabilidadRequerida> getHabi() {
        return habi;
    }

    public void setHabi(List<HabilidadRequerida> habi) {
        this.habi = habi;
    }

    public HabilidadRequerida getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(HabilidadRequerida seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    @Override
    public int getSize() {
        int cantidad = 0;
        if (this.habi != null) {
            cantidad = this.habi.size();
        }
        return cantidad;
    }

    @Override
    public String getElementAt(int index) {
        return this.habi.get(index).getNombreHabilidad();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.seleccionado = null;
        if (anItem != null) {

            for (HabilidadRequerida habilidads : this.habi) {
                if (habilidads.getNombreHabilidad().equals(anItem.toString()) == true) {
                    this.seleccionado = habilidads;
                    return;
                }
            }
        }
    }

    @Override
    public Object getSelectedItem() {
        String valor = "";
        if (this.seleccionado != null) {
            valor = this.seleccionado.getNombreHabilidad();
        }
        return valor;

    }
}
