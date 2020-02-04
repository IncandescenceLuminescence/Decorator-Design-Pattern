package csce247.assignments.decorator;
public class Tinsel extends TreeDecorator{
	ChristmasTree tree;
	public Tinsel(ChristmasTree tree) {
		this.tree=tree;
	}
	public String toString() {
		return tree.toString()+"+ tinsel all around";
	}		
	public double getCost() {
		return tree.getCost()+2;
	}
}
