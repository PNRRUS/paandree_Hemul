package Lab6;

public class Reporter {

    public Reporter() {
    }

    public void report(Report s) {
        System.out.println("My current report: " + s.getReport(s.x));
    }
}
