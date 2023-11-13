public class EstadoEnAuge implements EstadoPopularidad {
    @Override
    public String mostrarDetalle(Cancion cancion) {
        String detalle = Icono.ROCKET.texto() + " - " + cancion.getArtista() + " - " +
                cancion.getNombre() + " (" + cancion.getAlbum() + " - " +
                cancion.getAno() + ")";
        return detalle;
    }

    @Override
    public EstadoPopularidad actualizarEstado(Cancion cancion) {
        if (cancion.getReproducciones() >= 50000 || cancion.getLikes() >= 20000) {
            return new EstadoEnTendencia();
        }
        if (cancion.getDislikes() >= 5000) {
            return new EstadoNormal();
        }
        return this;
    }
}