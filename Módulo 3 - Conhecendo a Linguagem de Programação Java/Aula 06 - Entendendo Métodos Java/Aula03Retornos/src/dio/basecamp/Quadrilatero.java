package dio.basecamp;

public class Quadrilatero {

    public static double calculaArea(double lado){
        return (lado*lado);
    }

    public static double calculaArea(double ladoMaior, double ladoMenor){
        return (ladoMaior*ladoMenor);
    }

    public static double calculaArea(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * (altura/2));
    }
}
