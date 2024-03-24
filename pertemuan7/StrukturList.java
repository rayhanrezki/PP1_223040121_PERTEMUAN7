package pertemuan7;


public class StrukturList {

	private Node HEAD;


	//latihan2
	public void addHead(Matakuliah data) {
	    Node newNode = new Node(data);
	    if (isEmpty()) {
	        HEAD = newNode;
	    } else {
	        newNode.setNext(HEAD);
	        HEAD = newNode;
	    }
	}
	
	//Tes3
	public void addMid(Matakuliah data, int position) {
	    Node newNode = new Node(data);
	    if (isEmpty()) {
	        HEAD = newNode;
	    } else {
	        Node posNode = null;
	        Node curNode = HEAD;
	        int i = 1;
	        if (position == 1) { // insert at the beginning
	            newNode.setNext(curNode);
	            HEAD = newNode;
	        } else {
	            while (curNode != null && i < position) {
	                posNode = curNode;
	                curNode = curNode.getNext();
	                i++;
	            }
	            if (posNode == null) { // insert at the end
	                Node lastNode = HEAD;
	                while (lastNode.getNext() != null) {
	                    lastNode = lastNode.getNext();
	                }
	                lastNode.setNext(newNode);
	            } else {
	                posNode.setNext(newNode);
	                newNode.setNext(curNode);
	            }
	        }
	    }
	}

	
	//Tes2
	 public void addTail(Matakuliah data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node posNode = null;
            Node curNode = HEAD;

            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }

            posNode.setNext(newNode);
        }
    }
	
	
	 
	 private boolean isEmpty() {
		return false;
	}


	 //latihan3
	public void displayElement() {
		    if (isEmpty()) {
		        System.out.println("List Kosong");
		    } else {
		        Node curNode = HEAD;
		        while (curNode != null) {
		            System.out.println("Kode: " + curNode.getData().getKode());
		            System.out.println("Nama: " + curNode.getData().getNama());
		            System.out.println("SKS: " + curNode.getData().getSks());
		            System.out.println();
		            curNode = curNode.getNext();
		        }
		    }
		}

}
