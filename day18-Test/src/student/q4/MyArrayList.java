package student.q4;

import java.util.function.Consumer;

public class MyArrayList <T>{
    private T[] array;
    private int size;
    private int position=0;

    public MyArrayList(){
        array = (T[])new Object[10];
        this.size = 10;
    }
    public MyArrayList(int size) {
        this.size = size;
        array =  (T[]) new Object[size];
    }

    public void add(T item){
        if(array.length == size){
            T[] newarray = (T[]) new Object[size*2];
            for(int i=0;i<size;i++){
                newarray[i]=array[i];
            }
            array = newarray;
        }else{
            array[position]=item;
            position++;
        }
    }

    public void remove(int index){
        if(index<0 || index>=size) {
            return;
        }else{
            for(int i=index;i< array.length-1;i++){
                array[i]=array[i+1];
            }
        }
    }

    public int size(){
        return size;
    }

    public T get(int index){
        if(index<0 || index>=size){
            return null;
        }else{
            return array[index];
        }
    }

    public void forEach(Consumer<? super T> action){
        for(int i=0;i<size;i++){
            action.accept(array[i]);
        }
    }
}
