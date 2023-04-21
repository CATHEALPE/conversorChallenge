import javax.swing.JOptionPane;

public class MenuMonedas {

	public static void main(String[] args) {
		
	}
	
	public static void ValidarContinuidad(int respuesta) {
		
	}

	public static void opcionesMonedas() {

		boolean continuidad = true;
		
		
		
		while (continuidad) {
			
			try {

				String opcionesDeA[] = { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
						"De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos",
						"De Yen a Pesos", "De Won Coreano a Pesos" };

				String conversionMonedaElegida = (JOptionPane.showInputDialog(null,
						"Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcionesDeA,
						opcionesDeA[0])).toString();

				FuncionConversorMonedas monedas = new FuncionConversorMonedas();

				String cantidadIngresada = JOptionPane.showInputDialog("Ingrese la cantidad de dinero a convertir ");

				if (monedas.validarNumero(cantidadIngresada)) {
					double cantidad = Double.parseDouble(cantidadIngresada);
					
					switch (conversionMonedaElegida) {
					case "De Pesos a Dólar":
						if(JOptionPane.OK_OPTION != monedas.ConvertirPesosColADolares(cantidad)) {
							continuidad = false;
							JOptionPane.showMessageDialog(null,"Programa Terminado");
						}
						break;

					case "De Pesos a Euro":
						if(JOptionPane.OK_OPTION != monedas.ConvertirPesosColAEuros(cantidad)) {
							continuidad = false;
							JOptionPane.showMessageDialog(null,"Programa Terminado");
						}
						break;

					case "De Pesos a Libras":
						if(JOptionPane.OK_OPTION != monedas.ConvertirPesosColALibras(cantidad)) {
							continuidad = false;
							JOptionPane.showMessageDialog(null,"Programa Terminado");
						}
						break;

					case "De Pesos a Yen":
						if(JOptionPane.OK_OPTION != monedas.ConvertirPesosColAYen(cantidad)) {
							continuidad = false;
							JOptionPane.showMessageDialog(null,"Programa Terminado");
						}
						break;

					case "De Pesos a Won Coreano":
						if(JOptionPane.OK_OPTION != monedas.ConvertirPesosColAWonCoreano(cantidad)) {
							continuidad = false;
							JOptionPane.showMessageDialog(null,"Programa Terminado");
						}
						break;

					case "De Dólar a Pesos":
						if(JOptionPane.OK_OPTION != monedas.ConvertirDolarAPesos(cantidad)) {
							continuidad = false;
							JOptionPane.showMessageDialog(null,"Programa Terminado");
						}
						break;

					case "De Euro a Pesos":
						if(JOptionPane.OK_OPTION != monedas.ConvertirEuroAPesos(cantidad)) {
							continuidad = false;
							JOptionPane.showMessageDialog(null,"Programa Terminado");
						}
						break;

					case "De Libras a Pesos":
						if(JOptionPane.OK_OPTION != monedas.ConvertirLibrasAPesos(cantidad)) {
							continuidad = false;
							JOptionPane.showMessageDialog(null,"Programa Terminado");
						}
						break;

					case "De Yen a Pesos":
						if(JOptionPane.OK_OPTION != monedas.ConvertirYenesAPesos(cantidad)) {
							continuidad = false;
							JOptionPane.showMessageDialog(null,"Programa Terminado");
						}
						break;

					case "De Won Coreano a Pesos":
						if(JOptionPane.OK_OPTION != monedas.ConvertirWonesCoreanosAPesos(cantidad)) {
							continuidad = false;
							JOptionPane.showMessageDialog(null,"Programa Terminado");
						}
						break;
					}
					

				} else {
					continuidad = false;
					JOptionPane.showMessageDialog(null, "Por favor ingresar un valor válido, Programa terminado");
				}
				
			} catch (NullPointerException e) {
				continuidad = false;
				JOptionPane.showMessageDialog(null, "Programa Terminado");
			}
		}

	}
}
