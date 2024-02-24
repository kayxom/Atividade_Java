public class Carro {
    String modelo;
    double versao;
    int ano;
    String cor;
    boolean status;

    void mostrardados(){
        System.out.println("o modelo do meu carro é:"+this.modelo);
        System.out.println("o ano meu carro é:"+this.ano);
        System.out.println("a cor do meu carro é "+this.cor);
        System.out.println("a versao do meu carro é"+this.versao);
    }

    void andar(){

    }

    void buzinar(){

    }

    void ligado(){
        this.status = true;
    }

    void desligado(){
        this.status = false;
    }
}
