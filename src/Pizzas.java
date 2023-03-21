import java.util.ArrayList;

public class Pizzas {
    String masa;
    Boolean relleno;
    Integer tipo;
    Boolean salsa;
    String tipoSalsa;
    Boolean cebolla;
    Boolean sinGluten;
    Boolean extraQueso;
    Boolean piña;
    Boolean champiñones;
    Boolean jamon;

    Pizzas(String masa, Boolean relleno, Integer tipo, Boolean salsa, String tipoSalsa, Boolean cebolla, Boolean sinGluten, Boolean extraQueso, Boolean piña, Boolean champiñones, Boolean jamon) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;
    }

    public String getPizza() {
        ArrayList<String> pizza = new ArrayList<>();
        pizza.add("Tipo de masa: " + this.masa);
        pizza.add("Relleno: " + this.relleno.toString());
        pizza.add("Tamaño de la pizza: " + this.tipo.toString());
        pizza.add("Salsa: " + this.salsa.toString());
        pizza.add("Tipo de salsa: " + this.tipoSalsa);
        pizza.add("Cebolla: " + this.cebolla.toString());
        pizza.add("Gluten: " + this.sinGluten.toString());
        pizza.add("Extra de queso: " + this.extraQueso.toString());
        pizza.add("Piña: " + this.piña.toString());
        pizza.add("Champiñones: " + this.champiñones.toString());
        pizza.add("Jamón: " + this.jamon.toString());

        return String.join(", ", pizza);
    }
}
