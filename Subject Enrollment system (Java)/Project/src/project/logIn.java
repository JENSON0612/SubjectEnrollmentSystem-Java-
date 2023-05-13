
package project;


public class logIn {
    private String SID;
    private int logInPassword;


    public logIn(){
        this("" , 65264234);
    }
    
    public logIn(String SID, int logInPassword){
        this.SID = SID;
        this.logInPassword = logInPassword;
}
    


    

//getter
public String getSID(){return SID;}
public int getLogInPassword(){return logInPassword;}

//setter
public void setSID(String SID){this.SID = SID;}
public void setLogInPassword(int logInPassword){this.logInPassword = logInPassword;}
}

