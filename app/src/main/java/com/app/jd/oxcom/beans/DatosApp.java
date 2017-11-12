package main.java.com.app.jd.oxcom.beans;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Javier on 12/11/2017.
 */
public class DatosApp implements Serializable {
    ArrayList<LineaTerapeutica> lineaTerapeutica;

    public DatosApp() {
    }

    public ArrayList<LineaTerapeutica> getLineaTerapeutica() {
        return lineaTerapeutica;
    }

    public void setLineaTerapeutica(ArrayList<LineaTerapeutica> lineaTerapeutica) {
        this.lineaTerapeutica = lineaTerapeutica;
    }
}
