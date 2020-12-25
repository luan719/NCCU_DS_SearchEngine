
public class Keyword {
	
	public String keywordName;
    public int count;
    public float weight;
    
    public Keyword(String name,int count,float weight)
    {
		this.keywordName = name;
		this.count =count;
		this.weight =weight;
    }
    
    @Override
    public String toString()
    {
    	return "["+keywordName+","+count+","+weight+"]";
    }
    

    public int getCount()
    {
    	return count;
    }
    public String getKeywordName()
    {
    	return keywordName;
    }
    public float getWeight()
    {
    	return weight;
    }
}