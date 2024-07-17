public class Iphone {
    
    public static void main(String[] args) {
        
        String numero = "14991038089";
        String musica = "Thunderstruck";
        String url = "www.dio.com.br";
        
        AparelhoTelefonico telefone  = new AparelhoTelefonico();
        telefone.ligar(numero);
        telefone.atender();
        telefone.iniciarCorreioVoz();

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica(musica);

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina(url);
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
