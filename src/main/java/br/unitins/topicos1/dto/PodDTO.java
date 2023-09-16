package br.unitins.topicos1.dto;

public class PodDTO 
{
    private final String marca;
    private final  String puffs;
    private final String valor;
    private final String sabor;

    public PodDTO(String marca, String puffs, String valor, String sabor) 
    {
        this.marca = marca;
        this.puffs = puffs;
        this.valor = valor;
        this.sabor = sabor;
    }

    public String getMarca() 
    {
        return marca;
    }
    public String getPuffs() 
    {
        return puffs;
    }
    public String getValor() 
    {
        return valor;
    }
    public String getSabor() 
    {
        return sabor;
    }    
}
