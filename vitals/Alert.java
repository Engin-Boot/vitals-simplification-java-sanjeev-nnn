package vitals;

public abstract class Alert
    { 
        static String msg = "";
        abstract void sendAlert(String msg);
    }
 class AlertbySound extends Alert
    {
        void sendAlert(String msg) {
            System.out.println("Alerting via Sound: " + msg + "\n");
        }

    }
 class AlertbySMS extends Alert
    {   
        void sendAlert(String msg) {
           System.out.println("Alerting via SMS: " + msg + "\n");
        }

    }