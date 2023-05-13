
package project;


public class subjectEnrollment {
    private int creditHour;
    private int WBS;
    private int ITP;
    private int AJ;
    private int CC;
    private int OS;
    
    
    public subjectEnrollment(){
        this(21,0,0,0,0,0);
    }
    
    public subjectEnrollment(int creditHour, int WBS, int ITP, int AJ, int CC, int OS){ 
        this.creditHour = creditHour;
        this.WBS = WBS;
        this.ITP = ITP;
        this.AJ = AJ;
        this.CC = CC;
        this.OS = OS;
    }
        //getter
        public int getCreditHour(){return creditHour;}
        public int getWBS(){return WBS;}
        public int getITP(){return ITP;}
        public int getAJ(){return AJ;}
        public int getCC(){return CC;}
        public int getOS(){return OS;}
        
        //setter
        public void setCreditHour(int creditHour){this.creditHour = creditHour;}
        public void setWBS(int WBS){this.WBS = WBS;}
        public void setITP(int ITP){this.ITP = ITP;}
        public void setAJ(int AJ){this.AJ = AJ;}
        public void setCC(int CC){this.CC = CC;}
        public void setOS(int OS){this.OS = OS;}
        
        
    }

