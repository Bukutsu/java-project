package cpe.eng.kps.ku.ac.th;

import java.util.Iterator;

public class NameRepository implements Containers {
	 String[] names = {"John","May","Ryan"};

	 public Iterator getIterator() {
	 return new NameIterator() {
		 int index = 0 ;
		 public boolean hasNext() {
		 if(index < names.length)
		 return true ;
		 return false;
		 }
		 public Object next() {
		 return names[index++];
		 }
		 public void remove() {
			
		 }
	 };
	 
	 }
	 private class NameIterator implements Iterator {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return null;
			}

		}

}

	
	 
	