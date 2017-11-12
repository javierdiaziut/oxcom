package main.java.com.app.jd.oxcom.beans;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Javier on 12/11/2017.
 */
public class LineaTerapeutica implements Serializable {

    String nombreLinea;
    ArrayList<Productos> productos;

    public LineaTerapeutica() {
    }

    public String getNombreLinea() {
        return nombreLinea;
    }

    public void setNombreLinea(String nombreLinea) {
        this.nombreLinea = nombreLinea;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }
}
