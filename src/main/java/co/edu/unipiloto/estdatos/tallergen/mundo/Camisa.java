package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Camisa extends Vestuario{
		
	public enum Etiqueta
	{
		GEFT, NAUTICA, POLO, NINGUNO
	}
	
	private Etiqueta etiqueta;
	
	public Camisa(Talla pTalla, double pPrecio, Etiqueta petiqueta)
	{
		super(pTalla, pPrecio);
		etiqueta = petiqueta;
	}
	
        @Override
	public String toString()
	{
		return "Camisa "+ etiqueta + " Talla "+talla + "($ "+precio + ")";
	}

}
