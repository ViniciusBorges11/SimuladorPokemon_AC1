package pokemon_ac1;

import java.util.Scanner;

public class Batalha_Poke {

    public void batalha() {

        Scanner ler = new Scanner(System.in);

        int escolha;
        int escolhaAtaque = 0;
        int vidaAdver = 150;
        String adversario;

        System.out.println(" ------------------------------------ POKEMONS: -----------------------------------");
        Pokemons pokemon1 = new Pokemons("Cinderace", "Fogo", 60);
        Pokemons pokemon2 = new Pokemons("Greninja", "Agua", 60);
        Pokemons pokemon3 = new Pokemons("Sceptile", "Grama", 60);
        Pokemons pokemon4 = new Pokemons("Pikachu ", "Eletrico", 60);
        int vidapokemon1 = pokemon1.getVida();
        int vidapokemon2 = pokemon2.getVida();
        int vidapokemon3 = pokemon3.getVida();
        int vidapokemon4 = pokemon4.getVida();

        System.out.println("");
        System.out.println(" -------------------------- POKEMON!!!! TEMOS QUE PEGAR ----------------------------");
        System.out.println(" 1 - Cinderace ");
        System.out.println(" 2 - Greninja ");
        System.out.println(" 3 - Sceptile ");
        System.out.println(" 4 - Pikachu ");
        System.out.print("Escolha o seu pokemon: ");
        escolha = ler.nextInt();
        if (escolha == 1) {
            System.out.println("---------- CINDERACE EU ESCOLHO VOCÊ ---------");
        }
        if (escolha == 2) {
            System.out.println("---------- GRENINJA EU ESCOLHO VOCÊ -----------");
        }
        if (escolha == 3) {
            System.out.println("---------- SCEPTILE EU ESCOLHO VOCÊ  -----------");
        }
        if (escolha == 4) {
            System.out.println("---------- PIKACHU EU ESCOLHO VOCÊ  -----------");
        }
        if (escolha >= 5) {
            System.out.println(" Pokemon Invalido! Voltando para a seleção de Pokemons ");
            System.out.println(" ----------------------------------------------------- ");
            batalha();
        }

        System.out.println("Cinderace ");
        System.out.println("Greninja ");
        System.out.println("Sceptile ");
        System.out.println("Pikachu ");
        System.out.print("Escreva o nome do Pokemon Adversario: ");
        adversario = ler.next();
        if (adversario.equals("Cinderace")) {
            if (escolha == 1) {
                System.out.println("---------- CINDERACE X CINDERACE ---------");
            }
             if (escolha == 2) {
                System.out.println("---------- GRENINJA X CINDERACE ---------");
            }
              if (escolha == 3) {
                System.out.println("---------- SCEPTILE X CINDERACE ---------");
            }
               if (escolha == 4) {
                System.out.println("---------- PIKACHU X CINDERACE ---------");
            }
        } 
        if (adversario.equals("Greninja")) {
            if (escolha == 1) {
                System.out.println("---------- CINDERACE X GRENINJA ---------");
            }
             if (escolha == 2) {
                System.out.println("---------- GRENINJA X GRENINJA ---------");
            }
              if (escolha == 3) {
                System.out.println("---------- SCEPTILE X GRENINJA ---------");
            }
               if (escolha == 4) {
                System.out.println("---------- PIKACHU X GRENINJA ---------");
            }
        }
        if (adversario.equals("Sceptile")) {
            if (escolha == 1) {
                System.out.println("---------- CINDERACE X SCEPTILE ---------");
            }
             if (escolha == 2) {
                System.out.println("---------- GRENINJA X SCEPTILE ---------");
            }
              if (escolha == 3) {
                System.out.println("---------- SCEPTILE X SCEPTILE ---------");
            }
               if (escolha == 4) {
                System.out.println("---------- PIKACHU X SCEPTILE ---------");
            }
        }
        if (adversario.equals("Pikachu")) {
           if (escolha == 1) {
                System.out.println("---------- CINDERACE X PIKACHU ---------");
            }
             if (escolha == 2) {
                System.out.println("---------- GRENINJA X PIKACHU ---------");
            }
              if (escolha == 3) {
                System.out.println("---------- SCEPTILE X PIKACHU ---------");
            }
               if (escolha == 4) {
                System.out.println("---------- PIKACHU X PIKACHU ---------");
            }
        }
        else if (!"Cinderace".equals(adversario) && !"Greninja".equals(adversario) && !"Sceptile".equals(adversario) && !"Pikachu".equals(adversario)) {
            System.out.println(" Pokemon Invalido! Voltando para a seleção de Pokemons ");
            System.out.println(" ----------------------------------------------------- ");
            batalha();
        }
       
        do {
            if (escolha == 1) {
                System.out.println(" ---------------------- ");
                System.out.println(" 1 - Bola Incendiária ");
                System.out.println(" 2 - Chute Flamejante  ");
                System.out.print(" Escolha o seu Ataque: ");
                escolhaAtaque = ler.nextInt();
                System.out.println(" -------------------- ");
                switch (escolhaAtaque) {
                    case 1:
                        System.out.println("Cinderace usou Bola Incendiária ");
                        vidaAdver = vidaAdver - pokemon1.getAtaque1();
                        System.out.println("Vida do " + adversario + ":" + vidaAdver);
                        break;
                    case 2:
                        System.out.println("Cinderace usou Chute Flamejante ");
                        vidaAdver = vidaAdver - pokemon1.getAtaque2();
                        System.out.println("Vida do " + adversario + ":" + vidaAdver);
                        break;
                    default:
                        System.out.println(" Opção de Ataque Invalido! Perdeu o turno ");
                        break;
                }

                if (vidaAdver >= 0) {
                    switch (adversario) {
                        case "Cinderace":
                            System.out.println(" Cinderace usou Bola Incendiária");
                            vidapokemon1 = vidapokemon1 - pokemon1.getAtaque1();
                            System.out.println("Vida do Cinderace:" + vidapokemon1);
                            break;
                        case "Greninja":
                            System.out.println("Greninja usou Shuriken d'água ");
                            vidapokemon1 = vidapokemon1 - pokemon2.getAtaque1();
                            System.out.println("Vida do Cinderace:" + vidapokemon1);
                            break;
                        case "Sceptile":
                            System.out.println("Sceptile usou Lâmina de Folha ");
                            vidapokemon1 = vidapokemon1 - pokemon3.getAtaque1();
                            System.out.println("Vida do Cinderace:" + vidapokemon1);
                            break;
                        case "Pikachu":
                            System.out.println(" Pikachu usou o Choque do Trovão ");
                            vidapokemon1 = vidapokemon1 - pokemon4.getAtaque1();
                            System.out.println("Vida do Cinderace:" + vidapokemon1);
                            break;
                    }
                }
            }
            if (escolha == 2) {
                System.out.println(" ---------------------- ");
                System.out.println(" 1 - Shuriken d'água ");
                System.out.println(" 2 - Multiplicar ");
                System.out.print("Escolha o seu Ataque: ");
                escolhaAtaque = ler.nextInt();
                System.out.println(" ---------------------- ");
                switch (escolhaAtaque) {
                    case 1:
                        System.out.println("Greninja usou Shuriken d'água ");
                        vidaAdver = vidaAdver - pokemon2.getAtaque1();
                        System.out.println("Vida do " + adversario + ":" + vidaAdver);
                        break;
                    case 2:
                        System.out.println("Greninja usou Multiplicar ");
                        vidaAdver = vidaAdver - pokemon2.getAtaque2();
                        System.out.println("Vida do " + adversario + ":" + vidaAdver);
                        break;
                    default:
                        System.out.println(" Ataque Invalido! Perdeu o turno ");
                        break;
                }
                if (vidaAdver >= 0) {
                    switch (adversario) {
                       case "Cinderace":
                            System.out.println(" Cinderace usou Bola Incendiária");
                            vidapokemon2 = vidapokemon2 - pokemon1.getAtaque1();
                            System.out.println("Vida do Greninja:" + vidapokemon2);
                            break;
                        case "Greninja":
                            System.out.println("Greninja usou Shuriken d'água ");
                            vidapokemon2 = vidapokemon2 - pokemon2.getAtaque1();
                            System.out.println("Vida do Greninja:" + vidapokemon2);
                            break;
                        case "Sceptile":
                            System.out.println("Sceptile usou Lâmina de Folha ");
                            vidapokemon2 = vidapokemon2 - pokemon3.getAtaque1();
                            System.out.println("Vida do Greninja:" + vidapokemon2);
                            break;
                        case "Pikachu":
                            System.out.println(" Pikachu usou o Choque do Trovão ");
                            vidapokemon2 = vidapokemon2 - pokemon4.getAtaque1();
                            System.out.println("Vida do Greninja:" + vidapokemon2);
                            break;
                    }
                }
            }
            if (escolha == 3) {
                System.out.println(" ---------------------- ");
                System.out.println(" 1 - Lâmina de Folha ");
                System.out.println(" 2 - Rajada de Sementes ");
                System.out.print("Escolha o seu Ataque: ");
                escolhaAtaque = ler.nextInt();
                System.out.println(" ---------------------- ");
                switch (escolhaAtaque) {
                    case 1:
                        System.out.println("Sceptile usou Lâmina de Folha ");
                        vidaAdver = vidaAdver - pokemon3.getAtaque1();
                        System.out.println("Vida do " + adversario + ":" + vidaAdver);
                        break;
                    case 2:
                        System.out.println("Sceptile usou Rajada de Sementes ");
                        vidaAdver = vidaAdver - pokemon3.getAtaque2();
                        System.out.println("Vida do " + adversario + ":" + vidaAdver);
                        break;
                    default:
                        System.out.println(" Ataque Invalido! Perdeu o turno ");
                        break;
                }
                if (vidaAdver >= 0) {
                     switch (adversario) {
                      case "Cinderace":
                            System.out.println(" Cinderace usou Bola Incendiária");
                            vidapokemon3 = vidapokemon3 - pokemon1.getAtaque1();
                            System.out.println("Vida do Sceptile:" + vidapokemon3);
                            break;
                        case "Greninja":
                            System.out.println("Greninja usou Shuriken d'água ");
                            vidapokemon3 = vidapokemon3 - pokemon2.getAtaque1();
                            System.out.println("Vida do Sceptile:" + vidapokemon3);
                            break;
                        case "Sceptile":
                            System.out.println("Sceptile usou Lâmina de Folha ");
                            vidapokemon3 = vidapokemon3 - pokemon3.getAtaque1();
                            System.out.println("Vida do Sceptile:" + vidapokemon3);
                            break;
                        case "Pikachu":
                            System.out.println(" Pikachu usou o Choque do Trovão ");
                            vidapokemon3 = vidapokemon3 - pokemon4.getAtaque1();
                            System.out.println("Vida do Sceptile:" + vidapokemon3);
                            break;
                             default:
                    }
                }
            }

            if (escolha == 4) {
                System.out.println(" ---------------------- ");
                System.out.println(" 1 - Choque do Trovão ");
                System.out.println(" 2 - Cauda de Ferro ");
                System.out.print(" Escolha o seu Ataque: ");
                escolhaAtaque = ler.nextInt();
                System.out.println(" ---------------------- ");
                switch (escolhaAtaque) {
                    case 1:
                        System.out.println(" Pikachu usou o Choque do Trovão ");
                        vidaAdver = vidaAdver - pokemon4.getAtaque1();
                        System.out.println("Vida do " + adversario + ":" + vidaAdver);
                        break;
                    case 2:
                        System.out.println(" Pikachu usou o Cauda de Ferro ");
                        vidaAdver = vidaAdver - pokemon4.getAtaque2();
                        System.out.println("Vida do " + adversario + ":" + vidaAdver);
                        break;
                    default:
                        System.out.println(" Ataque Invalido! Perdeu o turno ");
                        break;
                }
                if (vidaAdver >= 0) {
                    switch (adversario) {
                        case "Cinderace":
                            System.out.println(" Cinderace usou Bola Incendiária");
                            vidapokemon4 = vidapokemon4 - pokemon1.getAtaque1();
                            System.out.println("Vida do Pikachu:" + vidapokemon4);
                            break;
                        case "Greninja":
                            System.out.println("Greninja usou Shuriken d'água ");
                            vidapokemon4 = vidapokemon4 - pokemon2.getAtaque1();
                            System.out.println("Vida do Pikachu:" + vidapokemon4);
                            break;
                        case "Sceptile":
                            System.out.println("Sceptile usou Lâmina de Folha ");
                            vidapokemon4 = vidapokemon4 - pokemon3.getAtaque1();
                            System.out.println("Vida do Pikachu:" + vidapokemon4);
                            break;
                        case "Pikachu":
                            System.out.println(" Pikachu usou o Choque do Trovão ");
                            vidapokemon4 = vidapokemon4 - pokemon4.getAtaque1();
                            System.out.println("Vida do Pikachu:" + vidapokemon4);
                            break;
                    }
                }
            }

        } while (vidapokemon1 > 0 && vidapokemon2 > 0 && vidaAdver > 0 && vidapokemon3 > 0 && vidapokemon4 > 0);

        if (escolha == 1 && vidaAdver <= 0 && vidapokemon1 > 0) {
            System.out.println(" ------------------ CINDERACE VENCEU !!! -------------");
             System.exit(0); 
            
        }
        if (escolha == 2 && vidaAdver <= 0 && vidapokemon2 > 0) {
            System.out.println(" ------------------ GRENINJA VENCEU !!! ----------------");
             System.exit(0); 
       }
        
        if (escolha == 3 && vidaAdver <= 0 && vidapokemon3 > 0) {
            System.out.println(" ------------------ SCEPTILE VENCEU !!! -------------------");
             System.exit(0); 
        }
        
        if (escolha == 4 && vidaAdver <= 0 && vidapokemon4 > 0) {
            System.out.println(" ------------------ PIKACHU VENCEU !!! -------------------");
             System.exit(0); 
             
        } else {
            System.out.println(" ------------ " + adversario + " Venceu --------------");
        }  
         System.exit(0); 
    }
}
