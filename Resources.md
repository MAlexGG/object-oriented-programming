# Programación Orientada a Objetos
La Programación Orientada a Objetos es un paradigma de programación basado en el uso de clases y objetos para estructurar el código, promoviendo la reutilización y modularidad mediante principios.

## ¿Qué es una clase?
Una clase es una plantilla, un modelo o un molde para crear objetos, define la estructura y el comportamiento de los objetos. Tienen atributos que es la definición de las características o propiedades que contendrán los objetos instanciados y también tienen métodos que son las acciones que puede realizar dicho objeto.

## ¿Qué es un Objeto?
Son instancias de una clase y representan entidades del mundo real.  A la acción de crear un objeto se la llama instanciar.
Cuando creamos un objeto podemos pasar valores (atributos) específicos para cada objeto y también los objetos pueden crearse con valores predefinidos en la clase. Cuando se instancia un objeto, se pueden usar los métodos definidos en la clase. 

## Principios
### Abstracción
Es la definición de una clase en el contexto que necesitemos, es la representación de los objetos de la vida real. Tiene atributos y métodos.

Por ejemplo: ¿Cómo abstraemos un coche? 
Un coche tiene ruedas, color y otras características, a las cuales llamamos atributos. Un coche tiene la capacidad de realizar acciones tales como acelerar, frenar, etc. A estas acciones las llamamos métodos. 
El contexto es muy importante, hemos de saber la lógica del negocio. Si estos coches que estamos creando son para una empresa de alquiler de coches, probablemente no nos sirva el método de acelerar, en su lugar, necesitaríamos un método alquilar, y de esta manera el programa tiene coherencia con la definición del contexto.

### Encapsulación
Es el principio que restringe el acceso directo a los datos de un objeto, permitiendo su manipulación solo a través de métodos definidos. Se logra mediante modificadores de acceso para proteger los atributos y garantizar la integridad de los datos.

En la mayoría de los casos, por cuestiones de seguridad, los atributos no deberían ser cambiados directamente por otras clases y deberían ir con una visibilidad privada, y para acceder a ellos o modificar su valor podemos crear métodos llamados 'getters' para objtener el atributo y 'setters' para modificarlo.

### Herencia 
Una subclase puede heredar métodos y atributos de una clase superior donde está definido todo lo necesario para que la subclase pueda heredar, se usa la palabra clave extends dentro de la subclase. Cuando no tenga sentido instanciar objetos de la clase superior se la define como abstracta.

- Por ejemplo: 
Podemos tener una clase superior llamada Vehículo que tendrá dos subclases, coche y moto, en la clase superior se definen todos los atributos y métodos que comparten las subclases y estas a su vez heredan de la clase superior, y el resto de atributos y métodos propios de las subclases se definen en cada una de ellas como corresponda. Entonces no tiene sentido que instancie Vehículo, tiene más sentido que cree un objeto Coche y un objeto Moto, de esta manera, Vehículo deberá ser una clase abstracta. Cuando un método es abstracto, la clase deberá también ser abstracta.

### Polimorfismo
El término 'polimorfismo' proviene del griego y significa 'muchas formas'. Se refiere a poder usar el mismo método definido en una clase superior o interfaz pero el comportamiento podrá ser distinto para cada una de sus subclases o implementaciones.

Existen dos tipos de polimorfismo, por herencia y por interfaz. Su principal diferencia radica en la relación entre las clases.

- Por Herencia:
El polimorfismo por herencia se basa en una jerarquía de clases, en la clase superior el método será abstracto y de implementación obligatoria para sus subclases.

- Por interfaz:
El polimorfismo por interfaz se basa en la implementación de una interfaz común. En la interfaz se define el método y cualquier clase lo puede implementar. Es más flexible ya que las clases no están vinculadas por una estructura de herencia común.


## Características del Paradigma
### Tipos de clases 
En la programación orientada a objetos se puede definir distintos tipos de clases que tienen diferentes propósitos. Los más comunes son:

- Clase concreta: puede ser instanciada directamente. Contiene implementaciones completas de todos sus métodos. Se utiliza para crear objetos directamente. Proporciona implementaciones completas y puede ser utilizada por otras clases. Se declara normalmente sin palabras claves.

- Clase abstracta: no puede ser instanciada directamente y puede contener métodos abstractos (sin implementación) así como métodos concretos (con implementación). Se utiliza para definir una base común para otras clases. Se declara con la palabra clave 'abstract'.

- Clase estática: clase anidada dentro de otra clase que puede ser instanciada sin una instancia de la clase externa. No puede acceder directamente a los miembros de la clase externa. Se utiliza para agrupar clases que solo tienen métodos estáticos o para encapsular una funcionalidad auxiliar relacionada con la clase externa. Se declara con la palabra clave 'static'. Normalmente contiene métodos estáticos, aunque puede contener métodos no estáticos también. 

- Clase final: no puede ser extendida (heredada) por otras clases. Se utiliza para evitar que una clase sea extendida. Esto puede ser útil por razones de seguridad, para asegurar la invariabilidad de una clase, o para mejorar el rendimiento. Se declara con la palabra clave 'final'.

### Tipos de métodos
Se pueden definir distintos tipos de métodos que tienen diferentes propósitos. Los más comunes son:

- Métodos concretos: funciones con implementación completa. Se declara normalmente sin palabras claves.

- Métodos abstractos: funciones que no tienen implementación en la clase abstracta y deben ser implementados por las subclases. Se declara con la palabra clave 'abstract'.

- Métodos estáticos: es una función que pertenece a la clase en sí misma, en lugar de a una instancia específica de la clase. Esto significa que puedes llamar a un método estático sin tener que crear un objeto de la clase. Se declara con la palabra clave 'static'.

- Métodos finales: funciones que no pueden ser sobrescritas por las subclases. Se declara con la palabra clave 'final'.

### Modificadores de acceso de las clases, atributos o métodos
Los modificadores de acceso pueden ser públicos, protegidos o privados, controlan la visibilidad de los atributos, métodos, clases e interfaces dentro de un programa.

- Public: puede ser accedido desde cualquier parte del programa.
- Private: (para atributos y métodos) solo puede ser accedido dentro de la misma clase. No se puede acceder directamente desde subclases ni desde otras clases.
- Protected: (para atributos y métodos) es accesible por subclases de la herencia.

Una clase solo puede ser definida como pública o por defecto (sin especificación). En los atributos, los modificadores de acceso,controlan la visibilidad y manipulación de los datos dentro de una clase. En los métodos, los modificadores de acceso definen si pueden ser llamados desde fuera de la clase o por clases heredadas. Y las interfaces usan public por defecto en sus métodos y atributos.