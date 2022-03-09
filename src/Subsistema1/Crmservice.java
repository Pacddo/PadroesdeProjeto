package Subsistema1;



public class Crmservice {
    private Crmservice() {
     super();
    }
    public static void gravarCliente(String nome, String cep, String cidade){
        System.out.println("Client salvo no sistema");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);

    }
}
