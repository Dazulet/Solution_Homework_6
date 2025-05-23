package SupportZoneApp;

public class SupportZoneApp {
    public static void main(String[] args) {
        SupportHandler faq = new FAQBotHandler();
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();

        faq.setNext(junior).setNext(senior);

        String[] issues = {
                "password_reset", "refund_request", "account_ban", "unknown_bug"
        };

        for (String issue : issues) {
            System.out.println("\n New request: " + issue);
            faq.handle(issue);
        }
    }
}
