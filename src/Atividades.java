public class Atividades {

    static void restaurante() {
        System.out.println("Restaurante\n1.Salada - $5\n2.Carne - $10\n3.Frango frito - $20");
        switch (Main.scn.nextInt()) {
            case 1:

                Main.pet.setMoedas(Main.pet.getMoedas() - 5);
                Main.pet.setFome(Main.pet.getFome() + 15);
                Main.pet.setFisico(Main.pet.getFisico() - 5);
                System.out.println("Seu javapet comeu a salada e ganhou +15 de alimentação!\nAlimentação: " + Main.pet.getFome() + "/100\nFisico: " + Main.pet.getFisico() + "/100\nMoedas: " + Main.pet.getMoedas());
                break;
            case 2:
                if (limit()) {
                    break;
                }

                Main.pet.setMoedas(Main.pet.getMoedas() - 15);
                Main.pet.setFome(Main.pet.getFome() + 20);
                Main.pet.setFisico(Main.pet.getFisico() - 10);
                System.out.println("Seu javapet comeu a carne e ganhou +20 de alimentação!\nAlimentação: " + Main.pet.getFome() + "/100\nFisico: " + Main.pet.getFisico() + "/100\nMoedas: " + Main.pet.getMoedas());
                break;
            case 3:
                if (limit()) {
                    break;
                }
                Main.pet.setMoedas(Main.pet.getMoedas() - 30);
                Main.pet.setFome(Main.pet.getFome() + 30);
                Main.pet.setFisico(Main.pet.getFisico() - 20);
                System.out.println("Seu javapet comeu a pizza e ganhou +30 de alimentação!\nAlimentação: " + Main.pet.getFome() + "/100\nFisico: " + Main.pet.getFisico() + "/100\nMoedas: " + Main.pet.getMoedas());
                break;
        }
    }

    static void academia() {
        System.out.println("Academia\n1.Caminhada - $0\n2.Esteira - $10\n3.Levantar peso - $25");
        switch (Main.scn.nextInt()) {
            case 1:
                if (limit()) {
                    break;
                }
                Main.pet.setHigiene(Main.pet.getHigiene() - 10);
                Main.pet.setFome(Main.pet.getFome() - 5);
                Main.pet.setFisico(Main.pet.getFisico() + 20);
                System.out.println("Seu javapet fez uma caminhada e aumentou seu fisico em +20!\nFisico: " + Main.pet.getFisico() + "/100\nFome: " + Main.pet.getFisico() + "/100\nHigiene: " + Main.pet.getHigiene() + "/100\nMoedas: " + Main.pet.getMoedas());
                break;
            case 2:
                if (limit()) {
                    break;
                }
                Main.pet.setMoedas(Main.pet.getMoedas() - 10);
                Main.pet.setHigiene(Main.pet.getHigiene() - 15);
                Main.pet.setFome(Main.pet.getFome() - 10);
                Main.pet.setFisico(Main.pet.getFisico() + 25);
                System.out.println("Seu javapet andou na esteira e aumentou seu fisico em +25!\nFisico: " + Main.pet.getFisico() + "/100\nFome: " + Main.pet.getFisico() + "/100\nHigiene: " + Main.pet.getHigiene() + "/100\nMoedas: " + Main.pet.getMoedas());
                break;
            case 3:
                if (limit()) {
                    break;
                }
                Main.pet.setMoedas(Main.pet.getMoedas() - 25);
                Main.pet.setHigiene(Main.pet.getHigiene() - 20);
                Main.pet.setFome(Main.pet.getFome() - 15);
                Main.pet.setFisico(Main.pet.getFisico() + 30);
                System.out.println("Seu javapet levantou peso e aumentou seu fisico em +30!\nFisico: " + Main.pet.getFisico() + "/100\nFome: " + Main.pet.getFisico() + "/100\nHigiene: " + Main.pet.getHigiene() + "/100\nMoedas: " + Main.pet.getMoedas());
                break;
        }

    }

    static void banheiro() {
        System.out.println("Banheiro\n1.Lavar as mãos\n2.Escovar os dentes\n3.Tomar banho");
        switch (Main.scn.nextInt()) {
            case 1:
                if (limit()) {
                    break;
                }
                Main.pet.setHigiene(Main.pet.getHigiene() + 10);
                System.out.println("Seu javapet lavou as mãos e melhorou sua higiene em +10!\nHigiene: " + Main.pet.getHigiene());
                break;
            case 2:
                if (limit()) {
                    break;
                }
                Main.pet.setHigiene(Main.pet.getHigiene() + 25);
                System.out.println("Seu javapet escovou seus dentes e melhorou sua higiene em +25!\nHigiene: " + Main.pet.getHigiene());
                break;
            case 3:
                if (limit()) {
                    break;
                }
                Main.pet.setHigiene(Main.pet.getHigiene() + 30);
                System.out.println("Seu javapet tomou banho e melhorou sua higiene em +30!\nHigiene: " + Main.pet.getHigiene());
                break;
        }

    }

    static void arcade() {
        System.out.println("Arcade\n1.Jogo de corrida - $5\n2.Jogo de luta - $15\n3.Jogo de tiro - $30");
        switch (Main.scn.nextInt()) {
            case 1:
                if (limit()) {
                    break;
                }
                int JogoCorrida = (int) (Math.random() * 100 + 1);
                if (JogoCorrida <= 65) {
                    Main.pet.setMoedas(Main.pet.getMoedas() - 5);
                    Main.pet.setFome(Main.pet.getFome() - 5);
                    Main.pet.setFisico(Main.pet.getDiversao() + 20);
                    System.out.println("Seu javapet venceu o jogo de corrida e ganhou +20 de diversão!\nDiversão: " + Main.pet.getDiversao() + "\nAlimentação: " + Main.pet.getFome() + "/100\nMoedas: " + Main.pet.getMoedas());
                    break;
                } else {
                    Main.pet.setMoedas(Main.pet.getMoedas() - 5);
                    Main.pet.setFome(Main.pet.getFome() - 10);
                    Main.pet.setFisico(Main.pet.getDiversao() + 10);
                    System.out.println("Seu javapet perdeu o jogo de corrida e ganhou +10 de diversão!\nDiversão: " + Main.pet.getDiversao() + "\nAlimentação: " + Main.pet.getFome() + "/100\nMoedas: " + Main.pet.getMoedas());
                    break;
                }
            case 2:
                if (limit()) {
                    break;
                }
                int JogoLuta = (int) (Math.random() * 100 + 1);
                if (JogoLuta <= 50) {
                    Main.pet.setMoedas(Main.pet.getMoedas() - 15);
                    Main.pet.setFome(Main.pet.getFome() - 15);
                    Main.pet.setFisico(Main.pet.getDiversao() + 35);
                    System.out.println("Seu javapet venceu o jogo de luta e ganhou +35 de diversão!\nDiversão: " + Main.pet.getDiversao() + "\nAlimentação: " + Main.pet.getFome() + "/100\nMoedas: " + Main.pet.getMoedas());
                    break;
                } else {
                    Main.pet.setMoedas(Main.pet.getMoedas() - 15);
                    Main.pet.setFome(Main.pet.getFome() - 20);
                    Main.pet.setFisico(Main.pet.getDiversao() + 25);
                    System.out.println("Seu javapet perdeu o jogo de luta e ganhou +25 de diversão!\nDiversão: " + Main.pet.getDiversao() + "\nAlimentação: " + Main.pet.getFome() + "/100\nMoedas: " + Main.pet.getMoedas());
                    break;
                }

            case 3:
                if (limit()) {
                    break;
                }
                int JogoTiro = (int) (Math.random() * 100 + 1);
                if (JogoTiro <= 35) {
                    Main.pet.setMoedas(Main.pet.getMoedas() - 30);
                    Main.pet.setFome(Main.pet.getFome() - 20);
                    Main.pet.setFisico(Main.pet.getDiversao() + 50);
                    System.out.println("Seu javapet venceu o jogo de tiro e ganhou +50 de diversão!\nDiversão: " + Main.pet.getDiversao() + "\nAlimentação: " + Main.pet.getFome() + "/100\nMoedas: " + Main.pet.getMoedas());
                    break;
                } else {

                    Main.pet.setMoedas(Main.pet.getMoedas() - 30);
                    Main.pet.setFome(Main.pet.getFome() - 30);
                    Main.pet.setFisico(Main.pet.getFisico() + 40);
                    System.out.println("Seu javapet perdeu o jogo de tiro e ganhou +30 de diversão!\nDiversão: " + Main.pet.getDiversao() + "\nAlimentação: " + Main.pet.getFome() + "/100\nMoedas: " + Main.pet.getMoedas());
                    break;
                }

        }

    }

    static void trabalhos() {
        System.out.println("Trabalhos\n1.Restaurante\n2.Academia\n3.Arcade");
        switch (Main.scn.nextInt()) {
            case 1:
                Main.pet.setDiversao(Main.pet.getDiversao()-5);
                Main.pet.setMoedas(Main.pet.getMoedas() + 5);
                System.out.println("Seu javapet trabalhou no restaurante e ganhou 5 moedas!\nDiversão: "+Main.pet.getDiversao()+ "/100\nMoedas:" + Main.pet.getMoedas());
                break;
            case 2:
                Main.pet.setDiversao(Main.pet.getDiversao()-10);
                Main.pet.setMoedas(Main.pet.getMoedas() + 10);
                System.out.println("Seu javapet trabalhou na academia e ganhou 10 moedas!\nDiversão: "+Main.pet.getDiversao()+"/100\nMoedas:" + Main.pet.getMoedas());
                break;
            case 3:
                Main.pet.setDiversao(Main.pet.getDiversao()-15);
                Main.pet.setMoedas(Main.pet.getMoedas() + 15);
                System.out.println("Seu javapet trabalhou no arcade e ganhou 15 moedas!\nDiversão: "+Main.pet.getDiversao()+"/100\nMoedas:" + Main.pet.getMoedas());
                break;
        }
    }

    public static boolean limit() {
        if (Main.pet.getFome() >= 100 || Main.pet.getDiversao() >= 100 || Main.pet.getHigiene() >= 100 || Main.pet.getFisico() >= 100) {
            System.out.println("Seu atributo já está maximizado");
            return true;
        }
        return false;
    }
}