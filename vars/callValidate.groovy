// validates that dependencies exist in a project, otherwise stops the build

def validateDependencies{
    
    // call validate file to validated if dependencies file exist
    if (validateFile()){
        println("File fond Continue to build Stage")
    }
    
    
    // call validate file to validated if dependencies exist inside setup
    else{ 
        
        if(validateWord()){
        
            println("Continue to build Stage")
        }
        
        else
        {
            println("Need Dependencies to Continue to build Stage")
        }
    }
      

def call (Map config=[:]){
    validateDependencies()
}
