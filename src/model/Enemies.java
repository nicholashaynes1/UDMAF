package model;

public class Enemies
{
	private static String enemyImage = "/images/s_strigrimm_move_strip4.png";
	private static int enemyX,enemyY;
	private int[] enemyDrawX;
	
	public Enemies()
	{
		enemyDrawX = new int[9];
		enemyDrawX[0] = 0;
		enemyDrawX[1] = 0;
		enemyDrawX[2] = 0;
		enemyDrawX[3] = 0;
		enemyDrawX[4] = 0;
		enemyDrawX[5] = 0;
		enemyDrawX[6] = 0;
		enemyDrawX[7] = 0;
		enemyDrawX[8] = 0;
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

}
