package mai.edu.lesson_2.lib;

import algorithm.MyComparable;

public class Student implements MyComparable, Comparable{
    private String fname;
    private String sname;

    private int ratePhys, rateMath, rateProg;

    public Student(String fname, String sname) {
        this.fname = fname;
        this.sname = sname;

        ratePhys = rateMath = rateProg = -1;
    }

    public void passPhys(int ratePhys) {
        if (ratePhys >=2 && ratePhys <= 5)
            this.ratePhys = ratePhys;
    }
    
    public boolean isBad(int ratePhys) {
       return (ratePhys <= 3) || (rateMath <= 3) || (rateProg <= 3);
    }

    public void passMath(int rateMath) {
    	if (rateMath >=2 && rateMath <= 5)
    		this.rateMath = rateMath;
    }

    public void passProg(int rateProg) {
       	if (rateProg >=2 && rateProg <= 5)
        this.rateProg = rateProg;
    }

    public double Avg()
    {
        return 1.0 * (rateMath + ratePhys + rateProg) / 3;
    }
    
@Override
	public String toString()
	{
		return String.format("%-20s M(%d)  �(%d) �(%d) ��(%.1f)", fname + " " + sname, rateMath, ratePhys, rateProg, this.Avg());
		
	}
    
@Override
    public int compareTo(Object obj)
    {
      Student stud = (Student)obj;
      if(this.Avg() < stud.Avg())
      {
        /* ������� ������ ����������� */
        return -1;
      }   
      else if(this.Avg() > stud.Avg())
      {
        /* ������� ������ ����������� */
        return 1;
      }
      /* ������� ����� ����������� */
      return 0;  
    }

}
