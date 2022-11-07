package one.dio.basecamp;

public class Mensagem {

    public static void obterMensagem (int hora){

        if (hora >= 5 && hora < 12){
            mensagemBomDia(hora);
        } else if (hora > 12 && hora < 18) {
            mensagemBoaTarde(hora);
        }else {
            mensagemBoaNoite(hora);
        }
    }

    public static void mensagemBomDia(int hora){
        System.out.println("Bom dia, são " + hora + "horas");
    }

    public static void mensagemBoaTarde(int hora){
        System.out.println("Boa tarde, são " + hora + "horas");
    }

    public static void mensagemBoaNoite(int hora){
        System.out.println("Boa noite, são " + hora + "horas");
    }
}
