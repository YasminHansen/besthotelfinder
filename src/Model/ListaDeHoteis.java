package Model;

import java.util.ArrayList;
import java.util.List;

public class ListaDeHoteis {
    public static List<Hotel> CriarHoteis(){
        List<Hotel> hoteis = new ArrayList<>();

        Hotel hotelPlaza = new Hotel("Hotel Plaza", 3, 110, 90, 80, 80);
        Hotel hotelHilton = new Hotel("Hotel Hilton", 4, 160,60, 110, 50);
        Hotel hotelContinental = new Hotel("Hotel Continental", 5, 200, 150 ,100, 40);

        hoteis.add(hotelPlaza);
        hoteis.add(hotelHilton);
        hoteis.add(hotelContinental);

        return hoteis;
    }
}
