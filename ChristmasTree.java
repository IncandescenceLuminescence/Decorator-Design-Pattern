package csce247.assignments.decorator;
public abstract class ChristmasTree {
	protected String description;
	public String toString() {
		return description;
	}
	public abstract double getCost();
}
