package OOPS;


public class box{
    int h;
    int l;
    int w;
    box(int h,int l,int w){
        this.h=h;
        this.l=l;
        this.w = w;
    }
//    box(){
//        this.h=-1;
//        this.l=-1;
//        this.w = -1;
//    }
    box(box other){
        this.h=other.h;
        this.l=other.l;
        this.w = other.w;
    }
}

