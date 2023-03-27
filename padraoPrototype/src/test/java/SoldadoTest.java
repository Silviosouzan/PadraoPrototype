import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoldadoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Soldado soldado = new Soldado(123, "Soldado Original", new Endereco("Rua A", 1), "Três Rios");

        Soldado soldadoClone = soldado.clone();
        soldadoClone.setMatricula(456);
        soldadoClone.setNome("Soldado Clonado");
        soldadoClone.getEndereco().setNumero(2);

        assertEquals("Soldado{matricula=123, nome='Soldier Original', endereco=Endereco{logradouro='Rua A', numero=1}, localNascimento='Tres Rios'}", soldado.toString());
        assertEquals("Soldado{matricula=456, nome='Soldier Clonado', endereco=Endereco{logradouro='Rua A', numero=2}, localNascimento='Tres Rios'}", soldadoClone.toString());
    }
}