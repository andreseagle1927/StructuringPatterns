package dev.andresabadia.iretator;

public abstract class Elemento
{
    protected String descripcion;


    public Elemento(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public boolean palabraClaveValida(String palabraClave)
    {
        return descripcion.contains(palabraClave);
    }
}