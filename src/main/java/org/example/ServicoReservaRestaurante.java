package org.example;

public class ServicoReservaRestaurante implements IServico {

    public String executar() {
        return "Reserva efetivada";
    }

    public String cancelar() {
        return "Reserva cancelada";
    }
}