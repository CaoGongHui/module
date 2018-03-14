public class SingleDemo {
    public static void main(String[] args) {
        Single ss =Single.getS();
        Single ss1= Single.s;
    }
}
class Single{
    static Single s=new Single();

    private Single(){

    }

    public static Single getS() {
        return s;
    }
}