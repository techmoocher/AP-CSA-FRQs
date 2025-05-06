/*
*    Created by: {techmoocher}
*    Date: Arpil 12, 2025
*/

/* Question 2 */

public class Sign {
	String message;
    int width;
    
    public Sign(String msg, int msg_width) {
        message = msg;
        width = msg_width;
    }
    
    public int numberOfLines() {
        if (message.length() == 0) {
            return 0;
        }
        if (message.length() % width == 0) {
            return message.length() / width;
        }
        return message.length() / width + 1;
    }
    
    public String getLines() {
        if (message.equals("")) {
            return null;
        }
        
        String result = "";
        int current = width;
        for (int i = 0; i < message.length(); i += width) {
            int end = (i + width > message.length()) ? message.length() : i + width;
            result += message.substring(i, end);
            if (end < message.length()) {
                result += ";";
            }
        }
        return result;
    }
}
