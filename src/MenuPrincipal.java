import javax.swing.JOptionPane;

public class MenuPrincipal {
	
	
	public static void main(String[] args) {
		
		opcionesMenuPrincipal();
		
	}	
	
	public static void opcionesMenuPrincipal() {
		
		String opciones[] = {"Conversor de Moneda", "Conversor de Temperatura"};
		
		String op = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
		
		JOptionPane.showMessageDialog(null,"Usted selecciono " + op );
		
		if (op == "Conversor de Moneda") {
			JOptionPane.showMessageDialog(null, "prueba ok");
		}
	}
	
}
