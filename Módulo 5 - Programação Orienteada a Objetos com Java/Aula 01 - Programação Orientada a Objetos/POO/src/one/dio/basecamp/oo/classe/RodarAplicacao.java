package one.dio.basecamp.oo.classe;

public class RodarAplicacao {
    public static void main(String[] args) {

        //criando um objeto
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Fusca");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println("R$ " + carro1.EncherTanque(5.49));

        Carro carro2 = new Carro("cinza","Kombi",60);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println("R$ " + carro2.EncherTanque(5.49));
    }
}
