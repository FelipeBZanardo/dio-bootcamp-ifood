package one.dio.basecamp.oo.updowncast;

public class RodarAplicacao {

    public static void main(String[] args) {

        //criado um objeto do tipo Funcionario
        Funcionario funcionario = new Funcionario();

        //Upcasts
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Dowcast
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
