/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratory2;

/**
 *
 * @author Guest
 */
public class Graph {

    Vertex vertices[];
    int matrixAd[][];
    int numVertices;
    int maxVertices;

    public Graph(int m) {
        maxVertices = m;
        numVertices = 0;
        vertices = new Vertex[m];
        matrixAd = new int[m][m];
    }

    public int getIndex(char v) {
        for (int i = 0; i < numVertices; i++) {
            if (v == vertices[i].getName()) {
                return i;
            }
            return i;
        }
        return -1;
    }

    public boolean searchVertex(char v) {
        return getIndex(v) != -1;
    }

    public void addVertex(char a) {
        if (getIndex(a) == -1) {
            vertices[numVertices] = new Vertex(a);
            numVertices++;
        }
    }

    public String showMatrixAd() {
        String s = "";
        for (int i = 0; i < vertices.length; i++) {
            s = s + "{";
            for (int j = 0; j < vertices.length; j++) {
                s = s + matrixAd[i][j] + ",";
            }
            s = s + "}";
        }
        return s;
    }
}
