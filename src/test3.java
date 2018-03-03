
public class test3 {

	public static void main(String[] args) {
		
		String[] names = {"Ольга", "Анна", "Ирина"}; 
		
		int[][] points = {{0,0},{1, 1}, {2, 2}, {3, 3}};
		
		
		String[] names2 = new String[3];
		
		names[0] = "Маша";
		names[1] = "Петя";
		names[2] = "Оля";
		
		for(int i = 0; i < names.length; i++)
			System.out.println(names[i]);
		
		for(String name : names)
		{
			name = "Test";                  //    Присваивание касается локальной и не меняет элементы массива
			//System.out.println(name);
		}
		
		for(int i = 0; i < names.length; i++)
		{
			names[i] = "Test";
		}
		
		for(String name : names)
		{
		//                                   
			System.out.println(name);
		}
		
		
		for(int i = 0; i < points.length; i++)
		{
			for(int j = 0; j < points[0].length; j++)
				System.out.print(points[i][j] + " ");
			System.out.println();
		}
		
	}

}
