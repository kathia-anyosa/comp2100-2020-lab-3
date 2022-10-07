package task2;

/**
 * Base class for node
 *
 * @param <T> data type
 */
public class Node<T> {

	Colour colour; // Node colour
	T value; // Node value
	Node<T> parent; // Parent node
	Node<T> l, r; // Children nodes

	public Node(T value) {
		this.value = value;
		this.colour = Colour.RED;
		this.parent = null;

		// Initialise children leaf nodes
		this.l = new Node<T>();
		this.r = new Node<T>();
		this.l.parent = this;
		this.r.parent = this;
	}

	// Leaf node
	public Node() {
		this.value = null;
		this.colour = Colour.BLACK;
	}
}
