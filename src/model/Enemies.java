package model;

public class Enemies
{
	private static String enemyImage = "/images/s_strigrimm_move_strip4.png";
	private static String enemyImageLeft = "/images/s_strigrimm_move_strip4.png";
	private static int enemyX = 0,enemyX1 = 0,enemyX2 = 0,enemyX3 = 0;
	private int[] enemyXArray;
	private int[] enemyLeftXArray;
	
	public Enemies()
	{
		
		enemyXArray = new int[4];
		enemyXArray[0] = 0;
		enemyXArray[1] = 70;
		enemyXArray[2] = 135;
		enemyXArray[3] = 190;
		
		enemyLeftXArray = new int[4];
		enemyLeftXArray[0] = 0;
		enemyLeftXArray[1] = 70;
		enemyLeftXArray[2] = 135;
		enemyLeftXArray[3] = 190;
		
	}

	public String getEnemyImage()
	{
		return enemyImage;
	}

	public static void setEnemyImage(String enemyImage)
	{
		Enemies.enemyImage = enemyImage;
	}

	public static int getEnemyX()
	{
		return enemyX;
	}

	public static void setEnemyX(int enemyX)
	{
		Enemies.enemyX = enemyX;
	}

	public int[] getEnemyXArray()
	{
		return enemyXArray;
	}

	public static String getEnemyImageLeft()
	{
		return enemyImageLeft;
	}

	public static void setEnemyImageLeft(String enemyImageLeft)
	{
		Enemies.enemyImageLeft = enemyImageLeft;
	}

	public int[] getEnemyLeftXArray()
	{
		return enemyLeftXArray;
	}

	public void setEnemyLeftXArray(int[] enemyLeftXArray)
	{
		this.enemyLeftXArray = enemyLeftXArray;
	}

	public static int getEnemyX1()
	{
		return enemyX1;
	}

	public static int getEnemyX2()
	{
		return enemyX2;
	}

	public static int getEnemyX3()
	{
		return enemyX3;
	}

	public static void setEnemyX1(int enemyX1)
	{
		Enemies.enemyX1 = enemyX1;
	}

	public static void setEnemyX2(int enemyX2)
	{
		Enemies.enemyX2 = enemyX2;
	}

	public static void setEnemyX3(int enemyX3)
	{
		Enemies.enemyX3 = enemyX3;
	}

}
