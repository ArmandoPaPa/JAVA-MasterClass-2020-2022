package JavaMasterClass2021;

import java.util.List;

public interface ISaveable {
    public List<String> write();
    public void read(List<String> savedValues);
}
