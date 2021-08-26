import java.util.ArrayList;

public class Graph implements IGraph {
    private final ArrayList<ArrayList<Boolean>> _adjacency_matrix;

    public Graph(ArrayList<ArrayList<Boolean>> _adjacency_matrix) {
        this._adjacency_matrix = _adjacency_matrix;
    }

    @Override
    public int GetSize() {
        return _adjacency_matrix.size();
    }

    @Override
    public String ToJson() {
        return null;
    }

    @Override
    public ArrayList<Short> GetNeighbours(final short i) {
        return null;
    }

    @Override
    public boolean IsJoined(final int i, final int j){
        return  _adjacency_matrix.get(i).get(j);
    }
}
