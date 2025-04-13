package views;

import data.Persistencia;
import domain.TipoAlimentacion;

import javax.swing.*;
import java.util.InvalidPropertiesFormatException;

public class Program {

    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        ListarAnimalesView view = new ListarAnimalesView();
        AgregarAnimalesView view1 = new AgregarAnimalesView();
        view.setVisible(true);
        view1.setVisible(true);
    }
}
