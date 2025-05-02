/*
*    Created by: {techmoocher}
*    Date: May 2, 2025
*/

/* Question 2 */

public class SystemLog {
    private ArrayList<LogMessage> messageList;
    
    // There are instance variables, methods, constructors that are not shown
    public ArrayList<LogMessage> removeMessages(String keyword) {
        ArrayList<LogMessage> removedMessages = new ArrayList<LogMessage>();
        for (int i = messageList.size() - 1; i >= 0; i--) {
            if (messageList.get(i).containsWord(keyword)) {
                removedMessages.add(messageList.get(i));
                messageList.remove(i);
            }
        }
        return removedMessages;
    }
}
