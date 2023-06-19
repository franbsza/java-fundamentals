package generics;

public class BasicGeneric<T> {
    private T data;

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }
}
