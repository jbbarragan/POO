import java.awt.*;
import javax.swing.*;

public class InterfazGrafica {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear la ventana
            JFrame frame = new JFrame("P11 POO");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 600);
            frame.setLayout(new GridLayout(2, 2));

            // Panel 1 - Amarillo con un entry y etiqueta
            JPanel panel1 = new JPanel(new GridBagLayout());
            panel1.setBackground(Color.YELLOW);
            agregarCampoTexto(panel1, "Insertar Texto");

            // Panel 2 - Imagen centrada
            JPanel panel2 = new JPanel(new GridBagLayout());
            panel2.setBackground(Color.LIGHT_GRAY);
            JLabel labelImagen1 = crearImagen("ibero.png", 200, 100);
            panel2.add(labelImagen1);

            // Panel 3 - Imagen centrada
            JPanel panel3 = new JPanel(new GridBagLayout());
            panel3.setBackground(Color.LIGHT_GRAY);
            JLabel labelImagen2 = crearImagen("ibero.png", 200, 100);
            panel3.add(labelImagen2);

            // Panel 4 - Dividido en 4 partes
            JPanel panel4 = new JPanel(new GridLayout(2, 2));
            JPanel subPanel1 = crearSubPanel(Color.YELLOW);
            JPanel subPanel2 = crearSubPanel(Color.GREEN);
            JPanel subPanel3 = crearSubPanel(Color.GREEN);
            JPanel subPanel4 = crearSubPanel(Color.YELLOW);
            panel4.add(subPanel1);
            panel4.add(subPanel2);
            panel4.add(subPanel3);
            panel4.add(subPanel4);

            // Agregar paneles a la ventana
            frame.add(panel1);
            frame.add(panel2);
            frame.add(panel3);
            frame.add(panel4);

            // Mostrar ventana
            frame.setVisible(true);
        });
    }

    // Método para agregar un campo de texto a un panel
    private static void agregarCampoTexto(JPanel panel, String texto) {
        JPanel container = new JPanel();
        container.setLayout(new BorderLayout());
        container.setOpaque(false);
        JLabel label = new JLabel(texto, SwingConstants.CENTER);
        JTextField textField = new JTextField(8);
        textField.setHorizontalAlignment(JTextField.CENTER);
        container.add(label, BorderLayout.NORTH);
        container.add(textField, BorderLayout.CENTER);
        panel.add(container);
    }

    // Método para agregar una imagen
    private static JLabel crearImagen(String ruta, int ancho, int alto) {
        ImageIcon icono = new ImageIcon(ruta);
        Image imagen = icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        return new JLabel(new ImageIcon(imagen));
    }

    // Método para crear subpaneles de colores con entry y etiqueta
    private static JPanel crearSubPanel(Color color) {
        JPanel subPanel = new JPanel(new GridBagLayout());
        subPanel.setBackground(color);
        agregarCampoTexto(subPanel, "Insertar Texto");
        return subPanel;
    }
}