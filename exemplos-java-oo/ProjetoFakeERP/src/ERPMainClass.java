
public class ERPMainClass {
	public static void main(String[] args) {
		
		// simulando a chamada da Oracle
		InterfaceOracleERP ioerp = new CalculadorDeImpostos();
		ioerp.calculateTaxes("nf.xml");
		
		// simular uma chamada da Microsoft
		MSInterface msi = new CalculadorDeImpostos();
		msi.summarizeBill("bill.xml");
		
		// simular uma chamada da SAP
		InterfaceSAP isap = new CalculadorDeImpostos();
		isap.calculanteTaxesAndSumarizeBill("nf011912.xml");
	
		
	
	}

}
