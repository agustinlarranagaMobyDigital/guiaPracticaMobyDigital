package Models;

public class Empresa extends Cliente{

    private int id_cliente;
    private String cuit;
    private String condicion_iva;
    private int descuento = 15;

    public Empresa( String cuit, String condicion_iva) {
        this.cuit = cuit;
        this.condicion_iva = condicion_iva;
    }

    public Empresa() {

    }
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getCondicion_iva() {
        return condicion_iva;
    }

    public void setCondicion_iva(String condicion_iva) {
        this.condicion_iva = condicion_iva;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}

