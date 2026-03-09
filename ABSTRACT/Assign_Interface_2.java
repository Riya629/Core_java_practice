package home.ABSTRACT;

public class Assign_Interface_2 {
    public static void main(String[]args){

    
      Tv t= new Tv();
      t.redbutton();
      t.switchon();
      t.changechannel();
      t.switchoff();

     
    /*
     * SmartTvRemote str= new Tv();
     * str.redbutton();
     * str.switchon();
     * str.switchoff(); --> Throw an error because we use parent interface reference
     * and this method is not in parent interface
     * }
     */
   /* TvRemote tr= new Tv();
    tr.redbutton();
    tr.switchon();
    tr.changechannel();
    tr.switchoff();            This doesnot throw an error because we use child interface reference and all method are there in child interface*/
    }
}

    interface SmartTvRemote {
        void redbutton();

        void switchon();
    }

    interface TvRemote extends SmartTvRemote {
        void changechannel();

        void switchoff();
    }

class Tv implements TvRemote{
    public void redbutton(){
        System.out.println("Press red button to switch on.");
    }
    public void switchon(){
        System.out.println("switching on......");
    }
    public void changechannel(){
System.out.println("channel changing......");
    }
    public void switchoff(){
        System.out.println("switching off tv.....");
    }
    
}