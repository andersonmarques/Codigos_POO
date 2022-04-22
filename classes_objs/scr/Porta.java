public class Porta {
    //atributos (características)
    float altura;
    float largura;
    String cor;
    String material;
    boolean aberta;//status

    //metodos (funcionalidades)
    public void abrir(){        
        System.out.println("Abrindo a porta.");
        aberta = true;
    }
    public void fechar(){
        System.out.println("Fechando a porta.");
        aberta = false;
    }
    public void correr(){
        if(aberta){
            System.out.println("Porta coorendo.");
            fechar();            
        }else{
            System.out.println("Porta coorendo.");
            abrir();
        }
    }
}
