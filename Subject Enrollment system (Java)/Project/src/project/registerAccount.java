
package project;


public class registerAccount {
    private String newUserName;
    private int logInPassword2;
    private int logInPassword3;
    
    
    public registerAccount(){
        this("",0 , 0);
    }
    
    public registerAccount(String newUserName, int logInPassword2, int logInPassword3){
        this.newUserName = newUserName;
        this.logInPassword2 = logInPassword2;
        this.logInPassword3 = logInPassword3;
    }
   
    
    //getter
    public String getUserName(){return newUserName;}
    public int getLogInPassword2(){return logInPassword2;}
    public int getLogInPassword3(){return logInPassword3;}
    
    //setter
    public void setUserName(String userName){this.newUserName = userName;}
    public void setLogInPassword2(int logInPassword2){this.logInPassword2 = logInPassword2;}
    public void setLogInPassword3(int logInPassword3){this.logInPassword3 = logInPassword3;}
}
