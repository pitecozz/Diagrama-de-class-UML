public class Diagrama {
    // Interface para o Reprodutor Musical
public interface ReprodutorMusical {
    void tocarMusica();
    void pausarMusica();
    void avancarFaixa();
    void retrocederFaixa();
}

// Interface para o Aparelho Telefônico
public interface AparelhoTelefonico {
    void fazerLigacao(String numero);
    void receberLigacao(String numero);
    void enviarMensagem(String destinatario, String mensagem);
    void receberMensagem(String remetente, String mensagem);
}

// Interface para o Navegador na Internet
public interface NavegadorInternet {
    void abrirURL(String url);
    void fecharURL();
    void navegarParaFrente();
    void navegarParaTras();
}

// Classe principal que representa o iPhone
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementações das interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet

        @Override
            public void tocarMusica() {
        // Implementação
        }

        @Override
            public void pausarMusica() {
        // Implementação
        }

        @Override
            public void avancarFaixa() {
                
        // Implementação
        }

        @Override
            public void retrocederFaixa() {
        // Implementação
        }

        @Override
            public void fazerLigacao(String numero) {
        // Implementação
        }

        @Override
            public void receberLigacao(String numero) {
        // Implementação
        }

        @Override
            public void enviarMensagem(String destinatario, String mensagem) {
        // Implementação
        }

        @Override
            public void receberMensagem(String remetente, String mensagem) {
        // Implementação
        }

        @Override
            public void abrirURL(String url) {
        // Implementação
        }

        @Override
            public void fecharURL() {
        // Implementação
        }

        @Override
            public void navegarParaFrente() {
        // Implementação
        }

        @Override
            public void navegarParaTras() {
        // Implementação
        }
    }
}