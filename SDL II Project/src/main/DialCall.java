package main;

/* Cloudvox - place an outgoing call with Java
Place and receive phone calls via open API: http://cloudvox.com/
Learn about call scripting, Asterisk/AGI, voice apps: http://help.cloudvox.com/ */
import java.io.IOException;
 
// Sample outgoing call
public class DialCall {

  public static final String CONTEXT = "OUTGOING_CONTEXT";
 
  public String call = "2065551234";
 
  public void run() throws IOException {
    OriginateAction originateAction = new OriginateAction();
   

    /* Format the call for dialing
       Channel example: Local/12065551234@outgoing-42 */
    originateAction.setChannel("Local/" + call + "@" + CONTEXT);
 
    
    originateAction.setApplication("Swift");
    originateAction.setData("\"I'm calling from Cloudvox to wish you a very happy birthday. This message could say anything, interact with the caller, play sounds, MP3s, voices, connect them to another call, or do pretty much anything your heart desires.\"");
 
    // Caller ID as a Cloudvox number
    originateAction.setCallerId("2063576220");
    originateAction.setTimeout(new Long(30000));
 
  
 
   
 
 
  }
 
  public static void main(String[] args) throws Exception {
    DialCall callout = new DialCall();
    callout.run();
  }
}