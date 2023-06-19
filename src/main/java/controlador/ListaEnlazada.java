/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Nodo;

/**
 *
 * @author ESTUDIANTE
 * @param <T>
 */
public class ListaEnlazada<T> {
    
   private Nodo<T> primero;

    public void agregar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            Nodo<T> nodoActual = primero;
            while (nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevoNodo);
        }
    }

    public boolean buscar(T elemento) {
        Nodo<T> nodoActual = primero;
        while (nodoActual != null) {
            if (nodoActual.getElemento().equals(elemento)) {
                return true;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return false;
    }

    public void eliminar(T elemento) {
        if (primero == null) {
            return;
        }
        if (primero.getElemento().equals(elemento)) {
            primero = primero.getSiguiente();
            return;
        }
        Nodo<T> nodoActual = primero;
        while (nodoActual.getSiguiente() != null) {
            if (nodoActual.getSiguiente().getElemento().equals(elemento)) {
                nodoActual.setSiguiente(nodoActual.getSiguiente().getSiguiente());
                return;
            }
            nodoActual = nodoActual.getSiguiente();
        }
    }
    
    public Nodo<T> getPrimero() {
        return primero;
    }
}
