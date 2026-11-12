# La casa del misterio

Dario Sierra Asenjo
1 DAW
Primera evaluación

Videojuego de aventura de texto para consola, programado en Java.

---

## 1. Descripción y objetivo

*La casa del misterio* es una aventura de texto en la que el jugador despierta en una mansión oscura sin recordar quién es ni cómo ha llegado hasta allí. Para salir tendrá que explorar la casa, enfrentarse a decisiones y descubrir qué hacen en ese lugar los extraños seres que la habitan.

**Objetivo:** sobrevivir al combate, recuperar la memoria y encontrar a tu familia para escapar de la mansión.

La historia avanza mediante decisiones. Según el arma elegida y la decisión final, el jugador llega a un desenlace distinto.

---

## 2. Reglas básicas y funcionamiento

- El juego se maneja **escribiendo el número de la opción** elegida y pulsando Enter. En las escenas narrativas se pulsa Enter para avanzar.
- Al elegir una opcion, la consecuencia de ella (siguiente texto) aparece sin la necesidad de pulsar enter para que aparezca.
- Al empezar una partida se introduce el nombre del personaje. Se parte con **100 puntos de vida** y el inventario vacío.
- Al acabar la partida se puede consultar las estadisticas de la anterior en la opcion 2
- Las primeras opciones del juego no tienen mucha importancia sobre la historia
- Al llegar al salón hay que elegir un arma, que se guarda en el inventario:
  - **Libro:** ataque más débil y constante (15-20 de daño).
  - **Espada:** ataque más fuerte, pero más arriesgada de conseguir (20-35 de daño).
- **Combate por turnos** contra un esqueleto con 50 puntos de vida:
  - *Atacar:* se causa daño al esqueleto y, si sigue vivo, este contraataca (5-9 puntos de daño).
  - *Defenderse:* se reduce el daño recibido (2-4 puntos), pero no se ataca.
  - *Opción no válida:* se pierde el turno y se reciben 10 puntos de daño.
- Si la vida llega a **0**, la partida termina con un *GAME OVER* y se vuelve al menú principal.
- Tras vencer al esqueleto, el jugador baja a la mazmorra y toma la **decisión final**: atacar al grupo de esqueletos o dejar que se acerquen. Cada elección conduce a un final diferente.
- Si se introduce una opción no válida en una decisión, el juego vuelve a pedirla.

### Menú principal

| Opción | Acción |
|---|---|
| 1 | Inicio de partida |
| 2 | Partida anterior (muestra el nombre, la vida y el inventario) |
| 3 | Inspeccionar pistas |
| 4 | Salir del juego |

### Finales

| Decisión final | Resultado |
|---|---|
| Atacar (con espada o libro) | El jugador consigue la llave, recuerda todo y escapa (final abierto: *¿HAS GANADO?*) |
| Dejar que se acerquen (con espada o libro) | Los esqueletos le enseñan una foto, reconoce a su familia y salen juntos de la mansión (*¡HAS GANADO!*) |

El texto de la escena previa y la frase de ataque cambian según el arma, pero la estructura del final es común.

---

## 3. Funcionalidades implementadas (primera evaluación)

- Menú principal con 4 opciones, repetido hasta elegir una opción válida.
- Narración interactiva con decisiones que se repiten si la respuesta no es válida.
- Elección de arma (espada o libro) que condiciona el combate y la escena final.
- Sistema de combate por turnos con daño aleatorio (`Math.random()`) y defensa.
- Sistema de vida del jugador y del enemigo, con pantalla de *Game Over*.
- Inventario mediante un **array unidimensional** de posiciones fijas:
  - `inventario[0]` → arma (`"Espada"` o `"Libro"`)
  - `inventario[1]` → llave (`"Llave"`)
  - Un hueco en `null` significa que ese objeto no se tiene.
- Visualización de la partida anterior (nombre, vida e inventario), recorriendo el array con un bucle.
- Un único bloque de combate y una única estructura para los finales, sin código duplicado entre espada y libro.
- Reinicio del estado (vida e inventario) al empezar una partida nueva.

**Contenidos de programación utilizados:** variables y constantes (`final`), `Scanner`, condicionales (`if/else`, `switch`), bucles (`while`, `do/while`, `for`), arrays y operaciones con números aleatorios.

---


## 4. Estructura de archivos

```
La-casa-de-las-memorias/
├── JuegoProgramacion.java   # Código fuente (clase principal con el método main)
└── README.md                # Este documento
```

Todo el juego está en una única clase, `JuegoProgramacion`, dentro del método `main`.

---

## 5. Limitaciones conocidas y mejoras previstas

### Limitaciones conocidas

- Si el usuario escribe un texto que no sea un número, el programa se cierra con una excepción (`InputMismatchException`), porque las entradas se leen con `nextInt()`.
- La opción *Partida anterior* solo muestra los datos de la partida jugada durante la ejecución actual. No se guardan en ningún archivo, así que se pierden al cerrar el programa. Si no se ha jugado ninguna, aparecen el nombre vacío y la vida inicial.
- Las pantallas de "pulsa cualquier número" para volver al menú dependen de `nextInt()` y requieren introducir un número.
- La opción *Inspeccionar pistas* solo muestra un texto fijo.
- Todo el código está en el método `main`, por lo que es largo y difícil de mantener.
- Solo hay un combate y un único recorrido por la historia.
- El jugador no puede recuperar vida ni usar objetos durante el combate.


### Mejoras previstas

- Validar las entradas para que el juego no se cierre con datos incorrectos.
- Dividir el código en métodos (combate, menú, escenas, finales) para reducir la longitud de `main`.
- Añadir más escenas, enemigos, objetos y finales.
- Ampliar el inventario y permitir usar objetos (por ejemplo, pociones de vida).
- Mostrar la lista de pistas descubiertas durante la partida.
- Mejorar el combate con más tipos de ataque y defensa.