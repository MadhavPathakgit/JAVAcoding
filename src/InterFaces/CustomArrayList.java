package InterFaces;

import java.util.Arrays;

public class CustomArrayList <T> {
    private Object [] data;
    private int defaultSize = 10;
    private int size;

    public CustomArrayList() {
        this.data = new Object[ defaultSize ];
    }
    public void add(int num){
        if ( isFull() ){
            resize();
        }
        data[size++]= num;

    }
    private void resize() {
         Object[] temp = new Object[data.length*2];

         for(int i = 0;i< data.length;i++){
             temp[i]= data[i];
         }
         data = temp;
    }
    private boolean isFull(){
       return  size == data.length;

    }
    public T remove(){
        T value = (T)data[--size];
        return value;

    }
    public int size(){
        return size;
    }
    public T getIndex(int index ){
        return (T)data[index];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString( data ) +
                ", defaultSize=" + defaultSize +
                ", size=" + size +
                '}';
    }

    public static void main( String[] args ) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(5);
        list.add(5);
        System.out.println(list);
        System.out.println(list.getIndex( 5 ));
    }

}
