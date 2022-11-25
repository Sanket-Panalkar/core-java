class Google
{
 public static String assistent(String command)
 {
	 System.out.println("assistent method is invoked");
	 if(command == "Hey Google")
	 {
		 System.out.println("Hello there, How can I help you?");
		 return " ";
	 }
	 if(command == "play a song")
	 {
		 System.out.println("Playing song");
		 return " ";
	 }
	 if(command == "tell me a joke")
	 {
		 System.out.println("What do You call a rose that wants to go to the moon?.............Gulab ja moon");
		 return" ";
	 }
	 else
	 {
		 System.out.println("this is not in data");
		 return "";
	 }
	 
	  
	 
 }

}