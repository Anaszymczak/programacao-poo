/**
 * Documento de texto com título e conteúdo.
 */


public class DocumentoTexto implements Imprimivel {
    private String titulo;
    private String conteudo;



 public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

public void imprimir() {
        System.out.println(titulo.toUpperCase());
        System.out.println(conteudo);
    }
}
