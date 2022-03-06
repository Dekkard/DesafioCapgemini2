package questoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Questao2 {
	// Sem parâmetro, leitura de console
	public static Integer numberDiff() {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			return numberDiff(bf.readLine().split(" |,"));
		} catch (IOException e) {
			return null;
		}
	}

	// Parâmetro String, para ser transformada em array, sendo a ultima posição o número a ser comparado
	public static Integer numberDiff(String inputString) {
		return numberDiff(inputString.split(" |,"));
	}

	// Parâmtro de Array String, para ser convertida em lista de integrais, sendo a ultima posição o número a ser comparado
	public static Integer numberDiff(String[] inputString) {
		List<Integer> numList = Arrays.stream(inputString)
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		return numberDiff(numList, numList.get(numList.size() - 1), numList.size() - 1);
	}

	//Parâmetro String e mais uma Integral, para ser transformada em array
	public static Integer numberDiff(String inputString, Integer numDiff) {
		return numberDiff(inputString.split(" |,"), numDiff);
	}
	
	// Parâmtro de Array String e mais uma Integral, para ser convertida em lista de integrais
	public static Integer numberDiff(String[] inputString, Integer numDiff) {
		List<Integer> numList = Arrays.stream(inputString)
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		return numberDiff(numList, numDiff, numList.size());
	}
	
	// Calculo da difenrença, retornando o contador de pares
	private static Integer numberDiff(List<Integer> numList, Integer numDiff, int size) {
		Integer numPairDiff = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (Math.abs(numList.get(i) - numList.get(j)) == numDiff)
					numPairDiff++;
			}
		}
		return numPairDiff;
	}

	@Test
	void test() {
		Assertions.assertEquals(3, numberDiff(new String[] { "1", "5", "3", "4", "2", "2" }));
		Assertions.assertEquals(3, numberDiff(new String[] { "1", "5", "3", "4", "2" }, 2));
		Assertions.assertEquals(3, numberDiff("1 5 3 4 2 2"));
		Assertions.assertEquals(3, numberDiff("1 5 3 4 2", 2));
		
		Assertions.assertEquals(3, numberDiff("4 8 7 3 5 4 6 4"));
		Assertions.assertEquals(3, numberDiff("4 8 7 3 5 4 6", 4));
	}
}
