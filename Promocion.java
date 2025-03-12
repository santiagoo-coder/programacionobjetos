public class Promocion {
    private String idPromocion;
    private String descripcion;
    private double descuento; // Porcentaje de descuento (ejemplo: 0.5 para 50%)

    public Promocion(String idPromocion, String descripcion, double descuento) {
        this.idPromocion = idPromocion;
        this.descripcion = descripcion;
        this.descuento = descuento;
    }

    // Getters
    public String getIdPromocion() {
        return idPromocion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getDescuento() {
        return descuento;
    }

    // Método para mostrar detalles de la promoción
    public void mostrarDetalles() {
        System.out.println("Promoción: " + descripcion);
        System.out.println("Descuento: " + (descuento * 100) + "%");
    }
}