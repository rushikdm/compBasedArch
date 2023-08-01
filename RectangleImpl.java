package comparch;

public class RectangleImpl extends BaseInterfaceImpl implements IRectangle {

    private Rectangle m_rect;
    private double m_x;
    private double m_y;

    public RectangleImpl(IComponent comp) {
        super(comp);
    }

    public double getX() {
        return m_x;
    }

    public double getY() {
        return m_y;
    }

    @Override public void setX(double x) {
        m_x = x;
    }

    @Override public void setY(double y) {
        m_y = y;
    }
}
