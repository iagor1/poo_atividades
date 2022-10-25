
import java.util.*;

class Pessoa
{
    private String nome;
    private int idade;
   
    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
   
    public void showInfo()
    {
        System.out.printf(nome, idade);
        System.out.println(idade);
    }
}

class Programador extends Pessoa
{
private String linguagem;
   
    public Programador(String nome, int idade, String linguagem)
    {
        super(nome, idade);
        this.linguagem = linguagem;
    }
   
    public void showInfo()
    {
        super.showInfo();
        System.out.println(linguagem);
    }
}

public class App
{
    public static void main(String []args){
        Scanner scann = new Scanner(System.in);
   
        Pessoa a = new Programador(scann.nextLine(), Integer.valueOf(scann.nextLine()), scann.nextLine());
               
        a.showInfo();
        scann.close();
    }
}