package HelperClasses;

import java.io.IOException;
import org.apache.log4j.*;

public class Logging {
    static final Logger log = Logger.getLogger(Logging.class);
    static final FileAppender fileAppender = new FileAppender();
    static final String PATTERN = "%d [%p|%c|%C{1}] %m%n"; // date, [priority, category, class name (without package name)], message, new line
    
    public static void loginLog(String userId, String userType) throws SecurityException, IOException {
        String fileDirectory = "src/Database/LogFile" + System.getProperty("file.separator") + userType + System.getProperty("file.separator") + userId + ".txt";
        
        fileAppender.setFile(fileDirectory);
        fileAppender.setLayout(new PatternLayout(PATTERN));
        fileAppender.setThreshold(Level.INFO);
        fileAppender.activateOptions();
        Logger.getRootLogger().addAppender(fileAppender);
    
        log.info(userType + "Login. (" + userType + "Id: " +userId+ ")");
    }

    public static void logoutLog(String userId, String userType) {
        String fileDirectory = "src/Database/LogFile" + System.getProperty("file.separator") + userType + System.getProperty("file.separator") + userId + ".txt";
        
        fileAppender.setFile(fileDirectory);
        fileAppender.setLayout(new PatternLayout(PATTERN));
        fileAppender.setThreshold(Level.INFO);
        fileAppender.activateOptions();
        Logger.getRootLogger().addAppender(fileAppender);
    
        log.info(userType + "Logout. (" + userType + "Id: " +userId+ ")");
    }
    
    public static void activityLog(String userId, String userType, String activityPerform) {
        String fileDirectory = "src/Database/LogFile" + System.getProperty("file.separator") + userType + System.getProperty("file.separator") + userId + ".txt";
        String activity = null;
        
        fileAppender.setFile(fileDirectory);
        fileAppender.setLayout(new PatternLayout(PATTERN));
        fileAppender.setThreshold(Level.INFO);
        fileAppender.activateOptions();
        Logger.getRootLogger().addAppender(fileAppender);
        
        switch(activityPerform){
            case "1":
                activity = " create a new vaccination appointment.";
                break;
            case "2":
                activity = " edit vaccination appointment.";
                break;
            case "3":
                activity = " delete vaccination appointment.";
                break;
            case "4":
                activity = " search vaccination appointment.";
            case "5":
                activity = " filter vaccination appointment.";
                break;
            case "6":
                activity = " add a new vaccination center.";
                break;
            case "7":
                activity = " edit vaccination center.";
                break;
            case "8":
                activity = " delete vaccination center.";
                break;
            case "9":
                activity = " search vaccination center.";
            case "10":
                activity = " filter vaccination center.";
                break;
            case "11":
                activity = " add a new vaccine supply.";
                break;
            case "12":
                activity = " search vaccine supply.";
            case "13":
                activity = " filter vaccine supply.";
                break;
            case "14":
                activity = " register new people account";
                break;
            case "15":
                activity = " edit people account";
                break;
            case "16":
                activity = " update people account";
                break;
            case "17":
                activity = " delete people account";
                break;
            case "18":
                activity = " search people account.";
                break;
            case "19":
                activity = " register new personnel account";
                break;
            case "20":
                activity = " edit personnel account";
                break;
            case "21":
                activity = " update personnel account";
                break;
            case "22":
                activity = " delete personnel account";
                break;
            case "24":
                activity = " search personnel account.";
                break;
            case "25":
                activity = " generate report in PDF.";
                break;
            case "26":
                activity = " confirm vaccination appointment.";
                break;
            case "27":
                activity = " cancel vaccination appointment.";
                break;
            case "28":
                activity = " register vaccination programme.";
                break;
            case "29":
                activity = " edit vaccination programme.";
                break;
            case "30":
                activity = " view vaccination appointment.";
                break;
            case "31":
                activity = " view personal details.";
                break;
            case "32":
                activity = " view vaccination programme.";
                break;
        }
    
        log.info(userType + activity + " (" + userType + "Id: " +userId+ ")");
    }
}
