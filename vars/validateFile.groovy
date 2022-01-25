import java.io.FilenameFilter;

def validate(){

	File dire = new File("path");

	File[] matches = dire.listFiles(new FilenameFilter(){
  	            public boolean accept(File dir, String name)
        	          {
        	             return name.startsWith("asd") && name.endsWith(".groovy");
	                  }
		           });

	 // println(matches)
	 if(matches == []) {
        
	    return false}
	  if(matches != null) {
        
	    return true }
}




def call (Map config=[:]){
    validate()
}
