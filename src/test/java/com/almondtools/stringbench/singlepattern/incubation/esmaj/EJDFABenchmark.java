package com.almondtools.stringbench.singlepattern.incubation.esmaj;

import java.util.List;
import java.util.function.Function;

import com.almondtools.stringbench.singlepattern.esmaj.ESMAJBenchmark;
import com.javacodegeeks.stringsearch.DFA;

public class EJDFABenchmark extends ESMAJBenchmark {

	private static final String ID = "EsmaJ DFA";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public Function<String, List<Integer>> createMatcher(String pattern) {
		DFA algorithm = DFA.compile(pattern);
		return algorithm::findAll;
	}
	

}