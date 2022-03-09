package one.digitalinnovation.singletone;

public class Singletone {
    private static Singletone instacia;

    private Singletone() {
        super ();
    }

    public static Singletone getInstacia(){
        if (instacia == null){
            instacia = new Singletone();
        }
       return instacia;
    }

}
