// Lab18bstv100.java 
// Janee Yeak
// 12 May 2021
// This program merges two lists into one.

import java.util.ArrayList;

public class Lab18bstv100
{
	public static void main(String[] args)
	{
		int[] jsaList1 = {101, 105, 115, 125, 145, 165, 175, 185, 195, 225, 235, 275, 305, 315, 325, 335, 345, 355, 375, 385};
		int[] jsaList2 = {110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 270, 280, 320, 350, 400};

		Array list1 = new Array(jsaList1,"List #1");
		Array list2 = new Array(jsaList2,"List #2");
		Array list3 = new Array("Merged List");

		list3.merge(list1,list2);

		list1.display();
		list2.display();
		list3.display();

	}

}


class Array
{
	private ArrayList<Integer> list;
	private int size;
	private String listName;

	public Array(String ln)
	{
		list = new ArrayList<Integer>();
		size = 0;
		listName = ln;
	}

	public Array(int[] jsArray, String ln)
	{
		list = new ArrayList<Integer>();
		size = jsArray.length;
		listName = ln;
		for (int j = 0; j < size; j++)
			list.add( new Integer( jsArray[j] ));
	}

	public void display()
	{
		System.out.println("\n" + listName + ":\n");
		System.out.println(list + "\n");
	}

	public void merge(Array that, Array theOther)
	{
      int a = 0;
      int b = 0;
      int lastTheOther = theOther.list.size() - 1;
      int thatSize = that.list.size();
      int theOtherSize = theOther.list.size();
      
      boolean isABigger = false;
      boolean isBBigger = false;
      
      do {
      
      if (isABigger == true)
      {
         list.add(theOther.list.get(b));
         b++;
      }
      
      else if (isBBigger == true)
      {
         list.add(that.list.get(a));
         a++;
      }
      
      else if (that.list.get(a) > theOther.list.get(b))
      {
         list.add(theOther.list.get(b));
         b++;
      }
      
      else {
            list.add(that.list.get(a));
      a++;
      }
             
      
      if (a >= thatSize)
         isABigger = true;
         
      if (b >= theOtherSize)
         isBBigger = true;
      
      }
      while (isABigger == false && isBBigger == false);
 
      list.add(theOther.list.get(lastTheOther));

	}

}
