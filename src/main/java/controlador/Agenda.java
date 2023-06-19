/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Contacto;
import modelo.Nodo;

/**
 *
 * @author ESTUDIANTE
 * @param <T>
 */
public class Agenda <T>{
 private ListaEnlazada<Contacto<T>> contactos;

    public Agenda() {
        contactos = new ListaEnlazada<>();
    }

    public void agregarContacto(T nombre, T telefono) {
        Contacto<T> nuevoContacto = new Contacto<>(nombre, telefono);
        contactos.agregar(nuevoContacto);
    }

    public boolean buscarContacto(T nombre) {
        Nodo<Contacto<T>> nodoActual = contactos.getPrimero();
        while (nodoActual != null) {
            Contacto<T> contacto = nodoActual.getElemento();
            if (contacto.getNombre().equals(nombre)) {
                return true;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return false;
    }

    public void eliminarContacto(T nombre) {
        contactos.eliminar(new Contacto<>(nombre, null));
    }
}
    

