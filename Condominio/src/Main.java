public class Main {
    public static void main(String[] args) {

        Moradores morador1 = new Moradores();
        Apartamentos ap1 = new Apartamentos();
        Garagens gr1 = new Garagens();
        Portaria p = new Portaria();
        Pagamentos pag = new Pagamentos();

        System.out.println("-------Moradores--------");

        morador1.setId(1);
        morador1.setNome("Isabelle Oliveira");
        morador1.setCpf("125.180.316-42");
        morador1.setEmail("isabelleagoliveira@gmail.com");
        morador1.setTelefone("(31)99764-4035");
        morador1.Imprimir();

        System.out.println("------Apartamentos---------");

        ap1.setId(1);
        ap1.setAndar("2 Andar");
        ap1.setNquartos(2);
        ap1.setTipo("Padrão");
        ap1.setNplaca("OQZ-5024");
        ap1.Imprimir();

        System.out.println("-----Garagem--------");

        gr1.setId(1);
        gr1.setNumero(1);
        gr1.getNApartamento(104)
        gr1.Imprimir();

        System.out.println("-----Portaria--------");

        p.setId(1);
        p.setPorteiro("Pablo");
        p.setPlaca("OQZ-5024");
        p.setVisitante("Marcus");
        p.Imprimir();

        System.out.println("-----Pagamentos--------");

        pag.setId(1);
        pag.setNapartamento(104);
        pag.setValorC(200);
        pag.setMulta(0);
        pag.Imprimir();

    }

    }
