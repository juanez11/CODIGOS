/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.tallergen.mundo;

/**
 *
 * @author juane
 */
public class Computador extends Electronico{
    
    public enum Marca
    {
        ASUS, HUAWEI, MAC, ACER, HP, DIFERENTE
    }
    private Marca marca;
    
    public Computador(Gama pGama, double pPrecio, Marca pMarca)
	{
		super(pGama, pPrecio);
		marca = pMarca;
	}
    @Override
	public String  toString()
        {
            return "Computador "+marca.name()+" - "+"Gama "+gama;
        }
             
}
