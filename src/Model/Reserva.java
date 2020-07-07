package Model;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private List<String> dias = new ArrayList<>();
    private Cliente cliente;

    public Reserva(List<String> dias, Cliente cliente){
        this.dias = dias;
        this.cliente = cliente;
    }

    public List<String> getDias() {
        return dias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setDias(List<String> dias) {
        this.dias = dias;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

//Trabalhar no input
//Scanner, a partir da string criar uma reserva