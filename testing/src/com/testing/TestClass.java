package com.testing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestClass 
{
	public static void main(String[] args) {
		User user1 = new User(1,"Satya");
		User user2 = new User(2,"Satya");
		//User user2 = user1;
		List<User> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		System.out.println(list.size());
		/*Set<User> set = new HashSet<>();*/
		Comparator<User> byName = (User u1, User u2)-> u1.getName().compareTo(u2.getName());
		Set<User> set = new TreeSet<>(byName);
		set.add(user1);
		set.add(user2);
		System.out.println(set.size());
	}
}
