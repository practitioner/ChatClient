/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package instantmessenger;

 class ChatMessage{
        String message;
        boolean messageFromUser;
        
        public ChatMessage(){};
        public ChatMessage(String msg, Boolean type){
            message = msg;
            messageFromUser = type;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public void setMessageFromUser(boolean messageFromUser) {
            this.messageFromUser = messageFromUser;
        }

        public String getMessage() {
            return message;
        }

        public boolean isMessageFromUser() {
            return messageFromUser;
        }
        
        
        
        
       
        
    }

/**
 *
 * @author manasi
 */
public class InstantMessenger {
    

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
