/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reynolds.lab4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author garri
 */
public class OrderedFOA<E extends Comparable> implements Iterable {
    
    
    @Override
    public Iterator<E> iterator() {
        return new OrderedFOAIterator();
    }
    
    private class OrderedFOAIterator implements Iterator
    {

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object next() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    

    class BinaryNode<E> {

        private E data;
        private BinaryNode<E> leftChild;
        private BinaryNode<E> rightChild;

        public BinaryNode() {
            this(null);
        }

        public BinaryNode(E dataPortion) {
            this(dataPortion, null, null);
        }

        public BinaryNode(E dataPortion, BinaryNode<E> newLeftChild, BinaryNode<E> newRightChild) {
            data = dataPortion;
            leftChild = newLeftChild;
            rightChild = newRightChild;
        }

        public E getData() {
            return data;
        }

        public void setData(E newData) {
            data = newData;
        }

        public BinaryNode<E> getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(BinaryNode<E> newLeftChild) {
            leftChild = newLeftChild;
        }

        public boolean hasLeftChild() {
            return leftChild != null;
        }

        public BinaryNode<E> getRightChild() {
            return rightChild;
        }

        public void setRightChild(BinaryNode<E> newRightChild) {
            rightChild = newRightChild;
        }

        public boolean hasRightChild() {
            return rightChild != null;
        }

        public boolean isLeaf() {
            return (leftChild == null) && (rightChild == null);
        }

        public int getHeight() {
            return getHeight(this); // Call private getHeight
        } // end getHeight

        private int getHeight(BinaryNode<E> node) {
            int height = 0;
            if (node != null) {
                height = 1 + Math.max(getHeight(node.getLeftChild()),
                        getHeight(node.getRightChild()));
            }
            return height;
        }

        public int getNumberOfNodes() {
            int leftNumber = 0;
            int rightNumber = 0;
            if (leftChild != null) {
                leftNumber = leftChild.getNumberOfNodes();
            }
            if (rightChild != null) {
                rightNumber = rightChild.getNumberOfNodes();
            }
            return 1 + leftNumber + rightNumber;
        }
        
        

    }

}
