package com.almondtools.stringbench.singlepattern.stringsearchalgorithms;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import net.amygdalum.stringsearchalgorithms.search.Horspool;
import net.amygdalum.stringsearchalgorithms.search.StringSearchAlgorithm;

@State(Scope.Thread)
public class SCHorspoolBenchmark extends StringSearchAlgorithmsBenchmark {

	private static final String ID = "Strings and Chars Horspool";

	@Override
	public String getId() {
		return ID;
	}
	
	@Override
	public StringSearchAlgorithm create(String pattern) {
		return new Horspool(pattern);
	}

}
