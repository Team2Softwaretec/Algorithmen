package graph;

import java.util.List;

public class AdjacencyListDirectedGraph<V> implements DirectedGraph<V>{

	@Override
	public boolean addVertex(V v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addEdge(V v, V w) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addEdge(V v, V w, double weight) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsVertex(V v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsEdge(V v, V w) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getWeight(V v, V w) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfVertexes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfEdges() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<V> getVertexList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Edge<V>> getEdgeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<V> getAdjacentVertexList(V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Edge<V>> getIncidentEdgeList(V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getInDegree(V v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getOutDegree(V v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<V> getPredecessorVertexList(V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<V> getSuccessorVertexList(V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Edge<V>> getOutgoingEdgeList(V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Edge<V>> getIncomingEdgeList(V v) {
		// TODO Auto-generated method stub
		return null;
	}

}
