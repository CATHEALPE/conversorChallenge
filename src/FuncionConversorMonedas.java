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
	
	public void ConvertirPesosColADolares(double valor) {
		double moneda = valor / 4512.32;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Pesos Colombianos equivalen a " + moneda + " Dolares");
	}
	
	public void ConvertirPesosColAEuros(double valor) {
		double moneda = valor / 4929.55;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Pesos Colombianos equivalen a " + moneda + " Euros");
	}
	
	public void ConvertirPesosColALibras(double valor) {
		double moneda = valor / 5610.19;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Pesos Colombianos equivalen a " + moneda + " Libras Esterlinas");
	}
	
	public void ConvertirPesosColAYen(double valor) {
		double moneda = valor / 33.76;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Pesos Colombianos equivalen a " + moneda + " Yenes");
	}
	
	public void ConvertirPesosColAWonCoreano(double valor) {
		double moneda = valor / 3.41;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Pesos Colombianos equivalen a " + moneda + " Wones Coreanos");
	}
	
	public void ConvertirDolarAPesos(double valor) {
		double moneda = valor * 4512.32;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Dolares equivalen a " + moneda + " Pesos Colombianos");
	}
	
	public void ConvertirEuroAPesos(double valor) {
		double moneda = valor * 5610.19;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Euros equivalen a " + moneda + " Pesos Colombianos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double moneda = valor * 5610.19;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Libras Esterlinas equivalen a " + moneda + " Pesos Colombianos");
	}
	
	public void ConvertirYenesAPesos(double valor) {
		double moneda = valor * 33.76;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Yenes equivalen a " + moneda + " Pesos Colombianos");
	}
	
	public void ConvertirWonesCoreanosAPesos(double valor) {
		double moneda = valor * 3.41;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, valor +" Wones Coreanos equivalen a " + moneda + " Pesos Colombianos");
	}
}
