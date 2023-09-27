package dev.andresabadia.templatemethod;

public class PedidoEspaña extends Pedido
{
    protected void calculaIVA()
    {
        importeIVA = importeSinIVA * 0.21;
    }
}