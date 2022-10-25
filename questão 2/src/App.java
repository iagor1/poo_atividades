

public class App {
    public static void main(String[] args) throws Exception {
        
        Paciente paciente = new Paciente("1548541","joao","rosa","25","masculino","58465","rua 1");
        Dentista dentista = new Dentista("pedro","rosa","dente","58465",true);
        paciente.MarcarConsulta(dentista);
        paciente.Consultar(dentista);
        paciente.CancelarConsulta(dentista);
        paciente.RemarcarConsulta(dentista);
        dentista.Atender(paciente);
        dentista.MarcarConsulta(paciente);
        dentista.RemarcarConsulta(paciente);
        dentista.CancelarConsulta(paciente);

    }

    
}
