package com.almondtools.stringbench.singlepattern.incubation.esmaj;

import com.almondtools.stringbench.singlepattern.SinglePatternMatcherBenchmark;
import com.almondtools.stringbench.singlepattern.SinglePatternMatcherBenchmarkTest;

public class EJBNDMBenchmarkTest extends SinglePatternMatcherBenchmarkTest {

	protected SinglePatternMatcherBenchmark getBenchmark() {
		return new EJBNDMBenchmark();
	}
}