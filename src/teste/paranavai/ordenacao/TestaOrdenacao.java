package teste.paranavai.ordenacao;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

//Saída esperada
public class TestaOrdenacao {
	@Rule
	public ExpectedException excecaoEsperada = ExpectedException.none();
	
	@Test()
	public void numeroDeElementosNegativos() {
		excecaoEsperada.expect(IndexOutOfBoundsException.class);
		excecaoEsperada.expectMessage("Tamanho inválido do vetor");
		// Entrada
		int n = -1;
		int elementos[] = {};
		OrdenaVetor.sort(n, elementos);
	}
	
	
	@Test()
	public void numeroDeElementosInformadosDiferenteDoVetor() {
		excecaoEsperada.expect(IndexOutOfBoundsException.class);
		excecaoEsperada.expectMessage("Número de elementos divergente do informado");
		// Entrada
		int n = 10;
		int elementos[] = {};
		OrdenaVetor.sort(n, elementos);
	}
	
	@Test()
	public void elementosDoVetorAleatorio() {
		int n = 5;
		int elementos[] = {7,2,9,4,1};
		int saidaEsperada[] = {1,2,4,7,9};
		assertArrayEquals(saidaEsperada, OrdenaVetor.sort(n, elementos));
	}
	
	@Test()
	public void elementosDoVetorCrescente() {
		int n = 5;
		int elementos[] = {1,2,3,4,5};
		int saidaEsperada[] = {1,2,3,4,5};
		assertArrayEquals(saidaEsperada, OrdenaVetor.sort(n, elementos));
	}
	
	
	@Test()
	public void elementosDoVetorDecrescente() {
		int n = 5;
		int elementos[] = {5,4,3,2,1};
		int saidaEsperada[] = {1,2,3,4,5};
		assertArrayEquals(saidaEsperada, OrdenaVetor.sort(n, elementos));
	}
}
