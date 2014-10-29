package my.graph.componenets.utils;

public class DFSNode extends Node {
	
	private int arrivalTime;
	
	private int departureTime;

	public DFSNode(int data, Node previous, Node next) {
		super(data, previous, next);
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	
	
}
