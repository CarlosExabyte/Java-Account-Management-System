//=====================================================================================
public class conta {
    
    public Double saldo;
    private String nome;
    private String tipo;
    private String devedor;
    private int numerodaconta;

   public conta( Double saldo,String nome, String tipo, String devedor, int numerodaconta){
       this.saldo = saldo;
       this.nome = nome;
       this.tipo = tipo;
       this.devedor = devedor;
       this.numerodaconta = numerodaconta;
    


       
   }
   public Double getSaldo(){
    return saldo;
   }
   public String getNome(){
    return nome;
   }
   public String getTipo(){
    return tipo;
   }
   public String getDevedor(){
    return devedor;
   }
   public int getnumerodaconta(){
    return numerodaconta;
   }
   
 

   

//=====================================================================================
public boolean sacar(double valor) {
    if (valor <= 0) {
        System.out.println("Valor inválido para saque.");
        return false;
    } else if (saldo < valor) {
        System.out.println("Saldo insuficiente para realizar o saque.");
        return false;
    } else {
        saldo -= valor;
        System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        return true;
    }
}
//=====================================================================================

public void adicionar(double valor) {
    if (valor <= 0) {
        System.out.println("Valor inválido para depósito.");
    } else {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
    }
}

//=====================================================================================
    public void dados ( conta conta ){
        System.out.println("A conta pertence a " + conta.nome);
        System.out.println("O tipo da conta é " + conta.tipo);
        System.out.println("O saldo atual da conta é " + conta.saldo);
        System.out.println("Situação pública : " + conta.devedor);
        System.out.println("O numero da conta é " + conta.numerodaconta);
    
    }
//=====================================================================================

   
public String toString() {
    return String.format("Nome: %s, Tipo: %s, Saldo: %.2f, Devedor: %s, Número da Conta: %d%n",
            nome, tipo, saldo, devedor, numerodaconta);
}





    }


    
