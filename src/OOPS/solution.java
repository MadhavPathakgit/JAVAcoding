package OOPS;

 class boxWeightImpl extends box {
    double weight;
    boxWeightImpl(box other){
        super(other);
//        this.weight= other.weight;
    }
    boxWeightImpl(int h, int l, int w, double weight){
        super(h,l,w);
        this.weight = weight;
    }

    }


