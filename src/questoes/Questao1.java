package questoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Questao1 {
	public Integer median(String inputString){
		return median(inputString.split(" |,"));
	}
	public Integer median(String[] inputString){
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		try {
			String[] inputArray;
			if(inputString.length == 0)
				inputArray = bf.readLine().split(" |,");
			else if(inputString.length == 1)
				inputArray = inputString[0].split(" |,");
			else 
				inputArray = inputString;
			List<Integer> numList = Arrays.stream(inputArray)
				.map(Integer::parseInt)
				.sorted((d1, d2) -> d1 > d2 ? 1 : (d1 == d2 ? 0 : -1))
				.collect(Collectors.toList());
		return numList.get((numList.size() / 2));
		} catch (IOException | NumberFormatException e) {
			return null;
		}
	}
	@Test
	void test() {
		Assertions.assertEquals(4, median(new String[] { "9", "2", "1", "4", "6" }));
		Assertions.assertEquals(4, median(new String[] { "9 2 1 4 6" }));
		Assertions.assertEquals(4, median(new String[] { "9,2,1,4,6" }));
		Assertions.assertEquals(4, median("9 2 1 4 6"));
		Assertions.assertEquals(8, median("9 10 1 4 5 14 8"));
	}
}
