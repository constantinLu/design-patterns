package _08Facade.hometheatre;

import _08Facade.hometheatre.facade.HomeTheatreFacadeImpl;
import _08Facade.hometheatre.subsystems.*;

public class HomeTheatreSimulator {

    public static void main(String[] args) {


        Amplifier  amp = new Amplifier();

        DvdPlayer dvd = new DvdPlayer();

        Lights lights = new Lights();

        PopcornPopper popcornPopper = new PopcornPopper();

        Projector projector = new Projector();

        Screen screen = new Screen();

        Tuner tuner = new Tuner();

        CdPlayer cd = new CdPlayer();


        HomeTheatreFacadeImpl homeTheatre = new HomeTheatreFacadeImpl(amp, tuner, dvd, cd, projector, screen, lights, popcornPopper);

        homeTheatre.watchMovie("Raider of the Lost Ark");
        homeTheatre.endMovie();
    }
}
