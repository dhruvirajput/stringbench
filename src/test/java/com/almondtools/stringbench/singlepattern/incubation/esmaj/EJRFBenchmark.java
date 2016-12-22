package com.almondtools.stringbench.singlepattern.incubation.esmaj;

import java.util.List;
import java.util.function.Function;

import com.almondtools.stringbench.singlepattern.esmaj.ESMAJBenchmark;
import com.javacodegeeks.stringsearch.RF;

public class EJRFBenchmark extends ESMAJBenchmark {

	private static final String ID = "EsmaJ Reverse Factor";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public Function<String, List<Integer>> createMatcher(String pattern) {
		RF algorithm = RF.compile(pattern);
		return algorithm::findAll;
	}
	

}