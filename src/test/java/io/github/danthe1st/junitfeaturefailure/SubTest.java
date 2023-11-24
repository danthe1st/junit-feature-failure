package io.github.danthe1st.junitfeaturefailure;

import org.junit.jupiter.api.Disabled;

class SubTest extends SuperTest {
	@Override
	@Disabled
	public void test() throws Exception {
	}
}
