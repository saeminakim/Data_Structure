package section2;

import java.util.Scanner;

public class Scheduler {
	
	public Event[] events = new Event[100];
	public int n = 0;
	private Scanner kb;

	public void processCommand() {
		kb = new Scanner(System.in);
		while(true) {
			System.out.println("$ ");
			String command = kb.next();
			if(command.equals("addevent")) {
				String type = kb.next();
				if(type.equalsIgnoreCase("oneday")) {
					handleAddOneDayEvent();
				} else if (type.equalsIgnoreCase("duration")) {
					handleAddDurationEvent();
				} else if (type.equalsIgnoreCase("deadline")) {
					handleAddDeadlinedEvent();
				} 
			}
			else if(command.equals("list")) {

			}
			else if(command.equals("show")) {

			}
			else if(command.equals("exit")) {
				break;
			}
		}
		kb.close();
	}

	private void handleAddDeadlinedEvent() {
		
	}

	private void handleAddDurationEvent() {
		
	}

	private void handleAddOneDayEvent() {
		System.out.print(" when : ");
		String dateString = kb.next();
		System.out.print(" title : ");
		String title = kb.next();
		
		MyDate date = parseDateString(dateString);
				
		OneDayEvent ev = new OneDayEvent(title, date);
		
		System.out.println(ev.toString());
		events[n++] = ev;
	}

	private MyDate parseDateString(String dateString) {
		String[] tokens = dateString.split("/");
		
		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		
		MyDate d = new MyDate(year, month, day);
		
		return d;
	}

	public static void main(String[] args) {
		Scheduler app = new Scheduler();
		app.processCommand();
	}

}
