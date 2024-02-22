package co.edu.uptc.structures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList<E> implements List<E> {
	private NodeDouble<E> head;

	@Override
	public boolean add(E arg0) throws ClassCastException, NullPointerException, IllegalArgumentException {
		boolean verificationAdd = false;
		NodeDouble<E> node = new NodeDouble<E>(arg0);
		if (isEmpty()) {
			head = node;
			verificationAdd = true;
		} else {
			NodeDouble<E> nodeAux = head;
			while (nodeAux.getNext() != null) {
				nodeAux = nodeAux.getNext();

			}
			nodeAux.setNext(node);
			node.setPrevius(nodeAux);
			verificationAdd = true;
		}
		return verificationAdd;
	}

	@Override
	public void add(int arg0, E arg1) throws UnsupportedOperationException, ClassCastException, NullPointerException,
			IllegalArgumentException, IndexOutOfBoundsException {
		NodeDouble<E> node = new NodeDouble<E>(arg1);
		NodeDouble<E> nodeAux = head;
		int count = 0;
		while (count != arg0) {
			nodeAux = nodeAux.getNext();
			count++;
		}
		nodeAux.setNext(node);
		nodeAux.getPrevius().setNext(nodeAux.getNext().getNext());
		node.setPrevius(nodeAux);
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends E> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return this.head == null;
	}

	@Override
	public Iterator<E> iterator() {
		Iterator<E> iterator;
		return iterator = new Iterator<E>() {
			NodeDouble<E> actual = head;

			@Override
			public boolean hasNext() {
				return actual != null;
			}

			@Override
			public E next() {
				E data = actual.getData();
				actual = actual.getNext();
				return data;
			}

		};
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E set(int arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
