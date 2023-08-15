package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Casillero {

	private Producto T;

	public Casillero ()
	{
                  T = null;
	}

	public boolean agregar(Producto pProducto)
	{
		if(T == null)
		{
			T = pProducto;
			return true;
		}
		return false;
	}

	public Producto darProducto()
	{
		return T;
	}

	public Producto despachar()
	{
		if(T==null)
		{
			return T;
		}
		
		Producto nObjeto = T;
		T = null;
		return nObjeto;
	}

	public boolean estaDesocupado() {
		
		if(T==null)
		{
			return true;
		}
		return false;
		
	}
}
