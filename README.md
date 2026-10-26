TDA Pila — Java

Implementación enlazada del TDA Pila.

Estructura

```
TDA-Pila/
├── .vscode/
│   ├── settings.json      # src como código fuente, bin como salida
│   └── launch.json        # configuración para ejecutar Main
├── src/
│   ├── IStack.java        # Interfaz del TDA: Push, Top, Pop, isEmpty
│   ├── Node.java          # Nodo genérico: info, next
│   ├── LinkedStack.java   # Pila enlazada (atributo top)
│   ├── VerificadorSimbolos.java  # Aplicación: símbolos desequilibrados
│   └── Main.java          # Programa de prueba
├── bin/                   # Clases compiladas
└── lib/                   # Dependencias (vacío)
```

Cómo ejecutar

En VS Code: abrir la carpeta `TDA-Pila` (con el Extension Pack for Java instalado), abrir `Main.java` y pulsar **Run.

Por terminal:

```
javac -d bin src/*.java
java -cp bin Main
```

Salida esperada

```
LinkedStack
El tope es: Elemento 3

Vaciando la pila (orden LIFO):
  Pop -> Elemento 3
  Pop -> Elemento 2
  Pop -> Elemento 1
¿Pila vacía? true
Top en pila vacía: null
Pop en pila vacía: null
...
```
