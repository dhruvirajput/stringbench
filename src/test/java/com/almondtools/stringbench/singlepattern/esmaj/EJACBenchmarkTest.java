package com.almondtools.stringbench.singlepattern.esmaj;

import com.almondtools.stringbench.singlepattern.SinglePatternMatcherBenchmark;
import com.almondtools.stringbench.singlepattern.SinglePatternMatcherBenchmarkTest;

public class EJACBenchmarkTest extends SinglePatternMatcherBenchmarkTest {

	protected SinglePatternMatcherBenchmark getBenchmark() {
		return new EJACBenchmark();
	}
}