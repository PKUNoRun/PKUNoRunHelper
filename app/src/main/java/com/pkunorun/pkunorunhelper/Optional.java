package com.pkunorun.pkunorunhelper;

public class Optional<T> {
    T value;
    public Optional(){
        value = null;
    }
    public Optional(T v){
        value = v;
    }
    public boolean hasValue(){return !(value==null);}
    public T get(){
        if(hasValue()){
            return value;
        }else{
            throw new RuntimeException("Trying to get a null object");
        }
    }
    public T get(T d){
        if(hasValue()){
            return value;
        }else{
            return d;
        }
    }
    public void set(T v){
        value = v;
    }
    public void clear(){
        value = null;
    }
}
