package entidade;

public class Conta {

	private int numero;
	private double saldo;


    
    public Conta(int numero) {

       this.numero = numero; //this obrigatorio
       this.saldo=999; 

    }    


    public int getNumero() {

    	return this.numero;

    }

    public double getSaldo() {

    	return this.saldo;

    }


    public void creditar(double v) {

        this.saldo = this.saldo + v;

    }

    public void debitar(double v) {

    	this.saldo = this.saldo - v;

			if (this.saldo < 0) 
				this.saldo = this.saldo - 10; 

    }



}