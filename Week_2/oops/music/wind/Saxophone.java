package oops.music.wind;

import oops.music.Playable;

public class Saxophone implements Playable {

    @Override
    public void play() {
        System.out.println("Saxophone is playing");
    }
}
