/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author alce
 */
public class Cliente {
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private List<Factura> coleccionDeFacturas;
}
