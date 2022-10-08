public class Event {
    private String EventId;
    private String EventProcess;
    private String EventDetails;
    private String EventSuggestion;
    private boolean EventCancel = false;

    public void setEventId(String eventId) {
        EventId = eventId; // this part is to get the event id
    }

    public void setEventDetails(String eventDetails) {
        EventDetails = eventDetails; // this part is to get the event details
    }

    public void setEventProcess(String eventProcess) {
        EventProcess = eventProcess; // this part is to get the event process
    }

    public String getEventId() {
        return EventId; // return the event id
    }

    public String getEventDetails() {
        return EventDetails; // return the event details
    }

    public String getEventProcess() {
        return EventProcess; // return the event process
    }

    public String getEventSuggestion() {
        return EventSuggestion; // return the event suggestion
    }

    public void setEventSuggestion(String eventSuggestion) {
        EventSuggestion = eventSuggestion; // this part is to get the event suggestion
    }
    public boolean CancelEvent() {
        EventCancel = true;
        return EventCancel; // this part is to cancel the event
    }

    public void GenerateEventid() {
            EventId = "EVT" + (int) (Math.random() * 1000);
    }

}
