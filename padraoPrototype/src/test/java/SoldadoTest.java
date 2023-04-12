import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SoldadoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Soldado soldado = new Soldado(123, "Soldado Original", new Endereco("Rua A", 1), "Três Rios");

        Soldado soldadoClone = (Soldado) soldado.clone();
        soldadoClone.setMatricula(456);
        soldadoClone.setNome("Soldado Clonado");
        soldadoClone.getEndereco().setNumero(2);

        assertEquals("Soldado{matricula=123, nome='Soldado Original', endereco=Endereco{logradouro='Rua A', numero=1}, localNascimento='Três Rios'}", soldado.toString());
        assertEquals("Soldado{matricula=456, nome='Soldado Clonado', endereco=Endereco{logradouro='Rua A', numero=2}, localNascimento='Três Rios'}", soldadoClone.toString());
    }
}
