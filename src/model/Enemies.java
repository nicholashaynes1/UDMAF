package model;

public class Enemies
{
	private static String enemyImage = "/images/s_strigrimm_move_strip4.png";
	private static int enemyX,enemyY;
	private int[] enemyXArray;
	
	public Enemies()
	{
		enemyXArray = new int[4];
		enemyXArray[0] = 0;
		enemyXArray[1] = 70;
		enemyXArray[2] = 135;
		enemyXArray[3] = 190;
		
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

}
