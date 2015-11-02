package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import java.util.ArrayList;
import java.util.List;

public class GildedRose
{

	private static List<Item> items = null;

	/**
	 * @param args
	 
	public static void main(String[] args)
	{

		System.out.println("OMGHAI!");

		items = new ArrayList<Item>();
		items.add(new Item("+5 Dexterity Vest", 10, 20));
		items.add(new Item("Aged Brie", 2, 0));
		items.add(new Item("Elixir of the Mongoose", 5, 7));
		items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(new Item("Conjured Mana Cake", 3, 6));

		updateQuality();
	}
*/
	public static void updateQuality(Item items)
	{
		
		
			if ((!"Aged Brie".equals(items.getName()))
					&& !"Backstage passes to a TAFKAL80ETC concert".equals(items.getName()))
			{
				if (items.getQuality() > 0)
				{
					if (!"Sulfuras, Hand of Ragnaros".equals(items.getName()))
					{
						items.setQuality(items.getQuality() - 1);
					}
				}
			}
			else
			{
				if (items.getQuality() < 50)
				{
					items.setQuality(items.getQuality() + 1);

					if ("Backstage passes to a TAFKAL80ETC concert".equals(items.getName()))
					{
						if (items.getSellIn() < 11)
						{
							if (items.getQuality() < 50)
							{
								items.setQuality(items.getQuality() + 1);
							}
						}

						if (items.getSellIn() < 6)
						{
							if (items.getQuality() < 50)
							{
								items.setQuality(items.getQuality() + 1);
							}
						}
					}
				}
			}

			if (!"Sulfuras, Hand of Ragnaros".equals(items.getName()))
			{
				items.setSellIn(items.getSellIn() - 1);
			}

			if (items.getSellIn() < 0)
			{
				if (!"Aged Brie".equals(items.getName()))
				{
					if (!"Backstage passes to a TAFKAL80ETC concert".equals(items.getName()))
					{
						if (items.getQuality() > 0)
						{
							if (!"Sulfuras, Hand of Ragnaros".equals(items.getName()))
							{
								items.setQuality(items.getQuality() - 1);
							}
						}
					}
					else
					{
						items.setQuality(items.getQuality() - items.getQuality());
					}
				}
				else
				{
					if (items.getQuality() < 50)
					{
						items.setQuality(items.getQuality() + 1);
					}
				}
			}
		
	}

}