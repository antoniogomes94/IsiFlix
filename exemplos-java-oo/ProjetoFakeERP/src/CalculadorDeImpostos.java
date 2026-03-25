
public class CalculadorDeImpostos implements InterfaceOracleERP, InterfaceSAP, MSInterface{

	
	
	// aqui temos efetivamente as regras do "segredo do negocio"
	public void calcularImposto(String documentoFiscal) {
		System.out.println("Processando arquivo...");
		System.out.println("calculando imposto do documento "+documentoFiscal);
		System.out.println("Gravando em BD");
		System.out.println("Emitindo guias");
		System.out.println("----> FIM");
	}

	@Override
	public void summarizeBill(String doc) {
		// chamar o meu método de negócio
		this.calcularImposto(doc);
		
	}

	@Override
	public void calculanteTaxesAndSumarizeBill(String doc) {
		// chamar meu metodo de negocio
		this.calcularImposto(doc);
		
	}

	@Override
	public void calculateTaxes(String doc) {
		// chamar meu metodo de negocio
		this.calcularImposto(doc);
		
	}
}
