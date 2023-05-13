
    package project;
    import java.util.Scanner;

    public class ProjectApp {
             

        public static void main(String[] args) {
            subjectEnrollment subjectC = new subjectEnrollment(21,0,0,0,0,0);
            System.out.println("Welcome to JMCW Subject Enrollment");
            System.out.println("");
            System.out.println("Please choose to log in or register");
            System.out.println("1: Log in to an existing account");
            System.out.println("2: Register a new account");
            Scanner option1 = new Scanner(System.in);
            logIn SID = new logIn("" , 0);
            registerAccount SID2 = new registerAccount("", 0, 0);
            int option11 = option1.nextInt();

            switch(option11){
                case 1 -> { 
                            System.out.println("Student ID: ");
                            SID.setSID(option1.next());
                            System.out.println("Password: ");
                            SID.setLogInPassword(option1.nextInt());
                            while(SID.getLogInPassword() != 65264234){
                                System.out.println("Wrong password");
                                System.out.println("Enter again your password: ");
                                SID.setLogInPassword(option1.nextInt());
                            }
                            break;
                          }
                case 2 -> {
                            System.out.println("Student ID: ");
                            SID2.setUserName(option1.next());
                            System.out.println("Please enter your password");
                            SID2.setLogInPassword2(option1.nextInt());
                            System.out.println("Re-enter your password");
                            SID2.setLogInPassword3(option1.nextInt());
                            while(SID2.getLogInPassword2() != SID2.getLogInPassword3()){
                                System.out.println("Your password is not the same");
                                System.out.println("Please enter again your password: ");
                                SID2.setLogInPassword2(option1.nextInt());
                                System.out.println("Re-enter your password: ");
                                SID2.setLogInPassword3(option1.nextInt());
                            }
                            break;

            }
        }
            while(true){
            System.out.println("Welcome" + SID2.getUserName());
            System.out.println("");
            System.out.println("Choose the function that you prefer: ");
            System.out.println("1. Enroll subject");
            System.out.println("2. Add Subject");
            System.out.println("3. Drop Subject");
            System.out.println("4. View Subject Enrollment");
            System.out.println("5. Exit The Enroll System");
            Scanner option2 = new Scanner(System.in);
            int option22 = option2.nextInt();
            int chooseSubject =0;



            switch(option22){
                case 1: while(chooseSubject <= 5){
                       System.out.println("");
                       System.out.println("Please choose the subject to enroll");
                       System.out.println("1. Web-based System");
                       System.out.println("2. Introduction To Programming");
                       System.out.println("3. Advanced Java");
                       System.out.println("4. Calculus");
                       System.out.println("5. Operating System");
                       System.out.println("6. Exit Subject Enrollment");
                       Scanner choice = new Scanner(System.in);
                       chooseSubject = choice.nextInt();




                       switch(chooseSubject){
                           case 1:
                                  if(chooseSubject ==1){
                                  subjectC.setWBS(1);
                                  break;
                                  }


                           case 2:
                                  if(chooseSubject == 2){
                                  subjectC.setITP(1);
                                  break;
                                  }
                           case 3:
                                  if(chooseSubject == 3){
                                  subjectC.setAJ(1);
                                  break;
                                  }
                           case 4:
                                  if(chooseSubject == 4){
                                  subjectC.setCC(1);
                                  break;
                                  }
                           case 5:
                                  break;
                           case 6:
                                  break;
                           default:
                                  break;
                                  }
                       }
                       break;

                case 2:
                       System.out.println("The subject that you have enroll");
                       if(subjectC.getWBS() == 0){
                           System.out.println("1. Web-based System");
                       }if(subjectC.getITP() == 0){
                           System.out.println("2. Introduction To Programming");
                       }if (subjectC.getAJ() == 0){
                           System.out.println("3. Advanced Java");
                       }if(subjectC.getCC() == 0){
                           System.out.println("4. Calculus");
                       }if(subjectC.getOS() == 0){
                           System.out.println("5. Operating System");
                       }else{
                           System.out.print("");
                           System.out.println("6. Exit Add Subject");
                       }
                       System.out.println("");
                       System.out.println("Please choose the subject to add");
                       Scanner addSubject = new Scanner(System.in);
                       int addChoice = addSubject.nextInt();
                       
                       switch(addChoice){
                           case 1: 
                                  subjectC.setWBS(1);
                                  break;
                           case 2: 
                                  subjectC.setITP(1);
                                  break;
                           case 3:
                                  subjectC.setAJ(1);
                                  break;
                           case 4: 
                                  subjectC.setCC(1);
                                  break;
                           case 5: 
                                  subjectC.setOS(1);
                                  break;
                           case 6:
                                  break;
                           default:
                                  break;
                       }

                       break;
                
                case 3:
                       System.out.println("These are the subjects that you have enroll");
                       System.out.println("");
                       if(subjectC.getWBS() == 1){
                           System.out.println("1. Web-based System");
                       }if(subjectC.getITP() == 1){
                           System.out.println("2. Introduction To Programming");
                       }if(subjectC.getAJ() == 1){
                           System.out.println("3. Advanced Java");
                       }if(subjectC.getCC() == 1){
                           System.out.println("4. Calculus");
                       }if(subjectC.getOS() == 1){
                           System.out.println("5. Operating System");
                       }else{
                           System.out.println("");
                           System.out.println("6. Exit Drop System");
                       }
                       Scanner input2 = new Scanner(System.in);
                       int dropSubject = input2.nextInt();
                       switch(dropSubject){
                           case 1:
                                  subjectC.setWBS(0);
                                  break;
                           case 2: 
                                  subjectC.setITP(0);
                                  break;
                           case 3: 
                                  subjectC.setAJ(0);
                                  break;
                           case 4: 
                                  subjectC.setCC(0);
                                  break;
                           case 5:
                                  subjectC.setOS(0);
                                  break;
                           case 6:
                                  break;
                           default:
                                  break;
                       }
                       break;
                case 4:
                       System.out.println("These are the subjects that you have enroll");
                       System.out.println("");
                       if(subjectC.getWBS() == 1){
                           System.out.println("Web-based System");
                       }if(subjectC.getITP() == 1){
                           System.out.println("Introduction To Programming");
                       }if(subjectC.getAJ() == 1){
                           System.out.println("Advanced Java");
                       }if(subjectC.getCC() == 1){
                           System.out.println("Calculus");
                       }if(subjectC.getOS() == 1){
                           System.out.println("Operating System");
                       }else{
                           System.out.println("");
                       }
                       System.out.println("1. Exit View System");
                       Scanner input3 = new Scanner(System.in);
                       int viewSubject = input3.nextInt();
                       if(viewSubject == 1){
                           break;
                       }
                       break;
                case 5:
                       System.exit(0);
                default:
                       System.exit(0);

            }

    }
        }
    }
