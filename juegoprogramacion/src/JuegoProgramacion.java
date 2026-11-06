import java.util.Scanner;

public class JuegoProgramacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        String nombre;
        int puntosdevida = 100;
        boolean tieneEspada = false;
        boolean tieneLibro = false;

        int respuestasMenu;
        do {                    //este do es para que el menu salga hasta que el usuario ponga un numero valido 
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║              MENÚ PRINCIPAL            ║");
            System.out.println("╠════════════════════════════════════════╣");
            System.out.println("║  1.  Inicio de partida                 ║");
            System.out.println("║  2.  Inspeccionar personaje            ║");
            System.out.println("║  3.  Inspeccionar pistas               ║");
            System.out.println("║  4.  Salir del juego                   ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.print("  Elige una opción: ");

            respuestasMenu = scanner.nextInt();//para leer la opcion del usuario y dependiendo de la que ponga pase una o otra 
            switch (respuestasMenu) {       
                case 1:
                    System.out.println("\n¡Iniciando partida!\n");
                    scanner.nextLine();
                    System.out.println("-------------------------");
                    System.out.println("Abres los ojos y todo a tu alrededor está oscuro");
                    scanner.nextLine();
                    System.out.println("No recuerdas nada");
                    scanner.nextLine();
                    System.out.println("- ¿Quién soy?");
                    scanner.nextLine();
                    System.out.println("- ¿Dónde estoy?");
                    scanner.nextLine();
                    System.out.println("Por una ventana pasa un rayo de luz que parece que te lleva a un espejo");
                    scanner.nextLine();
                    System.out.println("¿Qué haces?");
                    System.out.println("1. Vas a mirarte");
                    System.out.println("2. Lo ignoras");

                    int respuestaEspejo;
                    do {
                        respuestaEspejo = scanner.nextInt();
                        switch (respuestaEspejo) {
                            case 1:
                                System.out.println("Te acercas al espejo y ves una cara que no reconoces.");
                                break;
                            case 2:
                                System.out.println("Decides no ir al espejo, no recuerdas tu cara pero a lo mejor es por algo...");
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                    } while (respuestaEspejo != 1 && respuestaEspejo != 2); // mientras la respuesta no sea 1 o 2 el menu se repite 

                    System.out.println("\n-------------------------");
                    System.out.println("De repente escuchas un ruido, como si una estantería se hubiera caído");
                    scanner.nextLine();
                    System.out.println("¿Qué haces?");
                    System.out.println("1. Vas a investigar");
                    System.out.println("2. Mirar por el hueco que deja la puerta abierta de la habitación");

                    int respuestaPuerta;
                    do {
                        respuestaPuerta = scanner.nextInt();
                        switch (respuestaPuerta) {
                            case 1:
                                System.out.println("Abres la puerta con valentía, como si fuera natural para ti, ¿o no lo es?");
                                break;
                            case 2:
                                System.out.println("Al asomarte por el hueco te tropiezas y te caes abriendo la puerta con la cara, ¿siempre has sido así de torpe?");
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                    } while (respuestaPuerta != 1 && respuestaPuerta != 2);

                    System.out.println("\n-------------------------");
                    System.out.println("Llegas a un gran salón.");
                    scanner.nextLine();
                    System.out.println("Ves como una sombra se te acerca haciendo ruidos extraños");
                    scanner.nextLine();
                    System.out.println("Llega a una zona con luz y te fijas en que es un esqueleto entero moviendose hacia ti");
                    scanner.nextLine();
                    System.out.println("-Necesito encontrar un arma");
                    scanner.nextLine();
                    System.out.println("Te fijas en el suelo y ves varios objetos");
                    System.out.println("1. Ves un libro en el suelo ¿sera suficiente?");
                    System.out.println("2. Ves una espada pero esta cerca del esqueleto ¿Llegaras a tiempo?");

                    int respuestasSalon;
                    do {
                        respuestasSalon = scanner.nextInt();
                        switch (respuestasSalon) {
                            case 1:
                                System.out.println("Eliges la opcion segura , pero quizas no la mas fuerte");
                                tieneLibro = true;
                                tieneEspada = false;

                                int vidaEnemigolibro = 50;
                                System.out.println("El esqueleto se abalanza sobre ti. ¡Comienza el combate! El enemigo tiene " + vidaEnemigolibro + " puntos de vida.");

                                while (vidaEnemigolibro > 0 && puntosdevida > 0) {
                                    System.out.println("\n¿Qué quieres hacer?");
                                    System.out.println("1. Atacar con el libro");
                                    System.out.println("2. Intentas defenderte");

                                    int opcionCombate = scanner.nextInt();

                                    if (opcionCombate == 1) {
                                        int danoLibro = (int) (Math.random() * 6) + 15;
                                        vidaEnemigolibro = vidaEnemigolibro - danoLibro;
                                        System.out.println("¡Atacas con el libro y causas " + danoLibro + " puntos de daño!");

                                        if (vidaEnemigolibro <= 0) {
                                            System.out.println("¡El esqueleto recibe el golpe final y se desmorona en pedazos! Has ganado el combate.");
                                            break;
                                        } else {
                                            System.out.println("Al esqueleto aún le quedan " + vidaEnemigolibro + " puntos de vida.");
                                            int danoEnemigo = (int) (Math.random() * 5) + 5;
                                            puntosdevida = puntosdevida - danoEnemigo;
                                            System.out.println("El esqueleto te contraataca. Pierdes " + danoEnemigo + " puntos de vida. (Tu vida: " + puntosdevida + ")");
                                        }
                                    } else if (opcionCombate == 2) {
                                        System.out.println("Te pones en guardia y usas tu arma para bloquear el golpe.");
                                        int danoEnemigoReducido = (int) (Math.random() * 3) + 2;
                                        puntosdevida = puntosdevida - danoEnemigoReducido;
                                        System.out.println("¡Amortiguas el ataque enemigo! Solo pierdes " + danoEnemigoReducido + " puntos de vida. (Tu vida: " + puntosdevida + ")");
                                    } else {
                                        System.out.println("Opción inválida. Pierdes tu turno.");
                                    }

                                    if (puntosdevida <= 0) { // si la vida llega a 0 la partida acaba
                                        System.out.println("\n╔════════════════════════════════════════╗");
                                        System.out.println("║               GAME OVER                ║");
                                        System.out.println("╠════════════════════════════════════════╣");
                                        System.out.println("║    Has sucumbido ante tus heridas.     ║");
                                        System.out.println("╚════════════════════════════════════════╝\n");
                                        puntosdevida = 100;
                                        break;
                                    }
                                }
                                break;

                            case 2:
                                System.out.println("Vas corriendo a por la espada y la alcanzas, ¡la agarras justo a tiempo!");
                                tieneLibro = false;
                                tieneEspada = true;

                                int vidaEnemigo = 50;
                                System.out.println("El esqueleto se abalanza sobre ti. ¡Comienza el combate! El enemigo tiene " + vidaEnemigo + " puntos de vida.");

                                while (vidaEnemigo > 0 && puntosdevida > 0) {
                                    System.out.println("\n¿Qué quieres hacer?");
                                    System.out.println("1. Atacar con la espada");
                                    System.out.println("2. Intentas defenderte");

                                    int opcionCombate = scanner.nextInt();

                                    if (opcionCombate == 1) {
                                        int danoEspada = (int) (Math.random() * 16) + 20;
                                        vidaEnemigo = vidaEnemigo - danoEspada;
                                        System.out.println("¡Atacas con la espada y causas " + danoEspada + " puntos de daño!");

                                        if (vidaEnemigo <= 0) {
                                            System.out.println("¡El esqueleto recibe el golpe final y se desmorona en pedazos! Has ganado el combate.");
                                            break;
                                        } else {
                                            System.out.println("Al esqueleto aún le quedan " + vidaEnemigo + " puntos de vida.");
                                            int danoEnemigo = (int) (Math.random() * 5) + 5;
                                            puntosdevida = puntosdevida - danoEnemigo;
                                            System.out.println("El esqueleto te contraataca. Pierdes " + danoEnemigo + " puntos de vida. (Tu vida: " + puntosdevida + ")");
                                        }
                                    } else if (opcionCombate == 2) {
                                        System.out.println("Te pones en guardia y usas tu arma para bloquear el golpe.");
                                        int danoEnemigoReducido = (int) (Math.random() * 3) + 2;
                                        puntosdevida = puntosdevida - danoEnemigoReducido;
                                        System.out.println("¡Amortiguas el ataque enemigo! Solo pierdes " + danoEnemigoReducido + " puntos de vida. (Tu vida: " + puntosdevida + ")");
                                    } else {
                                        System.out.println("Opción inválida. Pierdes tu turno.");
                                    }

                                    if (puntosdevida <= 0) {
                                        System.out.println("\n╔════════════════════════════════════════╗");
                                        System.out.println("║               GAME OVER                ║");
                                        System.out.println("╠════════════════════════════════════════╣");
                                        System.out.println("║ Has muerto por culpa de tus heridas    ║");
                                        System.out.println("╚════════════════════════════════════════╝\n");
                                        puntosdevida = 100;
                                        int volver1 = scanner.nextInt();
                                        break;
                                    }
                                }
                                break;

                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                    } while (respuestasSalon != 1 && respuestasSalon != 2);

                    if (puntosdevida <= 0) {
                        break;
                    }

                    System.out.println("\n-------------------------");
                    System.out.println("Estas son tus estadisticas Vida:" + puntosdevida);
                    System.out.println("\n-------------------------");

                    System.out.println("\nBajas a la mazmorra, al bajar ves a lo lejos un grupo de personas gritandote algo que no llegas a entender ");
                    scanner.nextLine();
                    System.out.println("Al acercarte te das cuenta que son un grupo de esqueletos , igual al que te ataco antes ");
                    scanner.nextLine();
                    System.out.println("El grupo se acerca y empiezan a celebrar entre ellos, ¿es algo bueno?");
                    scanner.nextLine();

                    if (tieneEspada) {
                        System.out.println("Escuchas una voz...");
                        scanner.nextLine();
                        System.out.println("Viene de tu espada:");
                        scanner.nextLine();
                        System.out.println("- Acaba con ellos, son enemigos -");
                        scanner.nextLine();
                        System.out.println("¿Dejas que el miedo te consuma?");
                        System.out.println("1. Si, ataco sin pensar");
                        System.out.println("2. No, dejo que se acerquen");

                        int respuestaEspada;
                        do {
                            respuestaEspada = scanner.nextInt();
                            switch (respuestaEspada) {
                                case 1:
                                    System.out.println("Acabas con ellos.");
                                    scanner.nextLine();
                                    System.out.println("Ves que a uno de esos monstruos se le cae una llave al caer al suelo.");
                                    scanner.nextLine();
                                    System.out.println("¡Por fin saldre de aqui!");
                                    scanner.nextLine();
                                    System.out.println("Al lado de la llave ves una foto, que raro.");
                                    scanner.nextLine();
                                    System.out.println("La coges y te ves a ti con un grupo de gente.");
                                    scanner.nextLine();
                                    System.out.println("Ahora recuerdas todo, viniste a buscar a tu familia y parece que la encontraste...");
                                    scanner.nextLine();
                                    System.out.println("Coges la llave y sales de alli.");
                                    System.out.println("\n╔════════════════════════════════════════╗");
                                    System.out.println("║                FINAL                   ║");
                                    System.out.println("╠════════════════════════════════════════╣");
                                    System.out.println("║            ¿HAS GANADO?                ║");
                                    System.out.println("╚════════════════════════════════════════╝");
                                    break;

                                case 2:
                                    System.out.println("Dejas que se acerquen.");
                                    scanner.nextLine();
                                    System.out.println("Al acercarse uno de ellos te enseña una foto.");
                                    scanner.nextLine();
                                    System.out.println("Eres tu con un grupo de personas.");
                                    scanner.nextLine();
                                    System.out.println("Los reconoces, son tu familia.");
                                    scanner.nextLine();
                                    System.out.println("Salis todos de la mansion y al salir vuelven a su forma normal.");
                                    System.out.println("\n╔════════════════════════════════════════╗");
                                    System.out.println("║                 FINAL                  ║");
                                    System.out.println("╠════════════════════════════════════════╣");
                                    System.out.println("║             ¡HAS GANADO!               ║");
                                    System.out.println("╚════════════════════════════════════════╝");
                                    break;

                                default:
                                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                                    break;
                            }
                        } while (respuestaEspada != 1 && respuestaEspada != 2);

                    } else if (tieneLibro) {
                        System.out.println("Abres tu libro para ver si encuentras algo util.");
                        scanner.nextLine();
                        System.out.println("Ves un hechizo que puedes utilizar para atacarles.");
                        scanner.nextLine();
                        System.out.println("¿Lo utilizas o dejas que se acerquen?");
                        System.out.println("1. Si, ataco sin pensar");
                        System.out.println("2. No, dejo que se acerquen");

                        int respuestaLibro;
                        do {
                            respuestaLibro = scanner.nextInt();
                            switch (respuestaLibro) {
                                case 1:
                                    System.out.println("Lanzas el hechizo y acabas con ellos.");
                                    scanner.nextLine();
                                    System.out.println("Ves que a uno de esos monstruos se le cae una llave al caer al suelo.");
                                    scanner.nextLine();
                                    System.out.println("¡Por fin saldre de aqui!");
                                    scanner.nextLine();
                                    System.out.println("Al lado de la llave ves una foto, que raro.");
                                    scanner.nextLine();
                                    System.out.println("La coges y te ves a ti con un grupo de gente.");
                                    scanner.nextLine();
                                    System.out.println("Ahora recuerdas todo, viniste a buscar a tu familia y parece que la encontraste...");
                                    scanner.nextLine();
                                    System.out.println("Coges la llave y sales de alli.");
                                    System.out.println("\n╔════════════════════════════════════════╗");
                                    System.out.println("║                FINAL                   ║");
                                    System.out.println("╠════════════════════════════════════════╣");
                                    System.out.println("║            ¿HAS GANADO?                ║");
                                    System.out.println("╚════════════════════════════════════════╝");
                                    break;

                                case 2:
                                    System.out.println("Dejas que se acerquen.");
                                    scanner.nextLine();
                                    System.out.println("Al acercarse uno de ellos te enseña una foto.");
                                    scanner.nextLine();
                                    System.out.println("Eres tu con un grupo de personas.");
                                    scanner.nextLine();
                                    System.out.println("Los reconoces, son tu familia.");
                                    scanner.nextLine();
                                    System.out.println("Salis todos de la mansion y al salir vuelven a su forma normal.");
                                    System.out.println("\n╔════════════════════════════════════════╗");
                                    System.out.println("║                 FINAL                  ║");
                                    System.out.println("╠════════════════════════════════════════╣");
                                    System.out.println("║             ¡HAS GANADO!               ║");
                                    System.out.println("╚════════════════════════════════════════╝");
                                    break;

                                default:
                                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                                    break;
                            }
                        } while (respuestaLibro != 1 && respuestaLibro != 2);
                    }
                    break;

                case 2:
                    System.out.print("Introduce el nombre de tu personaje: ");
                    nombre = scanner.next();
                    System.out.println("\n--- PERFIL DE PERSONAJE ---");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Puntos de vida: " + puntosdevida);

                    System.out.print("Tus objetos: "); // menu donde dependiendo del objeto elegido sale uno o otro
                    if (tieneEspada) {
                        System.out.println("Espada");
                    } else if (tieneLibro) {
                        System.out.println("Libro");
                    } else {
                        System.out.println("Vacío / Ningún objeto");
                    }

                    System.out.println("\nPara volver introduce cualquier número y pulsa Enter:");
                    int volver = scanner.nextInt();
                    break;

                case 3:
                    System.out.println("Tus pistas...");
                    System.out.println("Todo lo que hagas tiene una consecuencia...");
                    System.out.println("Para volver introduce cualquier numero y pulsa enter");
                    int volver1 = scanner.nextInt();
                    break;

                case 4:
                    System.out.println("Saliendo del juego...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.\n");
                    break;
            }
        } while (respuestasMenu != 4);

        scanner.close();
    }
}



        
    
