
public class TocEntry
{
	public TocEntry()
	{
		chapter = "";
		page = 0;
	}
	
	public TocEntry(String chapter, int page)
	{
		this.chapter = chapter;
		this.page = page;
	}
	
	
	public String toString()
	{
		for (int i = chapter.length(); i < 50; i++)
			chapter = chapter + ".";
		return chapter + page;  
	}
	

	
	private String chapter;
	private int page;
}
