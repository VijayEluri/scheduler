package scheduler;
//import java.util.concurrent.LinkedBlockingQueue;

public class RR extends SchedulingAlgo{
	private int quantum;
	
	public RR(int numberOfProcesses, int quantum){
		unlocked = true;
		this.quantum = quantum;
		this.numberOfProcesses = numberOfProcesses;
	}
	
	public void offer(Process newProcess){
		if(newProcess.burstNumber > quantum)
			newProcess.burstNumber = quantum;
		processQ.offer(newProcess);
	}

}