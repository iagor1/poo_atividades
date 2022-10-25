public class App
{
    public static void main(String []args)
    {
      MeuLivro ml = new MeuLivro();
      ml.setTitulo("Senhor dos Anéis");
        System.out.println(ml.getTitulo());
    }

    
}
final class MeuLivro extends Livro {
    @Override
    void setTitulo(String s) {
        this.titulo = s;
    }
}

abstract class Livro{
    String titulo;

    abstract void setTitulo(String s);

    String getTitulo(){
            return titulo;
    }
}