package bilbioteca2.datos;

public class Prestamos {
    private int codPrestamo;
    private int codUsuario;
    private String libro;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private int aumento;
    private boolean devuelto;

    public Prestamos() {
    }

    public Prestamos(int codPrestamo,int codUsuario, String libro, String fechaPrestamo, String fechaDevolucion, int aumento, boolean devuelto) {
        this.codPrestamo =  codPrestamo;
        this.codUsuario =  codUsuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.aumento = aumento;
        this.devuelto=devuelto;
    }

    public int getCodPrestamo() {
        return codPrestamo;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public String getLibro() {
        return libro;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public int getAumento() {
        return aumento;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setCodPrestamo(int codPrestamo) {
        this.codPrestamo = codPrestamo;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setAumento(int aumento) {
        this.aumento = aumento;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }
}
