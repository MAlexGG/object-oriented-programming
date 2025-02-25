# :cat: :dog: Pet Adoption

## Objetivo
Vamos a construir un sistema para manejar el Centro de Adopción de Animales Hermosos, donde cada animal tiene sus propias características y comportamientos. En este ejercicio, vamos a aplicar los cuatro principios de la Programación Orientada a Objetos (abstracción, encapsulamiento, herencia y polimorfismo) para gestionar diferentes tipos de animales que esperan ser adoptados.

## Principios de la Programación Orientada a Objetos
### Abstracción
Vamos a pensar en los animales que están en adopción. Todos los animales, independientemente de su especie, tienen algunas características en común, vamos a usar las siguientes:
- name (String)
- age (int)
- sex (String)
- isAdopted (boolean)
- isPregnant (boolean)

También podemos incluir el método:
- adopt

También necesitamos registrar la persona que adopta, así que tendrá las siguientes características:
- name (String)
- lastname (String)
- phone (int)
- address (String) 
    
### Encapsulamiento
Queremos asegurarnos de que los atributos de los animales estén protegidos y no sean modificados de manera incorrecta por otras clases por lo que su visibilidad será privada, para que no se pueda cambiar directamente, sino mediante métodos específicos.

### Herencia
Ahora, todos los animales del centro de adopción comparten ciertas características comunes, pero también tienen sus propias características y comportamientos únicos. Para no repetir código, podemos usar herencia.
Usamos la clase abstracta Pet y las clases concretas Dog y Cat.
Dog tendrá otros atributos:
- bites (boolean)
  
Cat tendrá otros atributos:
- scratches (boolean)

### Polimorfismo
Aunque todos los animales en el centro tienen ciertos comportamientos comunes, cada tipo de animal puede hacerlo de manera diferente. Aquí es donde entra el polimorfismo.
Las hembras de los perros y los gatos pueden parir, pero las perras tienen cachorros y las gatas camadas. Aquí el método **gaveBirth** se comporta de manera diferente según el tipo de animal que lo llame. En este caso usaremos polimorfismo por herencia.

Cuando se adopte una mascota, tanto el animal como la persona recibirán un regalo que serán diferentes por cada uno de ellos. Aquí usaremos el polimorfismo por interfaz con el método **giveGift**.


