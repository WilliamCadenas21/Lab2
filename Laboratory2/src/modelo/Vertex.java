/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Guest
 */
public class Vertex {
    
    private int id;
    private int weight;
    private Vertex mainLink;
    private Vertex primero;
    private Vertex ultimo;
    private Vertex aux;
    private Vertex anteaux;
    private int numOfEdges;

    public void addEdge(Vertex vertex) {
        aux = vertex;
        if (primero == null) {
            primero = aux;
            ultimo = aux;
            aux.setMainLink(null);
            numOfEdges = 1;
        } else {
            ultimo.setMainLink(aux);
            ultimo = aux;
            numOfEdges++;
        }
        aux.setMainLink(null);
    }

    public int getNum() {
        return weight;
    }

    public void setNum(int num) {
        this.weight = num;
    }

    public Vertex getMainLink() {
        return mainLink;
    }

    public void setMainLink(Vertex mainLink) {
        this.mainLink = mainLink;
    }

    public Vertex getPrimero() {
        return primero;
    }

    public void setPrimero(Vertex primero) {
        this.primero = primero;
    }

    public Vertex getUltimo() {
        return ultimo;
    }

    public void setUltimo(Vertex ultimo) {
        this.ultimo = ultimo;
    }

    public Vertex getAux() {
        return aux;
    }

    public void setAux(Vertex aux) {
        this.aux = aux;
    }

    public Vertex getAnteaux() {
        return anteaux;
    }

    public void setAnteaux(Vertex anteaux) {
        this.anteaux = anteaux;
    }

    public int getNumOfEdges() {
        return numOfEdges;
    }

    public void setNumOfEdges(int numOfEdges) {
        this.numOfEdges = numOfEdges;
    }

    public Vertex(int id,int weight) {
        this.id = id;
        this.weight=weight;
    }

    public int getId(){
        return id;
    }
}
