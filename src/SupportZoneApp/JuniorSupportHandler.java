package SupportZoneApp;

class JuniorSupportHandler implements SupportHandler {
    private SupportHandler next;

    @Override
    public SupportHandler setNext(SupportHandler handler) {
        this.next = handler;
        return handler;
    }

    @Override
    public void handle(String issue) {
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            System.out.println("(Junior) Hooray! I know how to solve it. '" + issue + "'!");
        } else if (next != null) {
            System.out.println("(Junior) Can I pass it on to the elder??");
            next.handle(issue);
        } else {
            System.out.println("(Junior) They didn't teach this.");
        }
    }
}

