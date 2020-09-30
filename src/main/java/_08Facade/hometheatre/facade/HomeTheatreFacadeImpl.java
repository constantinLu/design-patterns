package _08Facade.hometheatre.facade;

import _08Facade.hometheatre.subsystems.*;

public class HomeTheatreFacadeImpl implements HomeTheatreFacade {


    Amplifier amp;

    Tuner tuner;

    DvdPlayer dvd;

    CdPlayer cd;

    Projector projector;

    Lights lights;

    PopcornPopper popcorn;

    Screen screen;

    public HomeTheatreFacadeImpl(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, Screen screen, Lights lights, PopcornPopper popcorn) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.popcorn = popcorn;
        this.screen = screen;
    }


    @Override
    public void watchMovie(String movie) {
        popcorn.on();
        popcorn.pop();

        lights.dim(2);

        screen.screenDown();

        projector.on();
        projector.wideScreenMode();

        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(12);
        dvd.on();
        dvd.play(movie);
    }

    @Override
    public void endMovie() {
        popcorn.off();
        lights.on();
        screen.screenUp();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();

    }

    @Override
    public void listenToCd() {

    }

    @Override
    public void endCd() {

    }

    @Override
    public void listenToRadio() {

    }

    @Override
    public void endRadio() {

    }
}
