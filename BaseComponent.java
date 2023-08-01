package comparch;

import java.util.HashMap;
import java.util.Map;

public class BaseComponent implements IComponent {

    private Map<Class<? extends IBaseInterface>, IBaseInterface> m_map;

    public BaseComponent() {
        m_map = new HashMap<>();
    }

    @Override public <T extends IBaseInterface> T getInterfaceImpl(Class<T> cls) {
        return (T)m_map.get(cls);
    }

    @Override public <T extends IBaseInterface> void setInterfaceImpl(Class<T> cls, T impl) {
        m_map.put(cls, impl);
    }
}
