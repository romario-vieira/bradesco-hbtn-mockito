import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    
    @Mock
    private ServicoMatematico servicoMatematicoMock;
    
    @InjectMocks
    private Calculadora calculadora;
    
    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }
    
    @Test
    void testSomar() {
        when(servicoMatematicoMock.somar(2, 3)).thenReturn(5);
        
        int resultado = calculadora.somar(2, 3);
        
        assertEquals(5, resultado);
        
        verify(servicoMatematicoMock).somar(2, 3);
    }
}
