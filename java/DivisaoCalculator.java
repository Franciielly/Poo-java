public class DivisaoCalculator {
    private int n1;
    private int n2;
     
    public DivisaoCalculator (int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public DivisaoCalculator () {

    }
    public float Dividir (int n1, int n2) {
        if (n2==0) {
            throw new ArithmeticException("Erro: não é possível dividir um número por zero");
        }
        return n1/n2;
    }

}
