package comparch;

public class Rectangle extends BaseComponent {

    public Rectangle() {
        IRectangle rect = new RectangleImpl(this);
        super.setInterfaceImpl(IRectangle.class, rect);
        ITransform trans = new TransformImpl(this);
        super.setInterfaceImpl(ITransform.class, trans);
    }
}
