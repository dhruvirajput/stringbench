package com.almondtools.stringbench.singlepattern.esmaj;

import java.util.List;
import java.util.function.Function;

import com.javacodegeeks.stringsearch.QS;

public class EJQSBenchmark extends ESMAJBenchmark {

	private static final String ID = "EsmaJ QuickSearch";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public Function<String, List<Integer>> createMatcher(String pattern) {
		QS algorithm = QS.compile(pattern);
		return algorithm::findAll;
	}
	

}