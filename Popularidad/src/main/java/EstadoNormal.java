public class EstadoNormal implements EstadoPopularidad {
    @Override
    public String mostrarDetalle(Cancion cancion) {
        return Icono.MUSICAL_NOTE.texto() + " - " + cancion.getArtista() + " - " +
                cancion.getAlbum() + " - " + cancion.getNombre();
    }

    @Override
    public EstadoPopularidad actualizarEstado(Cancion cancion) {
        if (cancion.getReproducciones() > 1000) {
            return new EstadoEnAuge();
        }
        return this;
    }
}