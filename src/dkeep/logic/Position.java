package dkeep.logic;

public class Position implements Comparable<Position> 
{	
	private int i;
	private int j;
	
	public Position(int i, int j)
	{
		setPosition(i,j);
	}
	
	public void setPosition(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	public boolean equals(Object o1)
	{
		return o1 != null && o1 instanceof Position && i==((Position)o1).i && j==((Position)o1).j;
	}

	@Override
	public int compareTo(Position p2) {
		if(i==p2.i && j==p2.j)
			return 0;
		
		if(i<p2.i  ||  (i==p2.i && j<p2.j))
			return -1;
		else 
			return 1;
	}
	
	public int getI()
	{
		return i;
	}
	
	public int getJ()
	{
		return j;
	}
	
	public void movePosition(char movement)
	{
		switch(movement)
		{
		case 'a':
			j--;
			break;
		case 'w':
			i--;
			break;
		case 'd':
			j++;
			break;
		case 's':
			i++;
			break;
			//map.updatePos(entity.x_pos, entity.y_pos, entity);
		default:
			break;
		}
	}
}