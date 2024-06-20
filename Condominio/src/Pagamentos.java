public class Pagamentos {
     private int id;
     private double ValorC;
     private double taxaExtra;
     private double multa;
     private int Napartamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorC() {
        return ValorC;
    }

    public void setValorC(double valorC) {
        ValorC = valorC;
    }

    public double getTaxaExtra() {
        return taxaExtra;
    }

    public void setTaxaExtra(double taxaExtra) {
        this.taxaExtra = taxaExtra;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public int getNapartamento() {
        return Napartamento;
    }

    public void setNapartamento(int napartamento) {
        Napartamento = napartamento;
        }
    public void Imprimir() {
        System.out.println("Id" + getId() + "\n" +
                "Napartamento" + getNapartamento() + "\n" +
                "Valor Condominio" + getValorC() + "\n" +
                "Taxa Extra" + getTaxaExtra()+"\n" +
                "Multa" + getMulta()
        );
    }
}
