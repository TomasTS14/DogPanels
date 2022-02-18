import javax.swing.*;
import java.awt.*;

public class PanelDatos extends JPanel {
    GridLayout layout;
    GridLayout layoutPanel1;

    JPanel panelSelecciones;
    PanelColor radioPanel;
    JPanel panelPerroGif;

    JTextField nombrAmo;
    JTextField nombrPerro;
    JTextField edadPerro;
    JLabel labelAmo;
    JLabel labelPerro;
    JLabel labelEdad;


    public PanelDatos(){
        layout = new GridLayout(1,2);
        layout.setHgap(222);
        setLayout(layout);

        layoutPanel1 = new GridLayout(5,1);
        layoutPanel1.setVgap(22);


        panelSelecciones= new JPanel();
        panelPerroGif = new JPanel();
        radioPanel = new PanelColor();
        panelSelecciones.setLayout(layoutPanel1);

        nombrAmo = new JTextField(2);
        nombrPerro = new JTextField(2);
        edadPerro = new JTextField(2);

        labelAmo = new JLabel("Nombre amo: ");
        labelPerro = new JLabel("Nombre perro: ");
        labelEdad = new JLabel("Edad perro: ");

        add(panelSelecciones);
        add(panelPerroGif);

        panelSelecciones.add(labelAmo);
        panelSelecciones.add(nombrAmo);

        panelSelecciones.add(labelPerro);
        panelSelecciones.add(nombrPerro);

        panelSelecciones.add(labelEdad);
        panelSelecciones.add(edadPerro);

        panelSelecciones.add(radioPanel);


    }

    public String getDatos(){
        String datos= nombrAmo.getText()+" "+nombrPerro.getText()+" "+edadPerro.getText();
        return  datos;
    }


    }

