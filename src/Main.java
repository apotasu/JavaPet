import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    static Scanner scn = new Scanner(System.in);
    static Pet pet = new Pet();
    static Atividades atividades = new Atividades();

    public static void main(String[] args) throws IOException {
        boolean opcao = true;
        System.out.println("Javagatchi~\n---MENU---\n1.Começar\n2.Importar Save\n3.Exportar Save\n4.Sair");
        switch (scn.nextInt()) {
            case 1:
                ComecoJogo();
                break;
            case 2:
                importFile();
                break;
            case 3:
                exportFile();
                break;
            case 4:
                break;
        }
        while (opcao) {
            MenuJogo();
            if (estaMorto()) {
                break;
            }
            if (estaFalido()) {
                break;
            }
            System.out.println("Voltar ao menu do jogo? (Y/N)");
            scn.nextLine();
            if (Objects.equals(scn.nextLine(), "n")) {
                opcao = false;
            }
            exportFile();
        }
    }

    static void ComecoJogo() {
        System.out.println("Qual seu nome?");
        scn.nextLine();
        pet.setNomeDono(scn.nextLine());
        System.out.println("Em uma noite fatídica, você, " + pet.getNomeDono() + ", escuta sua campainha tocar... \nQuando abre sua porta, você se depara com uma caixa, dentro dela você encontra o que seria seu futuro melhor amigo...\nUm ovo!~");
        System.out.println("\nO ovo se choca e vira um: " + pet.getTipoAnimal() + "!\nGostaria de dar um nome a ele? Y/N");
        if (Objects.equals(scn.nextLine(), "y")) {
            System.out.println("Qual nome você gostaria de dar para seu javapet?");
            pet.setNome(scn.nextLine());
            System.out.println("O nome dele será " + pet.getNome());
        } else {
            System.out.println("O nome dele será " + pet.getNome());
        }
    }

    static void MenuJogo() {
        System.out.println("\n---Ações---\n1.Ver status do " + pet.getNome() + "\n2.Atividades\n3.Voltar ao menu");
        switch (scn.nextInt()) {
            case 1:
                System.out.println("\n---Status---\nNome: " + pet.getNome() + "\nFisico: " + pet.getFisico() + "/100\nAlimentação: " + pet.getFome() + "/100\nHigiene: " + pet.getHigiene() + "/100\nDiversao: " + pet.getDiversao() + "/100\nMoedas: " + pet.getMoedas());
                break;
            case 2:
                Atividades();
                break;
            case 3:
                break;
        }
    }

    static void Atividades() {
        System.out.println("\n---Atividades---\n1.Restaurante\n2.Academia\n3.Banheiro\n4.Arcade\n5.Trabalhos");
        switch (scn.nextInt()) {
            case 1:
                Atividades.restaurante();
                break;
            case 2:
                Atividades.academia();
                break;
            case 3:
                Atividades.banheiro();
                break;
            case 4:
                Atividades.arcade();
                break;
            case 5:
                Atividades.trabalhos();
                break;

        }
    }

    static void importFile() throws IOException {
        String nomeFile = "feo.txt";
        File arquivo = new File(nomeFile);
        scn = new Scanner(arquivo);
        while (scn.hasNextLine()) {

        }
    }

    public static void exportFile() {
        try {
            FileWriter arquivo = new FileWriter(pet.getNomeDono() + ".txt");
            arquivo.write(pet.toString());
            arquivo.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
    }

    public static void status(int f) throws IOException {
        FileReader fileReader = new FileReader("feo.txt");
        BufferedReader buffReader = new BufferedReader(fileReader);
        while (buffReader.ready()) {
            System.out.println(
                    buffReader.readLine());
        }
    }

    public static boolean estaMorto() {
        if (pet.getFisico() <= 0 || pet.getDiversao() <= 0 || pet.getFome() <= 0 || pet.getHigiene() <= 0) {
            System.out.println("\n---1 ano depois---\nEm um dia nublado e chuvoso, você se encontra sentado em sua cama lembrando de seu melhor amigo...\nAs memorias que vocês fizeram juntos são inesquecíveis...\nVocê se questiona se vale a pena continuar sem ele...\n" + pet.getNome() + " Morreu!\nFim de jogo!");
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaFalido() {
        if (pet.getMoedas() <= 0) {
            System.out.println("Você faliu");
            return true;
        } else {
            return false;
        }
    }
}