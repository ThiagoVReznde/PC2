public class Documento {
    private
    String titulo;
    String conteudo;

    public
    Documento(String titulo, String conteudo){
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    String get_titulo(){
        return titulo;
    }
    String get_conteudo(){
        return conteudo;
    }
}
