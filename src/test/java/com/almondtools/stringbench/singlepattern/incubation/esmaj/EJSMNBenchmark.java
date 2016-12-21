package com.almondtools.stringbench.singlepattern.incubation.esmaj;

import java.util.List;
import java.util.function.Function;

import com.almondtools.stringbench.singlepattern.esmaj.ESMAJBenchmark;
import com.javacodegeeks.stringsearch.CLS;

public class EJSMNBenchmark extends ESMAJBenchmark {

	private static final String ID = "EsmaJ Simon";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public Function<String, List<Integer>> createMatcher(String pattern) {
		CLS algorithm = CLS.compile(pattern);
		return algorithm::findAll;
	}
	

}