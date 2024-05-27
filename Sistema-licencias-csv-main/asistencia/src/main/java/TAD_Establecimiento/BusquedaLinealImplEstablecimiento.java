/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAD_Establecimiento;

/**
 *
 * @author Sebas
 */
public class BusquedaLinealImplEstablecimiento implements BusquedaLinealEstablecimiento {

    private ListaEnlazadaImplEstablecimiento lista;

    public BusquedaLinealImplEstablecimiento(ListaEnlazadaImplEstablecimiento lista) {
        this.lista = lista;
    }

    @Override
    public ListaEnlazadaImplEstablecimiento buscarPorGiro(String giroActividad) {
        ListaEnlazadaImplEstablecimiento resultados = new ListaEnlazadaImplEstablecimiento();
        NodoEstablecimiento actual = lista.cabeza;
        while (actual != null) {
            if (actual.getEstablecimiento().getGiro_Actividad().equalsIgnoreCase(giroActividad)) {
                resultados.insertar(actual.getEstablecimiento());
            }
            actual = actual.getSiguiente();
        }
        return resultados;
    }

    @Override
    public ListaEnlazadaImplEstablecimiento buscarPorArea(Double area) {
        ListaEnlazadaImplEstablecimiento resultados = new ListaEnlazadaImplEstablecimiento();
        NodoEstablecimiento actual = lista.cabeza;
        while (actual != null) {
            if (actual.getEstablecimiento().getArea_Estab().equals(area)) {
                resultados.insertar(actual.getEstablecimiento());
            }
            actual = actual.getSiguiente();
        }
        return resultados;
    }
    @Override
    public ListaEnlazadaImplEstablecimiento buscarPorTipoLicencia(String tipoLicencia) {
        ListaEnlazadaImplEstablecimiento resultados = new ListaEnlazadaImplEstablecimiento();
        NodoEstablecimiento actual = lista.cabeza;
        while (actual != null) {
            if (actual.getEstablecimiento().getTipo_Licencia().equalsIgnoreCase(tipoLicencia)) {
                resultados.insertar(actual.getEstablecimiento());
            }
            actual = actual.getSiguiente();
        }
        return resultados;
    }
}
