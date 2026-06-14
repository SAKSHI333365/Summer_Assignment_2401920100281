package oops.music.string;

import oops.music.Playable;

public class Veena implements Playable {

    @Override
    public void play() {
        System.out.println("Veena is playing");
    }
}
