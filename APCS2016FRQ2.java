public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message) {
        String[] messArray = message.split(":");
        machineId = messArray[0];
        description = messArray[1];
    }

    public boolean containsWord(String keyword) {
        String[] descriptArray = description.split(" ");
        for(int i = 0; i < descriptArray.length; i++) {
            if(descriptArray[i].equals(keyword)) {
                return true;
            }
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

public class SystemLog {
    /*
     *   
     *     */
    private List<LogMessage> messageList;
    private List<int> toBeRemovedList;

    public List<LogMessage> removeMessages(String keyword) {
        List<LogMessage> returnmessage = new List<LogMessage>();
        for(int i = 0; i < messageList.size(); i++) {
            if(messageList.get(i).containsWord(keyword)) {
                returnMessage.add(messageList.get(i));
                toBeRemovedList.add(i);
                // messageList.remove(i); <-- XXXXXXX
                //       }
                //           }
                //               // Immutability : 
                //                   // NEVER CHANGE WHAT YOU'RE ITERATING
                //                            
                //                                for(int i = 0; i < toBeRemovedList.size(); i++) {
                //                                      messageList.remove(toBeRemovedList.get(i));
                //                                          }
                //                                             return returnMessage; 
                //                                               }
                //                                               }
                //
