
public class Main {
    public static void main(String[] args) {
        CalendarEvent calendarEvent = new CalendarEvent();

        User user1 = new User("Karunya");
        User user2 = new User("Harshini");
        User user3 = new User("Nivethitha");

        calendarEvent.registerObserver(user1);
        calendarEvent.registerObserver(user2);
        calendarEvent.registerObserver(user3);

        calendarEvent.addEvent("Movie plan at 8 PM");
        calendarEvent.addEvent("Bus Stop at 5PM");

        calendarEvent.removeObserver(user2);
        System.out.println("--Harshini removed--");
        
        System.out.println("--new event added--");
       calendarEvent.addEvent("Friend meet up at 6 PM");
    }
}
