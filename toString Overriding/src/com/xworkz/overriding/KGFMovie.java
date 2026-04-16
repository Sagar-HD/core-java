package com.xworkz.overriding;

public class KGFMovie extends Movie{
    int sequleNumber;
    String language;
    public KGFMovie(Actor[] actors, String name, int sequleNumber, String language) {
        super(actors,name);
        this.sequleNumber = sequleNumber;
        this.language = language;

    }

    @Override
    public void play() {
        System.out.println("Movie is playing in kgfmovue class");
    }

    @Override
    public void stop() {
   System.out.println("Movie is stoping in kgfmovue class");
    }

    @Override
    public String toString() {
        return super.toString() + ": " + this.sequleNumber + ": " + this.language;
    }

    public static void main(String[] args) {
 Movie movie=new Movie(null,"kgf");
 KGFMovie kgfMovie=new KGFMovie(null,"kgf",6,"kannada");
        System.out.println(movie);
        System.out.println(kgfMovie);
        movie.play();
        kgfMovie.play();
        kgfMovie.stop();
        movie.stop();
    }
}
