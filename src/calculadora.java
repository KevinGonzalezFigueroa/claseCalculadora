public class calculadora{
    int numero1;
    int numero2;
    
    public calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public calculadora(int numero1){
        this.numero1 = numero1;
    }

    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int division(int numero1, int numero2) {
        return numero1 / numero2;
    }

    public int valorAbsoluto(int numero1) {
        return Math.abs(numero1);
    }

    public double elevaNumero(int numero1, int numero2) {
        return Math.pow(numero1, numero2);
    }

    public boolean EsPositivo(int numero1){
        if(numero1 < 0){
            return false;
        }else{
            return true;
        }
    }
}