public class Paciente {
    private String id;
    private String nome;
    private String sobrenome;
    private String idade;
    private String sexo;
    private String telefone;
    private String endereco;

    public Paciente(String id, String nome, String sobrenome, String idade, String sexo, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    //setters
    public void setIdade(String idade) {this.idade = idade;}
    public void setNome(String nome){ this.nome = nome; } 
    public void setSobrenome(String sobrenome){ this.sobrenome = sobrenome; }
    public void setSexo(String sexo){ this.sexo = sexo; }
    public void setTelefone(String telefone){ this.telefone = telefone; }
    public void setEndereco(String endereco){ this.endereco = endereco; }
    public void setId(String id){ this.id = id; }
    
    //getters
    public String getId(){
        System.out.println("id: " + this.id);
        return this.id;    
    }
    public String getNome(){
        System.out.println("Nome: " + this.nome);
        return this.nome;
    }
    public String getSobrenome(){
        System.out.println("Sobrenome: " + this.sobrenome);
        return this.sobrenome;
    }
    public String getIdade(){
        System.out.println("Idade: " + this.idade);
        return this.idade;
    }
    public String getSexo(){
        System.out.println("Sexo: " + this.sexo);
        return this.sexo;
    }
    public String getTelefone(){
        System.out.println("Telefone: " + this.telefone);
        return this.telefone;
    }
    public String getEndereco(){
        System.out.println("Endereco: " + this.endereco);
        return this.endereco;
    }
    // metodos
    public void Consultar(Dentista d){
        System.out.println("Consulta com dentista " + d.getNome() + " "+ d.getSobrenome());
    }
    public void MarcarConsulta(Dentista d){
        System.out.println("Marcando Consulta com dentista " + d.getNome() + " "+ d.getSobrenome());
    }

    public void RemarcarConsulta(Dentista d){
        System.out.println("Remarcando Consulta com dentista " + d.getNome() + " "+ d.getSobrenome());
    }

    public void CancelarConsulta(Dentista d){
        System.out.println("Cancelando Consulta com dentista " + d.getNome() + " "+ d.getSobrenome());
    }

}
