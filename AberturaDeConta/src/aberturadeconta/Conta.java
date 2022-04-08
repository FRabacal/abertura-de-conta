package aberturadeconta;

public final class Conta {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
      
    public void statusConta (){
        System.out.println("----------------------------");
        System.out.println("Dono: " + this.getDono());
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    
    public Conta() {
        this.setSaldo(0.0f);
        this.setStatus(false);
    }
            
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        //this.tipo = tipo;
        this.setStatus(true);
        //this.status = true;
        if (tipo == "CC" ){
            this.setSaldo(50);
        } else if (tipo == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso! Seu saldo é: " + this.getSaldo());
    }
    public void fecharConta(){
        if (this.getSaldo() == 0){
        this.status = false;
        System.out.println("Sua conta foi fechada!");
        } else if (this.getSaldo() > 0){
        System.out.println("ERRO - Conta com saldo");
        } else {
        System.out.println("ERRO - Conta em débito");    
        }
    }
    public void depositar(float d){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()+ d);
            System.out.println("Deposito realizado! Seu saldo é: " + this.getSaldo());
        } else {
            System.out.println("ERRO - Necessario ter conta aberta");
        }
    }
    public void sacar(float s){
        if (this.getStatus()){
            if(this.getSaldo()>=s){
            this.setSaldo(this.getSaldo() - s);
            System.out.println("Saque realizado! Seu saldo é: " + this.getSaldo() );
        } else {
            System.out.println("ERRO - Saldo insuficiente");
            // conta fechada
        }
        } else {
            System.out.println("ERRO - Conta fechada");
        }     
    }
    public void pagarMensal(float cobranca){  
        if (this.getTipo() == "CC"){
            cobranca = 12;
        } else if (this.getTipo() == "CP"){
            cobranca=20;
        }
        if (this.getStatus()){
            if (this.saldo> cobranca){
                this.setSaldo(this.getSaldo() - cobranca);
                System.out.println("Pagamento de mensalidade feito!");
            } else {
                System.out.println("Saldo insuficiente");
            }  
        } else {
            System.out.println("Conta fechada");
        }
    
}
}        