package parcial2;

import vistas.VentanaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiantes
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexionBD c = new ConexionBD();
        c.Conectar();
        JOptionPane.showMessageDialog(null,"Conectado a la BD");
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.ejecutar();
    }
    
}
