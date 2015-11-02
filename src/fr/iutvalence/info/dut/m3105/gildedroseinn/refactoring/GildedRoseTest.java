package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.Test;

/**
 * test2
 * sellIn<0
 * 	 quality - 2
 *
 *test3
 *	quality>=0
 *
 *test4
 *	"aged brie"
 *	
 */

public class GildedRoseTest {

	/**@Test
	public void EachDayCheckTheQuality() {
		
		
		Item items1 = new Item("+5 Dexterity Vest", 10, 20);
		Item items2 = new Item("Aged Brie", 2, 0);
		Item items3 = new Item("Elixir of the Mongoose", 5, 7);
		Item items4 = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
		Item items5 = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
		Item items6 = new Item("Conjured Mana Cake", 3, 6);

		
		GildedRose.updateQuality(items1);
		GildedRose.updateQuality(items2);
		GildedRose.updateQuality(items3);
		GildedRose.updateQuality(items4);
		GildedRose.updateQuality(items5);
		GildedRose.updateQuality(items6);
		
		assertEquals(items1.getSellIn() ,9 );
		assertEquals(items2.getSellIn() ,1 );
		assertEquals(items3.getSellIn() ,4 );
		assertEquals(items4.getSellIn() ,0 );
		assertEquals(items5.getSellIn() ,14);
		assertEquals(items6.getSellIn() ,2 );
	}
	*/
	@Test
	public void ifSellInIsInferiorAt0() {
		
		Item items1 = new Item("+5 Dexterity Vest", -1, 20);
		Item items2 = new Item("Aged Brie", -2, 0);
		Item items3 = new Item("Elixir of the Mongoose", -5, 7);
		Item items4 = new Item("Sulfuras, Hand of Ragnaros", -10, 80);
		Item items5 = new Item("Backstage passes to a TAFKAL80ETC concert", -15, 20);
		Item items6 = new Item("Conjured Mana Cake", -3, 6);

		
		GildedRose.updateQuality(items1);
		GildedRose.updateQuality(items2);
		GildedRose.updateQuality(items3);
		GildedRose.updateQuality(items4);
		GildedRose.updateQuality(items5);
		GildedRose.updateQuality(items6);

		assertEquals(items1.getQuality() ,18 );
		assertEquals(items2.getQuality() ,-2 );
		assertEquals(items3.getQuality() ,5 );
		assertEquals(items4.getQuality() ,78 );
		assertEquals(items5.getQuality() ,18);
		assertEquals(items6.getQuality() ,4 );
		
	}
	}
