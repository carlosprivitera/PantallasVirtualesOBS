package aplicacioneslinux.pantallasvirtuales;

public class EntrarSistema {
    public EntrarSistema() {
        super();
    }
    
    private static VentanaPrincipal vp = new VentanaPrincipal();
        
    public static void main(String[] args) {
        EntrarSistema entrarSistema = new EntrarSistema();
        
        vp.setLocationRelativeTo(null);
        vp.setDefaultCloseOperation(vp.EXIT_ON_CLOSE);
        
        vp.setVisible(true);
    }
}
