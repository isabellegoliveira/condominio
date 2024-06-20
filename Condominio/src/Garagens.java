public class Garagens extends Condominio{
    private int id;
    private int numero;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



    public void Imprimir() {
        System.out.println("Id" + getId() + "\n" +
                "Numero" + getNumero() + "\n" +
                "Apartamento" + getNApartamento()
        );

    }
}
