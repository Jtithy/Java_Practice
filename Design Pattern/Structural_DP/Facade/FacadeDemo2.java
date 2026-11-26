//Facade Interface

interface HomeTheaterFacadeInterface {

    void watchMovie(String movie);

    void endMovie();
}

//DVD Player Subclass
class DVDPlayer {

    public void in() {
        System.out.println("DVD Player is pushed.");
    }

    public void out() {
        System.out.println("DVD Player is pulled out.");
    }
}
//SoundSystem Subclass

class SoundSystem {

    public void on() {
        System.out.println("Sound System is turned on.");
    }

    public void highVolume() {
        System.out.println("Sound System is set to high volume.");
    }

    public void lowVolume() {
        System.out.println("Sound System is set to low volume.");
    }

    public void off() {
        System.out.println("Sound System is turned off.");
    }
}
//Projector Subclass

class Projector {

    public void on() {
        System.out.println("Projector is turned on.");
    }

    public void off() {
        System.out.println("Projector is turned off.");
    }
}

//Facade Class
class HomeTheaterFacade implements HomeTheaterFacadeInterface {

    private DVDPlayer dvd = new DVDPlayer();
    private SoundSystem sound = new SoundSystem();
    private Projector project = new Projector();

    public HomeTheaterFacade(DVDPlayer dvd, SoundSystem sound, Projector project) {
        this.dvd = dvd;
        this.sound = sound;
        this.project = project;
    }

    @Override
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        dvd.in();
        sound.on();
        sound.highVolume();
        project.on();
        System.out.println("Movie is playing: " + movie);
    }

    @Override
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        System.out.println("Movie is stopped.");
        dvd.out();
        sound.lowVolume();
        sound.off();
        project.off();
    }
}

public class FacadeDemo2 {

    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        SoundSystem sound = new SoundSystem();
        Projector project = new Projector();
        HomeTheaterFacadeInterface homeTheater = new HomeTheaterFacade(dvd, sound, project);

        homeTheater.watchMovie("Inception");
        System.out.println();
        homeTheater.endMovie();
    }
}
