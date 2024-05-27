/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TAD_Establecimiento;

/**
 *
 * @author Sebas
 */
public interface BusquedaLinealEstablecimiento {
    ListaEnlazadaImplEstablecimiento buscarPorGiro(String giroActividad);
    ListaEnlazadaImplEstablecimiento buscarPorArea(Double Area);
    ListaEnlazadaImplEstablecimiento buscarPorTipoLicencia(String tipoLicencia);
}
