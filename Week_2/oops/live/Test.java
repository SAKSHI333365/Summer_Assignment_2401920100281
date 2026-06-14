package oops.live;

import oops.music.Playable;
import oops.music.string.Veena;
import oops.music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {
        Veena veena = new Veena();
        veena.play();

        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playable p1 = new Veena();
        p1.play();

        Playable p2 = new Saxophone();
        p2.play();
    }
}
