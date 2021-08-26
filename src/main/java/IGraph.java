import java.util.ArrayList;

public interface IGraph {

    int GetSize();
    String ToJson();
    ArrayList<Short> GetNeighbours(short i);
    boolean IsJoined(final int i, final int j);
}
