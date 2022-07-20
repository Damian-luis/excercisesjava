package excercises.herencia;

public class Main {
    public static void main(String[] args){

        SmartPhone newPhone=new SmartPhone("Android",2022,"black","Samsung",120,8);
        newPhone.phoneInformation();
        SmartWatch newWatch=new SmartWatch("IOS",2021,"white",40,true,"LG");
        newWatch.watchInformation();

    }
}
