package section4;

public abstract class Event implements Comparable {
	public String title;
	
	public Event(String title) {
		this.title = title;
	}
	
	public abstract boolean isRelevant(MyDate date);
	public abstract MyDate getRepresentativeDate();
	
	public int compareTo(Object other) {
		MyDate myDate = getRepresentativeDate();
		MyDate yourDate = ((Event) other).getRepresentativeDate();
		
		return myDate.compareTo(yourDate);
	}
}
