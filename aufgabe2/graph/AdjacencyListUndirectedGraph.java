package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class AdjacencyListUndirectedGraph <V> implements UndirectedGraph<V> {
	HashMap <V , HashMap<V, Double>> adjacencyList;

	@Override
	public boolean addVertex(V v) {
		if (!adjacencyList.containsKey(v)) {
			adjacencyList.put(v, null);
			return true;
		}
		return false;
	}

	@Override
	public boolean addEdge(V v, V w) {
		check(v,w);
		if(!containsEdge(v,w)){
			adjacencyList.get(v).put(w, 1.);
			adjacencyList.get(w).put(v, 1.);
			return true;	
		}
		return false;
	}

	@Override
	public boolean addEdge(V v, V w, double weight) {
		check(v,w);
		if(!containsEdge(v,w)) {
			adjacencyList.get(v).put(w, weight);
			adjacencyList.get(w).put(v, weight);
			return true;
		}
		return false;
	}

	@Override
	public boolean containsVertex(V v) {
		return adjacencyList.containsKey(v);
	}

	@Override
	public boolean containsEdge(V v, V w) {
		check(v,w);
		return adjacencyList.get(v).containsKey(w);
	}

	@Override
	public double getWeight(V v, V w) {
		check(v,w);
		if (containsEdge(v,w)) {
			return adjacencyList.get(v).get(w);
		}
		return 0;
	}

	@Override
	public int getNumberOfVertexes() {
		return adjacencyList.size();
	}

	@Override
	public int getNumberOfEdges() {
		int res = 0;
		V v;
		for() {
			
		}
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<V> getVertexList() {
		List<V> res = new LinkedList<V>();
		for(V v: adjacencyList.keySet()){
			res.add(v);
		}
		return res;
	}

	@Override
	public List getEdgeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAdjacentVertexList(V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getIncidentEdgeList(V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDegree(V v) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private void check(V v, V w) {
		if(!(adjacencyList.containsKey(v) && adjacencyList.containsKey(w))) {
			throw new IllegalArgumentException("Knoten nicht vorhanden");
		} else if (v.equals(w)) {
			throw new IllegalArgumentException("Konten sind identisch");
		}
	}

}
