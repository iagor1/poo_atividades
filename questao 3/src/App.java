public class App {
    public static void main(String[] args) throws Exception {
        Carro bora = new Carro();
        bora.setModelo("Bora");
        bora.setMarca("Volkswagen");
        bora.setAno("2000");

    }
        public static class Carro{
            public String modelo;
            public String marca;
            public String ano;
            
            public void setModelo(String modelo){ this.modelo = modelo; } 
            public void setMarca(String marca) { this.marca = marca; }
            public void setAno(String ano) { this.ano = ano; }
        }
}
