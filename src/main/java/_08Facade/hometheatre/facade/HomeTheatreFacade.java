package _08Facade.hometheatre.facade;

/**
 * The intent of the Facade Pattern is to provide a simplified interface to a subsystem.
 */
public interface HomeTheatreFacade {

    void watchMovie(String movie);

    void endMovie();

    void listenToCd();

    void endCd();

    void listenToRadio();

    void endRadio();

}
