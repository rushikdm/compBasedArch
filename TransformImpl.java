package comparch;

public class TransformImpl extends BaseInterfaceImpl implements ITransform {

    public TransformImpl(IComponent comp) {
        super(comp);
    }
    @Override public void translate(double dx, double dy) {
        IRectangle rect = getComponent().getInterfaceImpl(IRectangle.class);
        rect.setX(rect.getX() + dx);
        rect.setY(rect.getY() + dy);
    }
}
