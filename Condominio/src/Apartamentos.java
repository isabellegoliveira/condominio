public class Apartamentos extends Condominio {
    private int id;

    private String andar;
    private int Nquartos;
    private String tipo;
    private String Nplaca;

    public String getNplaca() {
        return Nplaca;
    }

    public void setNplaca(String nplaca) {
        Nplaca = nplaca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public int getNquartos() {
        return Nquartos;
    }

    public void setNquartos(int nquartos) {
        Nquartos = nquartos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void Imprimir() {
        System.out.println("Id" + getId() + "\n" +
                "Numero" + getNApartamento() + "\n" +
                "Andar" + getAndar() + "\n" +
                "Nquartos" + getNquartos() + "\n" +
                "Tipo" + getTipo() + "\n" +
                "NPlaca" + getNplaca()
        );
    }
}
