class Canvas{
    List<Points> [] points=new List<Points>;
    public Canvas(List<Points> points){
        this.points=points;
    }
    for(int i=0;i<20;i++){
        points[i]=i;
    }
    public List<Points> addPoint(int point){
        points.length++;
        points[length]=point;
        return points;
    }
}