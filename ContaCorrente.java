public class ContaCorrente{
   //3 atributos -> numero,saldo,status
    private int numero;
    private double saldo;
    private boolean status;
   //status true estou no cheque especial
   //status false estou com a conta no azul
    private double limite;
    

     public void saca(double valor){
        if(valor > saldo && limite < 2000){
            status=true;
            limite+=saldo-valor;
        }
        else{
            status=false;
        }
        saldo=saldo-valor;
        
    }

    public void deposita(double valor){
        saldo+=valor;
        //saldo=saldo+valor
    }
    
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
        
    }
  

}