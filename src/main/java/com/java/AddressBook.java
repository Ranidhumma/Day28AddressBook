package com.java;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	public static void main(String[] args) {

		System.out.println("**Welcome to Address Book**");

		/* Arraylist is used to store data/contacts */

		List<ContactPerson> contacts = new ArrayList<>();

		ContactPerson newContact = new ContactPerson("Rani", "Dhumma", "xyz", "Solapur", "Maharashtra", 410004,
				994445555, "@gmail.com");

		contacts.add(newContact);

		System.out.println(contacts);
	}

}
