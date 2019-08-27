/**
Sydney Davidson
CSI 213
Project 4 
**/

import java.util.*;
import java.io.*;
public class Project4{
	public static void start() throws IOException{

		BinarySearchTree<PersonRecord> tree = new BinarySearchTree<>();
		AddressBook addressBook = new AddressBook();
		addressBook.setTree(tree);

		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		br.readLine();
		String line = br.readLine();
		while(line != null){
			String[] data = line.split("\t");

			PersonRecord pr = new PersonRecord();
			Address a = new Address();

			pr.setFirstName(data[0]);
			pr.setLastName(data[1]);
			pr.setPhoneNum(data[6]);
			a.setStreet(data[2]);
			a.setCity(data[3]);
			a.setState(data[4]);
			a.setZip(data[5]);
			pr.setAddress(a);

			addressBook.add(pr);

			line = br.readLine();
		}

		PersonRecord test = new PersonRecord();
		Address testA = new Address();
		TreeIterator<PersonRecord> iterator = new TreeIterator<PersonRecord>(tree);
		LinkedList<TreeNode<PersonRecord>> list = new LinkedList<>();

		test.setFirstName("James");
		test.setLastName("Butt");
		test.setPhoneNum("504-621-8927");
		testA.setStreet("123 Happy St");
		testA.setCity("New Orleans");
		testA.setState("LA");
		testA.setZip("70116");
		test.setAddress(testA);

		addressBook.change("Butt", test);

		addressBook.delete("Foller");

		addressBook.retrieve("Rim");


		iterator = addressBook.getTree().iterator();
		list = iterator.getQueue();
		for(TreeNode<PersonRecord> person : list){
			System.out.println(person.getElement());
		}

	}
}