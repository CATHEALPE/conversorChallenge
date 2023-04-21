import javax.swing.JOptionPane;

public class FuncionConversorMonedas {
	
	public static void main(String[] args) {

	}
	
	public static boolean validarNumero(String cantidadIngresada) {
		try {
			double x = Double.parseDouble(cantidadIngresada);
				if(x >= 0 || x < 0);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
	}
	
	public static int salirDelPrograma() {
		int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar en el progama?");
		return respuesta;
	}
	
	public int ConvertirPesosColADolares(double valor) {
		double moneda = valor / 4512.32;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Pesos Colombianos equivalen a " + moneda + " Dolares");
		return salirDelPrograma();
	}
	
	public int ConvertirPesosColAEuros(double valor) {
		double moneda = valor / 4929.55;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Pesos Colombianos equivalen a " + moneda + " Euros");
		return salirDelPrograma();
	}
	
	public int ConvertirPesosColALibras(double valor) {
		double moneda = valor / 5610.19;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Pesos Colombianos equivalen a " + moneda + " Libras Esterlinas");
		return salirDelPrograma();
	}
	
	public int ConvertirPesosColAYen(double valor) {
		double moneda = valor / 33.76;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Pesos Colombianos equivalen a " + moneda + " Yenes");
		return salirDelPrograma();
	}
	
	public int ConvertirPesosColAWonCoreano(double valor) {
		double moneda = valor / 3.41;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Pesos Colombianos equivalen a " + moneda + " Wones Coreanos");
		return salirDelPrograma();
	}
	
	public int ConvertirDolarAPesos(double valor) {
		double moneda = valor * 4512.32;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Dolares equivalen a " + moneda + " Pesos Colombianos");
		return salirDelPrograma();
	}
	
	public int ConvertirEuroAPesos(double valor) {
		double moneda = valor * 5610.19;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Euros equivalen a " + moneda + " Pesos Colombianos");
		return salirDelPrograma();
	}
	
	public int ConvertirLibrasAPesos(double valor) {
		double moneda = valor * 5610.19;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Libras Esterlinas equivalen a " + moneda + " Pesos Colombianos");
		return salirDelPrograma();
	}
	
	public int ConvertirYenesAPesos(double valor) {
		double moneda = valor * 33.76;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Yenes equivalen a " + moneda + " Pesos Colombianos");
		return salirDelPrograma();
	}
	
	public int ConvertirWonesCoreanosAPesos(double valor) {
		double moneda = valor * 3.41;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Wones coreanos a " + moneda + " Pesos Colombianos");
		return salirDelPrograma();
	}
}
