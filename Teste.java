public class Teste {
    private static final int _2000 = 2000;

    public static void main(String[] args) {

        ContaCorrente conta=new ContaCorrente();

        conta.setSaldo(100);
        conta.deposita(1100);
        conta.saca(1500);
        

        System.out.println("Saldo: "+conta.getSaldo());
        System.out.println("Limite utilizado : "+conta.getLimite());

    



        
    }

    
}
