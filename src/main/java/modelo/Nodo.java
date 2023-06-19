/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

     public class Nodo<E> {
        private E elemento;
        private Nodo<E> siguiente;

        public Nodo(E elemento) {
            this.elemento = elemento;
        }

        public E getElemento() {
            return elemento;
        }

        public Nodo<E> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo<E> siguiente) {
            this.siguiente = siguiente;
        }
    }