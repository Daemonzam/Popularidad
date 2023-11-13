public class EstadoEnTendencia implements EstadoPopularidad {
    @Override
    public String mostrarDetalle(Cancion cancion) {
        String detalle = Icono.FIRE.texto() + " - " + cancion.getNombre() + " - " +
                cancion.getArtista() + " (" + cancion.getAlbum() + " - " +
                cancion.getAno() + ")";
        if (cancion.getReproducciones() > 50000 && cancion.getLikes() > 20000) {
            detalle += " - Tendencia";
        }
        return detalle;
    }

    @Override
    public EstadoPopularidad actualizarEstado(Cancion cancion) {
        if (cancion.getReproducciones() == 0) {
            return new EstadoNormal();
        }
        return this;
    }
}