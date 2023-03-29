# Patrón Builder

Es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso. 
El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción.

Este patrón sugiere que saques el código de construcción del objeto de su propia clase y lo coloques dentro de objetos independientes llamados constructores.

Por ejemplo, la creación de una hamburguesa, que dependiendo del cliente o los tipos de hamburguesa que se tengan en carta
será necesario añadir unos ingredientes u otros.

## Diagrama de clases

```mermaid
classDiagram
    Pizzas <|-- PizzaBuilder
    PizzaBuilder <|-- Main
    class Pizzas{
      -String masa
      -boolean relleno
      -int tipo
      -boolean salsa
      -String tipoSalsa
      -boolean cebolla
      -boolean sinGluten
      -boolean extraQueso
      -boolean pina
      -boolean champinones
      -boolean jamon
      +toString()
    }
    class PizzaBuilder{
      -Pizzas _pizza
      -PizzaBuilder()
      +build()
    }
    class Main{
      Pizzas pizzaJamonyqueso
      Pizzas pizzaHawaiana
      +main()
    }
```

```mermaid
classDiagram
    Hamburguesas <|-- HamburguesaBuilder
    HamburguesaBuilder <|-- Main
    class Hamburguesas{
      -String pan
      -String tipoCarne
      -boolean ketchup
      -boolean mayonesa
      -boolean cebolla
      -boolean lechuga
      -boolean queso
      -boolean bacon
      -boolean extraQueso
      -boolean pimiento
      +toString()
    }
    class HamburguesaBuilder{
      -Hamburguesas _hamburguesa
      -HamburguesaBuilder()
      +build()
    }
    class Main{
      Hamburguesas burguerAmericana
      Hamburguesas burguerBacon
      +main()
    }
```

## Combinación con otros patrones

Este patrón se podría utilizar con el patrón factory, de manera que el patrón factory devuelva un Builder de nuestra clase concreta
y utilizar este Builder para construir tantos objetos como queramos con los atributos que necesitemos.