package SupportZoneApp;

class SeniorSupportHandler implements SupportHandler {
    private SupportHandler next;

    @Override
    public SupportHandler setNext(SupportHandler handler) {
        this.next = handler;
        return handler;
    }

    @Override
    public void handle(String issue) {
        if (issue.equals("account_ban") || issue.equals("data_loss")) {
            System.out.println("(Senior) It was difficult, but I managed it '" + issue + "'.");
        } else {
            System.out.println("(Senior) Even I don't know what to do with '" + issue + "'. I have to figure it out manually.");
        }
    }
}


