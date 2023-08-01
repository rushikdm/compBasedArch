package comparch;

public class BaseInterfaceImpl implements IBaseInterface {

    private IComponent m_comp;
    public BaseInterfaceImpl(IComponent comp) {
        m_comp = comp;
    }

    @Override public IComponent getComponent() {
        return m_comp;
    }
}
