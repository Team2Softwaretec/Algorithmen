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
		return adjacencyList.values().size() / 2;
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
	public List<Edge<V>> getEdgeList() {
		List<Edge<V>> res = new LinkedList<Edge<V>>();
		for (V v : adjacencyList.keySet()) {
			for (V w : adjacencyList.get(v).keySet()) {
				Edge<V> e = new Edge<V>(v, w, adjacencyList.get(v).get(w));
				if (!res.contains(e)) {
					res.add(e);
				}
			}
		}
		return res;
	}

	@Override
	public List<V> getAdjacentVertexList(V v) {
		List<V> res = new LinkedList<V>();
		res.addAll(adjacencyList.get(v).keySet());
		return res;
	}

	@Override
	public List<Edge<V>> getIncidentEdgeList(V v) {
		List<Edge<V>> res = new LinkedList<Edge<V>>();
		if(!adjacencyList.containsKey(v)) {
			throw new IllegalArgumentException("Knoten nicht vorhanden");
		}
		for(V w : adjacencyList.get(v).keySet()) {
			Edge<V> e = new Edge<V>(v, w, adjacencyList.get(v).get(w));
			res.add(e);
		}
		return res;
	}

	@Override
	public int getDegree(V v) {
		if(!adjacencyList.containsKey(v)) {
			throw new IllegalArgumentException("Knoten nicht vorhanden");
		}
		return getAdjacentVertexList(v).size();
	}
	
	private void check(V v, V w) {
		if(!(adjacencyList.containsKey(v) && adjacencyList.containsKey(w))) {
			throw new IllegalArgumentException("Knoten nicht vorhanden");
		} else if (v.equals(w)) {
			throw new IllegalArgumentException("Konten sind identisch");
		}
	}

}
