import javax.swing.*;
import java.awt.*;

public class PanelColor extends JPanel {

    GridLayout layout;

    private ButtonGroup grupo;
    private JRadioButton marronBox;
    private JRadioButton negroBox;
    private JRadioButton dalmataBox;
    private JRadioButton azulBox;

    private JLabel labelMarron;
    private JLabel labelNegro;
    private JLabel labelDalmata;
    private JLabel labelAzul;

    public PanelColor() {

        layout = new GridLayout(4, 1);
        layout.setHgap(1);
        setLayout(layout);

        grupo = new ButtonGroup();
        marronBox = new JRadioButton("marron");
        negroBox = new JRadioButton("negro");
        dalmataBox = new JRadioButton("dalmata");
        azulBox = new JRadioButton("azul");

        grupo.add(marronBox);
        grupo.add(negroBox);
        grupo.add(dalmataBox);
        grupo.add(azulBox);

        add(marronBox);
        add(negroBox);
        add(dalmataBox);
        add(azulBox);

    }


}
