import javax.swing.JOptionPane;

public class MenuMonedas {
	
public static void main(String[] args) {
		
		opcionesMonedas();
		
	}	
	
	public static void opcionesMonedas() {
		
		String opcionesDeA[] = {"De Pesos a Dólar", 
								"De Pesos a Euro",
								"De Pesos a Libras",
								"De Pesos a Yen",
								"De Pesos a Won Coreano",
								"De Dólar a Pesos",
								"De Euro a Pesos",
								"De Libras a Pesos",
								"De Yen a Pesos",
								"De Won Coreano a Pesos"};
		
		String op = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.DEFAULT_OPTION, null, opcionesDeA, opcionesDeA[0]);
		
		JOptionPane.showMessageDialog(null,"Usted selecciono " + op );
	}

}
