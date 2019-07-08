public class Test{
    public static void main(String[] args) {
        Director director = new Director();
        director.SetPictureBuilder(new TriangleBuilder("hello"));
        director.Operation();

        director.SetPictureBuilder(new RectangleBuilder("world"));
        director.Operation();
    }
}