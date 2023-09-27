package dev.andresabadia.templatemethod;

public abstract class Pedido
{
    protected double importeSinIVA;
    protected double importeIVA;
    protected double importeConIVA;
    protected abstract void calculaIVA();
    public void calculaPrecioConIVA()
    {
        this.calculaIVA();
        importeConIVA = importeSinIVA + importeIVA;
    }
    public void setImporteSinIVA(double importeSinIVA)
    {
        this.importeSinIVA = importeSinIVA;
    }