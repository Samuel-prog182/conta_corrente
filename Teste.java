public class Teste {
    public static void main(String[] args) {

        ContaCorrente conta=new ContaCorrente();
        conta.deposita(1100);
        conta.setSaldo(100);

        System.out.println("Saldo: "+conta.getSaldo());

        
    }

    
}
