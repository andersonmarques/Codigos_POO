public class Principal {
    public static void main(String[] args) {
        //new criar um novo obj
        //new responsavel por guardar na memoria o obj
        //new vai fazer a referencia 'portaInterna' apontar para a nova porta
        //Tipo nomeReferencia = new Objeto();
        Porta portaQuarto = new Porta();//criando o objeto
        portaQuarto.largura = 70;
        portaQuarto.altura = 2.10f;
        portaQuarto.cor = "Verde";
        portaQuarto.material = "Madeira";
        portaQuarto.aberta = true;

        System.out.println(portaQuarto);
        System.out.println(portaQuarto.material);
        portaQuarto.correr();

        Porta portaBanheiro = new Porta();//criando o objeto
        portaBanheiro.largura = 60;
        portaBanheiro.altura = 2.10f;
        portaBanheiro.cor = "Marrom";
        portaBanheiro.material = "Plastico";
        portaBanheiro.aberta = false;
        System.out.println(portaBanheiro);
        System.out.println(portaBanheiro.material);
        portaQuarto.correr();
    }
}
