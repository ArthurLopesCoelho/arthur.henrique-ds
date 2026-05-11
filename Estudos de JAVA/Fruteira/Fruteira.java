public class Fruteira{
    public static void main(String[] args){
        frutas banana = new frutas();
        banana.color = "amarela";
        banana.nome = "banana";
        banana.nome_science = "Musa spp.";
        banana.quantidade = 12;
        banana.textura = "macia";

    System.out.println("Temos "+banana.quantidade+" "+banana.nome+" da cor "+banana.color+" e tem como nome cientifico de "+banana.nome_science+" com uma textura "+banana.textura);
    }
}

