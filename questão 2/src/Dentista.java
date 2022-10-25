public class Dentista {
    // atributos 
        private String nome;
        private String sobrenome;
        private String especialidade;
        private String cro;
        private boolean ativo;
    // Construtor 
    public Dentista(String nome, String sobrenome, String especialidade, String cro, boolean ativo ){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.especialidade = especialidade;
        this.cro = cro;
        this.ativo = ativo;
    }

    // setters
       public void setNome(String nome){ this.nome = nome; } 
       public void setSobrenome(String sobrenome){ this.sobrenome = sobrenome; }
       public void setEspecialidade(String especialidade){ this.especialidade = especialidade; }
       public void setCro(String cro){ this.cro = cro; }
       public void setAtivo(boolean ativo){ this.ativo = true; }
       public void setDesativo(boolean ativo){ this.ativo = false; }

    // gets
    public String getCRO(){
        System.out.println("CRO: " + this.cro);
        return this.cro;    
    }
    public String getNome(){
        System.out.println("Nome: " + this.nome);
        return this.nome;
    }
    public String getSobrenome(){
        System.out.println("Sobrenome: " + this.sobrenome);
        return this.sobrenome;
    }
    public String getEspecialidade(){
        System.out.println("Especialidade: " + this.especialidade);
        return this.especialidade;
    }
    public boolean getAtivo(){
        System.out.println("Ativo: " + this.ativo);
        return this.ativo;
    }
    public boolean getDesativo(){
        System.out.println("Desativo: " + this.ativo);
        return this.ativo;
    }

    // metodos
    public void Atender(Paciente p){
        System.out.println("Atendendo paciente: " + p.getNome() + " "+ p.getSobrenome());
    }

    public void MarcarConsulta(Paciente p){
        System.out.println("Marcando consulta com paciente " + p.getNome() + " "+ p.getSobrenome());
    }

    public void RemarcarConsulta(Paciente p){
        System.out.println("Remarcando consulta com paciente " + p.getNome() + " "+ p.getSobrenome());
    }

    public void CancelarConsulta(Paciente p){
        System.out.println("Cancelando consulta com paciente " + p.getNome() + " "+ p.getSobrenome());
    }
}

