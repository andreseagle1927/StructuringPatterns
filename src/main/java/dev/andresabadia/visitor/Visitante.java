package dev.andresabadia.visitor;

public interface Visitante
{
    void visita(EmpresaSinFilial empresa);
    void visita(EmpresaMadre empresa);
}