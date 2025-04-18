package collectionfrm;

import java.util.LinkedList;

public class ArryList {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList();
		LinkedList<Integer> l2 = new LinkedList();
		l1.add(10);l1.add(12);
		l1.add(13);l1.add(133);
	
		l2.add(1);l2.add(33);
		l2.add(13);l2.add(1);
		
		if (l1.contains(l2)) {
			System.out.println(l1);
			
		}
		for (int i = 0; i < l1.size() ;i++) {
			for (int j = 0; j < l2.size(); j++) {
				//if (l1[i]==l2[j]) {
					
					
				}
				
			}
			
		}

	}


