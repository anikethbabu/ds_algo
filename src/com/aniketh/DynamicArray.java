package com.aniketh;

public class DynamicArray {
    private String[] data;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        data = new String[capacity];
        size = 0;
    }

    public void set(int index, String value) {
        data[index] = value;
    }

    public String get(int index) {
        return data[index];
    }

    public void insert(int index, String value) {
//        if (size >= capacity) {
//            resize();
//        }

        for (int j = size; j > index; j--) {
            data[j] = data[j - 1];
        }
        data[index] = value;
        size++;
    }
    public void delete(int index){

    }
    public boolean Contains(String value)
    {
        for(String word : data){
            if(value == word){
                return true;
            }
        }
        return false;
    }
    public boolean isEmpty(){
        for(String word : data)
        {
            if(word != null)
            {
                return false;
            }
        }
        return true;
    }

    public void resize() {
        String[] newData = new String[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            newData[i] = data[i];

        }
        data = newData;
        capacity = capacity * 2;
    }
}
