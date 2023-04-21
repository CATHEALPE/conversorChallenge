import javax.swing.JOptionPane;

public class MenuPrincipal {
	
	
	public static void main(String[] args) {
		
		opcionesMenuPrincipal();
		
	}	
	
	public static void opcionesMenuPrincipal() {
		
		String opciones[] = {"Conversor de Moneda", "Conversor de Temperatura"};
		
		String opcionElegida = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		if (opcionElegida == "Conversor de Moneda") {
			JOptionPane.showMessageDialog(null,"Usted selecciono " + opcionElegida );
			MenuMonedas nuevaConversionMoneda = new MenuMonedas();
			nuevaConversionMoneda.opcionesMonedas();
			
		} else if (opcionElegida == "Conversor de Temperatura") {
			JOptionPane.showMessageDialog(null,"Usted selecciono " + opcionElegida );
			//implemntación conversor tempteratura
			
		} else {
			JOptionPane.showMessageDialog(null,"Programa Terminado");
		}
	}
}

//como esta funciona el codigo
//intentar consumir una api para la tasa
//falta conversor temperatura
