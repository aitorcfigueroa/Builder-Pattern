# Patrón Builder

Es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso. 
El patrón nos permite producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción.

Este patrón sugiere que saques el código de construcción del objeto de su propia clase y lo coloques dentro de objetos independientes llamados constructores.

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

## Combinación con otros patrones

Este patrón se podría utilizar con el patrón factory, de manera que el patrón factory devuelva un Builder de nuestra clase concreta
y utilizar este Builder para construír tantos objetos como queramos con los atributos que necesitemos.