package SupportZoneApp;

interface SupportHandler {
    SupportHandler setNext(SupportHandler handler);
    void handle(String issue);
}
