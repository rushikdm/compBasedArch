package comparch;

public interface IComponent {

    public <T extends IBaseInterface> T getInterfaceImpl(Class<T> cls);
    public <T extends IBaseInterface> void setInterfaceImpl(Class<T> cls, T impl);
}
