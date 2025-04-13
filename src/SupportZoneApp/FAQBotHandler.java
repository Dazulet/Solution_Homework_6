package SupportZoneApp;

class FAQBotHandler implements SupportHandler {
    private SupportHandler next;

    @Override
    public SupportHandler setNext(SupportHandler handler) {
        this.next = handler;
        return handler;
    }

    @Override
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("(Botaniс) Problem 'password_reset' solved by bot");
        } else if (next != null) {
            System.out.println("(Botaniс) None of my business. Redirecting");
            next.handle(issue);
        } else {
            System.out.println("(Botaniс) No idea, sorry.");
        }
    }
}
