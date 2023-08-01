import comparch.*;

public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        ITransform trans = rect.getInterfaceImpl(ITransform.class);
        trans.translate(1,2);

        IRectangle irect = rect.getInterfaceImpl(IRectangle.class);
        System.out.println("[x="+irect.getX()+", y="+irect.getY()+"]");
    }
}