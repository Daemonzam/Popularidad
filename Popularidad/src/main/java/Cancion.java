public class Cancion {
    private String nombre;
    private String artista;
    private String album;
    private int ano;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private EstadoPopularidad estado;

    public Cancion(String nombre, String artista, String album, int ano) {
        this.nombre = nombre;
        this.artista = artista;
        this.album = album;
        this.ano = ano;
        this.reproducciones = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.estado = new EstadoNormal();
    }

    public String getNombre() {
        return nombre;
    }
    public String getArtista() {
        return artista;
    }
    public String getAlbum() {
        return album;
    }
    public int getAno() {
        return ano;
    }
    public int getReproducciones() {
        return reproducciones;
    }
    public int getLikes() {
        return likes;
    }
    public int getDislikes() {
        return dislikes;
    }
    public String mostrarDetalle() {
        return estado.mostrarDetalle(this);
    }

    public void reproducir(int nr) {
        reproducciones += nr;
        estado = estado.actualizarEstado(this);
    }

    public void darLike(int nl) {
        likes += nl;
        estado = estado.actualizarEstado(this);
    }

    public void darDislike(int nd) {
        dislikes += nd;
        estado = estado.actualizarEstado(this);
    }
}