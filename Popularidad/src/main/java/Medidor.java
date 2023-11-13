public class Medidor {
    public static void main(String[] args) {
        Cancion theScientist = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);

        System.out.println("Caso de prueba 1:");
        theScientist.reproducir(900);
        theScientist.darDislike(0);
        theScientist.darLike(0);
        System.out.println(theScientist.mostrarDetalle());


    }
}