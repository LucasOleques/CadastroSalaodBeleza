import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AgendamentoTest {

    private Cliente cliente;
    private Servico servico;
    private String data;
    private String horario;
    Agendamento agendamento = new Agendamento(cliente,servico,data,horario);

    @Test
    public void testCliente(){
        assertTrue(agendamento.isValidClienteNameEmpty(agendamento.getNomecliente()));
    }
    @Test
    public void testServico(){
        assertTrue(agendamento.isValidClienteNameEmpty(agendamento.getNomecliente()));
    }
    @Test
    public void testData(){
        assertTrue(agendamento.isValidClienteNameEmpty(agendamento.getNomecliente()));
    }
    @Test
    public void testHorario(){
        assertTrue(agendamento.isValidClienteNameEmpty(agendamento.getNomecliente()));
    }
}