package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    public Type method1(Type type) {
        if (type.equals(null))
            return null;
        else
            return type;
    }

    public Type method2(Type type1, Type type2) {
        if (type1.equals(type2))
            return type1;
        else return null;
    }
}
