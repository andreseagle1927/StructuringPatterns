package dev.andresabadia.iretator;

public class CatalogoVehiculo extends
        Catalogo<Vehiculo, IteradorVehiculo>
{
    public CatalogoVehiculo()
    {
        contenido.add(new Vehiculo("vehiculo economico"));
        contenido.add(new Vehiculo("pequeño vehiculo economico"));
        contenido.add(new Vehiculo("vehiculo de gran calidad"));
    }
    protected IteradorVehiculo creaIterador()
    {
        return new IteradorVehiculo();
    }
}