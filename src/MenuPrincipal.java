import javax.swing.JOptionPane;

public class MenuPrincipal {
	
	
	public static void main(String[] args) {
		
		opcionesMenuPrincipal();
		
	}	
	
	public static void opcionesMenuPrincipal() {
		
		String opciones[] = {"Conversor de Moneda", "Conversor de Temperatura"};
		
		String opcionElegida = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		JOptionPane.showMessageDialog(null,"Usted selecciono " + opcionElegida );
		
		if (opcionElegida == "Conversor de Moneda") {

			MenuMonedas nuevaConversionMoneda = new MenuMonedas();
			nuevaConversionMoneda.opcionesMonedas();
		}
	}
	
}

//como esta funciona el codigo, falta hacer bien los calculos 
//falta organizar para que se salga del programa 
//verificacion de cantidad ingresada valida
//intentar consumir una api para la tasa
