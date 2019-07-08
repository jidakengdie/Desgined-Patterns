abstract class PictureBuilder{
    protected String opt;
    PictureBuilder(String opt){
        this.opt = opt;
    }
    public abstract void Drawing();
    public abstract void Color();
}

class RectangleBuilder extends PictureBuilder{
    RectangleBuilder(String opt){
        super(opt);
    }
    public void Drawing(){
        System.out.println("Rectangle Drawing" + opt);
    }
    public void Color(){
        System.out.println("Rectangle Color");
    }
}

class TriangleBuilder extends PictureBuilder{
    TriangleBuilder(String opt){
        super(opt);
    }
    public void Drawing(){
        System.out.println("Triangle Drawing" + opt);
    }
    public void Color(){
        System.out.println("Triangle Color");
    }
}

class Director{
    private PictureBuilder pictureBuilder;
    public void SetPictureBuilder(PictureBuilder pictureBuilder){
        this.pictureBuilder = pictureBuilder;
    }
    public void Operation(){
        pictureBuilder.Drawing();
        pictureBuilder.Color();
    }
}