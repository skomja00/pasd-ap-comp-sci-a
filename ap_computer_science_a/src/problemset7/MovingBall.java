package problemset7;

public class MovingBall {
    private int mLength, mWidth;
    private int mPosX, mPosY;
    private int mDirX, mDirY;
    public MovingBall(int length, int width, int dx, int dy)
    {
         mLength = length;
         mWidth = width;
         mPosX = length / 2;
         mPosY = width / 2;
         mDirX = dx;
         mDirY = dy;
    }
    public void move()
    {
         mPosX += mDirX;
         mPosY += mDirY;
         if (mPosX == 0 || mPosX == mLength) mDirX = -mDirX;
         if (mPosY == 0 || mPosY == mWidth) mDirY = -mDirY;
         System.out.println("("+mPosX+","+mPosY+")");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovingBall b = new MovingBall(8, 4, 1, -1);
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move(); //10x
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move(); //20x
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move(); //30x
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move(); //40x
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move(); //50x
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move(); //60x
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move();		
		b.move(); //70x
	}
}
