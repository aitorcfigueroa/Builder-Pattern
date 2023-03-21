public class Pizzas {
    private String masa = "Normal";
    private Boolean relleno = true;
    private Integer tipo = 2;
    private Boolean salsa = true;
    private String tipoSalsa = "tomate";
    private Boolean cebolla = false;
    private Boolean sinGluten = false;
    private Boolean extraQueso = false;
    private Boolean piña = false;
    private Boolean champiñones = false;
    private Boolean jamon = false;




    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public Boolean getRelleno() {
        return relleno;
    }

    public void setRelleno(Boolean relleno) {
        this.relleno = relleno;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Boolean getSalsa() {
        return salsa;
    }

    public void setSalsa(Boolean salsa) {
        this.salsa = salsa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public Boolean getCebolla() {
        return cebolla;
    }

    public void setCebolla(Boolean cebolla) {
        this.cebolla = cebolla;
    }

    public Boolean getSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(Boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public Boolean getExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(Boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public Boolean getPiña() {
        return piña;
    }

    public void setPiña(Boolean piña) {
        this.piña = piña;
    }

    public Boolean getChampiñones() {
        return champiñones;
    }

    public void setChampiñones(Boolean champiñones) {
        this.champiñones = champiñones;
    }

    public Boolean getJamon() {
        return jamon;
    }

    public void setJamon(Boolean jamon) {
        this.jamon = jamon;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "masa='" + masa + '\'' +
                ", relleno=" + relleno +
                ", tipo=" + tipo +
                ", salsa=" + salsa +
                ", tipoSalsa='" + tipoSalsa + '\'' +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                ", piña=" + piña +
                ", champiñones=" + champiñones +
                ", jamon=" + jamon +
                '}';
    }
}
