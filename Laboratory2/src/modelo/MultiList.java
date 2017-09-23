/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author WILL
 */
public class MultiList {

    private Vertex primero;
    private Vertex ultimo;
    private Vertex aux;
    private int tamaño;

    public MultiList() {
        this.primero = null;
        this.ultimo = null;
    }

    public void addVertex(int id, int weight) {
        aux = new Vertex(id, weight);
        if (primero == null) {
            primero = aux;
            ultimo = aux;
            aux.setMainLink(null);
            tamaño = 1;
        } else {
            ultimo.setMainLink(aux);
            ultimo = aux;
            tamaño++;
        }
        aux.setMainLink(null);
    }
    
    public void showList(){
        aux = primero;
        while(aux != null){
            System.out.println(aux.getId());
            
        }
    }

    public void addEdge(int id) {
        aux = primero;
        while (aux != null) {
            if (aux.getId() == id) {
                aux.addEdge(aux);
            }
        }

    }
}
