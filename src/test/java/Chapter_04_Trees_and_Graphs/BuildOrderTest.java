package Chapter_04_Trees_and_Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import Chapter_04_Trees_and_Graphs.BuildOrder;
import data.util.Dependency;

class BuildOrderTest {

	@Test
	void testGetBuildOrder() {
		List<Dependency> dependencies = new ArrayList<>();
		dependencies.add(new Dependency("a", "d"));
		dependencies.add(new Dependency("f", "b"));
		dependencies.add(new Dependency("b", "d"));
		dependencies.add(new Dependency("f", "a"));
		dependencies.add(new Dependency("d", "c"));
		dependencies.add(new Dependency(null, "e"));
		var result = BuildOrder.getBuildOrder(dependencies);
		System.out.println(result);
		assertEquals(result, Arrays.asList("f", "e", "a", "b", "d", "c"));

		dependencies = new ArrayList<>();
		dependencies.add(new Dependency("Saturday", "Sunday"));
		dependencies.add(new Dependency("Friday", "Saturday"));
		dependencies.add(new Dependency("Thursday", "Friday"));
		dependencies.add(new Dependency("Wednesday", "Thursday"));
		dependencies.add(new Dependency("Tuesday", "Wednesday"));
		dependencies.add(new Dependency("Monday", "Tuesday"));
		dependencies.add(new Dependency("Tuesday", "Sunday"));
		dependencies.add(new Dependency("Friday", "Sunday"));

		result = BuildOrder.getBuildOrder(dependencies);
		System.out.println(result);
		assertEquals(result,
				Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
	}

}
