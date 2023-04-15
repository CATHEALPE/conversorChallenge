import javax.swing.JOptionPane;

public class MenuMonedas {

	public static void main(String[] args) {
	}
	
	public static void opcionesMonedas() {

		String opcionesDeA[] = { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
				"De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
				"De Won Coreano a Pesos" };

		String conversionMonedaElegida = (JOptionPane.showInputDialog(null,
				"Seleccione una opción de conversión", "Menu", JOptionPane.DEFAULT_OPTION, null, opcionesDeA,
				opcionesDeA[0])).toString();

		

		String cantidadIngresada;
		Double cantidad = Double.parseDouble(cantidadIngresada = JOptionPane.showInputDialog(null, "Ingrese la cantidad: "));

		FuncionConversorMonedas monedas = new FuncionConversorMonedas();
		
		switch(conversionMonedaElegida) {
		case "De Pesos a Dólar":
			monedas.ConvertirPesosColADolares(cantidad);
			break;
		
		case "De Pesos a Euro":
			monedas.ConvertirPesosColAEuros(cantidad);
			break;
			
		case "De Pesos a Libras":
			monedas.ConvertirPesosColALibras(cantidad);
			break;
			
		case "De Pesos a Yen":
			monedas.ConvertirPesosColAYen(cantidad);
			break;
			
		case "De Pesos a Won Coreano":
			monedas.ConvertirPesosColAWonCoreano(cantidad);
			break;
			
		case "De Dólar a Pesos":
			monedas.ConvertirDolarAPesos(cantidad);
			break;
			
		case "De Euro a Pesos":
			monedas.ConvertirEuroAPesos(cantidad);
			break;
			
		case "De Libras a Pesos":
			monedas.ConvertirLibrasAPesos(cantidad);
			break;
		
		case "De Yenes a Pesos":
			monedas.ConvertirYenesAPesos(cantidad);
			break;
		
		case "De Wones Coreados a Pesos":
			monedas.ConvertirWonesCoreanosAPesos(cantidad);
			break;
		}
		
	}
}
