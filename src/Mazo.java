import Palos.palo;

import java.util.List;




public class Mazo {
    private List<Carta> cartas;

    public Mazo(){
        llenarMazo();
    }
    public void llenarMazo() {
        cartas.add(new Carta(palo.Palos.Espada, 1));
        cartas.add(new Carta(palo.Palos.Basto, 1));
        cartas.add(new Carta(palo.Palos.Espada, 7));
        cartas.add(new Carta(palo.Palos.Oro, 7));
        cartas.add(new Carta(palo.Palos.Copa, 3));
        cartas.add(new Carta(palo.Palos.Basto, 3));
        cartas.add(new Carta(palo.Palos.Oro, 3));
        cartas.add(new Carta(palo.Palos.Espada, 3));
        cartas.add(new Carta(palo.Palos.Espada, 2));
        cartas.add(new Carta(palo.Palos.Copa, 2));
        cartas.add(new Carta(palo.Palos.Oro, 2));
        cartas.add(new Carta(palo.Palos.Basto, 2));
        cartas.add(new Carta(palo.Palos.Copa, 1));
        cartas.add(new Carta(palo.Palos.Oro, 1));
        cartas.add(new Carta(palo.Palos.Copa, 12));
        cartas.add(new Carta(palo.Palos.Basto, 12));
        cartas.add(new Carta(palo.Palos.Oro, 12));
        cartas.add(new Carta(palo.Palos.Espada, 12));
        cartas.add(new Carta(palo.Palos.Basto, 11));
        cartas.add(new Carta(palo.Palos.Copa, 11));
        cartas.add(new Carta(palo.Palos.Oro, 11));
        cartas.add(new Carta(palo.Palos.Oro, 11));
        cartas.add(new Carta(palo.Palos.Basto, 10));
        cartas.add(new Carta(palo.Palos.Copa, 10));
        cartas.add(new Carta(palo.Palos.Espada, 10));
        cartas.add(new Carta(palo.Palos.Oro, 10));
        cartas.add(new Carta(palo.Palos.Basto, 7));
        cartas.add(new Carta(palo.Palos.Copa, 7));
        cartas.add(new Carta(palo.Palos.Basto, 6));
        cartas.add(new Carta(palo.Palos.Copa, 6));
        cartas.add(new Carta(palo.Palos.Oro, 6));
        cartas.add(new Carta(palo.Palos.Oro, 6));
        cartas.add(new Carta(palo.Palos.Basto, 5));
        cartas.add(new Carta(palo.Palos.Copa, 5));
        cartas.add(new Carta(palo.Palos.Oro, 5));
        cartas.add(new Carta(palo.Palos.Oro, 5));
        cartas.add(new Carta(palo.Palos.Basto, 4));
        cartas.add(new Carta(palo.Palos.Copa, 4));
        cartas.add(new Carta(palo.Palos.Oro, 4));
        cartas.add(new Carta(palo.Palos.Oro, 4));

    }
}
