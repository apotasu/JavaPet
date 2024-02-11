import java.lang.Math;

public class Pet {
    private String NomeDono;
    private String TipoAnimal;
    private String nome;
    private int fome = (int) (Math.random() * 99 + 1);
    private int fisico = (int) (Math.random() * 99 + 1);
    private int higiene = (int) (Math.random() * 99 + 1);
    private int diversao = (int) (Math.random() * 99 + 1);
    private int moedas = 30;
    private boolean morte = false;

    public Pet() {

    }

    public String getTipoAnimal() {
        int random = (int) (Math.random() * 4 + 1);
        switch (random) {
            case 1:
                TipoAnimal = "cachorro \uD83D\uDC36";
                break;

            case 2:
                TipoAnimal = "gato \uD83D\uDC31";
                break;

            case 3:
                TipoAnimal = "hamster \uD83D\uDC39";
                break;

            case 4:
                TipoAnimal = "alien \uD83D\uDC7D";
                break;

        }
        return TipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        TipoAnimal = tipoAnimal;
    }

    public String getNome() {
        if (nome != null) {
            return nome;
        } else {
            return TipoAnimal;
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        if (fome >= 100) {
            this.fome = 100;
        } else {
            this.fome = fome;
        }
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        if (fisico >= 100) {
            this.fisico = 100;
        } else {
            this.fisico = fisico;
        }
    }

    public int getHigiene() {
        return higiene;
    }

    public void setHigiene(int higiene) {
        if (higiene >= 100) {
            this.higiene = 100;
        } else {
            this.higiene = higiene;
        }
    }

    public int getDiversao() {
        return diversao;
    }

    public void setDiversao(int diversao) {
        if (diversao >= 100) {
            this.diversao = 100;
        } else {
            this.diversao = diversao;
        }
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }

    public String getNomeDono() {
        return NomeDono;
    }

    public void setNomeDono(String nomeDono) {
        NomeDono = nomeDono;
    }

    public int status() {
        return (int) (Math.random() * 99 + 1);
    }

    public boolean getMorte() {
        return morte;
    }

    public void setMorte(boolean morte) {
        this.morte = morte;
    }

    @Override
    public String toString() {
        return
                nome + '\n' +
                        getTipoAnimal() + '\n' +
                        fisico + '\n' +
                        fome + '\n' +
                        higiene + '\n' +
                        diversao + '\n' +
                        moedas;
    }
}