package e1_santiagog_joaquing_manuelg_s3;
public class cuentaSocio {
    //Atributos de la clase cuentaSocio
    private int nroSocio;
    private int valorCuota;
    private int cantidadAportada;
    private int ultimopago;

    //Constructor vacio
    public cuentaSocio() {
    }

    //Constructor de la clase cuentaSocio
    public cuentaSocio(int nroSocio, int valorCuota, int cantidadAportada) {
        this.nroSocio = nroSocio;
        this.valorCuota = valorCuota;
        this.cantidadAportada = cantidadAportada;
        this.ultimopago = 0;
    }

    //Metodos get de la clase cuentaSocio
    public int getNroSocio() {
        return nroSocio;
    }

    public int getValorCuota() {
        return valorCuota;
    }

    public int getCantidadAportada() {
        return cantidadAportada;
    }
    public int getUltimopago() {
        return ultimopago;
    }

    //Metodos set de la clase cuentaSocio
    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }

    public void setCantidadAportada(int cantidadAportada) {
        this.cantidadAportada = cantidadAportada;
    }
    public void setUltimopago(int ultimopago) {
        this.ultimopago = ultimopago;
    }
}