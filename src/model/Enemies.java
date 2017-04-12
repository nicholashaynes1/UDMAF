package model;

public class Enemies
{
	private static String enemyImage = "/images/knight_MoveR_strip6.png";
	private static int enemyX,enemyY;

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

}
