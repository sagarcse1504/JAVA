package Class8;

public class NumberTest <T extends Number>{
    private T obj;

    public NumberTest(T obj){
        this.obj = obj;
    }
    public T getObj(){
        return obj;
    }

}
