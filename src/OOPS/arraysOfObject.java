package OOPS;
class subject{
    private String  subID;
    private String Name;
    private int maxMArks;
    private int marksObtain;
    public String getSubID(){return subID;}

    public String getName(){return Name;}

    public int getMaxMArks(){return maxMArks;}

    public int getMarksObtain(){return marksObtain;}

  public void setMaxMarks(int MAXmarks){maxMArks = MAXmarks;}

  public void setMarksObtain(int marks){marksObtain= marks;}

  public subject(String id, String name,int marksObtain){
       this.subID  = id;
      this.Name  = name;
      this.marksObtain = marksObtain;
  }
  boolean isQualified(){
        return marksObtain>= maxMArks/10*4;
  }
  public String toString(){
        return "\n Subject ID:"+subID+"\n Name:"+Name+" \nMarks Obtained:"+marksObtain;
  }

}

public class arraysOfObject {
    public static void main( String[] args ) {
subject [] subs = new subject[3];
subs[0]= new subject( "21cse004","dataStructure", 100 );
subs[1]= new subject( "21cse005","algo", 100 );
subs[2]= new subject( "21cse006","os", 100 );
for(int i =0;i< subs.length;i++){
    System.out.println(subs[i]);
}

    }
}
