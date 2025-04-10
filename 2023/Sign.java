public class Sign {
	String message;
    int width;
    
    public Class(String msg, int msg_width) {
        message = msg;
        width = msg_width;
    }
    
    public int numberOfLines() {
        if (message.length() % width == 0) {
            return message.length() / width;
        }
        return message.length() / width + 1;
    }
}
