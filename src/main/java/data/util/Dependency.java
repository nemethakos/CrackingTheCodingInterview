package data.util;

public class Dependency {
	public String getProject() {
		return project;
	}

	public String getDependentOn() {
		return dependentOn;
	}

	private String project;
	private String dependentOn;

	public Dependency(String dependentOn, String project) {
		this.project = project;
		this.dependentOn = dependentOn;
	}

	@Override
	public String toString() {
		return String.format("" + project + "->" + dependentOn);
	}
}