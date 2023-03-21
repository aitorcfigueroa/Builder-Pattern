public class PizzaBuilder {
    private Pizzas _pizza;

    private PizzaBuilder() {
        this._pizza = new Pizzas();
    }

    public static PizzaBuilder pizza() {
        return new PizzaBuilder();
    }

    public Pizzas build() {
        return this._pizza;
    }

    public PizzaBuilder masa(String masa) {
        this._pizza.setMasa(masa);
        return this;
    }

    public PizzaBuilder relleno(Boolean relleno) {
        this._pizza.setRelleno(relleno);
        return this;
    }

    public PizzaBuilder tipo(Integer tipo) {
        this._pizza.setTipo(tipo);
        return this;
    }

    public PizzaBuilder salsa(Boolean salsa) {
        this._pizza.setSalsa(salsa);
        return this;
    }

    public PizzaBuilder tipoSalsa(String tipoSalsa) {
        this._pizza.setTipoSalsa(tipoSalsa);
        return this;
    }

    public PizzaBuilder cebolla(Boolean cebolla) {
        this._pizza.setCebolla(cebolla);
        return this;
    }

    public PizzaBuilder sinGluten(Boolean sinGluten) {
        this._pizza.setSinGluten(sinGluten);
        return this;
    }

    public PizzaBuilder extraQueso(Boolean extraQueso) {
        this._pizza.setExtraQueso(extraQueso);
        return this;
    }

    public PizzaBuilder piña(Boolean piña) {
        this._pizza.setPiña(piña);
        return this;
    }

    public PizzaBuilder champiñones(Boolean champiñones) {
        this._pizza.setChampiñones(champiñones);
        return this;
    }

    public PizzaBuilder jamon(Boolean jamon) {
        this._pizza.setJamon(jamon);
        return this;
    }
}
