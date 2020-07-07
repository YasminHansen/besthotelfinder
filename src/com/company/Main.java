package com.company;

import Model.Hotel;
import Model.ListaDeHoteis;
import Model.ProcessadorDeInput;
import Model.Reserva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Reserva reserva = new Reserva(ProcessadorDeInput.inputDiasReserva(), ProcessadorDeInput.inputCliente());

        List<Hotel> listaDeHoteis = ListaDeHoteis.CriarHoteis();

        System.out.println(reserva.getCliente().getTipo() + "\n" + reserva.getDias());
    }
}
