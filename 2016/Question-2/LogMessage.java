/*
*    Created by: {techmoocher}
*    Date: May 2, 2025
*/

/* Question 2 */

public class LogMessage {
    private String machineId;
    private String description;
    
    public LogMessage(String message) {
        int separator = message.indexOf(":");
        machineId = message.substring(0, separator);
        description = message.substring(separator + 1);
    }
    
    public boolean containsWord(String keyword) {
        if (description.indexOf(keyword) == -1 || keyword.length() > description.length()) {
            return false;
        }
        if (description.equals(keyword)) {
            return true;
        }
        if (description.indexOf(" " + keyword + " ") != -1) {
            return true;
        }
        if (description.indexOf(keyword + " ") == 0) {
            return true;
        }
        if (description.length() > keyword.length() && description.substring(description.length() - keyword.length() - 1).equals(" " + keyword)) {
            return true;
        }
        return false;
    }
    
    public String getMachineId() {
        return machineId;
    }
    public String getDescription() {
        return description;
    }
}
